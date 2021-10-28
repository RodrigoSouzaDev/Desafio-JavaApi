package com.rsouza.cadastroveiculos.repository;

import com.rsouza.cadastroveiculos.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo,Long> {

    public List<Veiculo> findVeiculoByVeiculo(String veiculo);
}
