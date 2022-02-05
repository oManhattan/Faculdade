package com.bancodados.model.dao;

import com.bancodados.connection.ConnectionFactory;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class DaoRelatorio {

    public ArrayList<String[]> read() {

        Connection con = ConnectionFactory.getConnection(); // Iniciando a conexão com o Banco de Dados
        PreparedStatement stmt = null; // Variável para executar comando MySQL
        ResultSet rs = null;

        DecimalFormat format = new DecimalFormat("0000");

        ArrayList<String[]> relatorio = new ArrayList(); // Lista do tipo objeto para alocar os valores da tabelaTeste

        try {
            stmt = con.prepareStatement("SELECT v.cod_vend, v.dia, c.nome AS nome_cliente, f.nome AS nome_funcionario, v.metodo_pagamento, v.valor_total FROM venda as v INNER JOIN cliente AS c ON v.fk_cliente_cod_cs = c.cod_cs INNER JOIN funcionario AS f ON v.fk_funcionario_cod_fun = f.cod_fun;"); // Comando MySQL
            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel

            while (rs.next()) {
                String resultado = "";
                String a = rs.getString("dia");

                resultado = "Venda,,";
                resultado += format.format(rs.getInt("cod_vend")) + ",,";
                resultado += a.substring(8) + "-" + a.substring(5, 7) + "-" + a.substring(0, 4) + ",,";
                resultado += rs.getString("nome_funcionario") + ",,";
                resultado += rs.getString("nome_cliente") + ",,";
                resultado += rs.getString("metodo_pagamento") + ",,";
                resultado += NumberFormat.getCurrencyInstance().format(rs.getDouble("valor_total"));

                relatorio.add(resultado.split(",,"));
            }

            stmt = con.prepareStatement("SELECT o.cod_os, o.dia, f.nome AS nome_funcionario, c.nome AS nome_cliente, o.metodo_pagamento, o.valor_total FROM ordem_servico AS o INNER JOIN cliente AS c ON o.fk_cliente_cod_cs = c.cod_cs INNER JOIN funcionario AS f ON o.fk_funcionario_cod_fun = f.cod_fun;"); // Comando MySQL
            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel

            while (rs.next()) {
                String resultado = "";
                String a = rs.getString("dia");

                resultado = "OS,,";
                resultado += format.format(rs.getInt("cod_os")) + ",,";
                resultado += a.substring(8) + "-" + a.substring(5, 7) + "-" + a.substring(0, 4) + ",,";
                resultado += rs.getString("nome_funcionario") + ",,";
                resultado += rs.getString("nome_cliente") + ",,";
                resultado += rs.getString("metodo_pagamento") + ",,";
                resultado += NumberFormat.getCurrencyInstance().format(rs.getDouble("valor_total"));

                relatorio.add(resultado.split(",,"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha em buscar dados\n" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // fechando conexão com o banco de dados inependente do que acontecer
        }

        return relatorio; // retorna valor da lista.
    }

    public ArrayList<String[]> search(LocalDate inicio, LocalDate fim) {

        Connection con = ConnectionFactory.getConnection(); // Iniciando a conexão com o Banco de Dados
        PreparedStatement stmt = null; // Variável para executar comando MySQL
        ResultSet rs = null;

        DecimalFormat format = new DecimalFormat("0000");

        ArrayList<String[]> relatorio = new ArrayList(); // Lista do tipo objeto para alocar os valores da tabelaTeste
        
        try {
            stmt = con.prepareStatement("SELECT v.cod_vend, v.dia, c.nome AS nome_cliente, f.nome AS nome_funcionario, v.metodo_pagamento, v.valor_total FROM venda as v INNER JOIN cliente AS c ON v.fk_cliente_cod_cs = c.cod_cs INNER JOIN funcionario AS f ON v.fk_funcionario_cod_fun = f.cod_fun where v.dia BETWEEN CAST(? AS DATE) AND CAST(? AS DATE);"); // Comando MySQL
//            System.out.println(inicio.toString() + " " +fim.toString() );
            stmt.setString(1, inicio.toString());
            stmt.setString(2, fim.toString());
            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel
            
            while (rs.next()) {
                String resultado = "";
                String a = rs.getString("dia");
                
                resultado = "Venda,,";
                resultado += format.format(rs.getInt("cod_vend")) + ",,";
                resultado += a.substring(8) + "/" + a.substring(5, 7) + "/" + a.substring(0, 4) + ",,";
                resultado += rs.getString("nome_funcionario") + ",,";
                resultado += rs.getString("nome_cliente") + ",,";
                resultado += rs.getString("metodo_pagamento") + ",,";
                resultado += NumberFormat.getCurrencyInstance().format(rs.getDouble("valor_total"));
                
                relatorio.add(resultado.split(",,"));
            }

            stmt = con.prepareStatement("SELECT o.cod_os, o.dia, f.nome as nome_funcionario, c.nome as nome_cliente, o.metodo_pagamento, o.valor_total from ordem_servico as o inner join cliente as c on o.fk_cliente_cod_cs = c.cod_cs inner join funcionario as f on o.fk_funcionario_cod_fun = f.cod_fun where o.dia BETWEEN CAST(? AS DATE) AND CAST(? AS DATE);"); // Comando MySQL
            stmt.setString(1, inicio.toString());
            stmt.setString(2, fim.toString());
            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel

            while (rs.next()) {
                String resultado = "";
                String a = rs.getString("dia");

                resultado = "OS,,";
                resultado += format.format(rs.getInt("cod_os")) + ",,";
                resultado += a.substring(8) + "/" + a.substring(5, 7) + "/" + a.substring(0, 4) + ",,";
                resultado += rs.getString("nome_funcionario") + ",,";
                resultado += rs.getString("nome_cliente") + ",,";
                resultado += rs.getString("metodo_pagamento") + ",,";
                resultado += NumberFormat.getCurrencyInstance().format(rs.getDouble("valor_total"));

                relatorio.add(resultado.split(",,"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha em buscar dados\n" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // fechando conexão com o banco de dados inependente do que acontecer
        }

        return relatorio; // retorna valor da lista.
    }

    public String[] abrirOS(int cod_os) {

        Connection con = ConnectionFactory.getConnection(); // Iniciando a conexão com o Banco de Dados
        PreparedStatement stmt = null; // Variável para executar comando MySQL
        ResultSet rs = null;

        String[] resultado = new String[5];

        try {
            stmt = con.prepareStatement("SELECT f.nome as nome_funcionario, c.nome as nome_cliente, o.problema, o.metodo_pagamento, o.valor_total from ordem_servico as o inner join cliente as c on o.fk_cliente_cod_cs = c.cod_cs inner join funcionario as f on o.fk_funcionario_cod_fun = f.cod_fun where o.cod_os = ?"); // Comando MySQL
            stmt.setInt(1, cod_os);
            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel

            while (rs.next()) {

                resultado[0] = rs.getString("nome_funcionario");
                resultado[1] = rs.getString("nome_cliente");
                resultado[2] = rs.getString("problema");
                resultado[3] = rs.getString("metodo_pagamento");
                resultado[4] = Double.toString(rs.getDouble("valor_total"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha em buscar dados\n" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // fechando conexão com o banco de dados inependente do que acontecer
        }

        return resultado; // retorna valor da lista.
    }

    public ArrayList<String[]> listaServico(int cod_os) {

        Connection con = ConnectionFactory.getConnection(); // Iniciando a conexão com o Banco de Dados
        PreparedStatement stmt = null; // Variável para executar comando MySQL
        ResultSet rs = null;

        DecimalFormat format = new DecimalFormat("0000");

        ArrayList<String[]> relatorio = new ArrayList(); // Lista do tipo objeto para alocar os valores da tabelaTeste

        try {
            stmt = con.prepareStatement("SELECT s.cod_serv, s.nome, s.valor, i.quantidade_serv FROM integra AS i INNER JOIN servico AS s ON i.fk_servico_cod_serv = s.cod_serv INNER JOIN ordem_servico AS o ON o.cod_os = i.fk_ordem_servico_cod_os WHERE o.cod_os = ?"); // Comando MySQL
            stmt.setInt(1, cod_os);
            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel

            while (rs.next()) {
                String resultado = "";

                resultado += format.format(rs.getInt("cod_serv")) + ",,";
                resultado += rs.getString("nome") + ",,";
                resultado += Double.toString(rs.getDouble("valor")) + ",,";
                resultado += Integer.toString(rs.getInt("quantidade_serv"));

                relatorio.add(resultado.split(",,"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha em buscar dados\n" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // fechando conexão com o banco de dados inependente do que acontecer
        }

        return relatorio; // retorna valor da lista.
    }

    public String[] abrirVenda(int cod_vend) {
        Connection con = ConnectionFactory.getConnection(); // Iniciando a conexão com o Banco de Dados
        PreparedStatement stmt = null; // Variável para executar comando MySQL
        ResultSet rs = null;

        String[] resultado = new String[4];

        try {
            stmt = con.prepareStatement("SELECT c.nome AS nome_cliente, f.nome AS nome_funcionario, v.metodo_pagamento, v.valor_total FROM venda as v INNER JOIN cliente AS c ON v.fk_cliente_cod_cs = c.cod_cs INNER JOIN funcionario AS f ON v.fk_funcionario_cod_fun = f.cod_fun where v.cod_vend = ?;"); // Comando MySQL
            stmt.setInt(1, cod_vend);
            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel

            while (rs.next()) {

                resultado[0] = rs.getString("nome_funcionario");
                resultado[1] = rs.getString("nome_cliente");
                resultado[2] = rs.getString("metodo_pagamento");
                resultado[3] = Double.toString(rs.getDouble("valor_total"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha em buscar dados\n" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // fechando conexão com o banco de dados inependente do que acontecer
        }

        return resultado; // retorna valor da lista.
    }

    public ArrayList<String[]> listaProdutos(int cod_vend) {

        Connection con = ConnectionFactory.getConnection(); // Iniciando a conexão com o Banco de Dados
        PreparedStatement stmt = null; // Variável para executar comando MySQL
        ResultSet rs = null;

        DecimalFormat format = new DecimalFormat("0000");

        ArrayList<String[]> relatorio = new ArrayList(); // Lista do tipo objeto para alocar os valores da tabelaTeste

        try {
            stmt = con.prepareStatement("select prod.cod_prod, prod.categoria, prod.nome, part.quantidade_total, prod.valor_unit from participa as part inner join produto as prod on part.fk_produto_cod_prod = prod.cod_prod where part.fk_venda_cod_vend = ?;"); // Comando MySQL
            stmt.setInt(1, cod_vend);
            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel

            while (rs.next()) {
                String resultado = "";

                resultado += format.format(rs.getInt("cod_prod")) + ",,";
                resultado += rs.getString("categoria") + ",,";
                resultado += rs.getString("nome") + ",,";
                resultado += Integer.toString(rs.getInt("quantidade_total")) + ",,";
                resultado += Double.toString(rs.getDouble("valor_unit"));

                relatorio.add(resultado.split(",,"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha em buscar dados\n" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // fechando conexão com o banco de dados inependente do que acontecer
        }

        return relatorio; // retorna valor da lista.
    }

    public ArrayList<String[]> getGraph(LocalDate inicio, LocalDate fim) {
        Connection con = ConnectionFactory.getConnection(); // Iniciando a conexão com o Banco de Dados
        PreparedStatement stmt = null; // Variável para executar comando MySQL
        ResultSet rs = null;

        ArrayList<String[]> relatorio = new ArrayList(); // Lista do tipo objeto para alocar os valores da tabelaTeste

        try {

            stmt = con.prepareStatement("SELECT SUM(o.valor_total) AS valor_total, o.dia FROM ordem_servico AS o WHERE o.dia BETWEEN CAST(? AS DATE) AND CAST(? AS DATE) GROUP BY o.dia"); // Comando MySQL
            stmt.setString(1, inicio.toString());
            stmt.setString(2, fim.toString());
            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel

            while (rs.next()) {
                String resultado = "";
                String a = rs.getString("dia");

                resultado += a.substring(8) + "/" + a.substring(5, 7) + "/" + a.substring(0, 4) + ",,";
                resultado += "Ordem Serviço,,";
                resultado += Double.toString(rs.getDouble("valor_total"));
                
                relatorio.add(resultado.split(",,"));
            }

            stmt = con.prepareStatement("SELECT SUM(v.valor_total) AS valor_total, v.dia FROM venda AS v WHERE v.dia BETWEEN CAST(? AS DATE) AND CAST(? AS DATE) GROUP BY v.dia"); // Comando MySQL
            stmt.setString(1, inicio.toString());
            stmt.setString(2, fim.toString());
            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel

            while (rs.next()) {
                String resultado = "";
                String a = rs.getString("dia");

                resultado += a.substring(8) + "/" + a.substring(5, 7) + "/" + a.substring(0, 4) + ",,";
                resultado += "Venda,,";
                resultado += Double.toString(rs.getDouble("valor_total"));
                
                relatorio.add(resultado.split(",,"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha em buscar dados\n" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // fechando conexão com o banco de dados inependente do que acontecer
        }
        
        return OrganizaLista(relatorio); // retorna valor da lista.
    }

    private  ArrayList<String[]> OrganizaLista(ArrayList<String[]> lista) {
        int menorIndex, j;
        String[] aux;
        j = 0;

        while (j < lista.size()) {
            menorIndex = j;

            for (int i = j + 1; i < lista.size(); i++) {
                String[] a = lista.get(menorIndex);
                String[] b = lista.get(i);
                if (a[0].compareToIgnoreCase(b[0]) > 0) {
                    menorIndex = i;
                }
            }

            aux = lista.get(j);
            lista.add(j, lista.get(menorIndex));
            lista.remove(menorIndex + 1);
            lista.add(menorIndex, aux);
            lista.remove(j + 1);

            j++;
        }

        return lista;
    }
}
