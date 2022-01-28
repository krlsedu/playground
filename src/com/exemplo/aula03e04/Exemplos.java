package com.exemplo.aula03e04;

import java.util.Scanner;

public class Exemplos {
    public static void main(String[] args) {
        String senha = "Abc123";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a senha do sistema:");
        String senhaDigitada = scanner.nextLine();

        if (senha == senhaDigitada) {
            System.out.println("VocÊ está logado!");
        }else {
            System.out.println("Senha incorreta");
        }

    }



}
