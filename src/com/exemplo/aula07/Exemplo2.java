package com.exemplo.aula07;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma nota");
        String entrada = scanner.nextLine();

        Integer numeroDigitado = null;

        System.out.println("Irá converter para número");
        try {
            numeroDigitado = Integer.parseInt(entrada);
            System.out.println("Converteu para um número a entrada");
            System.out.printf("O número digitado foi: %d\n", numeroDigitado);
        } catch (NumberFormatException exception) {
            System.out.println("Não foi possível converter " + entrada);
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
}
