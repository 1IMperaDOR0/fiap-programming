'''EXERCÍCIO 1'''

cubo = lambda x:x**3

x = input("Digite um número:\n-> ")

while not x.isnumeric():
    print("Formato inválido!")
    x = input("Digite um número:\n-> ")

x = int(x)

print(cubo(x))

'''EXERCÍCIO 2'''

lista = [1,2,3,4,5,6,7,8,9,10]
filtro = list(filter(lambda x:x%3==0, lista))
print(filtro)

'''EXERCÍCIO 3'''

# 0 °C = 32 °F
lista = [32,64,128,256]
conversor = list(map(lambda x:(x*(9/5))+32, lista))
print(conversor)

'''EXERCÍCIO 4'''

produtos = [
    {'nome': "notebook", 'preco': 3500},
    {'nome': "mouse", 'preco': 100},
    {'nome': "monitor", 'preco': 1200},
]

decrescente = sorted(produtos, key=lambda p:p['preco'], reverse=True)
print(decrescente)

'''EXERCÍCIO 5'''

lista = [1,2,3,4,5,6,7,8,9,10]
extra =  list(map(lambda x:x*2, filter(lambda x:x%2==0, lista)))
print(extra)