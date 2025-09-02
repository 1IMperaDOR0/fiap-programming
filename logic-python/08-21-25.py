import matplotlib.pyplot as plt

'''
matriz = [[1,2,3,4], [4,5,6,7], [7,8,9,10]]

plt.imshow(matriz, "hot")
plt.colorbar()
plt.show()

print(matriz[0])
print(type(matriz[0]))
print(matriz[0][2])

for i in range(len(matriz)):
    for j in range(len(matriz[0])):
        print(f"matriz[{i}][{j}] = {matriz[i][j]}")
'''

def mostra_matriz(matriz):
    for linha in matriz:
        print(linha)
    return

def cria_matriz(linhas, colunas):
    matriz = []
    for i in range(linhas):
        linha = []
        for j in range(colunas):
            linha.append(0)
        matriz.append(linha)
    return matriz

a = cria_matriz(100,  100)

'''
for i in range(len(a)):
    for j in range(len(a[0])):
        if j == i:
            a[i][j] = 1

for i in range(len(a)):
    a[i][i] = 1

for i in range(len(a)):
    for j in range(len(a[0])):
        if i % 2 == 0:
            if j % 2 == 0:
                a[i][j] = 1
            else:
                a[i][j] = 0
        else:
            if j % 2 == 0:
                a[i][j] = 1
            else:
                a[i][j] = 0
'''

raio = len(a)/2
for i in range(len(a)):
    for j in range(len(a[0])):
        if (i-raio)**2 + (j-raio)**2 <= raio**2:
            a[i][j] = 1
        else:
            a[i][j] = 0

mostra_matriz(a)
plt.imshow(a, "hot")
plt.colorbar()
plt.show()