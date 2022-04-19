package com.backes.desafio.dtos;

import com.backes.desafio.model.StatusBoleto;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class BoletoDto {

    private UUID id;

    private LocalDate dataVencimento;

    private BigDecimal totalEmCentavos;

    private String consumidor;

    private StatusBoleto status;

    private LocalDate dataPagamento;

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

    public BigDecimal getTotalEmCentavos() {
        return totalEmCentavos;
    }

    public void setTotalEmCentavos(BigDecimal totalEmCentavos) {
        this.totalEmCentavos = totalEmCentavos;
    }

    public String getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(String consumidor) {
        this.consumidor = consumidor;
    }

    public StatusBoleto getStatus() {
        return status;
    }

    public void setStatus(StatusBoleto status) {
        this.status = status;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
