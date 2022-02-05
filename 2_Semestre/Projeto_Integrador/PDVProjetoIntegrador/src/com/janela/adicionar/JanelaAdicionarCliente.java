package com.janela.adicionar;

import java.util.Map;
import java.util.HashMap;

import com.api.buscacep.BuscaCEP;
import com.api.verificadoc.VerificaDocumento;
import com.bancodados.model.bean.ModelCliente;
import com.bancodados.model.dao.DaoCliente;
import java.text.ParseException;
import javax.swing.JOptionPane;

public class JanelaAdicionarCliente extends javax.swing.JDialog {

    public JanelaAdicionarCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        FormatacaoDocumento();

        LograTextField.enable(true);
        BairroTextField.enable(true);
        CidadeTextField.enable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NomeTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CepTextField = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        LograTextField = new javax.swing.JTextField();
        ComplementoTextField = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BairroTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        CidadeTextField = new javax.swing.JTextField();
        NumTextField = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        DocumentoTextField = new javax.swing.JFormattedTextField();
        TelefoneTextField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Cliente");
        setResizable(false);

        jLabel2.setText("Nome:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Cancelar.png"))); // NOI18N
        jButton1.setToolTipText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("E-mail:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Confirmar.png"))); // NOI18N
        jButton2.setToolTipText("Adicionar Cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Documento:");

        jLabel5.setText("Logradouro:");

        jLabel6.setText("Telefone:");

        jLabel8.setText("CEP:");

        try {
            CepTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CepTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CepTextFieldFocusLost(evt);
            }
        });

        jLabel9.setText("Número:");

        jLabel10.setText("Complemento:");

        jLabel11.setText("Bairro:");

        jLabel12.setText("Cidade:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CPF", "CNPJ" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        try {
            TelefoneTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel4))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmailTextField)
                            .addComponent(NomeTextField)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NumTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                            .addComponent(LograTextField)
                            .addComponent(BairroTextField)
                            .addComponent(CidadeTextField)
                            .addComponent(ComplementoTextField)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DocumentoTextField))
                            .addComponent(TelefoneTextField))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TelefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(NumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LograTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComplementoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DocumentoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //BOTÃO CANCELAR
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        att = false;
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // CEP_TEXT_FIELD AÇÃO
    private void CepTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CepTextFieldFocusLost
        Map<String, String> busca = new HashMap<>();
        busca = BuscaCEP.buscarCep(CepTextField.getText());
        if (busca != null) {
            if (busca.isEmpty()) {
                JOptionPane.showMessageDialog(null, "CEP não encontrado.\nPreencha os campos de forma manual");
                LograTextField.enable(true);
                BairroTextField.enable(true);
                CidadeTextField.enable(true);

                LograTextField.setText("");
                BairroTextField.setText("");
                CidadeTextField.setText("");
            } else {
                LograTextField.enable(false);
                BairroTextField.enable(false);
                CidadeTextField.enable(false);

                LograTextField.setText(busca.get("logradouro"));
                BairroTextField.setText(busca.get("bairro"));
                CidadeTextField.setText(busca.get("localidade"));
            }
        }
    }//GEN-LAST:event_CepTextFieldFocusLost

    // BOTÃO ADICIONAR
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ModelCliente c = new ModelCliente();
        DaoCliente cdao = new DaoCliente();

        String tel = TelefoneTextField.getText();
        tel = tel.substring(1, 3) + tel.substring(5, 10) + tel.substring(11);
        String cep = CepTextField.getText();
        cep = cep.substring(0, 5) + cep.substring(6);

        if (VerificaDocumento.verificar(DocumentoTextField.getText()) == false) {
            JOptionPane.showMessageDialog(null, jComboBox1.getSelectedItem() + " inválido.\nPor favor, informe um " + jComboBox1.getSelectedItem() + " válido.");
        } else {
            c.setNome(NomeTextField.getText());
            c.setEmail(EmailTextField.getText());
            c.setTelefone(tel);
            c.setCep(cep);
            c.setLogradouro(LograTextField.getText());
            c.setLogradouro_num(NumTextField.getText());
            c.setComplemento(ComplementoTextField.getText());
            c.setBairro(BairroTextField.getText());
            c.setCidade(CidadeTextField.getText());
            c.setDocumento(VerificaDocumento.limpar(DocumentoTextField.getText()));

            cdao.create(c);

            att = true;

            setVisible(false);
            dispose();
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    // COMBO_BOX SELECIONA TIPO DOCUMENTO
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        FormatacaoDocumento();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    // VARIÁVEIS
    public boolean att;

    // FUNÇÕES
    // FUNÇÃO QUE MUDA A FORMATAÇÃO DO TEXTO DEPENDENDO DO COMBO_BOX SELECIONADO
    private void FormatacaoDocumento() {
        if (jComboBox1.getSelectedIndex() == 0) {
            DocumentoTextField.setValue(null);
            try {
                DocumentoTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
            } catch (ParseException ex) {
                System.out.println(ex);
            }
        } else {
            DocumentoTextField.setValue(null);
            try {
                DocumentoTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
            } catch (ParseException ex) {
                System.out.println(ex);
            }
        }
    }

    public void limpaCampos() {
        TelefoneTextField.setValue(null);
        CepTextField.setValue(null);
        NomeTextField.setText("");
        EmailTextField.setText("");
        NumTextField.setText("");
        LograTextField.setText("");
        ComplementoTextField.setText("");
        BairroTextField.setText("");
        CidadeTextField.setText("");
        DocumentoTextField.setValue(null);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaAdicionarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaAdicionarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaAdicionarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaAdicionarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaAdicionarCliente dialog = new JanelaAdicionarCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BairroTextField;
    private javax.swing.JFormattedTextField CepTextField;
    private javax.swing.JTextField CidadeTextField;
    private javax.swing.JFormattedTextField ComplementoTextField;
    private javax.swing.JFormattedTextField DocumentoTextField;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JTextField LograTextField;
    private javax.swing.JTextField NomeTextField;
    private javax.swing.JTextField NumTextField;
    private javax.swing.JFormattedTextField TelefoneTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
