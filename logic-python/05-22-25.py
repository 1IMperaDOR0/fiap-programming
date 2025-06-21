'''
# qtd = input('Quantos números você vai colocar na lista?\n-> ')

# while not qtd.isnumeric():
#     qtd = input('Caractere inválido! Quantos números você vai colocar na lista?\n-> ')
# qtd = int(qtd)

def verifica_numero(msg):
    numero = input(msg)
    
    while not numero.isnumeric():
        numero = input(msg)
    numero = int(numero)

    return numero

qtd = verifica_numero('Quantos números você vai colocar na lista?\n-> ')

print(qtd)

lista = []

while len(lista) < qtd:
    # num = input(f'Diga o {len(lista) + 1}° número:\n-> ')
    
    # while not num.isnumeric():
    #     num = input(f'Diga o {len(lista) + 1}° número:\n-> ')
    # num = int(num)
    # lista.append(num)
    
    num = verifica_numero(f'Diga o {len(lista) + 1}° número:\n-> ')
    
    print(lista)
    print('')

def forca_opcao(msg, lista_opcoes):
    opcoes = '\n'.join(lista_opcoes)
    escolha = input(f'{msg}\n{opcoes}\n-> ')

    while not escolha in lista_opcoes:
        escolha = input(f'Inválido! {msg}\n{opcoes}\n-> ')
        
    return escolha

while True:   
    vinhos = ['Vinho_1', 'Vinho_2', 'Vinho_3']
    vinho = forca_opcao('Qual vinho você deseja?', vinhos)
    print(f'Você escolheu o {vinho}')
    
    opcoes = ['s', 'n']
    continuar = forca_opcao('Você quer continuar?', opcoes)
    
    if continuar == 'n':
        break

print('')

def achar_media(lista_numeros):
    soma = 0
    for num in lista_numeros:
        soma += num
    media = soma/len(lista_numeros)
    return media

def conta_pares(lista_numeros):
    pares_achados = 0
    for num in lista_numeros:
        if num % 2 == 0:
            pares_achados += 1
    return pares_achados

def achar_maior(lista_numeros):
    maior_numero = lista_numeros[0]
    for num in lista_numeros:
        if num > maior_numero:
            maior_numero = num
    return maior_numero

lista01 = [10, 8, 2, 4, 5]

media01 = achar_media(lista01)
print(media01)

pares01 = conta_pares(lista01)
print(pares01)

maior01 = achar_maior(lista01)
print(maior01)

print('')

lista02 = [10, 2, 4, 5, 1]

media02 = achar_media(lista02)
print(media02)

pares02 = conta_pares(lista02)
print(pares02)

maior02 = achar_maior(lista02)
print(maior02)

print('')
'''

def join(lista_str, sep):
    ajuntado = lista_str[0]
    for i in range(1, len(lista_str)):
        ajuntado += sep + lista_str[i]
    return ajuntado 

def achar_caro(lista_nomes, lista_precos):
    index = 0
    lista_preco = lista_precos[index]
    for i in range(len(lista_nomes)):
        if lista_precos[i] > lista_preco:
            index = i
            lista_preco = lista_precos[i]
        
    msg = print(f'Nome: {lista_nomes[index]}\nPreço: {lista_preco}')
    return msg

carros = ['Up', 'Gol', 'Polinho Turbão Manual', 'Uno', 'Celta']

precos = [40, 50, 1000000, 100, 200]

carro_caro = achar_caro(carros, precos)

print('')

def escolher(msg, resposta, lista_coisas, lista_precos):
    escolha = input(f'{msg}\n{join(lista_coisas, '\n')}\n-> ')

    while escolha not in lista_coisas:
        escolha = input(f'Inválido! {msg}\n{join(lista_coisas, '\n')}\n-> ')

    index = 0
    for i in range(len(precos)):
        if lista_coisas[i] == escolha:
            index = i
            preco = lista_precos[i]
            
    preco = lista_precos[index]

    resposta = print(f'{resposta} {escolha} que custa R$ {preco:.2f} reais.')

carro_escolhido = escolher('Escolha seu carro:', 'O carro selecionado foi', carros, precos)
