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
public class ModelIntegra {
    private int quantidade_serv;
    private int fk_servico_cod_serv;
    private int fk_ordem_servico_cod_os;

    public int getQuantidade_serv() {
        return quantidade_serv;
    }

    public void setQuantidade_serv(int quantidade_serv) {
        this.quantidade_serv = quantidade_serv;
    }

    public int getFk_servico_cod_serv() {
        return fk_servico_cod_serv;
    }

    public void setFk_servico_cod_serv(int fk_servico_cod_serv) {
        this.fk_servico_cod_serv = fk_servico_cod_serv;
    }

    public int getFk_ordem_servico_cod_os() {
        return fk_ordem_servico_cod_os;
    }

    public void setFk_ordem_servico_cod_os(int fk_ordem_servico_cod_os) {
        this.fk_ordem_servico_cod_os = fk_ordem_servico_cod_os;
    }
}
