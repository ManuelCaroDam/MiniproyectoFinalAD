package com.minproyecto.miniproyectoFinal.model;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category {

    @Id @GeneratedValue
    private Long Id;
    private String name;

}
