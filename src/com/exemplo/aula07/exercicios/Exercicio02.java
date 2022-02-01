package com.exemplo.aula07.exercicios;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        leArquivo();
    }

    private static void leArquivo() {
        try {
            Scanner scanner = new Scanner(Path.of("src/resources/DadosPessoais.txt"));
            while (scanner.hasNextLine()) {
                try {
                    String linha = scanner.nextLine();
                    String nome = getString(linha, 0, 13, "Nome");
                    String sobreNome = getString(linha, 13, 32, "Sobrenome");
                    Integer idade = getInteiro(linha, 33, 35, "Idade");
                    String sexo = getString(linha, 35, 36);
                    Sexo sexoEnum = Sexo.fromString(sexo);
                    String uf = getString(linha, 36, 38, "UF");

                    System.out.printf("Nome completo: %s %s, Idade: %d, Sexo: %s, UF informada %s\n", nome, sobreNome, idade, sexoEnum.getDescricao(), uf);

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Não foi possível ler o arquivo");
        }
    }

    private static String getString(String st, int ini, int fim, String nomeCampo) throws ObterCampoException {
        try {
            return st.substring(ini, fim).trim();
        } catch (Exception e) {
            throw new ObterCampoException(nomeCampo, ini, fim, e);
        }
    }

    private static String getString(String st, int ini, int fim) throws ObterCampoException {
        return getString(st, ini, fim, "Texto");
    }


    private static Integer getInteiro(String st, int ini, int fim, String nomeCampo) throws ObterCampoException {
        try {
            st = getString(st, ini, fim, nomeCampo);
            return Integer.parseInt(st);
        } catch (Exception e) {
            throw new ObterCampoException(nomeCampo, ini, fim, e);
        }
    }


    private static Integer getInteiro(String st, int ini, int fim) throws ObterCampoException {
        return getInteiro(st, ini, fim, "Inteiro");
    }
}
