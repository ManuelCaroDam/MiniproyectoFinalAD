package com.minproyecto.miniproyectoFinal.model;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Route {

    @Id @GeneratedValue
    private long Id;
    private String name;
    private List<POI> steps;
}
