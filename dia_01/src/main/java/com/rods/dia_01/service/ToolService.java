package com.rods.dia_01.service;


import com.rods.dia_01.entity.Tool;
import com.rods.dia_01.repository.ToolRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToolService {

    private ToolRepository toolRepositoy;
    public ToolService(ToolRepository toolRepository){
        this.toolRepositoy = toolRepository;
    }

    public List<Tool> listAll(){
        return toolRepositoy.findAll();
    }

    public List<Tool> saveTool(Tool tool){
        toolRepositoy.save(tool);
        return listAll();
    }

    public List<Tool> deleteToolById(Long id){
        toolRepositoy.deleteById(id);
        return listAll();
    }

    public List<Tool> findByTags(String tag)
    {
        return toolRepositoy.findByTags(tag);
    }

}
