package com.exemplo.aula05e06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercicio04 {
    public static void main(String[] args) {

        List<Integer> valores = new ArrayList<>(List.of(88, 7, 0, -1, 45, 3, 92, -9, 300000001, 12, 23567));

//        Set<Integer> setDecrescente = new TreeSet<>(Comparator.reverseOrder());

        valores.sort(Comparator.reverseOrder());

        System.out.println(valores);
    }
}
