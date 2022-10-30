import random

tam = 10
m = [0]*tam
for i in range(tam):
    m[i] = [0]*tam
for i in range(tam):
    for j in range(tam):
        m[i][j] = random.randint(10,50)

aux = tam-1
soma = 0

for i in range(tam):
    soma = soma + m[i][aux]
    aux = aux - 1

for i in range(tam):
    print m[i][:]
print 'Média: ', soma/float(tam)
