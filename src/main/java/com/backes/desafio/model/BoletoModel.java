package com.backes.desafio.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "TB_BOLETO")
public class BoletoModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, name = "data_vencimento")
    private LocalDate dataVencimento;

    @Column(nullable = false, name = "total_em_centavos")
    private BigDecimal totalEmCentavos;

    @Column(nullable = false, name = "consumidor")
    private String consumidor;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "status")
    private StatusBoleto status;

    @Column(nullable = true, name = "data_pagamento")
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