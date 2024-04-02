package com.rods.dia_03.service;

import java.time.LocalDateTime;

public class RespostaInvestimentoDTO {
    private String investidor;
    private LocalDateTime dataSaque;
    private int valorRetirada;

    public RespostaInvestimentoDTO(String investidor, LocalDateTime dataSaque, int valorRetirada) {
        this.investidor = investidor;
        this.dataSaque = dataSaque;
        this.valorRetirada = valorRetirada;
    }

    public String getInvestidor() {
        return investidor;
    }

    public void setInvestidor(String investidor) {
        this.investidor = investidor;
    }

    public LocalDateTime getDataSaque() {
        return dataSaque;
    }

    public void setDataSaque(LocalDateTime dataSaque) {
        this.dataSaque = dataSaque;
    }

    public int getValorRetirada() {
        return valorRetirada;
    }

    public void setValorRetirada(int valorRetirada) {
        this.valorRetirada = valorRetirada;
    }
}
