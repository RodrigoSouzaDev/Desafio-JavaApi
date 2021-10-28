package com.rsouza.cadastroveiculos.controller;

import com.rsouza.cadastroveiculos.model.dto.VeiculoDto;
import com.rsouza.cadastroveiculos.service.VeiculoService;
import com.rsouza.cadastroveiculos.util.APIResponse;
import io.swagger.annotations.ApiOperation;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService service;

    @ApiOperation("Busca todos os veículos no banco")
    @GetMapping
    public ResponseEntity<APIResponse> findAll() {
        APIResponse response = service.findAllVeiculos();
        return ResponseEntity
                .status(HttpStatus.valueOf(response.getStatus()))
                .body(response);
    }

    @ApiOperation("Busca todos os veículos no banco pelo nome")
    @GetMapping("/find")
    public ResponseEntity<APIResponse> findVeiculosByName(String veiculo) {
        APIResponse response = service.findVeiculoByName(veiculo);
        return ResponseEntity
                .status(HttpStatus.valueOf(response.getStatus()))
                .body(response);
    }

    @ApiOperation("Busca um veículo no banco pelo id")
    @GetMapping("/{id}")
    public ResponseEntity<APIResponse> findVeiculoById(@PathVariable(name = "id") Long id) throws NotFoundException {
        APIResponse response = service.findVeiculoById(id);
        return ResponseEntity
                .status(HttpStatus.valueOf(response.getStatus()))
                .body(response);
    }

    @ApiOperation("Cadastra um veículo no banco")
    @PostMapping
    public ResponseEntity<APIResponse> createVeiculo(@RequestBody VeiculoDto veiculoDto) {
        APIResponse response = service.createVeiculo(veiculoDto);
        return ResponseEntity
                .status(HttpStatus.valueOf(response.getStatus()))
                .body(response);
    }

    @ApiOperation("Atualiza todos os dados de um veículo no banco")
    @PutMapping("/{id}")
    public ResponseEntity<APIResponse> updateVeiculoHard(@PathVariable(name = "id") Long id, @RequestBody VeiculoDto veiculoDto) throws NotFoundException {
        APIResponse response = service.updateVeiculoHard(id, veiculoDto);
        return ResponseEntity
                .status(HttpStatus.valueOf(response.getStatus()))
                .body(response);
    }

    @ApiOperation("Atualiza os dados não nulos e não vazios no banco")
    @PatchMapping("/{id}")
    public ResponseEntity<APIResponse> updateVeiculoSoft(@PathVariable(name = "id") Long id, @RequestBody VeiculoDto veiculoDto) throws NotFoundException {
        APIResponse response = service.updateVeiculoSoft(id, veiculoDto);
        return ResponseEntity
                .status(HttpStatus.valueOf(response.getStatus()))
                .body(response);
    }

    @ApiOperation("Deleta um veículo do banco")
    @DeleteMapping("/{id}")
    public ResponseEntity<APIResponse> deleteVeiculo(@PathVariable(name = "id") Long id) throws NotFoundException {
        APIResponse response = service.deleteVeiculo(id);
        return ResponseEntity
                .status(HttpStatus.valueOf(response.getStatus()))
                .body(response);
    }
}
