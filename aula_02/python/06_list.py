nomes = []

while True:
    nome = input("Digite um nome (ou 'fim' para encerrar): ")
    if nome.lower() == "fim":
        break
    nomes.append(nome)

print("Lista de nomes cadastrados:")
for n in nomes:
    print("-", n)