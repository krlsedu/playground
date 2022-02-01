package com.exemplo.aula07;

public class ErroTamanhoLista extends Exception {
    public ErroTamanhoLista(String msg) {
        super("Sua lista possui menos itens que a posição que vc solicitou: " + msg);
    }

    public ErroTamanhoLista(){
        super("Sua lista possui menos itens que a posição que vc solicitou!");
    }
}
