package com.example.Caso1.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.Caso1.model.camion;
import com.example.Caso1.repositorios.CamionRepositorio;



@Controller
@RequestMapping("/camiones")
public class CamionController {

    @Autowired
    private CamionRepositorio camionRepo;

    @PostMapping("/guardar")
    public String guardarCamion(camion camion) {
        camionRepo.save(camion);
        return "redirect:/";
    }

    @GetMapping("/buscar")
    public String buscarCamion(@RequestParam String placa, Model model) {
        camion c = camionRepo.findByPlaca(placa);
        if(c != null) {
            model.addAttribute("resultado", "Camión encontrado: " + c.getNombre());
        } else {
            model.addAttribute("resultado", "No se encontró ningún camión con esa placa");
        }
        return "index";
    }
}


