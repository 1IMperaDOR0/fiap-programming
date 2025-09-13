# Look Up Table

# dic = {'chave': "valor"}
# print(dic['chave'])

# dic['novaChave'] = "novoValor"
# print(dic['novaChave'])

# dic['chave'] = "alterandoValor"
# print(dic)

# lados = {
#     '3': "triângulo",
#     '4': "quadrado",
#     '5': "pentagôno",
#     '6': "hexágono"
# }

# def verifica_opcao(mensagem, dic):
#     resposta = input(f"{mensagem}:\n{"\n".join(dic)}\n-> ")
#     while not resposta in dic:
#         print("Opção inválida!")
#         resposta = input(f"{mensagem}\n{"\n".join(dic)}\n-> ")
#     return dic[resposta]

# poligono = verifica_opcao("Digite um número de lados das opções a seguir para descobrir o polígono:", lados)
# print(poligono)

# emojis = {
#     ':)': "😊",
#     'B)': "😎",
#     ':(': "☹️",
#     '<3': "❤️"
# }

# texto = "Eu amo python <3!"
# for key in emojis.keys():
#     texto = texto.replace(key, emojis[key])
# print(texto)

# numeros = {
#     'zero': '0',
#     'um': '1',
#     'dois': '2',
#     'tres': '3',
#     'quatro': '4',
#     'cinco': '5',
#     'seis': '6',
#     'sete': '7',
#     'oito': '8',
#     'nove': '9'
# }

# numero = input("Digite seu número de telefone:\n-> ")
# for key in numeros:
#     numero = numero.replace(key, numeros[key])
# numero = numero.replace(' ', '')
# print(numero)

# dic = {
#     'nome': ['danilo', 'lucas', 'henrique', 'matheus', 'vinicius'],
#     'idade': [30, 20, 19, 18, 21]
# }
# for i in range(len(dic['nome'])):
#     for key in dic.keys():
#         print(f"{key}: {dic[key][i]}")
#     print()

# frase = "A aranha arranha a rã. A rã arranha a aranha. Nem a aranha arranha a rã. Nem a rã arranha a aranha."
# print(frase)
# frase = frase.lower()
# print(frase)
# frase = frase.replace('.', '')
# print(frase)
# palavras = frase.split(' ')
# print(palavras)

# contador = {}
# for palavra in palavras:
#     if not palavra in contador.keys():
#         contador[palavra] = 1
#     else:
#         contador[palavra] += 1
# print(contador)

# Exercício 1
def forca_opcao(msg, opcoes):
    resposta = input(msg)
    while not resposta in opcoes:
        print("Opção inválida!")
        resposta = input(msg)
    return resposta

saudacoes = {
    'oi': ['olá', 'salve', 'bão'],
    'tchau': ['flw', 'tchau']
}

opcoes = ["oi", "tchau"]

resposta = forca_opcao('Diga "oi" ou "tchau":\n-> ', opcoes)
print(saudacoes[resposta][0])

print()

# Exercício 2
carros = {
    'nome': ['polinho turbão manual', 'up', 'kombi', 'uno'],
    'portas': [4, 2, 6, 2],
    'preco': [1000000, 200, 300, 100],
    'ano': [2014, 2018, 1970, 2005]
}

def table(dic, title, info_1, info_2, info_3, info_4):
    print("------------------------------------------------------------")
    print(f"-------------------------- {title} --------------------------")
    print("------------------------------------------------------------")
    print(f"|   Número   |   {info_1}   |   {info_2}   |   {info_3}   |   {info_4}   |")
    for i in range(len(dic[info_1])):
        print(f"{i+1}. {dic[info_1][i]} ({dic[info_2][i]}): R$ {dic[info_3][i]:.2f} - portas: {dic[info_4][i]}")
    print()
    return

table(carros, "CARROS", 'nome', 'ano', 'preco', 'portas')

carro = forca_opcao("Digite um carro da lista acima:\n-> ", carros['nome'])

for i in range(len(carros['nome'])):
    if carro == carros['nome'][i]:
        print()
        print(f"Você escolheu a opção:\n{i+1}. {carros['nome'][i]} ({carros['ano'][i]}): R$ {carros['preco'][i]:.2f} - portas: {carros['portas'][i]}")

print()

# Exercício 3
index = 0
carro_mais_caro = carros['preco'][0]

for i in range(len(carros['nome'])):
    if carros['preco'][i] > carro_mais_caro:
        carro_mais_caro = carros['preco'][i]
        index = i
print(f"O carro mais caro é a opção:\n{index+1}. {carros['nome'][index]} ({carros['ano'][index]}): R$ {carros['preco'][index]:.2f} - portas: {carros['portas'][index]}")

print()

# Exercício 4
index = 0
carro_mais_barato = carros['preco'][0]

for i in range(len(carros['nome'])):
    if carros['preco'][i] < carro_mais_barato:
        carro_mais_barato = carros['preco'][i]
        index = i
print(f"O carro mais barato é a opção:\n{index+1}. {carros['nome'][index]} ({carros['ano'][index]}): R$ {carros['preco'][index]:.2f} - portas: {carros['portas'][index]}")

print()

# Exercício 5
def forca_numero(msg):
    resposta = input(msg)
    while not resposta.isnumeric():
        print("Opção inválida!")
        resposta = input(msg)
    resposta = int(resposta)
    return resposta

opcoes = ['s', 'n']
resposta = forca_opcao("Você gostaria de adicionar um carro a lista? (s/n)\n-> ", opcoes)

if resposta == 's':
    novo_carro = input("Digite o nome do carro:\n-> ")

    carros['nome'].append(novo_carro)

    portas = forca_numero("Digite a quantidade de portas do carro:\n-> ")
    carros['portas'].append(portas)

    preco = forca_numero("Digite o preço do carro:\n-> ")
    carros['preco'].append(preco)

    ano = forca_numero("Digite o ano do carro:\n-> ")
    carros['ano'].append(ano)

    print()

    table(carros, "CARROS", 'nome', 'ano', 'preco', 'portas')

# Exercício 6
resposta = forca_opcao("Você gostaria de remover um carro da lista? (s/n)\n-> ", opcoes)

if resposta == 's':
    carro = input("Digite o nome do carro:\n-> ")

    for i in range(len(carros['nome'])):
        if carros['nome'][i] == carro:
            carros['portas'].remove(carros['portas'][i])
            carros['preco'].remove(carros['preco'][i])
            carros['ano'].remove(carros['ano'][i])
    
    carros['nome'].remove(carro)

    print()

    table(carros, "CARROS", 'nome', 'ano', 'preco', 'portas')

# Exercício 7
frase = "O bispo de Constantinopla é um bom desconstantinopolitanizador. Quem o desconstantinopolitanizar, um bom desconstantinopolitanizador será."
frase = frase.lower()
frase = frase.replace('.', '')
frase = frase.replace(',', '')
palavras = frase.split(' ')

contador = {}

for palavra in palavras:
    if not palavra in contador.keys():
        contador[palavra] = 1
    else:
        contador[palavra] += 1
print(contador)

print()

# Exercício 8
numeros = {
    'zero': '0',
    'um': '1',
    'dois': '2',
    'tres': '3',
    'quatro': '4',
    'cinco': '5',
    'seis': '6',
    'sete': '7',
    'oito': '8',
    'nove': '9'
}

numero = input("Digite seu número de telefone:\n-> ")
for key in numeros:
    numero = numero.replace(key, numeros[key])
numero = numero.replace(' ', '')
print(numero)

# Exercício 9 e 10
dic_1 = {
    "a": 1, 
    "b": 2, 
    "c": 3
}

dic_2 = {
    "b": 4, 
    "c": 5, 
    "d": 6
}

# Jeito 1
def acha_comuns(dic_1, dic_2):
    comuns = []
    for key in dic_1:
        if key in dic_2.keys():
            comuns.append(key)
    return comuns

def acha_incomuns(dic_1, dic_2):
    incomuns = []
    for key_1 in dic_1:
        if not key_1 in dic_2.keys():
            incomuns.append(key_1)

    for key_2 in dic_2:
        if not key_2 in dic_1.keys():
            incomuns.append(key_2)

    return incomuns

comuns = acha_comuns(dic_1, dic_2)
incomuns = acha_incomuns(dic_1, dic_2)

print("Comuns:", comuns)
print("Não comuns:", incomuns)

# Jeito 2
comuns = []
nao_comuns = []

for key in set(dic_1.keys()) | set(dic_2.keys()):
    if key in dic_1 and key in dic_2:
        comuns.append(key)
    else:
        nao_comuns.append(key)

print("Comuns:", comuns)
print("Não comuns:", nao_comuns)