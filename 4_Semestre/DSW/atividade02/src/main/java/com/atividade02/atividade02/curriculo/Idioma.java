package com.atividade02.atividade02.curriculo;

public class Idioma {
    private String idioma;
    private String leitura;
    private String escrita;
    private String conversacao;
    
    public Idioma(String idioma, String leitura, String escrita, String conversacao) {
        this.idioma = idioma;
        this.leitura = leitura;
        this.escrita = escrita;
        this.conversacao = conversacao;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getLeitura() {
        return leitura;
    }

    public void setLeitura(String leitura) {
        this.leitura = leitura;
    }

    public String getEscrita() {
        return escrita;
    }

    public void setEscrita(String escrita) {
        this.escrita = escrita;
    }

    public String getConversacao() {
        return conversacao;
    }

    public void setConversacao(String conversacao) {
        this.conversacao = conversacao;
    }
}
