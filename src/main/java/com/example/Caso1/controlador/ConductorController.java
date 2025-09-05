package com.example.Caso1.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Caso1.model.conductor;
import com.example.Caso1.repositorios.ConductorRepositorio;


@RestController
@RequestMapping("/conductores")
public class ConductorController {

    @Autowired
    private ConductorRepositorio conductorRepository;

    @PostMapping
    public conductor crearConductor(@RequestBody conductor conductor) {
        return conductorRepository.save(conductor);
    }

    
}
