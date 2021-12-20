package com.minproyecto.miniproyectoFinal.services;

import com.minproyecto.miniproyectoFinal.repos.RouteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RouteService {

    private final RouteRepository repositorio;
}
