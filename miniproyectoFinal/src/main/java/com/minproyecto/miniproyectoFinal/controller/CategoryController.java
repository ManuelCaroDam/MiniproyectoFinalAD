package com.minproyecto.miniproyectoFinal.controller;

import com.minproyecto.miniproyectoFinal.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Category")
@Validated
public class CategoryController {

    private final CategoryService servicio;


}
