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
public class ModelParticipa {
    private int quantidade_total;
    private int fk_venda_cod_vend;
    private int fk_produto_cod_prod;

    public int getQuantidade_total() {
        return quantidade_total;
    }

    public void setQuantidade_total(int quantidade_total) {
        this.quantidade_total = quantidade_total;
    }

    public int getFk_venda_cod_vend() {
        return fk_venda_cod_vend;
    }

    public void setFk_venda_cod_vend(int fk_venda_cod_vend) {
        this.fk_venda_cod_vend = fk_venda_cod_vend;
    }

    public int getFk_produto_cod_prod() {
        return fk_produto_cod_prod;
    }

    public void setFk_produto_cod_prod(int fk_produto_cod_prod) {
        this.fk_produto_cod_prod = fk_produto_cod_prod;
    }
    
    
}
