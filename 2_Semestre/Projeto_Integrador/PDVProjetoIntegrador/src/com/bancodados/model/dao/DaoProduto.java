/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodados.model.dao;

import com.bancodados.connection.ConnectionFactory;
import com.bancodados.model.bean.ModelProduto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.text.DecimalFormat;

/**
 *
 * @author Matheus
 */
public class DaoProduto {

    public void create(ModelProduto cs) {
        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL

        try {
            stmt = con.prepareStatement("INSERT INTO produto (nome, categoria, valor_unit, quantidade) VALUES (?, ?, ?, ?);");

            stmt.setString(1, cs.getNome());
            stmt.setString(2, cs.getCategoria());
            stmt.setString(3, Double.toString(cs.getValor_unit()));
            stmt.setString(4, Integer.toString(cs.getQuantidade()));

            stmt.executeUpdate(); // Executando atualização do comando

            JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!"); // Mensagem para caso o comando dê certo

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar adicionar o produto\n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
        }
    }

    //Função para buscar os valores disponíveis das categorias
    public ArrayList categoria() {
        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL

        ArrayList vetor = new ArrayList(); // Variável para criação do vetor dos valores disponíveis das categorias

        try {
            stmt = con.prepareStatement("SELECT DISTINCT categoria FROM produto ORDER BY categoria"); // Executa a busca na tabela produto
            ResultSet resultado = stmt.executeQuery(); // Executando atualização do comando

            while (resultado.next()) {
                vetor.add(resultado.getString("categoria")); // Adição dos elementos no vetor
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar buscar as categorias cadastradas\n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
            return vetor;
        }

    }

    //Função para buscar o valor da última OS cadastrada
    public static String totalOS() {

        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL
        String total = "";

        try {
            stmt = con.prepareStatement(" SELECT if(MAX(cod_prod) IS null, 0, MAX(cod_prod)) as total FROM produto"); // Executa a busca do código da última OS cadastrada
            ResultSet resultado = stmt.executeQuery(); // Executando atualização do comando

            if (resultado.next()) {

                total = Integer.toString(resultado.getInt("total") + 1); // Retorno do código da última OS cadastrada + 1
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar buscar os produtos cadastrados\n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
            return total;
        }
    }
    
    //Função para buscar a quantidade de produtos em estoque
    public static int totalProd(int cod_produto) {

        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL
        int total = 0;

        try {
            stmt = con.prepareStatement(" SELECT quantidade FROM produto WHERE cod_prod = ?");
            stmt.setString(1, String.valueOf(cod_produto));
            ResultSet resultado = stmt.executeQuery(); // Executando atualização do comando

            if (resultado.next()) {

                total = resultado.getInt("quantidade"); // Retorno do código da última OS cadastrada + 1
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar buscar os produtos cadastrados\n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
            return total;
        }
    }

    public ArrayList<String[]> search(String input) {

        Connection con = ConnectionFactory.getConnection(); // Iniciando a conexão com o Banco de Dados
        PreparedStatement stmt = null; // Variável para executar comando MySQL
        ResultSet rs = null;

        ArrayList<String[]> listaProduto = new ArrayList(); // Lista do tipo objeto para alocar os valores da tabelaTeste

        DecimalFormat format = new DecimalFormat("R$ 0.00");

        try {
            stmt = con.prepareStatement("SELECT cod_prod, categoria, nome, valor_unit, quantidade FROM produto where cod_prod = ? OR nome LIKE ? OR categoria LIKE ?");

            try {
                stmt.setInt(1, Integer.parseInt(input));
            } catch (Exception e) {
                stmt.setInt(1, -1);
            }
            stmt.setString(2, "%" +  input +  "%");
            stmt.setString(3,  "%" + input +  "%");
            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel

            while (rs.next()) {
                String resultado = "";

                resultado += Integer.toString(rs.getInt("cod_prod")) + ",";
                resultado += rs.getString("categoria") + ",";
                resultado += rs.getString("nome") + ",";
                resultado += format.format(rs.getDouble("valor_unit")).replace(",", ".") + ",";
                resultado += Integer.toString(rs.getInt("quantidade"));

                listaProduto.add(resultado.split(","));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha em buscar dados\n" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // fechando conexão com o banco de dados inependente do que acontecer
        }

        return listaProduto; // retorna valor da lista.
    }

    public void update(ModelProduto cs) {

        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL

        try {
            stmt = con.prepareStatement("UPDATE produto SET nome = ?, categoria = ?, valor_unit= ?, quantidade = ? WHERE cod_prod = ?"); // Comando MySQL para atualizar valores na tabela "tabelaTeste"

            stmt.setString(1, cs.getNome());
            stmt.setString(2, cs.getCategoria());
            stmt.setString(3, Double.toString(cs.getValor_unit()));
            stmt.setString(4, Integer.toString(cs.getQuantidade()));
            stmt.setString(5, Integer.toString(cs.getCod_prod()));

            stmt.executeUpdate(); // Executando atualização do comando

            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!"); // Mensagem para caso o comando dê certo

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar atualizar o produto\n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
        }
    }

    public ArrayList<String[]> read() {

        Connection con = ConnectionFactory.getConnection(); // Iniciando a conexão com o Banco de Dados
        PreparedStatement stmt = null; // Variável para executar comando MySQL
        ResultSet rs = null;

        ArrayList<String[]> produto = new ArrayList(); // Lista do tipo objeto para alocar os valores da tabelaTeste

        try {
            stmt = con.prepareStatement("SELECT cod_prod, nome, categoria, valor_unit, quantidade FROM produto"); // Comando MySQL
            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel

            DecimalFormat format = new DecimalFormat("R$ 0.00");

            while (rs.next()) {
                String resultado = "";

                resultado += Integer.toString(rs.getInt("cod_prod")) + ",";
                resultado += rs.getString("categoria") + ",";
                resultado += rs.getString("nome") + ",";
                resultado += format.format(rs.getDouble("valor_unit")).replace(",", ".") + ",";
                resultado += rs.getString("quantidade");
                
                produto.add(resultado.split(","));
            }
            
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha em buscar dados\n" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // fechando conexão com o banco de dados inependente do que acontecer
        }

        return produto; // retorna valor da lista.
    }
    
    public void delete(int id) {

        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL

        try {
            stmt = con.prepareStatement("DELETE FROM produto WHERE cod_prod = ?"); // Comando MySQL para deletar valores na tabela "tabelaTeste"

            stmt.setInt(1, id); // Pegando o valor de ID do objeto TesteTabelaBean e adicionando no "?"

            stmt.executeUpdate(); // Executando atualização do comando

            JOptionPane.showMessageDialog(null, "Produto deletado com sucesso!"); // Mensagem para caso o comando dê certo

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar deletar\n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
        }
    }

}
