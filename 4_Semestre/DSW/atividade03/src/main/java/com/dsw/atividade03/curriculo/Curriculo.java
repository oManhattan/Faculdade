package com.dsw.atividade03.curriculo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Curriculo {
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
    private String linkedin;
    private String github;
    private List<String> conhecimentos = new ArrayList<>();
    private List<Experiencia> experienciasProfissionais = new ArrayList<>();
    private List<Formacao> formacaoAcademica = new ArrayList<>();
    private List<Idioma> idiomas = new ArrayList<>();
    
    public Curriculo(String nome, String email, String telefone, LocalDate dataNascimento, String linkedin,
            String github) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.linkedin = linkedin;
        this.github = github;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public List<String> getConhecimentos() {
        return conhecimentos;
    }

    public void setConhecimentos(List<String> conhecimentos) {
        this.conhecimentos = conhecimentos;
    }

    public List<Experiencia> getExperienciasProfissionais() {
        return experienciasProfissionais;
    }

    public void setExperienciasProfissionais(List<Experiencia> experienciasProfissionais) {
        this.experienciasProfissionais = experienciasProfissionais;
    }

    public List<Formacao> getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(List<Formacao> formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public List<Idioma> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<Idioma> idiomas) {
        this.idiomas = idiomas;
    }
}
