# Índice

- [1.Votos](https://github.com/RodrigoSouzaDev/Desafio-JavaApi/tree/main/1%20-%20Votos)
- 2.BubbleSort <== 
- [3.Fatorial](https://github.com/RodrigoSouzaDev/Desafio-JavaApi/tree/main/3%20-%20Fatorial)
- [4.Multiplos de 3 e 5](https://github.com/RodrigoSouzaDev/Desafio-JavaApi/tree/main/4%20-%20Multiplos%20de%203%20e%205)
- [5.Api Cadastro de Veículos](https://github.com/RodrigoSouzaDev/Desafio-JavaApi/tree/main/5-%20Cadastro%20Veiculos)
# 2. BubbleSort

O exercício consistia em receber um vetor de numeros inteiros e ordená-lo utilizando o algoritmo de ordenação "Bubble Sort". 

## Resultado

Para concluir esse desafio, segui a seguinte linha de pensamento:

- Criei uma classe chamada [BubbleSort](https://github.com/RodrigoSouzaDev/Desafio-JavaApi/blob/main/2%20-%20Bubble%20Sort/src/BubbleSort.java) com um método estático chamado "sort", para não precisar instancia-la.
- Essa classe ficou responsável por receber um vetor e ordená-lo.
- Para fazer o BubbleSort utilizei um "do while" que executaria enquanto um contador fosse diferente de 0. 
- Dentro coloquei um "For" que percorria o tamanho do vetor -1 (ou seja, até o penúltimo item do vetor) e fiz com que toda vez que for executado, criei um inteiro j que percorria o vetor sempre um item acima do if.
- Dessa forma  coloquei um if para que fazer a lógica do BubbleSort, incrementar o contador, garantindo assim que o código contido no "do while" executaria novamente, até não haver alterações possíveis.

<image align="center" src="img/Result.PNG"/>

