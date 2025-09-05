package com.example.Caso1.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Caso1.model.camion;

public interface CamionRepositorio extends JpaRepository<camion, Long> {

    camion findByPlaca(String placa);
}

