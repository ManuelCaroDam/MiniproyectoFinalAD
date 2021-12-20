package com.minproyecto.miniproyectoFinal.controller;

import com.minproyecto.miniproyectoFinal.model.POI;
import com.minproyecto.miniproyectoFinal.services.POIService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@AllArgsConstructor
public class POIController {

    private final POIService servicio;

    @GetMapping("/")
    public List<POI> todos() {
        return servicio.findAll();
    }

    @GetMapping("/{id}")
    public POI uno(@PathVariable @Min(value = 0, message = "No se pueden buscar categorias con un identificador negativo") Long id) {
        return servicio.findById(id);
    }

    @PostMapping("/")
    public POI crear(@Valid @RequestBody POI poi) {
        return servicio.save(poi);
    }
}
