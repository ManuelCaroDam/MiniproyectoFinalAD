package com.minproyecto.miniproyectoFinal.errores.modelo;

import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class ApiValidationSubError {

    private String objeto, campo, mensaje;
    private Object valorRechazado;
}
