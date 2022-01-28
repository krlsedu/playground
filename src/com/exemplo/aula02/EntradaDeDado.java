package com.exemplo.aula02;

import java.util.Scanner;

public class EntradaDeDado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        String nome = scanner.nextLine();
        System.out.printf("Olá %s\n",nome);
    }
}
