import streamlit as st
import pandas as pd
import plotly.express as px

# Configuração da página
st.set_page_config(page_title="Monitoramento de Manganês", layout="wide")

# Função para carregar os dados
@st.cache_data
def load_data():
    df = pd.read_csv('data/analitos_join.csv')
    df['data'] = pd.to_datetime(df['data'])
    # Removendo linhas com manganês nulo para as métricas e gráfico
    return df

df = load_data()

# --- SIDEBAR (FILTROS) ---
st.sidebar.header("Filtros")

# Filtro de Pontos
pontos_disponiveis = sorted(df['ponto'].unique().tolist())
pontos_selecionados = st.sidebar.multiselect("Selecione os Pontos", pontos_disponiveis, default=pontos_disponiveis)

# Filtro de Período Hidrológico
periodos_disponiveis = sorted(df['periodo'].unique().tolist())
periodo_selecionado = st.sidebar.multiselect("Selecione o Período Hidrológico", periodos_disponiveis, default=periodos_disponiveis)

# Filtro de Rompimento
rompimento_opcoes = sorted(df['rompimento'].unique().tolist())
rompimento_selecionado = st.sidebar.multiselect("Rompimento (Antes/Depois)", rompimento_opcoes, default=rompimento_opcoes)

# Aplicando Filtros
df_filtered = df[
    (df['ponto'].isin(pontos_selecionados)) &
    (df['periodo'].isin(periodo_selecionado)) &
    (df['rompimento'].isin(rompimento_selecionado))
]

# --- DASHBOARD PRINCIPAL ---
st.title("Dashboard de Qualidade da Água: Manganês Total")

if df_filtered.empty:
    st.warning("Nenhum dado encontrado para os filtros selecionados.")
else:
    # --- MÉTRICAS (CARDS) ---
    # Ignorando NaNs para cálculos
    mn_values = df_filtered['manganes_total'].dropna()
    
    col1, col2, col3, col4 = st.columns(4)
    
    if not mn_values.empty:
        media_mn = mn_values.mean()
        max_mn = mn_values.max()
        contagem = len(mn_values)
        violações = (mn_values > 0.3).sum()
        pct_violacao = (violações / contagem) * 100
        
        col1.metric("Média Mn Total", f"{media_mn:.3f} mg/L")
        col2.metric("Valor Máximo", f"{max_mn:.3f} mg/L")
        col3.metric("Contagem (n)", f"{contagem}")
        col4.metric("% Violação (> 0.3)", f"{pct_violacao:.1f}%")
    else:
        st.info("Dados de Manganês insuficientes para métricas.")

    # --- GRÁFICO TEMPORAL ---
    st.subheader("Variação Temporal de Manganês Total")
    
    fig = px.line(
        df_filtered.sort_values('data'), 
        x='data', 
        y='manganes_total', 
        color='ponto',
        markers=True,
        labels={'data': 'Data', 'manganes_total': 'Mn Total (mg/L)', 'ponto': 'Ponto de Monitoramento'},
        title="Concentração de Manganês ao Longo do Tempo"
    )
    
    # Adicionando linha de referência da violação (0.3 mg/L)
    fig.add_hline(y=0.3, line_dash="dash", line_color="red", annotation_text="Limite (0.3 mg/L)")
    
    st.plotly_chart(fig, use_container_width=True)

    # --- TABELA DE DADOS ---
    st.subheader("Dados Filtrados")
    # Colunas solicitadas para visualização
    cols_display = ['data', 'ponto', 'rompimento', 'periodo', 'manganes_total']
    st.dataframe(df_filtered[cols_display], use_container_width=True)