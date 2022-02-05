package com.bancodados.model.dao;

import com.bancodados.connection.ConnectionFactory;
import com.bancodados.model.bean.ModelVenda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class DaoVenda {

    public void create(ModelVenda v) {
        
        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL

        try {
            // INSERIR A VENDA E GERAR UM COD_VEND
            stmt = con.prepareStatement("INSERT INTO venda (dia, valor_total, metodo_pagamento, fk_cliente_cod_cs, fk_funcionario_cod_fun) VALUES (curdate(), ?, ?, ?, ?);");
            
            stmt.setDouble(1, v.getValor_total());
            stmt.setString(2, v.getMetodo_pagamento());
            stmt.setInt(3, v.getFk_cliente_cod_cs());
            stmt.setInt(4, v.getFk_funcionario_cod_fun());
            
            stmt.executeUpdate(); // Executando atualização do comando
            
            // INSERIR OS PRODUTOS DA LISTA E SUAS RESPECTIVAS QUANTIDADES
            
            JOptionPane.showMessageDialog(null, "Venda concluída com sucesso!"); // Mensagem para caso o comando dê certo

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar processar a venda/n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
        }
    }
    
    public int getCodigoVenda() {
        Connection con = ConnectionFactory.getConnection(); // Iniciando a conexão com o Banco de Dados
        PreparedStatement stmt = null; // Variável para executar comando MySQL
        ResultSet rs = null;
         
        int resultado = 0;
        
        try {
            stmt = con.prepareStatement("SELECT MAX(cod_vend) FROM venda"); // Comando MySQL
            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel
            
             if (rs.next()) {
                resultado = Integer.valueOf(rs.getString("max(cod_vend)")); // Retorno do código da última venda cadastrada
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha em buscar dados\n" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // fechando conexão com o banco de dados inependente do que acontecer
        }
        
        return resultado;
    }
}
