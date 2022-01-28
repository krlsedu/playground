package com.exemplo.aula02;

public class ExercicioArrays {
    public static void main(String[] args) {
//        menor();
        codigoDeBarras();
    }

    private static void menor() {
        int[] numeros = {88, 7, 0, -1, 45, 3, 92, -9, 300000001, 12, 23567};
        int menor = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (i == 0) {
                menor = numeros[i];
            } else {
                if (menor > numeros[i]) {
                    menor = numeros[i];
                }
            }
        }
        System.out.printf("o menor número da lista é %d\n", menor);
    }

    private static void codigoDeBarras() {
        int[] codigoDeBarras = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 7, 9, 0, 89};
        int dvCalculado = 0;
        int dv = 0;
        for (int i = 0; i < codigoDeBarras.length; i++) {

            if (i == 20) {
                dv = codigoDeBarras[i];
            } else {
                dvCalculado += codigoDeBarras[i];
                if (dvCalculado > 99) {
                    dvCalculado -= 100;
                }
            }

            System.out.print(codigoDeBarras[i]);
        }
        System.out.println("");
        System.out.println(dvCalculado);
        if (dvCalculado != dv) {
            System.out.println("codigo de barras inválido");
        }
    }
}
