package com.atividade02.atividade02.curriculo;

public class Formacao {
    private String curso;
    private String instituicao;

    public Formacao(String curso, String instituicao) {
        this.curso = curso;
        this.instituicao = instituicao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    
}
