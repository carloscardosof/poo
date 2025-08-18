
senha_correta = "1234"
tentativas = 0
max_tentativas = 3

while tentativas < max_tentativas:
    senha = input("Digite a senha: ")
    if senha == senha_correta:
        print("Acesso permitido.")
        break
    else:
        print("Senha incorreta.")
        tentativas += 1

if tentativas == max_tentativas:
    print("Número máximo de tentativas atingido. Acesso negado.")