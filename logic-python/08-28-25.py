import matplotlib.pyplot as plt

matriz = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
'''print(matriz[2][1])'''

'''def elementos_matriz(matriz):
    for i in range(len(matriz)):
        for j in range(len(matriz[0])):
            print(f'Matriz{i}{j} = {matriz[i][j]}')
    return '''


'''print(cria_matriz(4, 4))'''

def mostra_matriz(matriz):
    for linha in matriz:
        print(linha)
    return

#===========Mostrar a matriz==========#



'''imagem = cria_matriz(10, 10)'''
'''print(mostra_matriz(imagem))'''



def cria_diagonal_bom(linhas,colunas):
    diagonal = cria_matriz(linhas,colunas)
    for i in range(len(diagonal)):
        diagonal[i][i] = 1
    return diagonal

def cria_matriz(linhas,colunas):
    matriz = []
    for i in range(linhas):
        linha = []
        for j in range(colunas):
            linha.append(i)
        matriz.append(linha)
    return matriz

def plotar_matriz(matriz):
    plt.imshow(matriz)
    plt.colorbar()
    plt.show()

'''matrizContraD = cria_matriz(10,10)
for i in range(len(matrizContraD)):
    for j in range(len(matrizContraD)):
        if j == len(matrizContraD) - i - 1:
            matrizContraD[i][j] = 1
mostra_matriz(matrizContraD)
plotar_matriz(matrizContraD)'''

'''
xadrez = cria_matriz(8,8)
for i in range(len(xadrez)):
    for j in range(len(xadrez[0])):
        if i%2 == 0:
            if j%2 == 0:
                xadrez[i][j] = 0
            else:
                xadrez[i][j] = 1
        else:
            if j%2 == 0:
                xadrez[i][j] = 1
            else:
                xadrez[i][j] = 0'''


'''def gerar_matriz_xadrez(xadrez):
    for i in range(len(xadrez)):
        for j in range(len(xadrez[0])):
            if i%2 == j%2:
                xadrez[i][j] = 0
            else:
                xadrez[i][j] = 1
    return

xadrez = cria_matriz(4, 4)
gerar_matriz_xadrez(xadrez)
plotar_matriz(xadrez)'''


'''triSuperior = cria_matriz(20, 20)
for i in range(len(triSuperior)):
    for j in range(len(triSuperior[0])):
        if i <= j:
            triSuperior[i][j] = 1
        else:
            triSuperior[i][j] = 0
plotar_matriz(triSuperior)'''

'''triSuperiorA = cria_matriz(20, 20)
for i in range(len(triSuperiorA)):
    for j in range(len(triSuperiorA[0])):
        if i < j:
            triSuperiorA[i][j] = 1
        elif i == j:
            triSuperiorA[i][j] = 2
        else:
            triSuperiorA[i][j] = 0
plotar_matriz(triSuperiorA)'''


matrizT = cria_matriz(10, 10)
for i in range(len(matrizT)):
    for j in range(len(matrizT[0])):
        if i>j:
            aux = matrizT[i][j]
            matrizT[i][j] = matrizT[j][i]
            matrizT[j][i] = aux
plotar_matriz(matrizT)

g = [
    [1, 2, 3],
    [1, 2, 3],
    [1, 2, 3]
]
for i in range(len(g)):
    for j in range(len(g[0])):
        if i>j:
            aux = g[i][j]
            g[i][j] = g[j][i]
            g[j][i] = aux
plotar_matriz(g)