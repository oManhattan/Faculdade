/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.database.teste001;

import com.bancodados.connection.ConnectionFactory;
import javax.swing.JOptionPane;



/**
 *
 * @author Matheus
 */
public class TesteConexao001 {
    public static void main(String[] args) {
        
        if (ConnectionFactory.getConnection() != null) {
            JOptionPane.showMessageDialog(null, "Conexao feita com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Falha na conexao");
        }
    }
}
