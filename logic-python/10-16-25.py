livros = [3, 4, 5, 2, 1, 7, 6]

def acha_menor(lista): # Selection Sort
    indice_menor = 0
    for i in range(len(lista)):
        if lista[i] < lista[indice_menor]:
            indice_menor = i
    return indice_menor

'''def ordena_lista(lista):
    nova_ordem = []
    while lista: # for i in range(len(lista)):
        print(lista)
        print(nova_ordem)
        indice_menor = acha_menor(lista)
        menor = lista.pop(indice_menor)
        nova_ordem.append(menor)
    print(lista)
    print(nova_ordem)
    return nova_ordem'''

def ordena_lista(lista):
    for i in range(len(lista)):
        indice_menor = acha_menor(lista[i:]) + i
        aux = lista[i]
        lista[i] = lista[indice_menor]
        lista[indice_menor] = aux
    return lista

print(ordena_lista(livros))

n = 25
fim = n
ini = 0
chute = (ini + fim) / 2
print(chute)
while chute != n:
    chute = (ini + fim) / 2
    if chute**2 > n:
        fim = chute
    else:
        ini = chute