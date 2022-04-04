package com.backes.desafio.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

public class NovoBoletoDto {

    @NotBlank
    private String nomeConsumidor;
    @NotNull
    private LocalDate dataVencimento;
    @NotNull
    private BigDecimal valorCentavos;

    public String getNomeConsumidor() {
        return nomeConsumidor;
    }

    public void setNomeConsumidor(String nomeConsumidor) {
        this.nomeConsumidor = nomeConsumidor;
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
}
