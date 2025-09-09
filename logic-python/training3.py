import matplotlib.pyplot as plt

# Tentativa 1
def show_matriz(matriz):
    for i in range(len(matriz)):
        print(matriz[i])
    print()
    return

def plotar_matriz(matriz):
    plt.imshow(matriz)
    plt.colorbar()
    plt.show()

# Exercício 1 e 2
def build_matriz(linhas, colunas):
    matriz = []
    for i in range(linhas):
        linha = []
        for j in range(colunas):
            linha.append(0)
        matriz.append(linha)
    return matriz

matriz_1 = build_matriz(10, 10)
show_matriz(matriz_1)

# Exercício 3
def diagonal(matriz):
    for i in range(len(matriz)):
        matriz[i][i] = 1
    return

diagonal(matriz_1)
show_matriz(matriz_1)
plotar_matriz(matriz_1)

# Exercício 4
def contra_diagonal(matriz):
    for i in range(len(matriz)):
        j = len(matriz) - i - 1
        matriz[i][j] = 1
    return

matriz_2 = build_matriz(10, 10)
contra_diagonal(matriz_2)
show_matriz(matriz_2)
plotar_matriz(matriz_2)

# Exercício 5
def xadrez(matriz):
    for i in range(len(matriz)):
        for j in range(len(matriz[i])):
            matriz[i][j] = 0
            if i%2 == j%2:
                matriz[i][j] = 1
    return

matriz_3 = build_matriz(8, 8)

xadrez(matriz_3)
show_matriz(matriz_3)
plotar_matriz(matriz_3)

# Exercício 6
def tranposta(matriz):
    for i in range(len(matriz)):
        for j in range(len(matriz[i])):
            matriz[i][j] = i
            if i > j:
                aux = matriz[i][j]
                matriz[i][j] = matriz[j][i]
                matriz[j][i] = aux
    return

matriz_4 = build_matriz(10, 10)
tranposta(matriz_4)
show_matriz(matriz_4)
plotar_matriz(matriz_4)

# Exercício 7
def linha(matriz):
    for i in range(len(matriz)):
        for j in range(len(matriz[i])):
            if i%2 != 0:
                matriz[i][j] = 1
    return

matriz_5 = build_matriz(10, 10)
linha(matriz_5)
show_matriz(matriz_5)
plotar_matriz(matriz_5)

# Exercício 8
matriz_6 = build_matriz(10, 10)

raio = len(matriz_6)/2
for i in range(len(matriz_6)):
    for j in range(len(matriz_6[0])):
        if (i-raio)**2 + (j-raio)**2 <= raio**2:
            matriz_6[i][j] = 1
        else:
            matriz_6[i][j] = 0

show_matriz(matriz_6)
plotar_matriz(matriz_6)

# Exercício 9
cinema = build_matriz(4, 4)
show_matriz(cinema)

for i in range(len(cinema)):
    for j in range(i, len(cinema[i])):
        aux = cinema[j][i]
        cinema[i][j] = aux
        cinema[j][i] = i

show_matriz(cinema)

for i in range(len(cinema)):
    for j in range(len(cinema[i])):
        if i%2 == j%2:
            cinema[i][j] = "vaga"
        else:
            cinema[i][j] = "ocupada"

show_matriz(cinema)