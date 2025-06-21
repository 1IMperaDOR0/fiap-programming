'''Funções'''
def verifica_numero(msg):
    numero = input(msg)
    while not numero.isnumeric():
        numero = input(f'Caractere inválido! {msg}')
    return int(numero)

def achar_maior(lista_textos, lista_numeros):
    if lista_textos:
        index = 0
        maior = lista_numeros[0]
        for i in range(1, len(lista_numeros)):
            if lista_numeros[i] > maior:
                maior = lista_numeros[i]
                index = i
        return lista_textos[index], lista_numeros[index]

def verifica_opcao(msg, lista):
    opcao = input(msg)
    while opcao not in lista:
        opcao = input(f'Opção inválida! {msg}')
    return opcao

'''Exercício 1'''
qtd_saltos = 5
atletas = []
medias = []

while True:
    atleta = input('Digite o nome do atleta (ou pressione "Enter" para encerrar):\n-> ')
    if atleta == '':
        break

    saltos = []
    for i in range(qtd_saltos):
        salto = verifica_numero(f'Digite a distância do {i + 1}º salto do atleta {atleta}:\n-> ')
        saltos.append(salto)

    maior = saltos[0]
    menor = saltos[0]
    for salto in saltos:
        if salto > maior:
            maior = salto
        if salto < menor:
            menor = salto

    saltos.remove(maior)
    saltos.remove(menor)

    soma = 0
    for salto in saltos:
        soma += salto

    media = soma / len(saltos)
    atletas.append(atleta)
    medias.append(media)

if atletas:
    print('\nRESULTADOS:')
    for i in range(len(atletas)):
        print(f'Nome: {atletas[i]} - Média: {medias[i]:.2f}')
        
    vencedor = achar_maior(atletas, medias)[0]
    print(f'\nVENCEDOR(A): {vencedor}')

'''Exercício 2'''
sistemas = ['Windows Server', 'Unix', 'Linux', 'Netware', 'Mac OS', 'Outro']
votos = [0, 0, 0, 0, 0, 0]

while True:
    print('\nSistemas Operacionais:')
    for i in range(len(sistemas)):
        print(f'{i + 1} - {sistemas[i]}')
    print('0 - Encerrar votação')

    voto = verifica_numero('\nQual é o melhor Sistema Operacional para uso em servidores? (0 a 6)\n-> ')
    while voto < 0 or voto > len(sistemas):
        voto = verifica_numero('Digite um número de 0 a 6 que corresponda à sua escolha:\n-> ')

    if voto == 0:
        break

    index = voto - 1
    votos[index] += 1

total_votos = 0
for voto in votos:
    total_votos += voto

print('\nSistema Operacional    Votos   %')
print('-------------------    -----  -----')

for i in range(len(sistemas)):
    if total_votos > 0:
        percentual = (votos[i] / total_votos) * 100
    else:
        percentual = 0
    print(f'{sistemas[i]:<22} {votos[i]:<7} {percentual:.0f}%')

print('-------------------    -----')
print(f'Total                  {total_votos}')

vencedor_nome, vencedor_votos = achar_maior(sistemas, votos)
if total_votos > 0:
    vencedor_percentual = (vencedor_votos / total_votos) * 100
else:
    vencedor_percentual = 0

print(f'\nO sistema mais votado foi o {vencedor_nome}, com {vencedor_votos} votos, correspondendo a {vencedor_percentual:.0f}% dos votos.')