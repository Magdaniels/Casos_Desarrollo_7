package com.example.Caso1.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Caso1.model.conductor;

public interface ConductorRepositorio extends JpaRepository<conductor, Long> {
}
