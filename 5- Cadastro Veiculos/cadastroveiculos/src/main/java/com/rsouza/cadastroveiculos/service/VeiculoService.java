package com.rsouza.cadastroveiculos.service;

import com.rsouza.cadastroveiculos.model.dto.VeiculoDto;
import com.rsouza.cadastroveiculos.util.ApiResponse;
import javassist.NotFoundException;

public interface VeiculoService {

    public ApiResponse findAllVeiculos();
    public ApiResponse findVeiculoByName(String veiculo);
    public ApiResponse findVeiculoById(Long id) throws NotFoundException;
    public ApiResponse createVeiculo (VeiculoDto veiculoDto);
    public ApiResponse updateVeiculoHard(Long id, VeiculoDto veiculoDto) throws NotFoundException;
    public ApiResponse updateVeiculoSoft(Long id, VeiculoDto veiculoDto) throws NotFoundException;
    public ApiResponse deleteVeiculo(Long id) throws NotFoundException;
}