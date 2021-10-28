package com.rsouza.cadastroveiculos.service.impl;

import com.rsouza.cadastroveiculos.data.ErrorData;
import com.rsouza.cadastroveiculos.data.MessageData;
import com.rsouza.cadastroveiculos.data.VeiculoData;
import com.rsouza.cadastroveiculos.enums.VeiculoEnum;
import com.rsouza.cadastroveiculos.model.Veiculo;
import com.rsouza.cadastroveiculos.model.dto.VeiculoDto;
import com.rsouza.cadastroveiculos.repository.VeiculoRepository;
import com.rsouza.cadastroveiculos.service.VeiculoService;
import com.rsouza.cadastroveiculos.util.ApiResponse;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class VeiculoServiceImpl implements VeiculoService {

    @Autowired
    private VeiculoRepository repository;

    private ApiResponse apiResponse;
    private VeiculoData data ;
    private  MessageData message = new MessageData() ;
    private ErrorData error = new ErrorData();


    @Override
    public ApiResponse findAllVeiculos() {
        apiResponse = new ApiResponse();
        List<Veiculo> veiculoList = repository.findAll();
        validaVeiculoList(apiResponse, veiculoList);
        return apiResponse;
    }

    @Override
    public ApiResponse findVeiculoByName(String veiculo) {
        apiResponse = new ApiResponse();
        List<Veiculo> veiculoList = repository.findVeiculoByVeiculo(veiculo);
        validaVeiculoList(apiResponse,veiculoList);
        return apiResponse;
    }


    @Override
    public ApiResponse findVeiculoById(Long id) throws NotFoundException {
        apiResponse = new ApiResponse();
        try {
            Veiculo veiculo = repository.findById(id).orElseThrow(()-> new NotFoundException("No Content"));
            data = new VeiculoData();
            data.setVeiculo(veiculo);
            apiResponse.setPayLoad(data);
            apiResponse.setStatus(HttpStatus.OK.value());

            return apiResponse;

        } catch (NotFoundException exception) {
            message.setMessage(exception.getMessage());
            apiResponse.setPayLoad(message);
            apiResponse.setStatus(HttpStatus.NO_CONTENT.value());

            return apiResponse;
        }
    }

    @Override
    public ApiResponse createVeiculo(VeiculoDto veiculoDto) {
        apiResponse = new ApiResponse();
        List<String> errorList = validaDto(veiculoDto);
        if (errorList.isEmpty()){
            try {
                Veiculo veiculo = new Veiculo(veiculoDto);
                message.setMessage("Veículo cadastrado com sucesso");
                apiResponse.setStatus(HttpStatus.CREATED.value());
                repository.save(veiculo);
            }  catch (IllegalArgumentException e){
                error.setErrorList(Arrays.asList("Marca não encontrada na lista"));
                message.setMessage("Veiculo não cadastrado");
                apiResponse.setError(error);
                apiResponse.setStatus(HttpStatus.BAD_REQUEST.value());
            }
        }else {
            error.setErrorList(errorList);
            apiResponse.setError(error);
            apiResponse.setStatus(HttpStatus.BAD_REQUEST.value());
            message.setMessage("Veículo não cadastrado");
        }
        apiResponse.setPayLoad(message);
        return apiResponse;
    }

    @Override
    public ApiResponse updateVeiculoHard(Long id, VeiculoDto veiculoDto) throws NotFoundException {
        apiResponse = new ApiResponse();
        List<String> errorList = validaDto(veiculoDto);

        if (errorList.isEmpty()){
            try {
                Veiculo veiculo = repository.findById(id).orElseThrow(()-> new NotFoundException("No Content"));
                veiculo = atualizandoEntity(veiculoDto, veiculo);
                message.setMessage("Veículo atualizado com sucesso");
                apiResponse.setStatus(HttpStatus.OK.value());
                repository.save(veiculo);
            } catch (NotFoundException exception) {
                message.setMessage(exception.getMessage());
                apiResponse.setStatus(HttpStatus.NOT_FOUND.value());
            } catch (IllegalArgumentException e){
                error.setErrorList(Arrays.asList("Marca não encontrada na lista"));
                apiResponse.setError(error);
                apiResponse.setStatus(HttpStatus.BAD_REQUEST.value());
            }
        } else{
            error.setErrorList(errorList);
            apiResponse.setError(error);
            apiResponse.setStatus(HttpStatus.BAD_REQUEST.value());
            message.setMessage("Veículo não atualizado");
        }
        apiResponse.setPayLoad(message);
        return apiResponse;
    }



    @Override
    public ApiResponse updateVeiculoSoft(Long id, VeiculoDto veiculoDto) throws NotFoundException {
        apiResponse = new ApiResponse();
        try {
            Veiculo veiculo = repository.findById(id).orElseThrow(()-> new NotFoundException("No Content"));
            veiculo = validaAlteracoes(veiculoDto, veiculo);
            message.setMessage("Veículo atualizado com sucesso");
            apiResponse.setStatus(HttpStatus.OK.value());
            repository.save(veiculo);
        } catch (NotFoundException e) {
            message.setMessage(e.getMessage());
            apiResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        } catch (IllegalArgumentException e){
            error.setErrorList(Arrays.asList("Marca não encontrada na lista"));
            apiResponse.setError(error);
            apiResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        }

        apiResponse.setPayLoad(message);
        return apiResponse;
    }

    @Override
    public ApiResponse deleteVeiculo(Long id) throws NotFoundException {
        apiResponse = new ApiResponse();
        try {
            repository.findById(id).orElseThrow(()-> new NotFoundException("No Content"));
            message.setMessage("Veículo excluído com sucesso");
            apiResponse.setStatus(HttpStatus.OK.value());
            repository.deleteById(id);
        } catch (NotFoundException e) {
            message.setMessage(e.getMessage());
            apiResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        }

        apiResponse.setPayLoad(message);
        return apiResponse;
    }

    private void validaVeiculoList(ApiResponse apiResponse, List<Veiculo> veiculoList) {
        if(!veiculoList.isEmpty()){
            data = new VeiculoData();
            data.setVeiculos(veiculoList);
            apiResponse.setStatus(HttpStatus.OK.value());
            apiResponse.setPayLoad(data);
        }else{

            message.setMessage("No Content");
            apiResponse.setStatus(HttpStatus.NO_CONTENT.value());
            apiResponse.setPayLoad(message);
        }
    }

    private Veiculo atualizandoEntity(VeiculoDto veiculoDto, Veiculo veiculo) {
        veiculo.setVeiculo(veiculoDto.getVeiculo());
        veiculo.setAno(veiculoDto.getAno());
        veiculo.setDescricao(veiculoDto.getDescricao());
        veiculo.setMarca(VeiculoEnum.valueOf(veiculoDto.getMarca().toUpperCase()));
        veiculo.setUpdated(LocalDateTime.now());
        return veiculo;
    }

    private List<String> validaDto(VeiculoDto veiculoDto) {
        List<String> errorList = new ArrayList<>() ;
        if (veiculoDto.getVeiculo() == null || veiculoDto.getVeiculo().equals("")){
            errorList.add("Digite o nome do veículo");
        }
        if (veiculoDto.getMarca() == null || veiculoDto.getMarca().equals("")){
            errorList.add("Digite a marca do veículo");
        }
        if (veiculoDto.getAno() == 0 || veiculoDto.getAno() < 1900) {
            errorList.add("Digite o ano do veículo");
        }
        if (veiculoDto.getDescricao() == null || veiculoDto.getDescricao().equals("")) {
            errorList.add("Digite uma descrição do veículo");
        }
        return errorList;
    }

    private Veiculo validaAlteracoes(VeiculoDto veiculoDto, Veiculo veiculo) {
        if (veiculoDto.getVeiculo() != null && !veiculoDto.getVeiculo().equals("")){
            veiculo.setVeiculo(veiculoDto.getVeiculo());
        }
        if(veiculoDto.getMarca() != null && !veiculoDto.getMarca().equals("")){
            veiculo.setMarca(VeiculoEnum.valueOf(veiculoDto.getMarca().toUpperCase()));
        }
        if(veiculoDto.getDescricao() != null && !veiculoDto.getDescricao().equals("")){
            veiculo.setDescricao(veiculoDto.getDescricao());
        }
        if (veiculoDto.getAno() != 0 && veiculoDto.getAno() > 1900){
            veiculo.setAno(veiculoDto.getAno());
        }
        veiculo.setUpdated(LocalDateTime.now());
        return veiculo;
    }
}
