# 1. Votos (exercício 1) 

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

- Criei uma classe chamada [Contagem]() para receber a contagem dos votos e o número de eleitores;
- Criei uma classe chamada [Eleicao]() para receber uma instância de [Contagem]() e ficar responsável por realizar os cálculos necessários, retornando uma String com o resultado para cada um deles.

<image align="center" src="img/Result.PNG"/>

