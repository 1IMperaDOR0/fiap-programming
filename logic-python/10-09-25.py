'''while True:
    try:
        a = int(input("Diga um numero:\n-> "))
        break
    except:
        print('Tente de novo')

while True:
    try:
        a = int(input("Diga um número:\n-> "))
        b = int(input("Diga um número:\n-> "))
        print(a/b)
    except ValueError:
        print("Diga um número válido!")
    except ZeroDivisionError:
        print("Não podemos dividir por zero.")
    except Exception as a:
        print(f"Algo deu errado: {a}")
    else:
        break

a = [1,3,5,7,9]

while True:
    try:
        index = input("Digite um indíce que você queira saber:\n-> ")
        index = int(index)
        print(a[index])
    except ValueError:
        print("Deve ser um número!")
    except IndexError:
        print(f"Fora do índice! O número deve estar entre 0 e {len(a) - 1}")
    except Exception as a:
        print(f"Algo deu errado: {a}")
    else:
        break

while True:
    try:
        mensagem = 'inteiro'
        inteiro = int(input("Digite um inteiro:\n-> "))
        mensagem = 'decimal'
        decimal = input("Digite um decimal:\n-> ")
        decimal = decimal.replace(',', '.')
        decimal = float(decimal)
    except ValueError:
        print(f"Inválido! Precisa ser {mensagem}.")
    else:
        break

def acha_index(lista, elem):
    for i in range(len(lista)):
        if lista[i] == elem:
            return i
    raise ValueError(f"Não achei o {elem}")'''

a = [1,3,5,7,9]
# acha_index(a, 10)
# a.index(10)