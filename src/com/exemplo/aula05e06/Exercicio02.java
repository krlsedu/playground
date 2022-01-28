package com.exemplo.aula05e06;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio02 {
    public static void main(String[] args) {
        Set<Integer> valores = new TreeSet<>(List.of(88, 7, 0, -1, 45, 3, 92, -9, 300000001, 12, 23567));
        System.out.println(valores);

        Iterator iterator = valores.iterator();
        while (iterator.hasNext()) {
            Integer valor = (Integer) iterator.next();
            if (valor > 0) {
                System.out.printf("%d - %s", valor, "Positivo\n");
            } else if (valor < 0) {
                System.out.printf("%d - %s", valor, "Negativo\n");
            } else {
                System.out.printf("%d - %s", valor, "Zero\n");
            }
        }
    }
}
