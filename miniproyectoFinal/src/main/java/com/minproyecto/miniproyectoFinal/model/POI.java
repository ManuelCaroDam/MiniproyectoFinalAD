package com.minproyecto.miniproyectoFinal.model;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class POI {

    @Id
    @GeneratedValue
    private Long Id;
    private String name;
    private String location;
    private String description;
    private LocalDate date;
    private Category category;
    private String coverPhoto;
    private String Photo2;
    private String Photo3;
}
