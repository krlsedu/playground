package com.exemplo.aula07.exercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        leLista();
        leListaUmAUm();
    }

    private static void leLista() {
//        System.out.println("Informe uma lista de números separados por ,");
//        Scanner scanner = new Scanner(System.in);
//        String linha = scanner.nextLine();
//
//        String[] linhaSplit = linha.split(",");

        String[] linhaSplit = {"1", "3", "s", "-1"};

        List<Integer> numeros = new ArrayList<>();

//        for (String valor: linhaSplit) {
//            try {
//                numeros.add(Integer.parseInt(valor));
//            } catch (NumberFormatException e) {
//                System.out.printf("Não foi possível converter \"%s\" para um Inteiro!\n", st);
//            }
//        }

        for (int i = 0; i < linhaSplit.length; i++) {
            String st = linhaSplit[i];
            try {
                numeros.add(Integer.parseInt(st.trim()));
            } catch (NumberFormatException e) {
                System.out.printf("Não foi possível converter \"%s\" para um Inteiro!\n", st);
            }
        }

        numeros.sort(Comparator.reverseOrder());

        System.out.println(numeros);
    }

    private static void leListaUmAUm() {
        String input;
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        do {
            System.out.println("Informe um número");
            input = scanner.nextLine();
            if (!input.equalsIgnoreCase("sair")) {
                try {
                    numeros.add(Integer.parseInt(input));
                } catch (NumberFormatException e) {
                    System.out.printf("Não foi possível converter \"%s\" para um inteiro\n", input);
                }
            }
        } while (!input.equalsIgnoreCase("sair"));

        numeros.sort(Comparator.reverseOrder());

        System.out.println(numeros);
    }
}
