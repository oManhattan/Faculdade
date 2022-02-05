package com.bancodados.model.dao;

import com.bancodados.connection.ConnectionFactory;
import com.bancodados.model.bean.ModelOS;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DaoOS {

    public String create(ModelOS cs) {
        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL
        ResultSet rs = null;

        String resultado = "";

        try {
            stmt = con.prepareStatement("INSERT INTO ordem_servico(dia, problema, valor_total, metodo_pagamento, fk_cliente_cod_cs, fk_funcionario_cod_fun) VALUES (curdate(), ?, ?, ?, ?, ?)");

            stmt.setString(1, cs.getProblema());
            stmt.setString(2, Double.toString(cs.getValor_total()));
            stmt.setString(3, cs.getMetodo_pagamento());
            stmt.setString(4, Integer.toString(cs.getFk_cliente_cod_cs()));
            stmt.setString(5, Integer.toString(cs.getFk_funcionario_cod_fun()));

            stmt.executeUpdate(); // Executando atualização do comando

            stmt = con.prepareStatement("SELECT MAX(cod_os) as valor FROM ordem_servico;");
            rs = stmt.executeQuery();

            while (rs.next()) {
                resultado = Integer.toString(rs.getInt("valor"));
            }

            JOptionPane.showMessageDialog(null, "OS adicionado com sucesso!"); // Mensagem para caso o comando dê certo

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar adicionar a OS\n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
        }

        return resultado;
    }
   
public void delete(int id) {

      Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
      PreparedStatement stmt = null; // Variável utilizada para comando MySQL

      try {
          stmt = con.prepareStatement("DELETE FROM ordem_servico WHERE cod_os = ?"); // Comando MySQL para deletar valores na tabela "tabelaTeste"

          stmt.setString(1, String.valueOf(id)); // Pegando o valor de ID do objeto TesteTabelaBean e adicionando no "?"

          stmt.executeUpdate(); // Executando atualização do comando

          JOptionPane.showMessageDialog(null, "OS deletada com sucesso!"); // Mensagem para caso o comando dê certo

      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Falha ao tentar deletar OS\n" + ex); // Mensagem para cada o comando não dê certo
      } finally {
          ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
      }
  }

public ArrayList<String[]> search(String input) {

        Connection con = ConnectionFactory.getConnection(); // Iniciando a conexão com o Banco de Dados
        PreparedStatement stmt = null; // Variável para executar comando MySQL
        ResultSet rs = null;

        ArrayList<String[]> listaProduto = new ArrayList(); // Lista do tipo objeto para alocar os valores da tabelaTeste

        try {
            //Utilizando um JOIN para unir as tabelas cliente e ordem_servico para poder mostrar na tela as informações
            stmt = con.prepareStatement("SELECT os.cod_os, cl.nome, cl.email, os.dia FROM ordem_servico AS os JOIN cliente AS cl on cl.cod_cs = fk_cliente_cod_cs where cod_os = ? OR nome LIKE ? OR email LIKE ? ORDER BY nome");

            try {
                stmt.setInt(1, Integer.parseInt(input));
            } catch (Exception e) {
                stmt.setInt(1, -1);
            }
            stmt.setString(2, "%" + input + "%");
            stmt.setString(3, "%" + input + "%");
            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel

            while (rs.next()) {
                String resultado = "";

                resultado += Integer.toString(rs.getInt("cod_os")) + ",";
                resultado += rs.getString("nome") + ",";
                resultado += rs.getString("email") + ",";
                resultado += rs.getString("dia");

                listaProduto.add(resultado.split(","));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha em buscar OS\n" + ex);
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
            stmt = con.prepareStatement("SELECT os.cod_os, cl.nome, cl.email, os.dia FROM ordem_servico AS os JOIN cliente AS cl ON cl.cod_cs = fk_cliente_cod_cs "); // Comando MySQL
            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel

            while (rs.next()) {
                String resultado = "";

                resultado += Integer.toString(rs.getInt("cod_os")) + ",";
                resultado += rs.getString("nome") + ",";
                resultado += rs.getString("email") + ",";
                resultado += rs.getString("dia");

                produto.add(resultado.split(","));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha em buscar OS\n" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // fechando conexão com o banco de dados inependente do que acontecer
        }

        return produto; // retorna valor da lista.
    }
  
public static String totalOS() {

        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL
        String total = "";

        try {
            stmt = con.prepareStatement("SELECT if(MAX(cod_os) IS null, 0, MAX(cod_os)) as total FROM ordem_servico"); // Executa a busca do código da última OS cadastrada
            ResultSet resultado = stmt.executeQuery(); // Executando atualização do comando

            if (resultado.next()) {
                total = Integer.toString(resultado.getInt("total") + 1 );
            }
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null, "Falha ao tentar buscar as OS cadastradas\n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
        }

        return total;
    }
  
public void update(ModelOS cs) {

        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL

        try {
            stmt = con.prepareStatement("UPDATE ordem_servico SET problema = ?, valor_total = ?, metodo_pagamento= ?, fk_cliente_cod_cs = ? , fk_funcionario_cod_fun = ? WHERE cod_os = ?"); // Comando MySQL para atualizar valores na tabela "tabelaTeste"

            stmt.setString(1, cs.getProblema());
            stmt.setString(2, Double.toString(cs.getValor_total()));
            stmt.setString(3, cs.getMetodo_pagamento());
            stmt.setString(4, Integer.toString(cs.getFk_cliente_cod_cs()));
            stmt.setString(5, Integer.toString(cs.getFk_funcionario_cod_fun()));
            stmt.setString(6, Integer.toString(cs.getCod_os()));

            stmt.executeUpdate(); // Executando atualização do comando

            JOptionPane.showMessageDialog(null, "OS atualizada com sucesso!"); // Mensagem para caso o comando dê certo

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar atualizar a OS\n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
        }
    }
   
   //Função para buscar as informações relacionadas as dados do código da OS 
public static ArrayList<String[]> infoOS(String cod_os) {

        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL
        ArrayList<String[]> produto = new ArrayList();
        DecimalFormat format = new DecimalFormat("0.00");
       

        try {
            stmt = con.prepareStatement("SELECT A.problema, A.valor_total, A.metodo_pagamento, B.cod_cs, B.nome AS nome_cli, C.cod_fun, C.nome AS nome_func FROM ordem_servico AS A "
                    + "JOIN cliente B ON A.fk_cliente_cod_cs = B.cod_cs JOIN funcionario AS C"
                    + " ON A.fk_funcionario_cod_fun = C.cod_fun WHERE A.cod_os = ? ;"); // Executa a busca das informações da OS informada

            stmt.setString(1, cod_os);
            ResultSet rs = stmt.executeQuery(); // Executando atualização do comando

            while (rs.next()) {
                String resultado = "";

                resultado += rs.getString("problema") + ",";
                resultado += Double.toString(rs.getDouble("valor_total")) + ",";
                resultado += rs.getString("metodo_pagamento") + ",";
                resultado += Integer.toString(rs.getInt("cod_cs")) + " - " + rs.getString("nome_cli") + ",";
                resultado += Integer.toString(rs.getInt("cod_fun")) + " - " + rs.getString("nome_func");
                produto.add(resultado.split(","));
            }

            stmt = con.prepareStatement("SELECT A.fk_servico_cod_serv AS cod_serv, B.nome, B.valor, A.quantidade_serv FROM integra AS A JOIN servico AS B ON A.fk_servico_cod_serv = B.cod_serv WHERE A.fk_ordem_servico_cod_os = ?;");
            stmt.setString(1, cod_os);
            rs = stmt.executeQuery();

            while (rs.next()) {

                String resultado = "";

                resultado += Integer.toString(rs.getInt("cod_serv")) + ",";
                resultado += rs.getString("nome") + ",";
                resultado += "R$ " + format.format(rs.getDouble("valor")).replace(",", ".") + ",";
                resultado += Integer.toString(rs.getInt("quantidade_serv"));

                produto.add(resultado.split(","));
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar buscar as informações da OS\n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
            return produto;
        }
    }

}
