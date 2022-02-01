package com.exemplo.aula07.exercicios;

public class SexoInvalidoException extends Exception {
    public SexoInvalidoException(String sexo) {
        super(String.format("O sexo informado %s é inválido. Valores aceitos (M,F,O,N)", sexo));
    }
}
