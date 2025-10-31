import time

# Exercício 1
for i in range(10, 0, -1):
    print(i)
    time.sleep(1)

for i in range(10, 0, -1):
    print(f"{i} ", end="\r")
    time.sleep(1)

for i in range(0, 101, 10):
    print(f"Downloading... {i}%", end="\r")
    time.sleep(0.5)
print("Download concluído!")

# Exercício 2
caracteres = {
    0: 'a', 1: 'b', 2: 'c', 3: 'd', 4: 'e', 5: 'f', 6: 'g', 7: 'h', 8: 'i', 9: 'j', 10: 'k', 
    11: 'l', 12: 'm', 13: 'n', 14: 'o', 15: 'p', 16: 'q', 17: 'r', 18: 's', 19: 't', 20: 'u', 
    21: 'v', 22: 'w', 23: 'x', 24: 'y', 25: 'z', 26: 'A', 27: 'B', 28: 'C', 29: 'D', 30: 'E', 
    31: 'F', 32: 'G', 33: 'H', 34: 'I', 35: 'J', 36: 'K', 37: 'L', 38: 'M', 39: 'N', 40: 'O', 
    41: 'P', 42: 'Q', 43: 'R', 44: 'S', 45: 'T', 46: 'U', 47: 'V', 48: 'W', 49: 'X', 50: 'Y',
    51: 'Z', 52: '0', 53: '1', 54: '2', 55: '3', 56: '4', 57: '5', 58: '6', 59: '7', 60: '8',
    61: '9', 62: '!', 63: '@', 64: '#', 65: '$', 66: '%', 67: '&', 68: '*'
}
qtd_caracteres = len(caracteres)
tamanho = int(input("Digite o tamanho da senha: "))
senha = ""

for i in range(tamanho):
    valor = int((time.time() * 1000) + i)
    indice = valor % qtd_caracteres
    senha += caracteres[indice]
    time.sleep(0.01)

print("Senha gerada:", senha)

# Exercício 3
def calcular_comprimento_circulo(raio):
    pi = 3.1415926
    calculo_circulo = 2 * pi * raio
    return calculo_circulo

def calcular_voltas_pista(raio, distancia):
    comprimento = calcular_comprimento_circulo(raio)
    calculo_voltas = distancia / comprimento
    return calculo_voltas

r = float(input("Digite o raio da pista: "))
d = float(input("Digite a distância percorrida: "))
print(f"O atleta deu {calcular_voltas_pista(r, d):.2f} voltas.")

# Exercícios 4
def calcular_delta(a, b, c):
    return b * b - 4 * a * c

def delta_positivo(delta):
    if delta >= 0:
        return True
    else:
        return False

def calcular_raizes(a = 0, b = 0, c = 0):
    delta = calcular_delta(a, b, c)
    
    if not delta_positivo(delta):
        print("Delta é negativo. Não existem raízes reais.")
        return None, None

    x1 = (-b + delta ** 0.5) / (2 * a)
    x2 = (-b - delta ** 0.5) / (2 * a)
    
    return x1, x2

print("Cálculo de raízes da equação do segundo grau (a(x^(2)) + bx + c = 0)")
a = float(input("Digite o valor de a: "))
b = float(input("Digite o valor de b: "))
c = float(input("Digite o valor de c: "))

x1, x2 = calcular_raizes(a, b, c)

if not x1 == None:
    print(f"As raízes da equação são: x1 = {x1:.2f} e x2 = {x2:.2f}")