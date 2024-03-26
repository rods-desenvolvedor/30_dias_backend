package com.rods.dia_01.controller;


import com.rods.dia_01.entity.Tool;
import com.rods.dia_01.service.ToolService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToolController {

    private ToolService toolService;
    public ToolController(ToolService toolService){
        this.toolService = toolService;
    }


    @GetMapping("/tools")
    private List<Tool> listAll()
    {
        return toolService.listAll();
    }

    @PostMapping("/registerTool")
    private List<Tool> saveTool(@RequestBody Tool tool)
    {
        return toolService.saveTool(tool);
    }


    @DeleteMapping("/delete/{id}")
    private List<Tool> deleteToolById(@PathVariable Long id)
    {
        return  toolService.deleteToolById(id);
    }

    @GetMapping("/tools/{tag}")
    private List<Tool> listByTag(@PathVariable String tag)
    {
        return toolService.findByTags(tag);
    }


}
