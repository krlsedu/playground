package com.exemplo.aula07.exercicios;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Exercicio02_Aula {
    public static void main(String[] args) {
        leArquivo();
    }

    private static void leArquivo() {
        try {
            Scanner scanner = new Scanner(Path.of("src/resources/DadosPessoais.txt"));
            while (scanner.hasNextLine()) {
                try {
                    String linha = scanner.nextLine();
                    String nome = linha.substring(0, 13).trim();
                    String sobreNome = linha.substring(13, 33).trim();
                    String idadeSt = linha.substring(33, 35);
                    Integer idade = Integer.parseInt(idadeSt);
                    String sexo = linha.substring(35, 36);
                    switch (sexo) {
                        case "M":
                        case "F":
                        case "N":
                        case "O":
                            break;
                        default:
                            throw new SexoInvalidoException(sexo);
                    }
                    String uf = linha.substring(36, 38);
                    System.out.printf("Nome completo: %s %s, idade %d, sexo: %s, UF: %s\n",
                            nome, sobreNome, idade, sexo, uf);
                } catch (NumberFormatException e) {
                    System.out.println("Não foi possível converter a idade!");
                } catch (SexoInvalidoException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Não foi possível ler o arquivo DadosPessoais.txt");
            e.printStackTrace();
        }
    }
}
