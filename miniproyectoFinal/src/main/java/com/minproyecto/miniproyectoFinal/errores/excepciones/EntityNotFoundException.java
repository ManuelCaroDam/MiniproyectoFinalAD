package com.minproyecto.miniproyectoFinal.errores.excepciones;

public class EntityNotFoundException extends RuntimeException{

    public EntityNotFoundException(String mensaje) {
        super(mensaje);
    }
}
