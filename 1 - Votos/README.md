# Índice

- 1.Votos <== 
- [2.BubbleSort](https://github.com/RodrigoSouzaDev/Desafio-JavaApi/tree/main/2%20-%20Bubble%20Sort)
- [3.Fatorial](https://github.com/RodrigoSouzaDev/Desafio-JavaApi/tree/main/3%20-%20Fatorial)
- [4.Multiplos de 3 e 5](https://github.com/RodrigoSouzaDev/Desafio-JavaApi/tree/main/4%20-%20Multiplos%20de%203%20e%205)
- [5.Api Cadastro de Veículos](https://github.com/RodrigoSouzaDev/Desafio-JavaApi/tree/main/5-%20Cadastro%20Veiculos)
# 1. Votos

O exercício consistia em calcular percentuais baseados em uma tabela previamente fornecida, que representa o número de votos (válidos, brancos e nulos) e eleitores de uma eleição.

```
| total eleitores | válidos | brancos | nulos |
| --------------- | ------- | ------- | ----- |
| 1000            | 800     | 150     | 50    |
```

os percentuais pedidos eram:

- o percentual de votos válidos em relação ao total de eleitores;
- o percentual de votos brancos em relação ao total de eleitores;
- o percentual de votos nulos em relação ao total de eleitores;

## Resultado

Para concluir esse desafio, segui a seguinte linha de pensamento: 

- Criei uma classe chamada [Contagem](https://github.com/RodrigoSouzaDev/Desafio-JavaApi/blob/main/1%20-%20Votos/src/Contagem.java) para receber a contagem dos votos e o número de eleitores;
- Criei uma classe chamada [Eleicao](https://github.com/RodrigoSouzaDev/Desafio-JavaApi/blob/main/1%20-%20Votos/src/Eleicao.java) para receber uma instância de [Contagem](https://github.com/RodrigoSouzaDev/Desafio-JavaApi/blob/main/1%20-%20Votos/src/Contagem.java) e ficar responsável por realizar os cálculos necessários, retornando uma String com o resultado para cada um deles.

<image align="center" src="img/Result.PNG"/>
