# """EXERCÍCO 1"""
# x = int(input("Digite o valor 1: "))
# y = int(input("Digite o valor 2: "))

# if x > y:
#     maior = x
#     menor = y
# else:
#     maior = y
#     menor = x

# print(f"O maior valor é {maior}")


# print(" ")
# print("---------------------------------------------------------")
# print(" ")

# """EXERCÍCO 2"""

# ano = int(input("Considerando o ano de 2025. Digite o ano que você nasceu\n: "))
# idade = 2025 - ano

# if idade > 0 and idade < 16:
#   print("Você não pode votar esse ano!")
# elif idade < 1 or idade > 122:
#   print("Você não existe ou já morreu!")
# elif idade >= 16 and idade < 18 or idade >= 70:
#   print("Você pode votar esse ano! (opicional)")
# else:
#   print("O voto é obrigatório!")

# print(" ")
# print("---------------------------------------------------------")
# print(" ")

# """EXERCÍCO 3"""

# senha = "1234"
# login = input("Digite sua senha\n: ")

# if login == senha:
#     print("ACESSO PERMITIDO")
# else:
#     print("ACESSO NEGADO")

# print(" ")
# print("---------------------------------------------------------")
# print(" ")

# """EXERCÍCO 4"""

# apple = int(input("Digite a quantidade de maças que você pegou\n: "))

# if 1 <= apple < 12:
#     preco = 0.3
# elif apple > 11:
#     preco = 0.25
# else:
#     print("Não tem maças!")

# print(f"Então a compra ficou R${apple * preco}")

# print(" ")
# print("---------------------------------------------------------")
# print(" ")

# """EXERCÍCO 5"""

# a = int(input("Diga o primeiro numero: "))
# b = int(input("Diga o segundo numero: "))
# c= int(input("Diga o terceiro numero: "))

# maior = a

# if b > maior:
#     maior = b

# if c > maior:
#     maior = c

# menor = a

# if b < menor:
#     menor = b

# if c < menor:
#     menor = c

# meio = a + b + c - menor - maior

# print(f'A ordem crescente é {menor}, {meio}, {maior}')

# print(" ")
# print("---------------------------------------------------------")
# print(" ")

# """EXERCÍCO 6"""

# altura = float(input("Digite sua altura\n: "))
# sexo = int(input("Digite 1 para feminino ou 2 para masculino\n: "))

# if sexo == 1:
#     print(f"Seu peso ideal é {62.1 * altura - 44.7}")
# else:
#     print(f"Seu peso ideal é {72.7 * altura - 58}")

# print(" ")
# print("---------------------------------------------------------")
# print(" ")

# """EXERCÍCO 7 E 8"""

# lados = int(input("Digite a quantidade de lados do polígono\n: "))

# if lados < 3:
#     print("NÃO É UM POLÍGONO")
# elif lados > 5:
#     print("POLÍGNO NÃO IDENTIFICADO")
# else:
#     medidas = int(input("Digite a medida do lado em cm\n: "))

#     if lados == 3:
#         forma = "TRIÂNGULO"
#         area = (((medidas**2) * 3**0.5) / 4)
#         perimetro = lados * medidas
#     elif lados == 4:
#         forma = "QUADRADO"
#         area = (medidas**2)
#         perimetro = lados * medidas
#     else:
#         forma = "PENTÁGONO"
#         area = (((medidas**2) * ((25 + 10 * 5**0.5)**0.5)) / 4)
#         perimetro = lados * medidas

#     print(f"A área do {forma} é {area} cm^(2))")
#     print(f"O perimetro do {forma} é {perimetro} cm")

# print(" ")
# print("---------------------------------------------------------")
# print(" ")

# """EXERCÍCO 9"""

# a = int(input("Digite o valor a\n: "))
# b = int(input("Digite o valor b\n: "))
# c = int(input("Digite o valor c\n: "))

# maior = a

# if b > maior:
#     maior = b

# if c > b:
#     maior = c

# print(f"O maior é {maior}")

# print(" ")
# print("---------------------------------------------------------")
# print(" ")

# """EXERCÍCO 10"""

# lado1 = int(input("Digite o valor do lado 1\n: "))
# lado2 = int(input("Digite o valor do lado 2\n: "))
# lado3 = int(input("Digite o valor do lado 3\n: "))

# if lado1 == lado2 and lado2 == lado3:
#     print("EQUILÁTERO")
# elif lado1 == lado2 or lado1 == lado3 or lado2 == lado3:
#     print("ISÓSCELES")
# else:
#     print("ESCALENO")

# print(" ")
# print("---------------------------------------------------------")
# print(" ")

"""EXERCÍCO 11"""

angulo1 = int(input("Digite o valor do ângulo 1\n: "))
angulo2 = int(input("Digite o valor do ângulo 2\n: "))
angulo3 = int(input("Digite o valor do ângulo 3\n: "))
if angulo1 + angulo2 + angulo3 == 180:
    if angulo1 == 90 or angulo2 == 90 or angulo3 == 90:
        print("TRIÂNGULO RETÂNGULO")
    elif angulo1 > 90 or angulo2 > 90 or angulo3 > 90:
        print("TRIÂNGULO OBTUSÂNGULO")
    else:
        print("TRIÂNGULO ACUTÂNGULO")
else:
    print("NÃO É UM TRIÂNGULO")