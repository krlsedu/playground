package com.exemplo.aula02;

public class Exercicio02 {
    public static void main(String[] args) {
        somaAte1000();
//        multiplosDe3();
//        menor();
//        fatorial();
    }

    private static void somaAte1000() {
        int soma = 0;
        for (int i = 0; i <= 1000; i++) {
            soma = soma + i;
        }
        System.out.printf("A soma dos número de 1 a 1000 é %d\n", soma);
    }

    private static void multiplosDe3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.printf("o número %d é múltiplo de 3\n", i);
            }
        }
    }

    private static void fatorial() {
        int fatorial = 1;
        for (int i = 1; i <= 10; i++) {
            fatorial *= i;
            System.out.printf("O fatorial de %d é %d\n", i, fatorial);
        }
    }
}
