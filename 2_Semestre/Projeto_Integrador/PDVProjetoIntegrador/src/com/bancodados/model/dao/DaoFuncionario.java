/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodados.model.dao;

import com.bancodados.connection.ConnectionFactory;
import com.bancodados.model.bean.ModelFuncionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */

public class DaoFuncionario {

    // FUNÇÃO PARA ADICIONAR "FUNCIONÁRIO" NA TABELA "FUNCIONARIO"
    public void create(ModelFuncionario f) {
        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL

        try {
            stmt = con.prepareStatement("INSERT INTO funcionario (nome, email, cargo) VALUES (?, ?, ?);");

            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getEmail());
            stmt.setString(3, f.getCargo());

            stmt.executeUpdate(); // Executando atualização do comando

            JOptionPane.showMessageDialog(null, "Funcionário(a) adicionado(a) com sucesso!"); // Mensagem para caso o comando dê certo

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar adicionar funcionário(a)/n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
        }
    }

    // FUNÇÃO PARA BUSCAR QUAIS SÃO OS CARGOS JÁ REGISTRADOS NA TABELA "FUNCIONARIO"
    public ArrayList<String> buscaCargo() {
        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL
        ResultSet rs = null;

        ArrayList<String> cargo = new ArrayList();

        try {
            stmt = con.prepareStatement("SELECT DISTINCT cargo FROM funcionario ORDER BY cargo;");
            rs = stmt.executeQuery(); // Executando atualização do comando

            while (rs.next()) {
                cargo.add(rs.getString("cargo"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar buscar cargos dos funcionários/n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // Fechando a conexão com o banco independendo do que aconteça
        }

        return cargo;
    }

    // FUNÇÃO PARA BUSCAR TODOS OS FUNCIONÁRIOS CADASTRADOS NA TABELA "FUNCIONARIO"
    public ArrayList<String[]> read() {

        Connection con = ConnectionFactory.getConnection(); // Iniciando a conexão com o Banco de Dados
        PreparedStatement stmt = null; // Variável para executar comando MySQL
        ResultSet rs = null;

        ArrayList<String[]> listaFuncionario = new ArrayList(); // Lista do tipo objeto para alocar os valores da tabelaTeste

        try {
            stmt = con.prepareStatement("SELECT cod_fun, nome, email, cargo FROM funcionario;"); // Comando MySQL
            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel

            while (rs.next()) {
                String resultado = "";

                resultado += Integer.toString(rs.getInt("cod_fun")) + ",";
                resultado += rs.getString("nome") + ",";
                resultado += rs.getString("email") + ",";
                resultado += rs.getString("cargo");

                listaFuncionario.add(resultado.split(","));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar buscar os funcionários\n" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // fechando conexão com o banco de dados inependente do que acontecer
        }

        return listaFuncionario;
    }

    // FUNÇÃO PARA ATUALIZAR UMA DETERMINADA LINHA NA TABELA "FUNCIONARIO"
    public void update(ModelFuncionario f) {

        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL

        try {
            stmt = con.prepareStatement("UPDATE funcionario SET nome = ?, email = ?, cargo = ? WHERE cod_fun = ?"); // Comando MySQL para atualizar valores na tabela "tabelaTeste"

            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getEmail());
            stmt.setString(3, f.getCargo());
            stmt.setInt(4, f.getCod_fun());

            stmt.executeUpdate(); // Executando atualização do comando

            JOptionPane.showMessageDialog(null, "Funcionário(a) atualizado(a) com sucesso!"); // Mensagem para caso o comando dê certo

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar atualizar o(a) funcionário(a)/n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
        }
    }
    
    // FUNÇÃO PARA APAGAR UMA DETERMINADA LINHA NA TABELA "FUNCIONARIO"
    public void delete(int id) {

        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL

        try {
            stmt = con.prepareStatement("DELETE FROM funcionario WHERE cod_fun = ?"); // Comando MySQL para deletar valores na tabela "tabelaTeste"

            stmt.setInt(1, id); // Pegando o valor de ID do objeto TesteTabelaBean e adicionando no "?"

            stmt.executeUpdate(); // Executando atualização do comando

            JOptionPane.showMessageDialog(null, "Funcionário(a) deletado(a) com sucesso!"); // Mensagem para caso o comando dê certo

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar deletar funcionário(a)/n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
        }
    }
    
    // FUNÇÃO PARA BUSCAR DETERMINADA(S) LINHA(S) NA TABELA "FUNCIONARIO"
    public ArrayList<String[]> search(String input) {

        Connection con = ConnectionFactory.getConnection(); // Iniciando a conexão com o Banco de Dados
        PreparedStatement stmt = null; // Variável para executar comando MySQL
        ResultSet rs = null;

        ArrayList<String[]> result = new ArrayList(); // Lista do tipo objeto para alocar os valores da tabelaTeste

        try {
            stmt = con.prepareStatement("SELECT cod_fun, nome, email, cargo FROM funcionario WHERE cod_fun = ? OR nome LIKE ? OR email LIKE ? OR cargo LIKE ?;");

//            for (int i = 1; i < 5; i++) {
//
//                if (i == 1) {
//                    try {
//                        stmt.setInt(i, Integer.parseInt(input));
//                    } catch (Exception e) {
//                        stmt.setInt(i, 0);
//                    }
//                } else {
//                    stmt.setString(i, input);
//                }
//            }
            
             try {
                stmt.setInt(1, Integer.parseInt(input));
            } catch (Exception e) {
                stmt.setInt(1, -1);
            }
            stmt.setString(2, "%" + input + "%");
            stmt.setString(3, "%" + input + "%");
            stmt.setString(4, "%" + input + "%");
         


            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel

            while (rs.next()) {
                String funcionario = "";
                
                funcionario += Integer.toString(rs.getInt("cod_fun")) + ",";
                funcionario+= rs.getString("nome") + ",";
                funcionario+= rs.getString("email") + ",";
                funcionario+= rs.getString("cargo");
                
                result.add(funcionario.split(","));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha em buscar dados " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // fechando conexão com o banco de dados inependente do que acontecer
        }

        return result; // retorna valor da lista.
    }
}
