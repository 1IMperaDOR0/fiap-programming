'''# Revisão da ideia
lista_desordenada = [5,0,4,1,2,7,6,3]
lista_ordenana = []

lista_desordenada = [5,4,1,2,7,6,3]
lista_ordenana = [0]'''

def acha_menor(lista):
    indice_menor = 0
    for i in range(len(lista)):
        if lista[i] < lista[indice_menor]:
            indice_menor = i
    return  indice_menor

'''def selection_sort(lista):
    lista_ordenada = []
    while lista:
        indice_menor = acha_menor(lista)
        menor = lista.pop(indice_menor)
        lista_ordenada.append(menor)
        print(lista_ordenada)
    return lista_ordenada'''

def selection_sort(lista):
    for i in range(len(lista)):
        indice_menor = acha_menor(lista[i:]) + i
        aux = lista[i]
        lista[i] = lista[indice_menor]
        lista[indice_menor] = aux
    print(lista)
    return

def bubble_sort(lista):
    for i in range(len(lista)):
        t = 0
        for j in range(len(lista) - 1 - i):
            if lista[j] > lista[j + 1]:
                aux = lista[j + 1]
                lista[j + 1] = lista[j]
                lista[j] = aux
                t += 1
            print(lista)
        print()
        if t == 0:
            break
    return

lista_desordenada = [5,4,0,1,2,7,6,3]
# selection_sort(lista_desordenada)
bubble_sort(lista_desordenada)

'''def busca_binaria(n):
    fim = n
    ini = 0
    while (fim - ini) > 0.0001:
        chute = (ini + fim) / 2
        if chute**2 > n:
            fim = chute
            print(chute)
        else:
            ini = chute
    return chute

busca_binaria(25)

# normal
def forca_numero():
    num = input("Diga um número:\n-> ")
    while not num.isnumeric():
        num = input("Diga um número:\n-> ")
    return int(num)

# recursiva
def forca_numero():
    num = input("Diga um número:\n-> ")
    if not num.isnumeric():
        num = forca_numero()
    return int(num)'''

def busca_binaria(n, ini = 0, fim = 0):
    if fim == 0:
        fim = n
    chute = (ini + fim) / 2
    if (fim - ini) > 0.0001:
        if chute**2 > n:
            fim = chute
        else:
            ini = chute
        chute = busca_binaria(n, ini, fim)
    print(chute)
    return chute

busca_binaria(25)

'''def forca_opcao(msg, conjunto):
    opcoes = '\n'.join(conjunto)
    escolha = input(f"{msg}:\n{opcoes}\n-> ")
    while not escolha in conjunto:
        escolha = input(f"{msg}:\n{opcoes}\n-> ")
    return escolha'''

def forca_opcao(msg, conjunto):
    opcoes = '\n'.join(conjunto)
    escolha = input(f"{msg}:\n{opcoes}\n-> ")
    if not escolha in conjunto:
        escolha = forca_opcao(msg, conjunto)
    return escolha

print(forca_opcao("Escolha um número", ['1', '2', '3', '4']))