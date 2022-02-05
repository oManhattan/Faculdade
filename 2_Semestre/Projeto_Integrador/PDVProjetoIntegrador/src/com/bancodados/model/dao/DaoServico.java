/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodados.model.dao;

import com.bancodados.connection.ConnectionFactory;
import com.bancodados.model.bean.ModelServico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author PICHAU
 */
public class DaoServico {
    
     public void create(ModelServico cs) {
        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL

        try {
            stmt = con.prepareStatement("INSERT INTO servico (nome, valor) VALUES (?, ?);");

            stmt.setString(1, cs.getNome());
            stmt.setString(2, Double.toString(cs.getValor()));

            stmt.executeUpdate(); // Executando atualização do comando

            JOptionPane.showMessageDialog(null, "Serviço adicionado com sucesso!"); // Mensagem para caso o comando dê certo

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar adicionar o serviço\n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
        }
    }
     
     public void update(ModelServico cs) {

        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL

        try {
            stmt = con.prepareStatement("UPDATE servico SET nome = ?, valor = ? WHERE cod_serv = ?"); // Comando MySQL para atualizar valores na tabela "tabelaTeste"

            stmt.setString(1, cs.getNome());
            stmt.setString(2, Double.toString(cs.getValor()));
            stmt.setString(3, Integer.toString(cs.getCod_serv()));

            stmt.executeUpdate(); // Executando atualização do comando

            JOptionPane.showMessageDialog(null, "Serviço atualizado com sucesso!"); // Mensagem para caso o comando dê certo

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar atualizar o serviço\n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
        }
    }
     
    public void delete(int id) {

        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL

        try {
            stmt = con.prepareStatement("DELETE FROM servico WHERE cod_serv = ?"); // Comando MySQL para deletar valores na tabela "tabelaTeste"

            stmt.setInt(1, id); // Pegando o valor de ID do objeto TesteTabelaBean e adicionando no "?"

            stmt.executeUpdate(); // Executando atualização do comando

            JOptionPane.showMessageDialog(null, "Serviço deletado com sucesso!"); // Mensagem para caso o comando dê certo

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar deletar\n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
        }
    }
     
     public static String totalOS() {

        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL
        int total = 0;

        try {
            stmt = con.prepareStatement("SELECT IF (MAX(cod_serv) IS NULL, 0, MAX(cod_serv)) AS total FROM servico"); // Executa a busca do código do último serviço cadastrado
            ResultSet resultado = stmt.executeQuery(); // Executando atualização do comando

            if (resultado.next()) {

                total = resultado.getInt("total") + 1; // Retorno do código da última OS cadastrada + 1
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar buscar os serviços cadastrados\n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
           
            return String.valueOf(total);
        }
    }
     
     
    
    public ArrayList<String[]> search(String input) {

        Connection con = ConnectionFactory.getConnection(); // Iniciando a conexão com o Banco de Dados
        PreparedStatement stmt = null; // Variável para executar comando MySQL
        ResultSet rs = null;

        ArrayList<String[]> listaProduto = new ArrayList(); // Lista do tipo objeto para alocar os valores da tabelaTeste

        DecimalFormat format = new DecimalFormat("R$ 0.00");

        try {
            stmt = con.prepareStatement("SELECT cod_serv, nome, valor FROM servico where cod_serv = ? OR nome LIKE ?");

            try {
                stmt.setInt(1, Integer.parseInt(input));
            } catch (Exception e) {
                stmt.setInt(1, -1);
            }
            stmt.setString(2, "%" + input + "%");
            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel

            while (rs.next()) {
                String resultado = "";

                resultado += Integer.toString(rs.getInt("cod_serv")) + ",";
                resultado += rs.getString("nome") + ",";
                resultado += format.format(rs.getDouble("valor")).replace(",", ".");
                
                listaProduto.add(resultado.split(","));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha em buscar dados\n" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // fechando conexão com o banco de dados inependente do que acontecer
        }

        return listaProduto; // retorna valor da lista.
    }
    
     public ArrayList<String[]> read() {

        Connection con = ConnectionFactory.getConnection(); // Iniciando a conexão com o Banco de Dados
        PreparedStatement stmt = null; // Variável para executar comando MySQL
        ResultSet rs = null;

        ArrayList<String[]> produto = new ArrayList(); // Lista do tipo objeto para alocar os valores da tabelaTeste

        try {
            stmt = con.prepareStatement("SELECT cod_serv, nome, valor FROM servico"); // Comando MySQL
            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel

            DecimalFormat format = new DecimalFormat("R$ 0.00");

            while (rs.next()) {
                String resultado = "";

                resultado += Integer.toString(rs.getInt("cod_serv")) + ",";
                resultado += rs.getString("nome") + ",";
                resultado += format.format(rs.getDouble("valor")).replace(",", ".");
                
                produto.add(resultado.split(","));
            }
            
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha em buscar dados\n" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // fechando conexão com o banco de dados inependente do que acontecer
        }

        return produto; // retorna valor da lista.
    }
    
}
