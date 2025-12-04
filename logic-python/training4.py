# Tentativa 1
saudacoes = {
    'oi': "olá",
    'tchau': "flw"
}

saudacao = input("Diga 'oi' ou 'tchau':\n-> ")

print(saudacoes[saudacao])

print()

carros = {
    'nome' : ['celta','up','kombi','uno'],
    'portas': [4,2,6,2],
    'preco' : [1000,200,300,100],
    'ano' : ['2014','2018','1970','2005']
}

for i in range(len(carros['nome'])):
    for key in carros.keys():
        print(f"{key}: {carros[key][i]}")
    print()

def acha_index(lista, elem):
    for i in range(len(lista)):
        if lista[i] == elem:
            return i

escolha = input(f"Escolha um carro:\n{"\n".join(carros['nome'])}\n-> ")

print()

index_escolha = acha_index(carros['nome'], escolha)

for key in carros.keys():
    print(f"{key}: {carros[key][index_escolha]}")

print()

def acha_index_maior(lista):
    index_maior = 0
    for i in range(len(lista)):
        if lista[i] > lista[index_maior]:
            index_maior = i
    return index_maior

index_maior = acha_index_maior(carros['preco'])
for key in carros.keys():
    print(f"{key}: {carros[key][index_maior]}")

print()

def acha_index_menor(lista):
    index_menor = 0
    for i in range(len(lista)):
        if lista[i] < lista[index_menor]:
            index_menor = i
    return index_menor

index_menor = acha_index_menor(carros['preco'])
for key in carros.keys():
    print(f"{key}: {carros[key][index_menor]}")

print()

def forca_opcao(msg, lista):
    opcao = input(f"{msg}\n{"\n".join(lista)}\n-> ")
    while not opcao in lista:
        print("Opção inválida!")
        opcao = input(f"{msg}\n{"\n".join(lista)}\n-> ")
    return opcao

opcoes = ['s', 'n']

opcao = forca_opcao("Você quer adicionar um novo carro?", opcoes)

if opcao == 's':
    for key in carros.keys():
        nova_key = input(f"Diga o(a) novo(a) {key}:\n-> ")
        carros[key].append(nova_key)
        print(carros[key])

print()

opcao = forca_opcao("Você gostaria de remover um carro?", opcoes)

if opcao == 's':
    carro = forca_opcao("Qual carro você quer remover?", carros['nome'])
    index_remover = acha_index(carros['nome'], carro)
    for key in carros.keys():
        carros[key].pop(index_remover)
        print(carros[key])
    
print()

numeros = {
    'zero': '0',
    'um': '1',
    'dois': '2'
}

frase = "um dois zero"
print(frase)
frase = frase.replace(' ', '')
print(frase)
for key in numeros.keys():
    frase = frase.replace(key, numeros[key])
print(frase)

dic_1 = {
    'a': 1,
    'b': 2,
    'c': 3
}

dic_2 = {
    'b': 2,
    'c': 3,
    'd': 4
}

comuns = []
for key in dic_1:
    if key in dic_2:
        comuns.append(key)
print(comuns)

incomuns = []
for key in dic_1:
    if not key in dic_2:
        incomuns.append(key)
for key in dic_2:
    if not key in dic_1:
        incomuns.append(key)
print(incomuns)