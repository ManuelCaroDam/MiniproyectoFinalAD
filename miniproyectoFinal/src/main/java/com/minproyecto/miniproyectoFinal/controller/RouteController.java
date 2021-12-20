package com.minproyecto.miniproyectoFinal.controller;

import com.minproyecto.miniproyectoFinal.model.Route;
import com.minproyecto.miniproyectoFinal.services.RouteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@AllArgsConstructor
public class RouteController {

    private final RouteService servicio;

    @GetMapping("/")
    public List<Route> todos() {
        return servicio.findAll();
    }

    @GetMapping("/{id}")
    public Route uno(@PathVariable @Min(value = 0, message = "No se pueden buscar categorias con un identificador negativo") Long id) {
        return servicio.findById(id);
    }

    @PostMapping("/")
    public Route crear(@Valid @RequestBody Route route) {
        return servicio.save(route);
    }
}
