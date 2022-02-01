package com.exemplo.aula07;

import java.util.ArrayList;
import java.util.List;

public class Exemplo {
    public static void main(String[] args) {
        iniciaExecucao();
    }

    public static void iniciaExecucao() {
//        try {
//            leLista();
//        } catch (ErroTamanhoLista e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            System.out.println("ocorreu um erro genérico");
//        }
        leLista();
    }

    public static void leLista() {
        List<Integer> valores = new ArrayList<>(List.of(88, 7, 0, -1, 45, 3, 92, -9, 300000001, 12, 23567));

        System.out.println("Antes do get");
        Integer valor = 123;

        valor = Integer.parseInt("Z");
//        try {
//            valor = Integer.parseInt("10");
//            valor = valores.get(11);
//            System.out.println("conseguiu pegar o valor");
//        } catch (NumberFormatException e) {
//            System.out.println("Ocorreu um erro ao tentar converter uma string para um inteiro ->"
//                    + e.getMessage());
//            e.printStackTrace();
//        } catch (IndexOutOfBoundsException e) {
//            e.printStackTrace();
//            throw new ErroTamanhoLista();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        System.out.println("Depois do get");

        System.out.println(valor);
    }
}
