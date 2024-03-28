package com.rods.dia_03.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "investimentos")
public class Investimento {

    private Long id;
    private String investidor;
    private java.time.LocalDateTime dataInvestimento;
    private BigDecimal investimentoInicial;

}
