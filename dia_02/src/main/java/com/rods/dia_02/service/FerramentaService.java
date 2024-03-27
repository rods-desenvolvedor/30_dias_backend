package com.rods.dia_02.service;


import com.rods.dia_02.entity.Ferramenta;
import com.rods.dia_02.repository.FerramentaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FerramentaService {

    private FerramentaRepository ferramentaRepository;
    public FerramentaService(FerramentaRepository ferramentaRepository){
        this.ferramentaRepository = ferramentaRepository;
    }

    public List<Ferramenta> listarFerramentas()
    {
        List<Ferramenta> lista = ferramentaRepository .listarFerramentas();
        return lista;
    }

    public List<Ferramenta> cadastrarFerramenta(Ferramenta ferramenta)
    {
        ferramentaRepository.save(ferramenta);
        return listarFerramentas();
    }

    public List<Ferramenta> listarFerramentasPorTag(String tag)
    {
        return ferramentaRepository.findFerramentaByTags(tag);
    }

    public List<Ferramenta> apagarTodasAsFerramentas()
    {
        ferramentaRepository.deleteAll();
        return listarFerramentas();
    }
}
