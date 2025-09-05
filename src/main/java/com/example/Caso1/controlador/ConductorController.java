package com.example.Caso1.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.Caso1.model.conductor;
import com.example.Caso1.repositorios.ConductorRepositorio;


@Controller
@RequestMapping("/conductores")
public class ConductorController {

    @Autowired
    private ConductorRepositorio conductorRepo;

    @PostMapping("/guardar")
    public String guardarConductor(conductor conductor) {
        conductorRepo.save(conductor);
        return "redirect:/";
    }
}


