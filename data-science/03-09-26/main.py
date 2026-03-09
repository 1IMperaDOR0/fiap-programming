alturas = [1.57, 1.68, 1.76, 1.73, 1.72, 1.72, 1.75, 1.75, 1.88, 1.90]
alturas = sorted(alturas) # Ordenado as alturas

xi = 0

for i in range(len(alturas)):
    xi += alturas[i] # Soma total das alturas da amostra

    n = i+1 # Quantidade de elementos da amostra

    x = xi/n # Média das alturas dos alementos da amostra

maximo = alturas[n-1]
minimo = alturas[0]
amplitude = maximo - minimo
print(amplitude)

Xi = x # Total de altura da população
variancia = ((Xi - x)**2)/(n-1) # Existem 2 tipos de variância: Populacional e Amostral 
print(variancia)

desvio_padrão = variancia**0.5
print(desvio_padrão)

# Cada quartil equivale a 25% ou 1/4 da amostra
q2 = 0 # Segundo quartil
q3 = 0 # Terceiro quartil
desvio_quartil = q3 - q2
print(desvio_quartil)