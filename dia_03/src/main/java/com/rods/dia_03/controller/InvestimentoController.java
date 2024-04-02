package com.rods.dia_03.controller;

import com.rods.dia_03.entity.Investimento;
import com.rods.dia_03.service.InvestimentoService;
import com.rods.dia_03.service.RespostaInvestimentoDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.annotation.HandlesTypes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class InvestimentoController {

    private InvestimentoService investimentoService;
    public InvestimentoController(InvestimentoService investimentoService){
        this.investimentoService = investimentoService;
    }


    @GetMapping("/investimentos")
    private List<Investimento> listarTodosInvestimentos()
    {
        return investimentoService.listarTodosInvestimentos();
    }

    @PostMapping("/investimentos/novo-investimento")
    private List<Investimento> criarNovoInvestimento(@RequestBody Investimento investimento)
    {
        return investimentoService.criarNovoInvestimento(investimento);
    }

    @GetMapping("/investimentos/{nomeInvestidor}")
    private List<Investimento> listarInvestimentoPorInvestidor(@PathVariable String nomeInvestidor)
    {
        return investimentoService.listarInvestimentoPorInvestidor(nomeInvestidor);
    }

    @DeleteMapping("/investimentos/{id}/sacarInvestimento")
    private ResponseEntity<RespostaInvestimentoDTO> sacarInvestimento(@PathVariable Long id) {
        RespostaInvestimentoDTO respostaSaque = investimentoService.SacarInvestimento(id);
        return new ResponseEntity<>(respostaSaque, HttpStatus.OK);
    }

    @DeleteMapping("/investimentos/limpar")
    private List<Investimento> limpar()
    {
        return investimentoService.limpar();
    }
}
