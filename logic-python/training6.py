def acha_menor(lista):
    indice_menor = 0
    for i in range(len(lista)):
        if lista[i] < lista[indice_menor]:
            indice_menor = i
    return indice_menor

def forca_numero(msg):
    n = input(msg)
    while not n.isnumeric():
        print("Caractere inválido! Precisa ser um número!")
        n = input(msg)
    n = int(n)
    return n

def cria_lista():
    tamanho = forca_numero("Digite o tamanho da lista:\n-> ")
    lista = input(f"Digite os elementos da lista separados por vírgula:\n-> ")
    lista = lista.split(',')
    while len(lista) != tamanho:
        print("Elementos insuficientes!")
        lista = input(f"Digite os elementos da lista separados por vírgula:\n-> ")
        lista = lista.split(',')
    for i in range(tamanho):
        if not lista[i].isnumeric():
            lista[i] = forca_numero(f"Digite o elemento no indice {i} como um número:\n-> ")
        else:
            lista[i] = int(lista[i])
    return lista

lista_exemplo = [232,3232,232323,2121,111,1]

menor = acha_menor(lista_exemplo)

print(f"A posição do menor elemento na lista é: {menor}\nO menor elemento da lista é: {lista_exemplo[menor]}")

def selection_sort(lista):
    lista_ordenada = []
    while lista:
        indice = acha_menor(lista_exemplo)
        elem = lista_exemplo.pop(indice)
        lista_ordenada.append(elem)
    return lista_ordenada

lista_crescente = selection_sort(lista_exemplo)

print(f"A lista ordenada é: {lista_crescente}")

lista_crescente = cria_lista()

 
for i in range(len(lista_crescente)):
    print(lista_crescente[i:])

def selection_sort_melhor(lista):
    for i in range(len(lista)):
        indice = acha_menor(lista[i:]) + i
        aux = lista[i]
        lista[i] = lista[indice]
        lista[indice] = aux
    return lista    

lista_crescente_melhor = selection_sort_melhor(lista_crescente)    
print(lista_crescente_melhor)

def bubble_sort(lista):
    for i in range(len(lista)):
        t = 0
        for j in range(len(lista) - 1 - i):
            if lista[i] > lista[j+1]:
                aux = lista[i]
                lista[i] = lista[j+1]
                lista[j+1] = aux
                t += 1
                print(lista) 
        if t == 0:
            break
        return lista    
    
lista_crescente = cria_lista()
  
lista_bubble = bubble_sort(lista_crescente)