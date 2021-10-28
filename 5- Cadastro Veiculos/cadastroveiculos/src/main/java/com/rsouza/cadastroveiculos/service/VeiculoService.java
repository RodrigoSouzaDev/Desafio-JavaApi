package com.rsouza.cadastroveiculos.service;

import com.rsouza.cadastroveiculos.model.Veiculo;
import com.rsouza.cadastroveiculos.model.dto.VeiculoDto;
import com.rsouza.cadastroveiculos.util.APIResponse;
import javassist.NotFoundException;

import java.util.List;

public interface VeiculoService {

    public APIResponse findAllVeiculos();
    public APIResponse findVeiculoByName(String veiculo);
    public APIResponse findVeiculoById(Long id) throws NotFoundException;
    public APIResponse createVeiculo (VeiculoDto veiculoDto);
    public APIResponse updateVeiculoHard(Long id, VeiculoDto veiculoDto) throws NotFoundException;
    public APIResponse updateVeiculoSoft(Long id, VeiculoDto veiculoDto) throws NotFoundException;
    public APIResponse deleteVeiculo(Long id) throws NotFoundException;
}