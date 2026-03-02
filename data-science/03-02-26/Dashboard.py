import streamlit as st
import pandas as pd
import plotly.express as px
import os

st.set_page_config(layout="wide")

st.title("📊 Dashboard de Qualidade da Água")
st.markdown("Análise Antes vs Depois do Rompimento")

# ----------------------------
# Seleção automática de arquivo
# ----------------------------
pasta_dados = "datas"

if not os.path.exists(pasta_dados):
    st.error("A pasta 'datas' não foi encontrada.")
    st.stop()

arquivos = [f for f in os.listdir(pasta_dados) if f.endswith(".csv")]

if not arquivos:
    st.error("Nenhum arquivo CSV encontrado na pasta 'datas'.")
    st.stop()

arquivo_escolhido = st.selectbox("📂 Selecione o arquivo CSV", arquivos)

caminho_arquivo = os.path.join(pasta_dados, arquivo_escolhido)

df = pd.read_csv(caminho_arquivo)

# ----------------------------
# Verificando as colunas
# ----------------------------
st.write(df.columns)  # Verifica as colunas e mostra no Streamlit

# Limpeza de espaços extras
df.columns = df.columns.str.strip()  # Limpa espaços extras

# Ajuste para o nome correto da coluna de data
df["data"] = pd.to_datetime(df["data"])  # Ajuste para "data" (em minúsculas)

# Ajuste a data do rompimento
data_rompimento = pd.to_datetime("2015-12-05")
df["Periodo_Evento"] = df["data"].apply(
    lambda x: "Antes" if x < data_rompimento else "Depois"
)

# ----------------------------
# Sidebar – Filtros
# ----------------------------
st.sidebar.header("Filtros")

pontos = st.sidebar.multiselect(
    "Selecione o Ponto",
    options=df["ponto"].unique(),
    default=df["ponto"].unique()
)

periodo_climatico = st.sidebar.multiselect(
    "Selecione o Período Climático",
    options=df["periodo"].unique(),
    default=df["periodo"].unique()
)

parametro = st.sidebar.selectbox(
    "Selecione o Parâmetro",
    ["turbidez", "manganes_total", "ferro_dissolvido"]
)

df_filtrado = df[
    (df["ponto"].isin(pontos)) &
    (df["periodo"].isin(periodo_climatico))
]

# ----------------------------
# Métricas
# ----------------------------
st.subheader("📌 Médias Antes vs Depois")

col1, col2 = st.columns(2)

media_antes = df_filtrado[df_filtrado["Periodo_Evento"] == "Antes"][parametro].mean()
media_depois = df_filtrado[df_filtrado["Periodo_Evento"] == "Depois"][parametro].mean()

col1.metric("Média Antes", f"{media_antes:.2f}")
col2.metric(
    "Média Depois",
    f"{media_depois:.2f}",
    delta=f"{media_depois - media_antes:.2f}"
)

# ----------------------------
# Série Temporal
# ----------------------------
st.subheader("📈 Série Temporal")

fig = px.line(
    df_filtrado,
    x="data",
    y=parametro,
    color="ponto",
    markers=True
)

fig.add_vline(
    x=data_rompimento,
    line_dash="dash",
    line_color="red",
    annotation_text="Rompimento"
)

st.plotly_chart(fig, use_container_width=True)

# ----------------------------
# Boxplot
# ----------------------------
st.subheader("📦 Distribuição Antes vs Depois")

fig_box = px.box(
    df_filtrado,
    x="Periodo_Evento",
    y=parametro,
    color="Periodo_Evento"
)

st.plotly_chart(fig_box, use_container_width=True)

# ----------------------------
# Tabela
# ----------------------------
st.subheader("📋 Dados Filtrados")
st.dataframe(df_filtrado)