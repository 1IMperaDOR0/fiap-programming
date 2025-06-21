'''Exercício 1'''
# while True:
#   nota = input('Digite uma nota de 0 à 10\n: ')
#   if nota.isnumeric():
#     nota = int(nota)
#     if nota >= 0 and nota <= 10:
#       print(f'Sua nota é {nota}!')
#       break
#     else:
#       print('Nota inválida!')
#   else:
#     print('Caractere inválido!')

#   print(" ")
#   print("---------------------------------------------------------")
#   print(" ")

'''Exercício 2'''
# nome = input('Digite seu nome\n: ')
# while not(nome.isalpha() and len(nome) >= 3):
#   nome = input('Nome inválido! Digite seu nome\n: ')

# while True:
#   idade = input('Digite sua idade\n: ')
#   if idade.isnumeric():
#     idade = int(idade)
#     if idade > 0 and idade < 150:
#       break
#     else:
#       print('Idade inválida!')
#   else:
#     print('Caractere inválido!')

# while True:
#   salario = input('Digite seu salário\n: ')
#   if salario.isnumeric():
#     salario = int(salario)
#     if salario > 0:
#       break
#     else:
#       print('Salário inválido!')
#   else:
#     print('Caractere inválido!')

# sexo = input('Digite seu sexo:\n"m" para masculino e "f" para feminino\n: ')

# while not(sexo == 'm' or sexo == 'f'):
#   sexo = input('Sexo inválido! Digite seu sexo\n"m" para masculino e "f" para feminino\n: ')

# civil = input('Digite seu estado civil:\n"s" para solteiro, "c" para casado, "v" para viuvo e "d" para divorciado\n: ')

# while not(civil == 's' or civil == 'c' or civil == 'v' or civil == 'd'):
#   civil = input('Estado civil inválido! Digite seu estado civil:\n"s" para solteiro, "c" para casado, "v" para viuvo e "d" para divorciado\n: ')

#   print(" ")
#   print("---------------------------------------------------------")
#   print(" ")

'''Exercício 8'''
a = 0
b = 1

print('Sequência de Fibonacci')

while True:
  n = input('Digite a quantidade de termos que você deseja ver\n: ')
  if n.isnumeric():
    n = int(n)
    if n > 0:
      break
    else:
      print('Quantidade inválida!')
  else:
    print('Caractere inválido!')

i = 0

while i < n:
    print(a, end=', ')
    aux = a
    a = b
    b += aux
    i += 1

#   print(" ")
#   print("---------------------------------------------------------")
#   print(" ")

'''Exercício 9'''
# i = 0

# pares = 0

# while i < 10:
#     n = input(f'Digite o {i + 1}° número\n: ')
#     while not(n.isnumeric()):
#         n = input(f'Caractere inválido!\nDigite o {i + 1}° número\n: ')
#     n = int(n)
#     if n % 2 == 0:
#         pares = pares + 1
#     i = i + 1

# num = 37
# i = 2
# while True:
#     print(f"{num}%{i} = {num%i}")
#     if num%i == 0:
#         print(f"{num} não é primo!")
#         break
#     elif i >= num**(1/2):
#         print(f"{num} é primo")
#         break
#     i += 1

# print(f'Você digitou {pares} números pares e {i - pares} números ímpares.')

#   print(" ")
#   print("---------------------------------------------------------")
#   print(" ")

'''Exercício 12'''
# while True:
#   nota = input('Digite a quantidade de notas que você quer digitar\n: ')
#   if nota.isnumeric():
#     nota = int(nota)
#     if nota > 0:
#       break
#     else:
#       print('Quantidade inválida!')
#   else:
#     print('Caractere inválido!')


# i = 0
# media = 0
# while i < nota:
#     nota = input(f'Digite sua {i+1}° nota de 0 a 10\n: ')
#     if nota.isnumeric():
#         nota = int(nota)
#         if (nota >= 0 and nota <= 10):
#             media += nota
#             i += 1
#         else:
#             nota = print('A nota não é de 0 a 10!')
#     else:
#         nota = print('Nota inválida!')
# media /= i
# print(f'Sua média é {media}')

#   print(" ")
#   print("---------------------------------------------------------")
#   print(" ")

'''Exercício 13'''
# ano = 1995

# salarioInicial = input('Digite o salário\n: ')

# while not(salarioInicial.isnumeric()):
#   salarioInicial = input('Caracteres inválidos! Digite o salário\n: ')

# salario = int(salarioInicial)

# ano += 1

# taxa = 0.015

# aumento = salario * taxa
# salario += aumento

# while ano <= 2025:
#   print(f'Ano: {ano} -> Salário: {salario:.2f}')
#   taxa *= 2
#   aumento = salario * taxa
#   salario += aumento

#   ano += 1

#   print(" ")
#   print("---------------------------------------------------------")
#   print(" ")

'''Exercício 14'''
# intervalo_1 = 0
# intervalo_2 = 0
# intervalo_3 = 0
# intervalo_4 = 0

# while True:
#     num = input("Diga um número: ")
#     while not num.isnumeric():
#         num = input("Inválido! Diga um número: ")
#     num = int(num)
#     if num <= 25:
#         intervalo_1 += 1
#     elif num <= 50:
#         intervalo_2 += 1
#     elif num <= 75:
#         intervalo_3 += 1
#     elif num <= 100:
#         intervalo_4 += 1
#     else:
#         print("Número deve ser até 100")
#         continue
#     proxima = input("Quer continuar? (s/n)\n-> ")
#     while not (proxima == 's' or proxima == 'n'):
#         proxima = input("Inválido! Quer continuar? (s/n)\n-> ")
#     if proxima == 'n':
#         print(f'A quantidade de números no intervalo de 0-25: {intervalo_1}')
#         print(f'A quantidade de números no intervalo de 26-50: {intervalo_2}')
#         print(f'A quantidade de números no intervalo de 51-75: {intervalo_3}')
#         print(f'A quantidade de números no intervalo de 76-100: {intervalo_4}')
#         break

#   print(" ")
#   print("---------------------------------------------------------")
#   print(" ")

'''Exercício 15'''
# candidato1 = 'José'
# candidato2 = 'João'
# candidato3 = 'Maria'
# candidato4 = 'Sebastião'

# votosCandidato1 = 0
# votosCandidato2 = 0
# votosCandidato3 = 0
# votosCandidato4 = 0

# votosNulos = 0
# votosBrancos = 0

# i = 0

# while i < 10:
#   nome = input('Digite seu nome\n: ')

#   while not(len(nome) >= 3):
#     nome = input('Nome inválido! Digite seu nome\n: ')

#   eleicao = input(f'\nOlá {nome}! Bem-vindo(a) a urna digital! Você tem os seguintes candidatos:\n\nJosé = 1\n\nJoão = 2\n\nMaria = 3\n\nSebastião = 4\n\nVoto Branco = 0\n\nDigite o número do candidato que deseja votar\n: ')

#   while not(eleicao.isnumeric()):
#     eleicao = input('Caractere inválido! Digite o número do candidato que deseja votar\n: ')

#   if eleicao == '1':
#     votosCandidato1 += 1
#     candidato = candidato1
#   elif eleicao == '2':
#     votosCandidato2 += 1
#     candidato = candidato2
#   elif eleicao == '3':
#     votosCandidato3 += 1
#     candidato = candidato3
#   elif eleicao == '4':
#     votosCandidato4 += 1
#     candidato = candidato4
#   elif eleicao == '0':
#     votosBrancos += 1
#     candidato = 'branco'
#   else:
#     votosNulos += 1
#     candidato = 'nulo'

#   print(f'\nVoto computado! Seu voto foi número {eleicao} para {candidato}!')

#   print(" ")
#   print("---------------------------------------------------------")
#   print(" ")

#   i += 1

# print(f'Aqui está a tabela de votos!\n\n'
#     f'O candidato {candidato1} recebeu {votosCandidato1} votos\n\n'
#     f'O candidato {candidato2} recebeu {votosCandidato2} votos\n\n'
#     f'O candidato {candidato3} recebeu {votosCandidato3} votos\n\n'
#     f'O candidato {candidato4} recebeu {votosCandidato4} votos\n\n'
#     f'Votos Brancos recebeu {votosBrancos} votos\n\n'
#     f'Votos Nulos recebeu {votosNulos} votos')

# print(" ")
# print("---------------------------------------------------------")
# print(" ")

# totalVotos = votosCandidato1 + votosCandidato2 + votosCandidato3 + votosCandidato4 + votosBrancos + votosNulos

# print(f'A porcentagem de votos em branco é de {votosBrancos / totalVotos * 100:.2f}%')
# print(f'A porcentagem de votos nulos é de {votosNulos / totalVotos * 100:.2f}%')