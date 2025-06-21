for char in 'danilo':
    if char in ['a','e','i','o','u']:
        vogais += 1
print(vogais)

for i in range(10):
    print(i)

for i in range(1,10,3):#ini,fim,passo
    print(i)

for i in range(20,10,-2):
    print(i)

for i in range(10):
    print(i)
    i = 0
    print(i)

for i in range(1,11):
    print(f"Tabuada do {i}:")
    for j in range(1,11):
        print(f"{i}*{j} = {i*j}")
    print()
    
i = 1

while i < 11:
    j = 1
    print(f"Tabuada do {i}:")
    while j < 11:
        print(f"{i}*{j} = {i * j}")
        j += 1
    i += 1
    print()

lista = [3,True,1.5,'danilo',[]]

for elem in lista:
    print(elem)

print()

print(lista[0])
print(lista[1])
print(lista[2])
print(lista[3])
print(lista[4])

lista = [3,True,1.5,'danilo',[]]

for elem in lista:
    print(elem)
print()
for i in range(len(lista)):
    print(f"lista[{i}] = {lista[i]}")

lista = [3,True,1.5,'danilo',[]]
for elem in lista:
    elem = 1
print(lista)
for i in range(len(lista)):
    lista[i] = 1
print(lista)

profs = ['Danilo','André','Gabi','Celso','Yan','Lucas','Luís']
materias = ['Filosofia','Historinha','Design','Matemática','Arduíno','Front','Web']
for i in range(len(profs)):
    print(f"O/a prof {profs[i]} dá {materias[i]}")

alunos = ['Lucas Sena','Rhariel','Sara','Isabela','Lucas Zago']
notas = [8,8.5,6,4,1]

for i in range(len(alunos)):
    if notas[i] >= 6:
        print(f"{alunos[i]} foi aprovado/a")
    else:
        print(f"{alunos[i]} foi reprovado/a")

#Exercício 1 - contar a quantidade de numeros pares na lista
#Exercício 2 - Calcular a soma dos elementos da lista
#Exercício 3 - calcular a media dos elementos da lista
numeros = [90,7,3,5,2,1,8,6,0,4]
pares = 0
for num in numeros:
    if num % 2 == 0:
        pares += 1
pares = 0
for i in range(len(numeros)):
    if numeros[i] % 2 == 0:
        pares += 1

#ERRADO
# pares = 0
# for i in numeros:
#     if numeros[i]%2 == 0:
#         pares += 1

pares = 0
for numero in numeros:
    if numeros[numero]%2 == 0:
        pares += 1

numeros = [90,7,3,5,2,1,8,6,0,4]
soma = 0
for num in numeros:
    soma += num
print(soma)

soma = 0
for i in range(len(numeros)):
    soma += numeros[i]
print(soma)
media = soma/len(numeros)

#Errado!
# soma = 0
# for i in range(numeros):
#     soma += numeros[i]
# print(soma)

lista = []

lista.append(349)
print(lista)
lista.append(67)
print(lista)
lista.append(765)
print(lista)

lista = []

i = 0
while i < 10:
    num = input(f"Diga o {i+1}º numero: ")
    if not num.isnumeric():
        num = input(f"Diga o {i+1}º numero: ")
        continue
    num = int(num)
    lista.append(num)
    i+=1
    print(lista)

lista = []

for i in range(10):
    num = input(f"Diga o {i+1}º numero: ")
    while not num.isnumeric():
        num = input(f"Diga o {i+1}º numero: ")
    num = int(num)
    lista.append(num)
    print(lista)

a = input()
b = input()
c = input()

maior = a

if b > maior:
    b = a
if c > maior:
    c = maior

lista = [7,3,8,5,2,0,9,6,10,4]

maior = lista[0]

for num in lista:
    print(f"Vou testar se {num} > {maior}")
    if num > maior:
        print(f"Deu certo, vou trocar {maior} por {num}")
        maior = num
print(f"O maior numero em {lista} é {maior}")