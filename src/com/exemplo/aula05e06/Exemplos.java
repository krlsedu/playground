package com.exemplo.aula05e06;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

import static com.exemplo.aula05e06.ColunaCsv.*;

public class Exemplos {
    public static void main(String[] args) {
        list();
        set();
        map();
    }

    private static void list(){
        List<Integer> list = new ArrayList<>();
        var listaString = new ArrayList<String>();

        list.add(3);
        list.add(1);
        list.set(0,4);

        System.out.println(list);

        List<String> listString = new ArrayList<>();
        listString.add("Item 1");
        listString.add("Item 2");
        listString.add("Item 3");
        listString.add("Item 4");

        listString.remove(0);

        String st = listString.get(2);

        System.out.println(listString);
    }

    private static void set(){
        Set<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(1);
        System.out.println(set);

    }

    private static void queue(){

    }

    private static void map(){
        Map<String,Integer> map = new HashMap<>();
        map.put("Jose",35);
        System.out.println(map);
    }

    private static void exemploEnum() throws IOException {
        Scanner scanner = new Scanner(Path.of("src/main/resources/pessoas.csv"));
        boolean cabecalho = true;
        while (scanner.hasNext()) {
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
                if (campos.length >= 4) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Nome do funcionário:").append("\n")
                            .append("\t").append(campos[NOME.getIndex()].trim()).append(" ")
                            .append(campos[SOBRENOME.getIndex()].trim()).append("\n");

                    Double salario = Double.parseDouble(campos[SALARIO.getIndex()]);
                    Double beneficios = Double.parseDouble(campos[BENEFICIOS.getIndex()]);

                    String salarioFormatado = String.format("%,.2f", salario + beneficios);

                    stringBuilder.append("Salário:").append("\n")
                            .append("\t").append("R$ ").append(salarioFormatado)
                            .append("\n");

                    System.out.println(stringBuilder);
                }
            }
        }
    }
}
