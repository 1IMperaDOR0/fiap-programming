def forca_opcao(msg, lista_opcoes):
    msg += '\n' + '\n' + '\n'.join(lista_opcoes) + '\n' + '\n-> '
    opcao = input(msg)
    while opcao not in lista_opcoes:
        print("Erro!")
        opcao = input(msg)
    return opcao

def acha_indice(lista, elem):
    for i in range(len(lista)):
        if lista[i] == elem:
            return i

def indice_maior(lista):
    indice_maior = 0
    for i in range(len(lista)):
        if lista[i] > lista[indice_maior]:
            indice_maior = i
    return indice_maior

def indice_menor(lista):
    indice_menor = 0
    for i in range(len(lista)):
        if lista[i] < lista[indice_menor]:
            indice_menor = i
    return indice_menor

dic = {
    'oi' : 'olá',
    'tchau' : 'flw'
}
# resposta = forca_opcao('Diga oi ou tchau: ', dic.keys())
# print(dic[resposta])

carros = {
    'nome' : ['celta', 'up', 'kombi', 'uno'],
    'portas' : [4, 2, 6, 2],
    'preço' : [1000, 200, 300, 100],
    'ano de fabricação' : [2014, 2018, 1970, 2005]
}

def informacoes():
    escolha = forca_opcao("Qual carro você quer?", carros['nome'])
    indice_escolha = acha_indice(carros['nome'], escolha)
    for key in carros.keys():
        print(f"{key} : {carros[key][indice_escolha]}")
    return
print()

def mais_caro():
    local_mais_caro = indice_maior(carros['preço'])
    print('As infos sobre o carro mais caro são:')
    for key in carros.keys():
        print(f"{key} : {carros[key][local_mais_caro]}")
    return

print()

def mais_barato():
    local_mais_barato = indice_menor(carros['preço'])
    print('As infos sobre o carro mais barato são:')
    for key in carros.keys():
        print(f"{key} : {carros[key][local_mais_barato]}")
    print()
    return

def cadastrar():
    for key in carros.keys():
        info = input(f"Diga o novo {key}: ")
        carros[key].append(info)
    print(carros)
    return

def remover():
    remover = forca_opcao("Qual carro você quer remover?", carros['nome'])
    indice_remover = acha_indice(carros['nome'],remover)
    for key in carros.keys():
        carros[key].pop(indice_remover)
    print(carros)
    return

def atualizar():
    atualizar = forca_opcao("Qual carro você deseja atualizar?",carros['nome'])
    indice_atualizar = acha_indice(carros['nome'], atualizar)
    for key in carros.keys():
        carros[key][indice_atualizar] = input(f"Diga o novo {key} do {atualizar}")
    return

frase = 'O bispo de Constantinopla é um bom desconstantinopolitanizador. Quem o desconstantinopolitanizar, um bom desconstantinopolitanizador será.'
frase = frase.lower()
for char in ',.:;?!':
    frase = frase.replace(char,'')
print(frase)
palavras = frase.split(' ')
contador = {}
for palavra in palavras:
    if palavra not in contador.keys():
        contador[palavra] = 1
    else:
        contador[palavra] += 1

numeros ={
    'zero' : '0',
    'dois' : '2',
    'cinco' : '5'
}

frase = 'Eu tenho aula na sala cinco zero dois'
for key in numeros.keys():
    frase = frase.replace(key+' ', numeros[key])
    frase = frase.replace(key, numeros[key])

print(frase)

dic_1 = {'a' : 10,'b':20,'c':30}
dic_2 = {'b' : 10,'c':20,'d':30}

comuns = []
for key_1 in dic_1.keys():
    if key_1 in dic_2.keys():
        comuns.append(key_1)
print(comuns)

incomuns = []
for key_1 in dic_1.keys():
    if key_1 not in dic_2.keys():
        incomuns.append(key_1)

for key_2 in dic_2.keys():
    if key_2 not in dic_1.keys():
        incomuns.append(key_2)
print(incomuns)