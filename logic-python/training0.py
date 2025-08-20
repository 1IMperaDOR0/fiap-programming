# Tentativa 1
# def verifica_numero(msg):
#     numero = input(msg)
    
#     while not numero.isnumeric():
#         numero = input(f'Caractere inválido! {msg}')
#     numero = int(numero)

#     return numero

# def verifica_opcao(msg, lista):
#     opcao = input(msg)
    
#     while not opcao in lista:
#         opcao = input(f'Opção inválida! {msg}')

#     return opcao

# cliente = input('Olá! Digite seu nome para continuar:\n-> ')

# print(f'Seja bem vindo(a) {cliente} a nossa Vinheria Agnello! 😎😋😊')

# ano = verifica_numero('Digite o seu ano de nascimento:\n-> ')

# idade = 2025 - ano

# if idade < 18:
#     print(f'Que isso {cliente}? Venda de bebidas alcoolicas é proibida para menores! Que feio! Vou contar para sua mãe! 👀👩‍👧‍👧')
# else:
#     endereco = input(f'Por favor {cliente}, digite o seu endereço:\n-> ')

#     qtd_1 = 0
#     qtd_2 = 0
#     qtd_3 = 0
#     qtd_4 = 0

#     total = 0

#     frete = 0

#     vinhos = ['Vinho Legalzinho', 'Vinho Legal', 'Vinho Bom', 'Vinho Ótimo']

#     precos = [25, 50, 75, 100]

#     while True:

#         escolha = verifica_opcao(f'Aqui está o nosso catálogo de vinhos:\n{'\n'.join(vinhos)}\n-> ', vinhos)

#         if escolha == vinhos[0]:
#             vinho_escolhido = vinhos[0]
#             preco = precos[0]
#         elif escolha == vinhos[1]:
#             vinho_escolhido = vinhos[1]
#             preco = precos[1]
#         elif escolha == vinhos[2]:
#             vinho_escolhido = vinhos[2]
#             preco = precos[2]
#         else:
#             vinho_escolhido = vinhos[3]
#             preco = precos[3]

#         qtd = verifica_numero(f'Sua opção foi {vinho_escolhido}! Ele custa R$ {preco:.2f}! Quantos você vai querer?\n-> ')

#         total += preco * qtd

#         if escolha == vinhos[0]:
#             qtd_1 += qtd
#         elif escolha == vinhos[1]:
#             qtd_2 += qtd
#         elif escolha == vinhos[2]:
#             qtd_3 += qtd
#         else:
#             qtd_4 += qtd
        
#         s_n = ['s', 'n']

#         continuar = verifica_opcao('Você quer continuar? (s/n)\n-> ', s_n)

#         if total < 500:
#             frete = 15

#         if continuar == 'n':
#             print(f'Você comprou {qtd_1} unidades de {vinhos[0]}, {qtd_2} unidades de {vinhos[1]}, {qtd_3} unidades de {vinhos[2]} e {qtd_4} unidades de {vinhos[3]}.\nO seu frete ficou R$ {frete:2f}!\nEntão o total ficou R$ {total + frete}.\nSeu pedido será entregue no endereço {endereco}!\nMuito obrigado {cliente} pela preferência!')
#             break

# Tentativa 2
# def verifica_numero(msg):
#     numero = input(msg)
    
#     while not numero.isnumeric():
#         numero = input(f'Caractere inválido! {msg}')
#     numero = int(numero)

#     return numero

# def verifica_opcao(msg, lista):
#     opcao = input(msg)
    
#     while not opcao in lista:
#         opcao = input(f'Opção inválida! {msg}')

#     return opcao

# cliente = input('Olá! Digite seu nome para continuar:\n-> ')
# print(f'Seja bem-vindo(a) {cliente} à nossa Vinheria Agnello! 😎😋😊')

# ano = verifica_numero('Digite o seu ano de nascimento:\n-> ')
# idade = 2025 - ano

# if idade < 18:
#     print(f'Que isso {cliente}? Venda de bebidas alcoólicas é proibida para menores! Que feio! Vou contar pra sua mãe! 👀👩‍👧‍👧')
# else:
#     endereco = input(f'Por favor {cliente}, digite o seu endereço:\n-> ')

#     vinhos = ['Vinho Legalzinho', 'Vinho Legal', 'Vinho Bom', 'Vinho Ótimo']
#     precos = [25, 50, 75, 100]
#     quantidades = [0, 0, 0, 0]

#     total = 0

#     while True:
#         print('Catálogo de Vinhos:')
#         for i in range(len(vinhos)):
#             print(f'{i + 1}. {vinhos[i]} - R$ {precos[i]:.2f}')

#         opcao = verifica_numero('Digite o número do vinho desejado:\n-> ')

#         while opcao < 1 or opcao > len(vinhos):
#             opcao = verifica_numero('Digite o número do vinho desejado:\n-> ')

#         index = opcao - 1 
#         escolha = vinhos[index]
#         preco = precos[index]

#         qtd = verifica_numero(f'Sua opção foi {escolha}! Ele custa R$ {preco:.2f}. Quantos você vai querer?\n-> ')
#         quantidades[index] += qtd
#         total += preco * qtd

#         continuar = verifica_opcao('Você quer continuar? (s/n)\n-> ', ['s', 'n'])
#         if continuar == 'n':
#             break

#     frete = 0
#     if total < 500:
#         frete = 15

#     print('\nResumo do pedido:')
#     for i in range(len(vinhos)):
#         print(f'{quantidades[i]} unidades de {vinhos[i]}')

#     print(f'\nFrete: R$ {frete:.2f}')
#     print(f'Total: R$ {total + frete:.2f}')
#     print(f'\nSeu pedido será entregue no endereço: {endereco}')
#     print(f'Muito obrigado, {cliente}, pela preferência! 🍷')

# Tentativa 3
# def verifica_numero(msg):
#     numero = input(msg)

#     while not numero.isnumeric():
#         numero = input(f'Caractere inválido! {msg}')
#     numero = int(numero)

#     return numero


# def verifica_opcao(msg, lista):
#     opcao = input(msg)

#     while not opcao in lista:
#         opcao = input(f'Opção inválida! {msg}')

#     return opcao


# cliente = input('Olá! Digite seu nome:\n-> ')
# print(f'Seja bem-vindo(a) {cliente} a Vinheria Agnello!')

# ano = verifica_numero('Por favor informe o seu ano de nascimento:\n-> ')

# idade = 2025 - ano

# if idade < 18:
#     print('Que feio! Venda de bebidas alcoolicas é proibida para menores de idade!')
# else:
#     endereco = input('Qual é o seu endereço?\n-> ')

#     vinhos = ['Vinho Legalzinho', 'Vinho Legal', 'Vinho Bom', 'Vinho Ótimo']
#     precos = [20, 40, 60, 80, 100]
#     qtds = [0, 0, 0, 0, 0]

#     total = 0

#     while True:
#         print('Aqui está o nosso catálogo de vinhos:')
#         for i in range(len(vinhos)):
#             print(f'{i + 1}. {vinhos[i]} - R$ {precos[i]}')

#         escolha = verifica_numero('Digite o número correspondente ao vinho que você deseja:\n-> ')

#         while escolha < 1 or escolha > len(vinhos):
#             escolha = verifica_numero('Digite o número correspondente ao vinho que você deseja:\n-> ')

#         index = escolha - 1
#         escolha = vinhos[index]
#         preco = precos[index]

#         qtd = verifica_numero(f'A sua escolha foi {escolha}! Quantos você deseja?\n-> ')

#         qtds[index] += qtd

#         total += preco * qtd

#         continuar = verifica_opcao('Você quer continuar comprando? (s/n)\n-> ', ['s', 'n'])

#         if continuar == 'n':
#             break

#     frete = 0

#     if total < 500:
#         frete = 15

#     total += frete

#     print('Resumo da compra:')
#     for i in range(len(vinhos)):
#         print(f'{qtds[i]} unidades de {vinhos[i]}.')

#     print(f'Frete: R$ {frete}\nTotal (com frete): R$ {total}\nSeu pedido vai ser entrege para {endereco}.\nObrigado {cliente} pela preferência.')

# Tentativa de 4
def verifica_numero(msg):
    numero = input(msg)

    while not numero.isnumeric():
        numero = input(f'Caractere inválido! {msg}')
    numero = int(numero)

    return numero

def verifica_opcao(msg, lista):
    opcao = input(msg)

    while not opcao in lista:
        opcao = input(f'Opção inválida! {msg}')

    return opcao

def achar_indice(elem, lista):
    for i in range(len(lista)):
        if lista[i] == elem:
            return i

cliente = input('Olá! Digite seu nome:\n-> ')
print(f'Seja bem-vindo(a) {cliente} a Vinheria Agnello!')

ano = verifica_numero('Por favor informe o seu ano de nascimento:\n-> ')

idade = 2025 - ano

if idade < 18:
    print('Que feio! Venda de bebidas alcoolicas é proibida para menores de idade!')
else:
    endereco = input('Qual é o seu endereço?\n-> ')

    vinhos = ['Vinho Legalzinho', 'Vinho Legal', 'Vinho Bom', 'Vinho Ótimo']
    precos = [20, 40, 60, 80, 100]
    qtds = [0, 0, 0, 0, 0]
    posicao = ['1', '2', '3', '4', '5']

    total = 0

    while True:
        print('Aqui está o nosso catálogo de vinhos:')
        for i in range(len(vinhos)):
            print(f'{i + 1}. {vinhos[i]} - R$ {precos[i]}')

        escolha = verifica_opcao('Digite o número correspondente ao vinho que você deseja:\n-> ', num)

        index = achar_indice(escolha, posicao)
        escolha = vinhos[index]
        preco = precos[index]

        qtd = verifica_numero(f'A sua escolha foi {escolha}! Quantos você deseja?\n-> ')

        qtds[index] += qtd

        total += preco * qtd

        continuar = verifica_opcao('Você quer continuar comprando? (s/n)\n-> ', ['s', 'n'])

        if continuar == 'n':
            break

    frete = 0

    if total < 500:
        frete = 15

    total += frete

    print('Resumo da compra:')
    for i in range(len(vinhos)):
        print(f'{qtds[i]} unidades de {vinhos[i]}.')

    print(f'Frete: R$ {frete}\nTotal (com frete): R$ {total}\nSeu pedido vai ser entrege para {endereco}.\nObrigado {cliente} pela preferência.')