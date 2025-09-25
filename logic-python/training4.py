# Desafio
acougue = {
    'Carne' : ['Patinho','Coxão Mole','Fraldinha','Picanha','Maminha','LINGÜIÇA'],
    'R$/kg' : [35.90, 49.90, 39.90, 80.00, 45.90, 15],
    'Estoque' : [10, 50, 30, 15, 20, 100],
    'Validade' : ['4','7','5','9','20','50']
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
        total = acougue['R$/kg'][escolha]*qtd
        print()
        show_menu(acougue)
        return total

def cadastrar(dic):
    for key in dic.keys():
        info = input(f"Diga o novo {key}: ")

        if key == 'R$/kg':
            info = float(info)
        elif key in ['Estoque','Validade']:
            info = int(info)

        dic[key].append(info)
    return

def remover(dic):
    remover = forca_opcao("Qual carne você quer remover?", dic['Carne'])
    indice_remover = acha_indice(dic['Carne'],remover)
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

print(f"O total ficou R$ {total:.2f}")

print()

adicionar = forca_opcao("Quer adicionar uma carne?", ['s', 'n'])

if adicionar == 's':
    cadastrar(acougue)
    show_menu(acougue)

print()

tirar = forca_opcao("Quer remover uma carne?", ['s', 'n'])

if tirar == 's':
    remover(acougue)
    show_menu(acougue)