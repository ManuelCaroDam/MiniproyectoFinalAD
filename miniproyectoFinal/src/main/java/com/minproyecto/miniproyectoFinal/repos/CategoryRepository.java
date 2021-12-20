package com.minproyecto.miniproyectoFinal.repos;

import com.minproyecto.miniproyectoFinal.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
