package com.minproyecto.miniproyectoFinal.controller;

import com.minproyecto.miniproyectoFinal.model.Category;
import com.minproyecto.miniproyectoFinal.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Category")
@Validated
public class CategoryController {

    private final CategoryService servicio;

    @GetMapping("/")
    public List<Category> todos() {
        return servicio.findAll();
    }

    @GetMapping("/{id}")
    public Category uno(@PathVariable @Min(value = 0, message = "No se pueden buscar categorias con un identificador negativo") Long id) {
        return servicio.findById(id);
    }

    @PostMapping("/")
    public Category crear(@Valid @RequestBody Category category) {
        return servicio.save(category);
    }

}
