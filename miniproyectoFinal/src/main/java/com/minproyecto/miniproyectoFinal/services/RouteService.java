package com.minproyecto.miniproyectoFinal.services;

import com.minproyecto.miniproyectoFinal.errores.excepciones.ListEntityNotFoundException;
import com.minproyecto.miniproyectoFinal.errores.excepciones.SingleEntityNotFoundException;
import com.minproyecto.miniproyectoFinal.model.POI;
import com.minproyecto.miniproyectoFinal.model.Route;
import com.minproyecto.miniproyectoFinal.repos.RouteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RouteService {

    private final RouteRepository repositorio;

    public List<Route> findAll() {
        List<Route> result = repositorio.findAll();

        if (result.isEmpty()) {
            throw new ListEntityNotFoundException(Route.class);
        } else {
            return result;
        }
    }

    public Route findById(Long id) {
        return repositorio.findById(id)
                .orElseThrow(() -> new SingleEntityNotFoundException(id.toString(),POI.class));
    }

    public Route save (Route route) {
        return repositorio.save(route);
    }
}
