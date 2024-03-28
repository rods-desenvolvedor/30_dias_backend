package com.rods.dia_03.service;


import com.rods.dia_03.entity.Investimento;
import com.rods.dia_03.repository.InvestimentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Investimento> listarInvestimentoPorInvestidor(String nome){
        return investimentoRepository.findInvestimentoByInvestidor(nome);
    }
}
