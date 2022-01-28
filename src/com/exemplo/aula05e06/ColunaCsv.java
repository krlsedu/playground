package com.exemplo.aula05e06;

public enum ColunaCsv {
    NOME(0),
    SOBRENOME(1),
    SALARIO(2),
    BENEFICIOS(3);

    private int index;

    ColunaCsv(int index){
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
