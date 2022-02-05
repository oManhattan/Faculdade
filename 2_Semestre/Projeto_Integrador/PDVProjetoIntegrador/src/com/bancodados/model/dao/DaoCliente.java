package com.bancodados.model.dao;

import com.api.verificadoc.VerificaDocumento;
import com.bancodados.connection.ConnectionFactory;
import com.bancodados.model.bean.ModelCliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DaoCliente {

    public void create(ModelCliente cs) {
        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL

        try {
            stmt = con.prepareStatement("INSERT INTO cliente (nome, email, telefone, cep, logradouro, logradouro_num, complemento, bairro, cidade, documento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");

            stmt.setString(1, cs.getNome());
            stmt.setString(2, cs.getEmail());
            stmt.setString(3, cs.getTelefone());
            stmt.setString(4, cs.getCep());
            stmt.setString(5, cs.getLogradouro());
            stmt.setString(6, cs.getLogradouro_num());
            stmt.setString(7, cs.getComplemento());
            stmt.setString(8, cs.getBairro());
            stmt.setString(9, cs.getCidade());
            stmt.setString(10, cs.getDocumento());

            stmt.executeUpdate(); // Executando atualização do comando

            JOptionPane.showMessageDialog(null, "Cliente adicionado com sucesso!"); // Mensagem para caso o comando dê certo

        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062){
                JOptionPane.showMessageDialog(null, "Documento já cadastrado na base de dados"); // Mensagem para cada o comando não dê certo
            }else{
                JOptionPane.showMessageDialog(null, "Falha ao tentar adicionar o cliente\n" + ex);
            } // Mensagem para cada o comando não dê certo
        }

        finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
        }
    }

    public ArrayList<String[]> read() {

        Connection con = ConnectionFactory.getConnection(); // Iniciando a conexão com o Banco de Dados
        PreparedStatement stmt = null; // Variável para executar comando MySQL
        ResultSet rs = null;

        ArrayList<String[]> cliente = new ArrayList(); // Lista do tipo objeto para alocar os valores da tabelaTeste

        try {
            stmt = con.prepareStatement("SELECT cod_cs, nome, email, telefone, documento from cliente"); // Comando MySQL
            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel

            while (rs.next()) {
                String resultado = "";

                resultado += Integer.toString(rs.getInt("cod_cs")) + ",";
                resultado += rs.getString("nome") + ",";
                resultado += rs.getString("email") + ",";
                resultado += maskPhone(rs.getString("telefone")) + ",";
                resultado += VerificaDocumento.mask(rs.getString("documento"));

                cliente.add(resultado.split(","));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha em buscar dados do cliente\n" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // fechando conexão com o banco de dados inependente do que acontecer
        }

        return cliente; // retorna valor da lista.
    }

    public void update(ModelCliente cs) {

        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL

        try {
            stmt = con.prepareStatement("UPDATE cliente SET nome = ?, email = ?, telefone = ?, cep = ?, logradouro = ?, logradouro_num = ?, complemento = ?, bairro = ?, cidade = ?, documento = ? WHERE cod_cs = ?"); // Comando MySQL para atualizar valores na tabela "tabelaTeste"

            stmt.setString(1, cs.getNome());
            stmt.setString(2, cs.getEmail());
            stmt.setString(3, cs.getTelefone());
            stmt.setString(4, cs.getCep());
            stmt.setString(5, cs.getLogradouro());
            stmt.setString(6, cs.getLogradouro_num());
            stmt.setString(7, cs.getComplemento());
            stmt.setString(8, cs.getBairro());
            stmt.setString(9, cs.getCidade());
            stmt.setString(10, cs.getDocumento());
            stmt.setInt(11, cs.getCod_cs());

            stmt.executeUpdate(); // Executando atualização do comando

            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!"); // Mensagem para caso o comando dê certo

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar atualizar dados do cliente/n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
        }
    }

    public ArrayList<String> getAddress(int id) {

        Connection con = ConnectionFactory.getConnection(); // Iniciando a conexão com o Banco de Dados
        PreparedStatement stmt = null; // Variável para executar comando MySQL
        ResultSet rs = null;

        ArrayList<String> endereco = new ArrayList();

        try {
            stmt = con.prepareStatement("SELECT logradouro, complemento, bairro, logradouro_num, cidade, cep from cliente where cod_cs = ?"); // Comando MySQL
            stmt.setInt(1, id);
            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel

            if (rs != null && rs.next()) {
                endereco.add(rs.getString("logradouro"));
                endereco.add(rs.getString("complemento"));
                endereco.add(rs.getString("bairro"));
                endereco.add(rs.getString("logradouro_num"));
                endereco.add(rs.getString("cidade"));
                endereco.add(rs.getString("cep"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha em buscar dados do cliente\n" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // fechando conexão com o banco de dados inependente do que acontecer
        }

        return endereco; // retorna valor da lista.
    }

    public void delete(int id) {

        Connection con = ConnectionFactory.getConnection(); // Inicia conexão com o banco de dados
        PreparedStatement stmt = null; // Variável utilizada para comando MySQL

        try {
            stmt = con.prepareStatement("DELETE FROM cliente WHERE cod_cs = ?"); // Comando MySQL para deletar valores na tabela "tabelaTeste"

            stmt.setInt(1, id); // Pegando o valor de ID do objeto TesteTabelaBean e adicionando no "?"

            stmt.executeUpdate(); // Executando atualização do comando

            JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso!"); // Mensagem para caso o comando dê certo

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar deletar dados do cliente/n" + ex); // Mensagem para cada o comando não dê certo
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fechando a conexão com o banco independendo do que aconteça
        }
    }

    public ArrayList<String[]> search(String input) {

        Connection con = ConnectionFactory.getConnection(); // Iniciando a conexão com o Banco de Dados
        PreparedStatement stmt = null; // Variável para executar comando MySQL
        ResultSet rs = null;

        ArrayList<String[]> cliente = new ArrayList(); // Lista do tipo objeto para alocar os valores da tabelaTeste

        try {
            stmt = con.prepareStatement("SELECT cod_cs, nome, email, telefone, documento FROM cliente where cod_cs = ? OR nome LIKE ? OR email LIKE ? OR telefone LIKE ? OR documento LIKE ?");

            try {
                stmt.setInt(1, Integer.parseInt(input));
            } catch (Exception e) {
                stmt.setInt(1, 0);
            }
            stmt.setString(2, "%" + input + "%");
            stmt.setString(3, "%" + input + "%");
            stmt.setString(4, "%" + input + "%");
            stmt.setString(5, "%" + input + "%");

            rs = stmt.executeQuery(); // Adicionando os valores coletados no comando MySQL na varáivel

            while (rs.next()) {
                String resultado = "";

                resultado += Integer.toString(rs.getInt("cod_cs")) + ",";
                resultado += rs.getString("nome") + ",";
                resultado += rs.getString("email") + ",";
                resultado += maskPhone(rs.getString("telefone")) + ",";
                resultado += VerificaDocumento.mask(rs.getString("documento"));

                cliente.add(resultado.split(","));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha em buscar dados " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // fechando conexão com o banco de dados inependente do que acontecer
        }

        return cliente; // retorna valor da lista.
    }
    
    private String maskPhone(String p) {
        p = "(" + p.substring(0, 2) + ") " + p.substring(2, 7) + "-" + p.substring(7);
        return p;
    }
}
