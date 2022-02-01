package com.exemplo.aula07.exercicios;

public class ObterCampoException extends Exception {
    public ObterCampoException(String tipo, int ini, int fim, Throwable e) {
        super(String.format("Houve um erro ao obter o campo %s - posições %d a %d -> %s", tipo, ini, fim, e.getMessage()));
    }
}
