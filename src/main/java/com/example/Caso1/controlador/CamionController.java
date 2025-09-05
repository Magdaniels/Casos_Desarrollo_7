package com.example.Caso1.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Caso1.model.camion;
import com.example.Caso1.repositorios.CamionRepositorio;



@RestController
@RequestMapping("/camiones")
public class CamionController {

    @Autowired
    private CamionRepositorio camionRepository;


    @PostMapping
    public camion crearCamion(@RequestBody camion camion) {
        return camionRepository.save(camion);
    }

    @GetMapping("/placa/{placa}")
    public camion buscarPorPlaca(@PathVariable String placa) {
        return camionRepository.findByPlaca(placa);
    }
}
