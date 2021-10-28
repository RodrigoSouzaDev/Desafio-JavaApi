package com.rsouza.cadastroveiculos.enums;

public enum VeiculoEnum {
    FORD(0,"Ford"),
    VOLKSWAGEM(1,"Volkswagem"),
    CHEVROLET(2,"Chevrolet"),
    AUDI(3,"Audi"),
    BMW(4, "BMW"),
    CITROEN(5, "Citroen"),
    FERRARI(6, "Ferrari"),
    FIAT(7, "Fiat"),
    HONDA(8,"Honda"),
    HYUNDAI(9,"Hyundai"),
    KIA(10, "Kia"),
    MERCEDES_BENZ(11, "Mercedes-Benz"),
    MITSUBISHI(12, "Mitsubishi");

    private int value;
    private String descricao;

    VeiculoEnum(int value, String descricao) {
        this.value = value;
        this.descricao = descricao;
    }
}
