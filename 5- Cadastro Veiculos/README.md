# Índice

- [1.Votos](https://github.com/RodrigoSouzaDev/Desafio-JavaApi/tree/main/1%20-%20Votos)
- [2.BubbleSort](https://github.com/RodrigoSouzaDev/Desafio-JavaApi/tree/main/2%20-%20Bubble%20Sort)
- [3.Fatorial]()
- [4.Múltiplos de 3 e 5]()
- 5.Api Cadastro de Veículos <==

# 5. Api Cadastro de Veículos  

O exercício consistia em criar uma API REST para CRUD de veículos.

Este exercício era o maior desafio apresentado dentre os 5, e por ser meio extenso não consegui conclui-ló por inteiro:

## Backend (Java SpringBoot)

- [x] Backend Funcionando.
- [x] Endpoint POST para cadastro de veículos.
- [x] Endpoint PUT  para atualização total de veículos.
- [x] Endpoint PATCH para atualização parcial de veículos.
- [x] Endpoint DELETE para exclusão de veículos.
- [x] Marcas não podem ser escritas de formas erradas.
- [x] Utilizar os métodos (GET,POST,PUT,PATCH,DELETE)
- [ ] Fazer o teste unitário da Api.

## Frontend (React)
- [ ] Exibir a informação de quantos veículos estão como não vendidos na base.
- [ ] Exibir a informação da distribuição de veículos por década de fabricação.
- [ ] Exibir a informação da distribuição de veículos por fabricante.




## Resultado

Como dito acima, não conclui 100% o desafio, mas cheguei bem longe na parte da api. Irei deixar abaixo o que utilizei:

- SpringBoot : para criação da api;
- h2Database : para persistência dos dados em memória.
- Lombok: para simplificar a criação de construtores e getters and setters das classes com relação com o spring.
- Swagger: para documentar e exemplificar os endpoints da api.



## Endpoints criados

- Todos os endpoints retornam no body uma classe chamada [ApiResponse]() que retorna o código da requisição, um payload com os dados daquela requisição, e uma lista de erros .

  <image align="center" src="img/apiResponse.PNG"/>

- Os endpoints tem como baseUrl "http://localhost:8080/veiculos".

<image align="center" src="img/swaggerEndpoints.PNG"/>

obs: a ui do swagger pode ser acessada em "http://localhost:8080/swagger-ui/index.html#/"

- Criei uma classe chamada VeiculoDto para não possibilitar os usuários de alterar alguns campos dos veículos como id, vendido, created, updated. 

<image align="center" src="img/veiculoDto.PNG"/>

## Banco de dados

Como optei por utilizar um banco em memória, preciso mockar os dados precisam ser mockados toda vez que a api é executada. 
