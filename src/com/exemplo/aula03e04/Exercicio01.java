package com.exemplo.aula03e04;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        stringBuffer();
    }

    private static void split() {
        System.out.println("Informe o texto a processar:");
        String texto = new Scanner(System.in).nextLine();
        String[] textoSplit = texto.split(" ");
        for (String txt :
                textoSplit) {
            System.out.println(txt);
        }

        for (int i = 0; i < textoSplit.length; i++) {
            System.out.println(textoSplit[i]);
        }
    }

    private static void subString() {
        System.out.println("Informe o texto a processar:");
        String texto = new Scanner(System.in).nextLine();
        if (texto.length() <= 13) {
            System.out.printf("%s ", texto);
        } else {
            System.out.println(texto.substring(0, 13));
        }
    }

    private static void toLowerCaseToUpperCase() {
        System.out.println("Informe o texto a processar:");
        String texto = new Scanner(System.in).nextLine();
        boolean espaco = false;
        for (int i = 0; i < texto.length(); i++) {
            String caracter = String.valueOf(texto.charAt(i));
            if (!espaco) {
                espaco = caracter.equals(" ");
                System.out.print(
                        caracter.toUpperCase());
            }else {
                System.out.print(
                        caracter.toLowerCase());
            }
        }
    }

    private static void compareToTrimIsEmpty() {
        System.out.println("Informe o texto a processar:");
        String email = new Scanner(System.in).nextLine();
        email = email.trim();
        System.out.println(email);

        if (email.equals("carlos@targettrust.com.br")) {
            System.out.println("email correto");
        }

        if (email.compareTo("carlos@targettrust.com.br") == 0) {
            System.out.println("email correto");
        }

        if (email.isEmpty()) {
            System.out.println("É necessário informar seu e-mail!");
        }
    }

    private static void indexof() {
        System.out.println("Informe o texto a processar:");
        String texto = new Scanner(System.in).nextLine();
        if (texto.indexOf(",") > 0) {
            System.out.println(texto.substring(0, texto.indexOf(",")));
        }else {
            System.out.println(texto);
        }
    }

    private static void twitter() {
        System.out.println("Informe o texto a processar:");
        String texto = new Scanner(System.in).nextLine();
        if (texto.length() > 140) {
            System.out.println();
            texto = texto.substring(0, 137);
            texto = texto.concat("...");
        }
        System.out.println(texto);
    }

    public static void stringBuffer() {
        String texto;
        StringBuffer stringBuffer = new StringBuffer();
        do {

            System.out.println("Digite algo, caso queira parar digite sair:");

            texto = new Scanner(System.in).nextLine();
            if (texto.compareTo("sair") != 0) {
                stringBuffer.append(texto);
            }
        } while (!texto.equals("sair"));

        System.out.println(stringBuffer);
    }
}
