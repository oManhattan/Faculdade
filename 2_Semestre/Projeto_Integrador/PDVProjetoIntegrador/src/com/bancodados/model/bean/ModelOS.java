/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodados.model.bean;

/**
 *
 * @author Matheus
 */
public class ModelOS {
    private int cod_os;
    private String date;
    private String problema;
    private double valor_total;
    private String metodo_pagamento;
    private int fk_cliente_cod_cs;
    private int fk_funcionario_cod_fun;

    public int getCod_os() {
        return cod_os;
    }

    public void setCod_os(int cod_os) {
        this.cod_os = cod_os;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public String getMetodo_pagamento() {
        return metodo_pagamento;
    }

    public void setMetodo_pagamento(String metodo_pagamento) {
        this.metodo_pagamento = metodo_pagamento;
    }

    public int getFk_cliente_cod_cs() {
        return fk_cliente_cod_cs;
    }

    public void setFk_cliente_cod_cs(int fk_cliente_cod_cs) {
        this.fk_cliente_cod_cs = fk_cliente_cod_cs;
    }

    public int getFk_funcionario_cod_fun() {
        return fk_funcionario_cod_fun;
    }

    public void setFk_funcionario_cod_fun(int fk_funcionario_cod_fun) {
        this.fk_funcionario_cod_fun = fk_funcionario_cod_fun;
    }
    
}
