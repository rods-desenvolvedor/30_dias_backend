package com.rods.dia_03.service;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.rods.dia_03.entity.Investimento;
import com.rods.dia_03.repository.InvestimentoRepository;
import org.springframework.boot.context.properties.bind.validation.BindValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class InvestimentoService {
    private InvestimentoRepository investimentoRepository;
    public InvestimentoService(InvestimentoRepository investimentoRepository){
        this.investimentoRepository = investimentoRepository;
    }



    public List<Investimento> listarTodosInvestimentos()
    {
        return  investimentoRepository.findAll();
    }

    public List<Investimento> listarInvestimentoPorInvestidor(String nomeInvestidor){
        return investimentoRepository.findInvestimentoByInvestidor(nomeInvestidor);
    }

    public List<Investimento> criarNovoInvestimento(Investimento investimento){
        investimentoRepository.save(investimento);
        return listarTodosInvestimentos();
    }

    private double calcularGanho(Optional<Investimento> investimento)
    {

        java.time.LocalDateTime horarioAgora = LocalDateTime.now();
        Duration tempoPassado = Duration.between(investimento.get().getDataInvestimento(), horarioAgora);
        Long mesesPassados = tempoPassado.toDays() / 30;

        int valorInvestimento = investimento.get().getInvestimentoInicial();
        double taxaRendimentoMensal = 0.0052;

        double ganho = valorInvestimento * taxaRendimentoMensal * mesesPassados;

        return ganho;

    }

    public List<Investimento> limpar()
    {
        investimentoRepository.deleteAll();
        return listarTodosInvestimentos();
    }

    public RespostaInvestimentoDTO SacarInvestimento(Long id)
    {
        Optional<Investimento> investimento = investimentoRepository.findById(id);

        double ganho = calcularGanho(investimento);

        double investimentoAtualizado = investimento.get().getInvestimentoInicial() + ganho;

        investimento.get().setInvestimentoInicial((int)investimentoAtualizado);

        return new RespostaInvestimentoDTO(investimento.get().getInvestidor(), LocalDateTime.now(), investimento.get().getInvestimentoInicial());
    }

}
