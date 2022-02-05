/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.database.teste002.model.dao;

import com.bancodados.connection.ConnectionFactory;
import com.teste.database.teste002.model.bean.TesteTabelaBean;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class TesteTabelaDAO {

    // Comando para adicionar valores no Banco de Dados na tabela tabelaTeste
    public void create(TesteTabelaBean t) {

        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL

        try {
            stmt = con.prepareStatement("INSERT INTO tabelaTeste (nome, idade, sexo, cidade) VALUES (?, ?, ?, ?)"); // Comando MySQL para inserir valores na tabela "tabelaTeste"

            stmt.setString(1, t.getNome()); // Pegando o valor Nome do objeto TesteTabelaBean e adicionando no primeiro "?"
            stmt.setInt(2, t.getIdade()); // Pegando o valor Idade do objeto TesteTabelaBean e adicionando no segundo "?"
            stmt.setString(3, t.getSexo()); // Pegando o valor Sexo do objeto TesteTabelaBean e adicionando no terceiro "?"
            stmt.setString(4, t.getCidade()); // Pegando o valor Cidade do objeto TesteTabelaBean e adicionando no terceiro "?"

            stmt.executeUpdate(); // Executando atualização do comando

            JOptionPane.showMessageDialog(null, "INFO adicionada com sucesso!"); // Mensagem para caso o comando dê certo

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar adicionar/n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
        }
    }

    // Comando para adicionar valores no Banco de Dados na tabela tabelaTeste
    public void update(TesteTabelaBean t) {

        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL

        try {
            stmt = con.prepareStatement("UPDATE tabelaTeste SET nome = ?, idade = ?, sexo = ?, cidade = ? WHERE id = ?"); // Comando MySQL para atualizar valores na tabela "tabelaTeste"

            stmt.setString(1, t.getNome()); // Pegando o valor Nome do objeto TesteTabelaBean e adicionando no primeiro "?"
            stmt.setInt(2, t.getIdade()); // Pegando o valor Idade do objeto TesteTabelaBean e adicionando no segundo "?"
            stmt.setString(3, t.getSexo()); // Pegando o valor Sexo do objeto TesteTabelaBean e adicionando no terceiro "?"
            stmt.setString(4, t.getCidade()); // Pegando o valor Cidade do objeto TesteTabelaBean e adicionando no quarto "?"
            stmt.setInt(5, t.getId()); // Pegando o valor de ID do objeto TesteTabelaBean e adicionando no quinto "?"

            stmt.executeUpdate(); // Executando atualização do comando

            JOptionPane.showMessageDialog(null, "INFO atualizada com sucesso!"); // Mensagem para caso o comando dê certo

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar atualizar/n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
        }
    }

    public void delete(TesteTabelaBean t) {

        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL

        try {
            stmt = con.prepareStatement("DELETE FROM tabelaTeste WHERE id = ?"); // Comando MySQL para deletar valores na tabela "tabelaTeste"

            stmt.setInt(1, t.getId()); // Pegando o valor de ID do objeto TesteTabelaBean e adicionando no "?"

            stmt.executeUpdate(); // Executando atualização do comando

            JOptionPane.showMessageDialog(null, "INFO deletada com sucesso!"); // Mensagem para caso o comando dê certo

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar deletar/n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
        }
    }

    // Comando para ler os valores da tabelaTeste em uma JTable
    public ArrayList<TesteTabelaBean> read() {

        Connection con = ConnectionFactory.getConnection(); // Iniciando a conexão com o Banco de Dados
        PreparedStatement stmt = null; // Variável para executar comando MySQL
        ResultSet rs = null;

        ArrayList<TesteTabelaBean> listaProd = new ArrayList(); // Lista do tipo objeto para alocar os valores da tabelaTeste

        try {
            stmt = con.prepareStatement("SELECT id, nome, idade, sexo, cidade FROM tabelaTeste"); // Comando MySQL
            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel

            while (rs.next()) {
                TesteTabelaBean prod = new TesteTabelaBean(); // Objeto semente iniciado para conseguir ler os dados da variável rs

                prod.setId(rs.getInt("id"));
                prod.setNome(rs.getString("nome"));
                prod.setIdade(rs.getInt("idade"));
                prod.setSexo(rs.getString("sexo"));
                prod.setCidade(rs.getString("cidade"));

                listaProd.add(prod); // Enviando todos os valores para a lista
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha em buscar dados");
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // fechando conexão com o banco de dados inependente do que acontecer
        }

        return listaProd; // retorna valor da lista.
    }

    public ArrayList<String[]> ler() {
        Connection con = ConnectionFactory.getConnection(); // Iniciando a conexão com o Banco de Dados
        PreparedStatement stmt = null; // Variável para executar comando MySQL
        ResultSet rs = null;

        ArrayList<String[]> lista = new ArrayList();

        try {
            stmt = con.prepareStatement("SELECT id, nome, idade, sexo, cidade FROM tabelaTeste"); // Comando MySQL
            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel

            while (rs.next()) {
                String resultado = "";

                resultado += Integer.toString(rs.getInt("id")) + ",";
                resultado += rs.getString("nome") + ",";
                resultado += Integer.toString(rs.getInt("idade")) + ",";
                resultado += rs.getString("sexo") + ",";
                resultado += rs.getString("cidade") + ",";

                lista.add(resultado.split(",")); // Enviando todos os valores para a lista
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha em buscar dados");
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // fechando conexão com o banco de dados inependente do que acontecer
        }

        return lista;
    }

    public ArrayList<TesteTabelaBean> search(TesteTabelaBean t) {

        Connection con = ConnectionFactory.getConnection(); // Iniciando a conexão com o Banco de Dados
        PreparedStatement stmt = null; // Variável para executar comando MySQL
        ResultSet rs = null;

        ArrayList<TesteTabelaBean> listaProd = new ArrayList(); // Lista do tipo objeto para alocar os valores da tabelaTeste

        try {
            stmt = con.prepareStatement("SELECT id, nome, idade, sexo, cidade FROM tabelaTeste where id = ? OR nome = ?");
            stmt.setInt(1, t.getId());
            stmt.setString(2, t.getNome());
            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel

            while (rs.next()) {
                TesteTabelaBean prod = new TesteTabelaBean(); // Objeto semente iniciado para conseguir ler os dados da variável rs

                prod.setId(rs.getInt("id"));
                prod.setNome(rs.getString("nome"));
                prod.setIdade(rs.getInt("idade"));
                prod.setSexo(rs.getString("sexo"));
                prod.setCidade(rs.getString("cidade"));

                listaProd.add(prod); // Enviando todos os valores para a lista
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha em buscar dados " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // fechando conexão com o banco de dados inependente do que acontecer
        }

        return listaProd; // retorna valor da lista.
    }

}
