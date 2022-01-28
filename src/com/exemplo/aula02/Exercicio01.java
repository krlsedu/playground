package com.exemplo.aula02;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        loops();
    }

    private static void nota() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a nota do aluno:");
        int nota = scanner.nextInt();
        if (nota < 7) {
            System.out.printf("O aluno tirou a nota %d e com isso foi reprovado\n", nota);
        } else {
            System.out.printf("O aluno tirou a nota %d e com isso foi aprovado\n", nota);
        }
    }

    private static void classificacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a nota do aluno:");
        int nota = scanner.nextInt();
        System.out.printf("A nota %d classificou o aluno como ", nota);
        switch (nota) {
            case 0:
            case 1:
                System.out.printf("A nota %d classificou o aluno como péssimo", nota);
                break;
            case 2:
                System.out.printf("A nota %d classificou o aluno como ruim", nota);
                break;
            case 3:
                System.out.printf("A nota %d classificou o aluno como regular", nota);
                break;
            case 4:
                System.out.printf("A nota %d classificou o aluno como bom", nota);
                break;
            case 5:
                System.out.printf("A nota %d classificou o aluno como excelente", nota);
                break;
            default:
                System.out.printf("a nota %d não é um valor válido, informe uma nota entre 0 e 5", nota);

        }
    }

    private static void loops() {
        for (int i = 150; i <= 300; i++) {
            System.out.println(i);
        }

        int i = 150;
        while (i <= 300) {
            System.out.println(i);
            i++;
        }

        i = 150;
        do {
            System.out.println(i);
            i++;
        } while (i <= 300);
    }
}
