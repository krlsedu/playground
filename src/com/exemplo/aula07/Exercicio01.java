package com.exemplo.aula07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("Informe uma lista de números separados por ,");
        Scanner scanner = new Scanner(System.in);
        String linha = scanner.nextLine();
        String[] linhaSplit = linha.split(",");
        List<Integer> numeros = new ArrayList<>();
        for (String st :
                linhaSplit) {
            try {
                numeros.add(Integer.parseInt(st.trim()));
            } catch (NumberFormatException e) {
                System.out.printf("Não foi possível converter \"%s\" para um Inteiro!\n",st);
            }
        }
        numeros.sort(Comparator.reverseOrder());
        System.out.println(numeros);
    }
}
