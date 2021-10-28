package com.rsouza.cadastroveiculos.data;

import com.rsouza.cadastroveiculos.model.Veiculo;

import java.util.List;

public class VeiculoData {

    private List<Veiculo> veiculos;
    private Veiculo veiculo;

    public VeiculoData() {
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
