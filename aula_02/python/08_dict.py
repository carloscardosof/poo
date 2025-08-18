pontuacao = {
    "Alice": 120,
    "Bruno": 300,
    "Carla": 250,
    "Daniel": 150
}

# Mostrar todos os jogadores e pontuações
print("Pontuação dos jogadores:")
for jogador, pontos in pontuacao.items():
    print(f"{jogador}: {pontos} pontos")

# Calcular pontuação média
media = sum(pontuacao.values()) / len(pontuacao)
print(f"\nPontuação média: {media:.2f}")

# Encontrar o jogador com maior pontuação
melhor_jogador = max(pontuacao, key=pontuacao.get)
print(f"Melhor jogador: {melhor_jogador} ({pontuacao[melhor_jogador]} pontos)")