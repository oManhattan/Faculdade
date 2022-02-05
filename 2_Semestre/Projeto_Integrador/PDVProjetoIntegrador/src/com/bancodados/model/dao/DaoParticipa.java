/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodados.model.dao;

import com.bancodados.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class DaoParticipa {
    public void create(ArrayList<String[]> p) {
        
        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL

        try {
            // INSERIR A VENDA E GERAR UM COD_VEND
            stmt = con.prepareStatement("INSERT INTO participa (fk_produto_cod_prod, fk_venda_cod_vend, quantidade_total) VALUES (?, ?, ?);");
            
            for (String[] a : p) {
                stmt.setInt(1, Integer.parseInt(a[0]));
                stmt.setInt(2, Integer.parseInt(a[1]));
                stmt.setInt(3, Integer.parseInt(a[2]));
                
                stmt.executeUpdate(); // Executando atualização do comando
            }
            
            // INSERIR OS PRODUTOS DA LISTA E SUAS RESPECTIVAS QUANTIDADES
            
            //JOptionPane.showMessageDialog(null, "INFO adicionada com sucesso!"); // Mensagem para caso o comando dê certo

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar adicionar PARTICIPA/n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
        }
    }
}
