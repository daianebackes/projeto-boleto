package com.backes.desafio.dtos;

import com.backes.desafio.model.StatusBoleto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class RetornoNovoBoletoDto {

    private UUID id;

    private LocalDate dataVencimento;

    private BigDecimal valorCentavos;

    private String nomeConsumidor;

    private StatusBoleto status;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public BigDecimal getValorCentavos() {
        return valorCentavos;
    }

    public void setValorCentavos(BigDecimal valorCentavos) {
        this.valorCentavos = valorCentavos;
    }

    public String getNomeConsumidor() {
        return nomeConsumidor;
    }

    public void setNomeConsumidor(String nomeConsumidor) {
        this.nomeConsumidor = nomeConsumidor;
    }

    public StatusBoleto getStatus() {
        return status;
    }

    public void setStatus(StatusBoleto status) {
        this.status = status;
    }
}