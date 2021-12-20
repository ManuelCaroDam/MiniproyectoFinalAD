package com.minproyecto.miniproyectoFinal.services;

import com.minproyecto.miniproyectoFinal.errores.excepciones.ListEntityNotFoundException;
import com.minproyecto.miniproyectoFinal.errores.excepciones.SingleEntityNotFoundException;
import com.minproyecto.miniproyectoFinal.model.POI;
import com.minproyecto.miniproyectoFinal.repos.POIRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class POIService {

    private final POIRepository repositorio;

    public List<POI> findAll() {
        List<POI> result = repositorio.findAll();

        if (result.isEmpty()) {
            throw new ListEntityNotFoundException(POI.class);
        }else {
            return result;
        }
    }
    public POI findById(Long id) {
        return repositorio.findById(id)
                .orElseThrow(() -> new SingleEntityNotFoundException(id.toString(),POI.class));
    }

    public POI save (POI poi) {
        return repositorio.save(poi);
    }
    }
