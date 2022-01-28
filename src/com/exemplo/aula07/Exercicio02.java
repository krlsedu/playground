package com.exemplo.aula07;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(Path.of("src/main/resources/DadosPessoais.txt"));
            while (scanner.hasNextLine()) {
                try {
                    String linha = scanner.nextLine();
                    String nome = linha.substring(0, 13).trim();
                    String sobreNome = linha.substring(13, 32).trim();
                    Integer idade = Integer.parseInt(linha.substring(33, 35).trim());
                    String sexo = linha.substring(35, 36).trim();
                    Sexo sexoEnum = Sexo.fromString(sexo);
                    String uf = linha.substring(36, 38);

                    System.out.printf("Nome completo: %s %s, Idade: %d, Sexo: %s, UF informada %s\n", nome, sobreNome,idade, sexoEnum.getDescricao(), uf);


                } catch (NumberFormatException | IndexOutOfBoundsException e) {
                    System.out.println("Não foi possível identificar a informação");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Não foi possível ler o arquivo");
        }
    }
}
