package com.minproyecto.miniproyectoFinal.services;

import com.minproyecto.miniproyectoFinal.errores.excepciones.ListEntityNotFoundException;
import com.minproyecto.miniproyectoFinal.errores.excepciones.SingleEntityNotFoundException;
import com.minproyecto.miniproyectoFinal.model.Category;
import com.minproyecto.miniproyectoFinal.repos.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository repositorio;

    public List<Category> findAll() {
        List<Category> result = repositorio.findAll();

        if (result.isEmpty()) {
            throw new ListEntityNotFoundException(Category.class);
        } else {
            return result;
        }
    }

    public Category findById (Long id) {
        return repositorio.findById(id)
                .orElseThrow(() -> new SingleEntityNotFoundException(id.toString(), Category.class));
    }

    public Category save (Category category) {
        return repositorio.save(category);
    }



}
