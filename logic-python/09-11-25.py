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

# # Exercício 1
# saudacoes = {
#     'oi': ['olá', 'salve', 'bão'],
#     'tchau': ['flw', 'tchau']
# }

# resposta = input('Diga "oi" ou "tchau":\n-> ')
# print(saudacoes[resposta][0])

# print()

# # Exercício 2
# carros = {
#     'nome': ['polinho turbão manual', 'up', 'kombi', 'uno'],
#     'portas': [4, 2, 6, 2],
#     'preco': [1000000, 200, 300, 100],
#     'ano': [2014, 2018, 1970, 2005]
# }

# print("-------------------------------------------------")
# print("-------------------- CARROS ---------------------")
# print("-------------------------------------------------")
# print("|   Número   |   Modelo   |   Ano   |   Preço   |")
# for i in range(len(carros['nome'])):
#     print(f"{i+1}. {carros['nome'][i]} ({carros['ano'][i]}): R$ {carros['preco'][i]:.2f} - portas: {carros['portas'][i]}")
# print()
# carro = input("Digite um carro da lista acima:\n-> ")

# for i in range(len(carros['nome'])):
#     if carro == carros['nome'][i]:
#         print()
#         print(f"Você escolheu a opção:\n{i+1}. {carros['nome'][i]} ({carros['ano'][i]}): R$ {carros['preco'][i]:.2f} - portas: {carros['portas'][i]}")

# print()

# # Exercício 3
# index = 0
# carro_mais_caro = carros['preco'][0]

# for i in range(len(carros['nome'])):
#     if carros['preco'][i] > carro_mais_caro:
#         carro_mais_caro = carros['preco'][i]
#         index = i
# print(f"O carro mais caro é a opção:\n{index+1}. {carros['nome'][index]} ({carros['ano'][index]}): R$ {carros['preco'][index]:.2f} - portas: {carros['portas'][index]}")

# print()

# # Exercício 4
# index = 0
# carro_mais_barato = carros['preco'][0]

# for i in range(len(carros['nome'])):
#     if carros['preco'][i] < carro_mais_barato:
#         carro_mais_barato = carros['preco'][i]
#         index = i
# print(f"O carro mais barato é a opção:\n{index+1}. {carros['nome'][index]} ({carros['ano'][index]}): R$ {carros['preco'][index]:.2f} - portas: {carros['portas'][index]}")

# print()

# # Exercício 5
# opcao = ['s', 'n']
# resposta = input("Você gostaria de adicionar um carro a lista? (s/n)\n-> ")

# while not resposta in opcao:
#     print("Opção inválida!")
#     resposta = input("Você gostaria de adicionar um carro a lista?\n-> ")

# if resposta == 's':
#     novo_carro = input("Digite o nome do carro:\n-> ")

#     carros['nome'].append(novo_carro)

#     portas = input("Digite a quantidade de portas do carro:\n-> ")
#     portas = int(portas)
#     carros['portas'].append(portas)

#     preco = input("Digite o preço do carro:\n-> ")
#     preco = int(preco)
#     carros['preco'].append(preco)

#     ano = input("Digite o ano do carro:\n-> ")
#     ano = int(ano)
#     carros['ano'].append(ano)

#     print("-------------------------------------------------")
#     print("-------------------- CARROS ---------------------")
#     print("-------------------------------------------------")
#     print("|   Número   |   Modelo   |   Ano   |   Preço   |")
#     for i in range(len(carros['nome'])):
#         print(f"{i+1}. {carros['nome'][i]} ({carros['ano'][i]}): R$ {carros['preco'][i]:.2f} - portas: {carros['portas'][i]}")
#     print()

# # Exercício 6
# resposta = input("Você gostaria de remover um carro da lista? (s/n)\n-> ")

# while not resposta in opcao:
#     print("Opção inválida!")
#     resposta = input("Você gostaria de remover um carro da lista?\n-> ")

# if resposta == 's':
#     carro = input("Digite o nome do carro:\n-> ")

#     for i in range(len(carros['nome'])):
#         if carros['nome'][i] == carro:
#             carros['portas'].remove(carros['portas'][i])
#             carros['preco'].remove(carros['preco'][i])
#             carros['ano'].remove(carros['ano'][i])
    
#     carros['nome'].remove(carro)

#     print("-------------------------------------------------")
#     print("-------------------- CARROS ---------------------")
#     print("-------------------------------------------------")
#     print("|   Número   |   Modelo   |   Ano   |   Preço   |")
#     for i in range(len(carros['nome'])):
#         print(f"{i+1}. {carros['nome'][i]} ({carros['ano'][i]}): R$ {carros['preco'][i]:.2f} - portas: {carros['portas'][i]}")
#     print()

# # Exercício 7
# frase = "O bispo de Constantinopla é um bom desconstantinopolitanizador. Quem o desconstantinopolitanizar, um bom desconstantinopolitanizador será."
# frase = frase.lower()
# frase = frase.replace('.', '')
# frase = frase.replace(',', '')
# palavras = frase.split(' ')

# contador = {}

# for palavra in palavras:
#     if not palavra in contador.keys():
#         contador[palavra] = 1
#     else:
#         contador[palavra] += 1
# print(contador)

# print()

# # Exercício 8
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
comuns = []
nao_comuns = []

for key in dic_1:
    if key in dic_2.keys():
        comuns.append(key)

for key_1 in dic_1:
    if not key_1 in dic_2.keys():
        nao_comuns.append(key_1)

for key_2 in dic_2:
    if not key_2 in dic_1.keys():
        nao_comuns.append(key_2)

print("Comuns:", comuns)
print("Não comuns:", nao_comuns)

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