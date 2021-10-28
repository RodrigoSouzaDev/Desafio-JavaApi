package com.rsouza.cadastroveiculos.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VeiculoDto {

    @ApiModelProperty(value = "Nome do veículo", example = "Fusca")
    private String veiculo;
    @ApiModelProperty(value = "Nome da marca do veículo", example = "Volkswagem")
    private String marca;
    @ApiModelProperty(value = "Ano de fabricação do veículo", example = "1968")
    private int ano;
    @ApiModelProperty(value = "Descrição do veículo", example = "Carro em ótimas condições")
    private String descricao;
}
