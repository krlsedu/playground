package com.exemplo.aula07.exercicios;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(Path.of("src/resources/pessoas.csv"));
            boolean cabecalho = true;
            Map<String, Double> mapSalarios = new HashMap<>();
            while (scanner.hasNextLine()) {
                try {
                    String linha = scanner.nextLine();

                    String[] campos = linha.split(",");

                    if (cabecalho) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("As informações contidas no arquivo são:").append("\n");
                        for (int i = 0; i < campos.length; i++) {
                            stringBuilder.append("Índice ").append(i).append(": ").append(campos[i]).append("; ");
                        }
                        System.out.println(stringBuilder);
                        cabecalho = false;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(campos[0].trim()).append(" ")
                                .append(campos[1].trim());

                        Double salario = 0D;
                        Double beneficios = 0D;

                        try {
                            salario = Double.parseDouble(campos[2]);
                            beneficios = Double.parseDouble(campos[3]);
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }

                        mapSalarios.put(stringBuilder.toString(), salario + beneficios);

                    }
                } catch (IndexOutOfBoundsException e){
                    System.out.println("A linha do arquivo não está devidamente formatada!");
                }
            }
            Scanner scanner1 = new Scanner(System.in);
            String nome;
            do {
                System.out.println("Informe o nome do funcionário a consultar:");
                nome = scanner1.nextLine();
                Double salarioComBeneficios = mapSalarios.get(nome);
                if (salarioComBeneficios == null) {
                    for (String key :
                            mapSalarios.keySet()) {
                        if (key.contains(nome)) {
                            salarioComBeneficios = mapSalarios.get(key);
                            nome = key;
                        }
                    }
                }
                if (salarioComBeneficios == null) {
                    System.out.printf("Não foi encontrado salário para o funcionário %s \n", nome);
                } else {
                    System.out.printf("O salário do funcionário %s é R$ %,.2f\n", nome, salarioComBeneficios);
                }
            } while (!(nome.equals(":q") || nome.equals("!sair")));
        } catch (IOException e) {
            System.out.println("Não foi possível ler o arquivo!");
        }
    }
}
