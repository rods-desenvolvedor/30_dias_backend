package com.rods.dia_02.controller;


import com.rods.dia_02.entity.Ferramenta;
import com.rods.dia_02.service.FerramentaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.OnError;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping(value = "/open-api", produces = {"application/json"})
@Tag(name = "open-api")
public class FerramentaController {

    private FerramentaService ferramentaService;

    public FerramentaController(FerramentaService ferramentaService)
    {
        this.ferramentaService = ferramentaService;
    }

    @Operation(summary = "Retorna a listagem de TODAS as ferramentas listadas", method = "GET")
    @ApiResponse(responseCode = "200", description = "deu bom")
    @GetMapping("/ferramentas")
    private List<Ferramenta> listarFerramentas()
    {
        return ferramentaService.listarFerramentas();
    }

    @Operation(summary = "Cadastra uma nova ferramenta - É necessário passar um body na requisição.", method = "POST")
    @ApiResponse(responseCode = "200", description = "nova tarefa cadastrada com sucesso")
    @PostMapping("/cadastrar-ferramenta")
    private List<Ferramenta> cadastrarFerramenta(@RequestBody Ferramenta ferramenta)
    {
        return ferramentaService.cadastrarFerramenta(ferramenta);
    }


    @Operation(summary = "Filtra as ferramentas a partir de uma tag")
    @ApiResponse(responseCode = "200", description = "Ferramentas filtradas com sucesso.")
    @GetMapping("/ferramentas/{tag}")
    private List<Ferramenta> listarFerramentaPorTag(@PathVariable String tag)
    {
        return ferramentaService.listarFerramentasPorTag(tag);
    }


    @Operation(summary = "CUIDADO!! Essa operação apaga TODAS as ferramentas cadastradas.")
    @ApiResponse(responseCode = "200", description = "Todas as ferramentas foram apagadas.")
    @DeleteMapping("/ferramentas/apagar-tudo")
    private List<Ferramenta> apagarTodasAsFerramentas()
    {
        return ferramentaService.apagarTodasAsFerramentas();
    }
}
