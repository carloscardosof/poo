temperaturas = []

for i in range(7):
    temp = float(input(f"Digite a temperatura do dia {i+1}: "))
    temperaturas.append(temp)

media = sum(temperaturas) / len(temperaturas)

print(f"Temperatura média da semana: {media:.2f}")

dias_acima_media = 0
for temp in temperaturas:
    if temp > media:
        dias_acima_media += 1

print(f"Dias com temperatura acima da média: {dias_acima_media}")