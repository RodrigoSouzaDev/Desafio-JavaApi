package com.rsouza.cadastroveiculos.model;

import com.rsouza.cadastroveiculos.enums.VeiculoEnum;
import com.rsouza.cadastroveiculos.model.dto.VeiculoDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String veiculo;
    @Enumerated(EnumType.STRING)
    private VeiculoEnum marca;
    private int ano;
    private String descricao;
    private boolean vendido;
    private LocalDateTime created;
    private LocalDateTime updated;

    public Veiculo (VeiculoDto veiculoDto){
        this.veiculo = veiculoDto.getVeiculo();
        this.marca = VeiculoEnum.valueOf(veiculoDto.getMarca().toUpperCase());
        this.ano = veiculoDto.getAno();
        this.descricao = veiculoDto.getDescricao();
        this.vendido = false;
        this.created = LocalDateTime.now();
    }
}
