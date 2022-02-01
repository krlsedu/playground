package com.exemplo.aula07.exercicios;

public enum Sexo {
    MASCULINO("M", "Masculino"),
    FEMININO("F", "Feminino"),
    NAO_INFORMADO("N", "Não informado"),
    OUTRO("O", "Outro");

    private String sigla;
    private String descricao;

    Sexo(String sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Sexo fromString(String text) throws SexoInvalidoException {
        for (Sexo sexo : Sexo.values()) {
            if (sexo.sigla.equalsIgnoreCase(text)) {
                return sexo;
            }
        }
        throw new SexoInvalidoException(text);
    }
}
