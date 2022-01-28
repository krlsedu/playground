package com.exemplo.aula03e04;


public class Exercicio02 {
    public static void main(String[] args) {

//        char ch = 'A';
//        converteMinuscula(ch);
        converte();

    }

    private static void converteMinuscula(char ch) {


        int chInt = ch;

        chInt += 32;

        ch = (char) chInt;

        System.out.println(ch);

    }

    private static void converte() {
        int[] numeros = {86, 99, 32, 101, 104, 32, 100, 101, 109, 97, 105,
                115, 33, 32, 83, 117, 97, 32, 114, 101, 115, 111, 108, 117, 99, 97,
                111, 32, 101, 115, 116, 97, 104, 32, 99, 111, 114, 114, 101, 116, 97,
                33, 33, 32, 78, 97, 111, 32, 99, 111, 110, 116, 101, 32, 97, 111, 115,
                32, 100, 101, 109, 97, 105, 115, 32, 58, 41};

        StringBuilder stringBuilder = new StringBuilder();

        for (int numero : numeros) {
            stringBuilder.append((char) numero);
        }

        System.out.println(stringBuilder);
    }
}
