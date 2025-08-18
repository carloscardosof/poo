
nome = "Aluno"
nota1 = 7;
nota2 = 4;
nota3 = 8;

media = (nota1 + nota2 + nota3) / 3

print(f"Aluno: ",nome)
print(f"Média: ", media)

if media >= 7:
    print("Status: Aprovado")
elif media >= 4:
    print("Status: Recuperação")
else:
    print("Status: Reprovado")
