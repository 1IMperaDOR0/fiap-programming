# Look Up Table

'''dic = {'chave': "valor"}
print(dic['chave'])

dic['novaChave'] = "novoValor"
print(dic['novaChave'])

dic['chave'] = "alterandoValor"
print(dic)

lados = {
    '3': "triângulo",
    '4': "quadrado",
    '5': "pentagôno",
    '6': "hexágono"
}

def verifica_opcao(mensagem, dic):
    resposta = input(f"{mensagem}:\n{"\n".join(dic)}\n-> ")
    while not resposta in dic:
        print("Opção inválida!")
        resposta = input(f"{mensagem}\n{"\n".join(dic)}\n-> ")
    return dic[resposta]

poligono = verifica_opcao("Digite um número de lados das opções a seguir para descobrir o polígono:", lados)
print(poligono)

emojis = {
    ':)': "😊",
    'B)': "😎",
    ':(': "☹️",
    '<3': "❤️"
}

texto = "Eu amo python <3!"
for key in emojis.keys():
    texto = texto.replace(key, emojis[key])
print(texto)

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

dic = {
    'nome': ['danilo', 'lucas', 'henrique', 'matheus', 'vinicius'],
    'idade': [30, 20, 19, 18, 21]
}
for i in range(len(dic['nome'])):
    for key in dic.keys():
        print(f"{key}: {dic[key][i]}")
    print()

frase = "A aranha arranha a rã. A rã arranha a aranha. Nem a aranha arranha a rã. Nem a rã arranha a aranha."
print(frase)
frase = frase.lower()
print(frase)
frase = frase.replace('.', '')
print(frase)
palavras = frase.split(' ')
print(palavras)

contador = {}
for palavra in palavras:
    if not palavra in contador.keys():
        contador[palavra] = 1
    else:
        contador[palavra] += 1
print(contador)
'''

# Exercício 1
saudacoes = {
    'oi': ['olá', 'salve', 'bão'],
    'tchau': ['flw', 'tchau']
}

resposta = input('Diga "oi" ou "tchau":\n-> ')
print(saudacoes[resposta][0])

print()

# Exercício 2
carros = {
    'nomes': ['polinho turbão manual', 'up', 'uno', 'celta'],
    'portas': [4, 2, 6, 2],
    'preco': [1000000, 200, 300, 100],
    'ano': [2014, 2018, 1970, 2005]
}

print("-------- CARROS --------")
for i in range(len(carros['nomes'])):
    print(f"{i+1}. {carros['nomes'][i]} ({carros['ano'][i]}): R$ {carros['preco'][i]:.2f}")
print()
carro = input("Digite um carro da lista acima:\n-> ")

for i in range(len(carros['nomes'])):
    if carro == carros['nomes'][i]:
        print(f"{i+1}. {carros['nomes'][i]} ({carros['ano'][i]}): R$ {carros['preco'][i]:.2f}")

print()

# Exercício 3
for i in range(len(carros['nomes'])):
    for j in range(len(carros['nomes'])):
        if carros['preco'][j] > carros['preco'][i]:
            index = j
            print(carros['nomes'][index])
print(carros['nomes'][index])