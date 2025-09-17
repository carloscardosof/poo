senha_correta = "senha123"
tentativas = 0

while tentativas < 3:
    senha = input("Digite a senha: ")
    if senha == senha_correta:
        print("Acesso permitido")
        break
    else:
        print("Senha incorreta")
        tentativas += 1

if tentativas == 3:
    print("Número máximo de tentativas atingido")