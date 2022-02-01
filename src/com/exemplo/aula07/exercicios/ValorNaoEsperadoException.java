package com.exemplo.aula07.exercicios;

public class ValorNaoEsperadoException extends Exception{
    public ValorNaoEsperadoException(String s){
        super("Valos inválido para o enum Sexo: " + s);
    }
}
