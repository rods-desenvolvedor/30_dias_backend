package com.rods.dia_03.entity;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "investimentos")
public class Investimento {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String investidor;
    private java.time.LocalDateTime dataInvestimento;
    private int investimentoInicial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvestidor() {
        return investidor;
    }

    public void setInvestidor(String investidor) {
        this.investidor = investidor;
    }

    public LocalDateTime getDataInvestimento() {
        return dataInvestimento;
    }

    public void setDataInvestimento(LocalDateTime dataInvestimento) {
        this.dataInvestimento = dataInvestimento;
    }

    public int getInvestimentoInicial() {
        return investimentoInicial;
    }

    public void setInvestimentoInicial(int investimentoInicial) {
        this.investimentoInicial = investimentoInicial;
    }
}
