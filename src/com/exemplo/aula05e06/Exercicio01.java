package com.exemplo.aula05e06;

import java.util.ArrayList;
import java.util.List;

public class Exercicio01 {
    public static void main(String[] args) {
        List<String> cores = new ArrayList<>();
        cores.add("Amarelo");
        cores.add("Azul");
        cores.add("Vermelho");
        cores.add("Preto");
        cores.add("Branco");
        cores.add("Azul");

        System.out.println(cores);

        cores.remove(1);

        System.out.println(cores);

        cores.add("Marrom");

        System.out.println(cores.size());

        int ultimoIndice = cores.size() - 1;

        System.out.println(cores.get(ultimoIndice));

        int indiceAzul = cores.indexOf("Azul");

        cores.set(indiceAzul,"Verde");

        System.out.println(cores);

        if (!cores.contains("Azul") && cores.contains("Vermelho")) {
            cores.add("Azul");
        }else {
            cores.add("Roxo");
        }

        System.out.println(cores);
    }
}
