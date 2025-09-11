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