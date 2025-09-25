# Desafio
acougue = {
    'Carne': ['Patinho', 'Coxão Mole', 'Fraldinha', 'Picanha', 'Maminha', 'LINGÜIÇA'],
    'R$/kg': [35.90, 49.90, 39.90, 80.00, 45.90, 15],
    'Estoque': [10, 50, 30, 15, 20, 100],
    'Validade': ['4', '7', '5', '9', '20', '50']
}

total = 0

def show_menu(dic):
    print()
    print("===== AÇOGUE =====")
    for i in range(len(dic['Carne'])):
        for key in dic.keys():
            print(f"{key}: {dic[key][i]}")
        print("==================")
    print()
    return dic

def forca_opcao(msg, lista_opcoes):
    msg += '\n' + '\n' + '\n'.join(lista_opcoes) + '\n' + '\n-> '
    opcao = input(msg)
    while opcao not in lista_opcoes:
        print("Erro!")
        opcao = input(msg)
    return opcao

def forca_numero(msg):
    qtd = input(f"{msg}\n-> ")
    while not qtd.isnumeric():
        print("Caractere inválido!")
        qtd = input(f"{msg}\n-> ")

    qtd = int(qtd)
    return qtd

def acha_indice(lista, elem):
    for i in range(len(lista)):
        if lista[i] == elem:
            return i

def remove_estoque(qtd, escolha):
    if qtd > acougue['Estoque'][escolha]:
        print()
        print("Pediu mais do que temos ou acabou!")
        print()
        return 0
    else:
        acougue['Estoque'][escolha] -= qtd
        total = acougue['R$/kg'][escolha] * qtd
        print()
        show_menu(acougue)
        return total

def cadastrar(dic):
    for key in dic.keys():
        info = input(f"Diga o novo {key}: ")

        if key == 'R$/kg':
            info = float(info)
        elif key in ['Estoque', 'Validade']:
            info = int(info)

        dic[key].append(info)
    return

def remover(dic):
    remover = forca_opcao("Qual carne você quer remover?", dic['Carne'])
    indice_remover = acha_indice(dic['Carne'], remover)
    for key in dic.keys():
        dic[key].pop(indice_remover)
    return

while True:
    show_menu(acougue)

    escolha = forca_opcao("Escolha qual carne você quer:", acougue['Carne'])
    escolha = acha_indice(acougue['Carne'], escolha)

    print()

    qtd = forca_numero("Quantos kilos você vai querer?")
    dindin = remove_estoque(qtd, escolha)
    total += dindin

    continuar = forca_opcao("Quer continuar comprando?", ['s', 'n'])

    if continuar == 'n':
        break

print()

print(f"O total ficou R$ {total:.2f}")

print()

admin = forca_opcao("Você é admin?", ['s', 'n'])
if admin == 's':
    while True:
        adicionar = forca_opcao("Quer adicionar uma carne?", ['s', 'n'])

        if adicionar == 's':
            cadastrar(acougue)
            show_menu(acougue)

        print()

        tirar = forca_opcao("Quer remover uma carne?", ['s', 'n'])

        if tirar == 's':
            remover(acougue)
            show_menu(acougue)

        continuar = forca_opcao("Quer continuar alterando?", ['s', 'n'])

        if continuar == 'n':
            break

# Correção
# import pandas as pd
import requests

acougue = {
    'Carne': ['Patinho', 'Coxão Mole', 'Fraldinha', 'Picanha', 'Maminha', 'LINGÜIÇA'],
    'Preço/kg': [35.90, 49.90, 39.90, 80.00, 45.90, 15],
    'Estoque': [10, 50, 30, 15, 20, 100],
    'Validade': ['4', '7', '5', '9', '20', '50']
}

# print(pd.DataFrame(acougue))

def forca_numero(msg):
    num = input(f"{msg}\n-> ")
    while not num.isnumeric():
        print("Caractere inválido!")
        num = input(f"{msg}\n-> ")
    return int(num)

def forca_opcao(msg, lista):
    opcoes = '\n'.join(lista)
    opcao = input(f"{msg}\n{opcoes}\n-> ")
    while not opcao in lista:
        print("Inválido")
        opcao = input(f"{msg}\n{opcoes}\n-> ")
    return opcao

def cria_indices():
    indices = {acougue['Carne'][i]: i for i in range(len(acougue['Carne']))}
    '''indices = {}
    for i in range(len(acougue['Carne'])):
        indices[acougue['Carne'][i]] = i'''
    return indices

def cadastrar():
    global indices
    for key in acougue.keys():
        info = input(f"Diga o novo {key}:\n-> ")
        acougue[key].append(info)
    indices = cria_indices()
    return

def remover():
    global indices
    item = forca_opcao("Qual item você quer remover?", acougue['Carne'])
    indice_item = indices[item]
    for key in acougue.keys():
        acougue[key].pop(indice_item)
    indices = cria_indices()
    return

def atualizar():
    item = forca_opcao("Qual item você deseja atualizar?", acougue['Carne'])
    indice_item = indices[item]
    keys = list(acougue.keys())
    keys.pop(0)
    for key in keys:
        if forca_opcao(f"Vc quer atualizar {key} para {item}?", ['s', 'n']) == 's':
            info = input(f"Diga o novo {key}: ")
            acougue[key][indice_item] = info

    '''key = forca_opcao("Qual chave você quer atualizar?", acougue.keys())
    item = forca_opcao("Qual item você quer atualizar?", acougue[key])
    indice_item = indices[item]

    acougue[key][indice_item] = input(f"Digite o novo valor do {acougue[key][indice_item]}:\n-> ")'''

    return

def comprar():
    item = forca_opcao("Qual item você quer comprar", acougue['Carne'])
    indice_item = indices[item]
    for key in acougue.keys():
        print(f"{key}: {acougue[key][indice_item]}")
    continuar = forca_opcao(f"Você quer levar {item}?", ['sim', 'não'])
    if continuar == 'não':
        return
    qtd = forca_numero(f"Quantos kilos de {item}?")
    carrinho['Valor Total'] += qtd*acougue['Preço/kg'][indice_item]
    if acougue['Estoque'][indice_item] >= qtd:
        acougue['Estoque'][indice_item] -= qtd
        if not item in carrinho['Itens'].keys():
            carrinho['Itens'][item] = qtd
        else:
            carrinho['Itens'][item] += qtd
    else:
        print(f"Só há {acougue['Estoque'][indice_item]}")
        comprar()
    return

def cadastro_cep():
    cep = input("Diga seu cep:\n-> ")
    endereco = requests.get(f"https://viacep.com.br/ws/{cep}/json/")
    if endereco.status_code == 200:
        carrinho['Endereço'] = endereco.json()
        carrinho['Endereço']['N°'] = input("Número da residência:\n-> ")
        carrinho['Endereço']['Complemento'] = input("Complemento:\n-> ")
    else:
        print("CEP inválido!")
        cadastro_cep()
    return

indices = cria_indices()

carrinho = {
    'Endereço': {
        "Rua": '',
        "Bairro": '',
        "N°": '',
        "CEP": ''
    },
    'Itens': {},
    'Valor Total': 0
}

while True:
    print("BEM-VINDO À AÇOGUERIA AGNELLO!!! 🍖🍖🍖")
    usuario = forca_opcao("Você é:", ['cliente', 'funcionario'])
    if usuario == "funcionario":
        operacao = forca_opcao("Qual operação será realizada?", ["cadastrar", "remover", "atualizar"])
        if operacao == "cadastrar":
            cadastrar()
        elif operacao == "remover":
            remover()
        else:
            atualizar()

        continuar = forca_opcao("Você deseja realizar outra operação", ['sim', 'nao'])
        if continuar == 'não':
            break
    else:
        comprar()
        encerrar = forca_opcao("Encerrar a compra ou ver mais itens?", ['encerrar', 'continuar'])
        if encerrar == 'encerrar':
            print(carrinho)
            break