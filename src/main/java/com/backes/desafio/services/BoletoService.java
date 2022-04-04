package com.backes.desafio.services;

import com.backes.desafio.dtos.NovoBoletoDto;
import com.backes.desafio.dtos.RetornoNovoBoletoDto;
import com.backes.desafio.model.BoletoModel;
import com.backes.desafio.model.StatusBoleto;
import com.backes.desafio.repositories.BoletoRepository;
import org.springframework.stereotype.Service;

@Service
public class BoletoService {

    final BoletoRepository boletoRepository;

    public BoletoService(BoletoRepository boletoRepository) {
        this.boletoRepository = boletoRepository;
    }

    public RetornoNovoBoletoDto salvarBoleto(NovoBoletoDto novoBoletoDto) {

        BoletoModel model = new BoletoModel();
        model.setConsumidor(novoBoletoDto.getNomeConsumidor());
        model.setDataVencimento(novoBoletoDto.getDataVencimento());
        model.setTotalEmCentavos(novoBoletoDto.getValorCentavos());
        model.setStatus(StatusBoleto.PENDENTE);

        BoletoModel modelDb = boletoRepository.save(model);

        RetornoNovoBoletoDto retornoDto = new RetornoNovoBoletoDto();
        retornoDto.setId(modelDb.getId());
        retornoDto.setNomeConsumidor(modelDb.getConsumidor());
        retornoDto.setValorCentavos(modelDb.getTotalEmCentavos());
        retornoDto.setDataVencimento(modelDb.getDataVencimento());
        retornoDto.setStatus(modelDb.getStatus());
        return retornoDto;
    }
}
