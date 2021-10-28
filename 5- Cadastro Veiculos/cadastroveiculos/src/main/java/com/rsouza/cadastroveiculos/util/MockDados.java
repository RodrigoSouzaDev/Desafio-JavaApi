package com.rsouza.cadastroveiculos.util;

import com.rsouza.cadastroveiculos.enums.VeiculoEnum;
import com.rsouza.cadastroveiculos.model.Veiculo;
import com.rsouza.cadastroveiculos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class MockDados {

    @Autowired
    VeiculoRepository repository;

    @Bean
    @Scheduled(fixedRateString = "3000")
    public void mockarVeiculos(){
       System.out.println("Iniciando Mockagem de dados");
        List<Veiculo> veiculosList = new ArrayList<>();
        getVeiculosList(veiculosList);

        repository.saveAll(veiculosList);

    }

    private void getVeiculosList(List<Veiculo> veiculosList) {
        Veiculo veiculo1 = Veiculo.builder()
                .id(1L)
                .veiculo("Fusca")
                .marca(VeiculoEnum.VOLKSWAGEM)
                .ano(1968)
                .descricao("Carro em ótimas condições")
                .vendido(true)
                .created(LocalDateTime.now())
                .updated(LocalDateTime.now())
                .build();
        veiculosList.add(veiculo1);

        Veiculo veiculo2 = Veiculo.builder()
                .id(2L)
                .veiculo("Ferrari")
                .marca(VeiculoEnum.FERRARI)
                .ano(2010)
                .descricao("Motor com defeito")
                .vendido(false)
                .created(LocalDateTime.of(2021,10,22,21,30))
                .updated(LocalDateTime.now())
                .build();
        veiculosList.add(veiculo2);
    }

}
