package com.janela.main;

import com.bancodados.model.bean.ModelVenda;
import com.bancodados.model.dao.DaoCliente;
import com.bancodados.model.dao.DaoFuncionario;
import com.bancodados.model.dao.DaoOS;
import com.bancodados.model.dao.DaoParticipa;
import com.bancodados.model.dao.DaoProduto;
import com.bancodados.model.dao.DaoRelatorio;
import com.bancodados.model.dao.DaoVenda;
import com.bancodados.model.dao.DaoServico;

import com.janela.adicionar.JanelaAdicionarCliente;
import com.janela.adicionar.JanelaAdicionarFuncionario;
import com.janela.adicionar.JanelaAdicionarOS;
import com.janela.adicionar.JanelaAdicionarProduto;
import com.janela.adicionar.JanelaAdicionarServico;

import com.janela.atualizar.JanelaAtualizarCliente;
import com.janela.atualizar.JanelaAtualizarFuncionario;
import com.janela.atualizar.JanelaAtualizarOS;
import com.janela.atualizar.JanelaAtualizarProduto;
import com.janela.atualizar.JanelaAtualizarServico;

import com.janela.buscar.JanelaBuscarCliente;
import com.janela.buscar.JanelaBuscarFuncionario;
import com.janela.buscar.JanelaBuscarProduto;
import com.janela.detalhe.JanelaDetalheOS;
import com.janela.detalhe.JanelaDetalheVenda;

import com.janela.excluir.JanelaExcluirCliente;
import com.janela.excluir.JanelaExcluirFuncionario;
import com.janela.excluir.JanelaExcluirOS;
import com.janela.excluir.JanelaExcluirProduto;
import com.janela.excluir.JanelaExcluirServico;
import com.my.utils.DateUtils;
import com.my.utils.GraphUtils;

import com.my.utils.MyUtils;
import java.awt.BorderLayout;

import java.awt.CardLayout;
import java.awt.Color;
import java.time.LocalDate;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;

public class JanelaMain extends javax.swing.JFrame {

    public JanelaMain() {
        initComponents();

        readTable(jTable1, janelaBuscarProduto.produto);
        jFormattedTextField3.setValue(0);
        setTextDefault(jTextField1, "Adicione um cliente");
        setTextDefault(jTextField6, "Adicione um funcionário");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer();
        lineRenderer3D1 = new org.jfree.chart.renderer.category.LineRenderer3D();
        keypointPNGEncoderAdapter1 = new org.jfree.chart.encoders.KeypointPNGEncoderAdapter();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        VenderScreen = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        OsScreen = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        ClienteScreen = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        RelatorioScreen = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        ConfigScreen = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        ProdutoScreen = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton40 = new javax.swing.JButton();
        FuncionarioScreen = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        ServicoScreen = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jButton35 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton39 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PDVSys");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("VENDER");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setInheritsPopupMenu(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("CRIAR O.S.");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setInheritsPopupMenu(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("CLIENTES");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setInheritsPopupMenu(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setText("RELATÓRIO");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setInheritsPopupMenu(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setText("CONFIGURAÇÕES");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setInheritsPopupMenu(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PDV.SYS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setLayout(new java.awt.CardLayout());

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextField6.setText("Adicione um funcionário");
        jTextField6.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("VENDER");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextField1.setText("Adicione um cliente");
        jTextField1.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Cliente");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Produto", "Categoria", "Nome", "Quantidade", "Valor unidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Produtos");

        jButton7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Adicionar.png"))); // NOI18N
        jButton7.setToolTipText("Adicionar Produto");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Método de Pagamento");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Débito", "Crédito", "Crédito (x2)", "Crédito (x3)", "Crédito (x4)", "Crédito (x5)", "Crédito (x6)", "Crédito (x7)", "Crédito (x8)", "Crédito (x9)", "Crédito (x10)", "Crédito (x11)", "Crédito (x12)" }));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Valor Total");

        jButton8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Cancelar.png"))); // NOI18N
        jButton8.setToolTipText("Cancelar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Confirmar.png"))); // NOI18N
        jButton9.setToolTipText("Concluir");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton31.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Buscar.png"))); // NOI18N
        jButton31.setToolTipText("Buscar Cliente");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jFormattedTextField3.setEditable(false);
        jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        jFormattedTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField3.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel13.setText("Funcionário");

        jButton32.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Buscar.png"))); // NOI18N
        jButton32.setToolTipText("Buscar Funcionário");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Remover.png"))); // NOI18N
        jButton33.setToolTipText("Remover Produto");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VenderScreenLayout = new javax.swing.GroupLayout(VenderScreen);
        VenderScreen.setLayout(VenderScreenLayout);
        VenderScreenLayout.setHorizontalGroup(
            VenderScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VenderScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VenderScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(VenderScreenLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VenderScreenLayout.createSequentialGroup()
                        .addGap(0, 425, Short.MAX_VALUE)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9))
                    .addGroup(VenderScreenLayout.createSequentialGroup()
                        .addGroup(VenderScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(VenderScreenLayout.createSequentialGroup()
                                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addGroup(VenderScreenLayout.createSequentialGroup()
                                .addGroup(VenderScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(VenderScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        VenderScreenLayout.setVerticalGroup(
            VenderScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VenderScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(VenderScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(VenderScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VenderScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VenderScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(VenderScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(VenderScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(VenderScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel5.getAccessibleContext().setAccessibleDescription("");
        jComboBox1.getAccessibleContext().setAccessibleDescription("");
        jLabel6.getAccessibleContext().setAccessibleDescription("");

        jPanel3.add(VenderScreen, "card2");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("ORDEM DE SERVIÇO");

        jTextField2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(211, 211, 211));
        jTextField2.setText("Procurar Ordem de Serviço");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Buscar.png"))); // NOI18N
        jButton10.setToolTipText("Buscar Ordem de Serviço");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código OS", "Cliente", "E-mail", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(120);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(120);
        }

        jButton11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Excluir.png"))); // NOI18N
        jButton11.setToolTipText("Excluir OS");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Adicionar_OS.png"))); // NOI18N
        jButton12.setToolTipText("Adicionar OS");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Atualizar_OS.png"))); // NOI18N
        jButton13.setToolTipText("Atualizar OS");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OsScreenLayout = new javax.swing.GroupLayout(OsScreen);
        OsScreen.setLayout(OsScreenLayout);
        OsScreenLayout.setHorizontalGroup(
            OsScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OsScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OsScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
                    .addGroup(OsScreenLayout.createSequentialGroup()
                        .addComponent(jTextField2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OsScreenLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OsScreenLayout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        OsScreenLayout.setVerticalGroup(
            OsScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OsScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(OsScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addGroup(OsScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.add(OsScreen, "card3");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("CLIENTES");

        jTextField3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(211, 211, 211));
        jTextField3.setText("Procurar Cliente");
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Buscar.png"))); // NOI18N
        jButton14.setToolTipText("Buscar Cliente");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Cliente", "Nome", "E-mail", "Telefone", "Documento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTable3.getColumnModel().getColumn(4).setResizable(false);
            jTable3.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        jButton15.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Excluir.png"))); // NOI18N
        jButton15.setToolTipText("Excluir Cliente");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Adicionar_Func.png"))); // NOI18N
        jButton16.setToolTipText("Adicionar Cliente");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Atualizar_Func.png"))); // NOI18N
        jButton17.setToolTipText("Atualizar Cliente");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ClienteScreenLayout = new javax.swing.GroupLayout(ClienteScreen);
        ClienteScreen.setLayout(ClienteScreenLayout);
        ClienteScreenLayout.setHorizontalGroup(
            ClienteScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClienteScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
                    .addGroup(ClienteScreenLayout.createSequentialGroup()
                        .addComponent(jTextField3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ClienteScreenLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClienteScreenLayout.createSequentialGroup()
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ClienteScreenLayout.setVerticalGroup(
            ClienteScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(ClienteScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addGroup(ClienteScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.add(ClienteScreen, "card4");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setText("Data início");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("RELATÓRIOS");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel12.setText("Data final");

        jButton18.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Buscar.png"))); // NOI18N
        jButton18.setToolTipText("Buscar");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Categoria", "Código", "Data", "Funcionario", "Cliente", "Método de Pagamento", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable4.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable4.getColumnModel().getColumn(2).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTable4.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTable4.getColumnModel().getColumn(4).setPreferredWidth(200);
            jTable4.getColumnModel().getColumn(5).setResizable(false);
            jTable4.getColumnModel().getColumn(5).setPreferredWidth(150);
            jTable4.getColumnModel().getColumn(6).setResizable(false);
            jTable4.getColumnModel().getColumn(6).setPreferredWidth(200);
        }

        jDateChooser2.setDateFormatString("dd-MM-yyyy");
        jDateChooser2.setMinSelectableDate(new java.util.Date(1609470000000L));
        jDateChooser2.setOpaque(false);

        jDateChooser3.setDateFormatString("dd-MM-yyyy");
        jDateChooser3.setOpaque(false);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Detalhes.png"))); // NOI18N
        jButton6.setToolTipText(" Detalhes");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout RelatorioScreenLayout = new javax.swing.GroupLayout(RelatorioScreen);
        RelatorioScreen.setLayout(RelatorioScreenLayout);
        RelatorioScreenLayout.setHorizontalGroup(
            RelatorioScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RelatorioScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RelatorioScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RelatorioScreenLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RelatorioScreenLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        RelatorioScreenLayout.setVerticalGroup(
            RelatorioScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RelatorioScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(RelatorioScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RelatorioScreenLayout.createSequentialGroup()
                        .addGroup(RelatorioScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RelatorioScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(RelatorioScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(RelatorioScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(RelatorioScreen, "card5");

        ConfigScreen.setLayout(new java.awt.CardLayout());

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("TELA DE CONFIGURAÇÕES");

        jButton19.setText("PRODUTOS");
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.setInheritsPopupMenu(true);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("FUNCIONÁRIOS");
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton20.setInheritsPopupMenu(true);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton34.setText("SERVIÇOS");
        jButton34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton34.setInheritsPopupMenu(true);
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
                    .addComponent(jButton34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(443, Short.MAX_VALUE))
        );

        ConfigScreen.add(jPanel1, "card2");

        jTextField4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextField4.setText("Procurar Produto");
        jTextField4.setBorder(jTextField3.getBorder());
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Buscar.png"))); // NOI18N
        jButton21.setToolTipText("Buscar Produto");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Categoria", "Nome", "Valor Unidade", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable5.setShowGrid(false);
        jTable5.setSurrendersFocusOnKeystroke(true);
        jTable5.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setMinWidth(80);
            jTable5.getColumnModel().getColumn(0).setMaxWidth(80);
            jTable5.getColumnModel().getColumn(1).setMinWidth(120);
            jTable5.getColumnModel().getColumn(1).setMaxWidth(120);
            jTable5.getColumnModel().getColumn(4).setMaxWidth(110);
        }

        jButton22.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Excluir.png"))); // NOI18N
        jButton22.setToolTipText("Excluir Produto");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Adicionar_Prod.png"))); // NOI18N
        jButton23.setToolTipText("Adicionar Produto");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Atualizar_Prod.png"))); // NOI18N
        jButton24.setToolTipText("Atualizar Produto");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setText("PRODUTOS");

        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Voltar.png"))); // NOI18N
        jButton40.setToolTipText("Voltar");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProdutoScreenLayout = new javax.swing.GroupLayout(ProdutoScreen);
        ProdutoScreen.setLayout(ProdutoScreenLayout);
        ProdutoScreenLayout.setHorizontalGroup(
            ProdutoScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProdutoScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProdutoScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
                    .addGroup(ProdutoScreenLayout.createSequentialGroup()
                        .addComponent(jTextField4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProdutoScreenLayout.createSequentialGroup()
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProdutoScreenLayout.createSequentialGroup()
                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ProdutoScreenLayout.setVerticalGroup(
            ProdutoScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProdutoScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProdutoScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ProdutoScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addGroup(ProdutoScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ConfigScreen.add(ProdutoScreen, "card3");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("FUNCIONÁRIOS");

        jTextField5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextField5.setText("Procurar Funcionário");
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Buscar.png"))); // NOI18N
        jButton25.setToolTipText("Buscar Funcionário");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "E-mail", "Cargo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setMinWidth(80);
            jTable6.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        jButton26.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Excluir.png"))); // NOI18N
        jButton26.setToolTipText("Excluir Funcionário");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Adicionar_Func.png"))); // NOI18N
        jButton27.setToolTipText("Adicionar Funcionário");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Atualizar_Func.png"))); // NOI18N
        jButton28.setToolTipText("Atualizar Funcionário");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Voltar.png"))); // NOI18N
        jButton29.setToolTipText("Voltar");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FuncionarioScreenLayout = new javax.swing.GroupLayout(FuncionarioScreen);
        FuncionarioScreen.setLayout(FuncionarioScreenLayout);
        FuncionarioScreenLayout.setHorizontalGroup(
            FuncionarioScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FuncionarioScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FuncionarioScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
                    .addGroup(FuncionarioScreenLayout.createSequentialGroup()
                        .addComponent(jTextField5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FuncionarioScreenLayout.createSequentialGroup()
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FuncionarioScreenLayout.createSequentialGroup()
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        FuncionarioScreenLayout.setVerticalGroup(
            FuncionarioScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FuncionarioScreenLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(FuncionarioScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FuncionarioScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addGroup(FuncionarioScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ConfigScreen.add(FuncionarioScreen, "card4");

        jTextField7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextField7.setText("Procurar Serviços");
        jTextField7.setBorder(jTextField3.getBorder());
        jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField7FocusLost(evt);
            }
        });
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jButton35.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Buscar.png"))); // NOI18N
        jButton35.setToolTipText("Buscar Serviços");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable7.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable7.setShowGrid(false);
        jTable7.setSurrendersFocusOnKeystroke(true);
        jTable7.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(jTable7);
        if (jTable7.getColumnModel().getColumnCount() > 0) {
            jTable7.getColumnModel().getColumn(0).setMinWidth(80);
            jTable7.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        jButton36.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Excluir.png"))); // NOI18N
        jButton36.setToolTipText("Excluir Serviço");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Adicionar_Serv.png"))); // NOI18N
        jButton37.setToolTipText("Adicionar Serviço");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Atualizar_Serv.png"))); // NOI18N
        jButton38.setToolTipText("Atualizar Serviço");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setText("SERVIÇOS");

        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Voltar.png"))); // NOI18N
        jButton39.setToolTipText("Voltar");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ServicoScreenLayout = new javax.swing.GroupLayout(ServicoScreen);
        ServicoScreen.setLayout(ServicoScreenLayout);
        ServicoScreenLayout.setHorizontalGroup(
            ServicoScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServicoScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ServicoScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
                    .addGroup(ServicoScreenLayout.createSequentialGroup()
                        .addComponent(jTextField7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ServicoScreenLayout.createSequentialGroup()
                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ServicoScreenLayout.createSequentialGroup()
                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ServicoScreenLayout.setVerticalGroup(
            ServicoScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServicoScreenLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(ServicoScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ServicoScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addGroup(ServicoScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ConfigScreen.add(ServicoScreen, "card5");

        jPanel3.add(ConfigScreen, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // @JANELA_CLIENTE -> ÁREA_TEXTO "BUSCAR" (AO APERTAR ENTER FARÁ BUSCA DO QUE FOI ESCRITO)
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        if (daoOS.search(jTextField2.getText()).isEmpty()) {
            // Informa que nao encontrou um resultado para busca e mostra todas as
            // informacoes
            JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado");
            readTable(jTable2, daoOS.read());
        } else {
            // Informa na tabela o resultado da busca
            readTable(jTable2, daoOS.search(jTextField2.getText()));
        }

        jTextField2.setText("Procurar Ordem de Serviço");
        jTextField2.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost

    }//GEN-LAST:event_jTextField2FocusLost

    // @JANELA_SERVIÇOS -> BOTÃO "SERVIÇOS" (ACESSAR JANELA DE SERVIÇOS)
    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        TrocaTela(ConfigScreen, "card5");
        readTable(jTable7, daoServico.read());
        setTextDefault(jTextField7, "Procurar Serviços");
    }//GEN-LAST:event_jButton34ActionPerformed

    // @JANELA_SERVIÇOS -> ÁREA_TEXTO "BUSCAR" (AO GANHAR FOCUS, DEFINE O TEXTO 
    // PADRÃO)
    private void jTextField7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusGained
        if (jTextField7.getText().equals("Procurar Serviços")) {
            jTextField7.setText("");
            jTextField7.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField7FocusGained

    // @JANELA_SERIVIÇOS -> BOTÃO "BUSCAR" (ATUALIZA JTABLE7 COM OS RESULTADOS DA
    // PESQUISA)
    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed

        if (daoServico.search(jTextField7.getText()).isEmpty()) {
            // Informa que nao encontrou um resultado para busca e mostra todas as
            // informacoes
            JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado");
            readTable(jTable7, daoServico.read());
        } else {
            // Informa na tabela o resultado da busca
            readTable(jTable7, daoServico.search(jTextField7.getText()));
        }


    }//GEN-LAST:event_jButton35ActionPerformed

    // @JANELA_SERVIÇO -> BOTÃO "EXCLUIR" (ABRIR JDIALOG PARA EXCLUIR SERVIÇO)
    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed

        if (jTable7.getSelectedRow() != -1) {

            janelaExcluirServico.jTable1.setValueAt(jTable7.getModel().getValueAt(jTable7.getSelectedRow(), 0).toString(), 0, 0);
            janelaExcluirServico.jTable1.setValueAt(jTable7.getModel().getValueAt(jTable7.getSelectedRow(), 1).toString(), 0, 1);
            AlinhaCelula(janelaExcluirServico.jTable1);

            janelaExcluirServico.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum serviço selecionado");
        }

        if (janelaExcluirServico.att) {
            readTable(jTable7, daoServico.read());
        }

    }//GEN-LAST:event_jButton36ActionPerformed

    // @JANELA_SERVIÇOS -> BOTÃO "ADICIONAR" (ABRIR JDIALOG PARA ADICIONAR SERVIÇO)
    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed

        janelaAdicionarServico.jLabel5.setText(DaoServico.totalOS());
        janelaAdicionarServico.setVisible(true);
        janelaAdicionarServico.limpaCampos();

        if (janelaAdicionarServico.att) {
            readTable(jTable7, daoServico.read());
        }
    }//GEN-LAST:event_jButton37ActionPerformed

    // @JANELA_SERVIÇO -> BOTÃO "ATUALIZAR" (ABRIR JDIALOG PARA ATUALIZAR SERVIÇO)
    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed

        // Adicionando os valores no Jdialog
        try {
            if (jTable7.getSelectedRow() != -1) {
                janelaAtualizarServico.jLabel5.setText(jTable7.getValueAt(jTable7.getSelectedRow(), 0).toString());
                janelaAtualizarServico.NomeTextField.setText(jTable7.getValueAt(jTable7.getSelectedRow(), 1).toString());
                janelaAtualizarServico.ValorFormattedTextField.setText(jTable7.getValueAt(jTable7.getSelectedRow(), 2).toString().substring(3).replace(".", ","));
                janelaAtualizarServico.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum serviço selecionado");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Nenhum serviço selecionado");
        }

        if (janelaAtualizarServico.att) {
            readTable(jTable7, daoServico.read());
        }

    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        TrocaTela(ConfigScreen, "card2");
    }//GEN-LAST:event_jButton39ActionPerformed

    // @JANELA_VENDER -> BOTÃO REMOVER PRODUTO
    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        if (jTable1.getSelectedRow() != -1) {
            String[] s = {jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(),
                jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString(),
                jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString(),
                jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString()};

            MyUtils.removeItem(janelaBuscarProduto.produto, s);

            readTable(jTable1, janelaBuscarProduto.produto);
            calculaValor(jTable1, jFormattedTextField3);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum produto selecionado");
        }
    }//GEN-LAST:event_jButton33ActionPerformed

    // @JANELA_VENDER -> BOTÃO CANCELAR
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        janelaBuscarProduto.produto.clear();
        readTable(jTable1, janelaBuscarProduto.produto);
        jFormattedTextField3.setValue(0);
        jComboBox1.setSelectedIndex(0);
        setTextDefault(jTextField1, "Adicione um cliente");
        setTextDefault(jTextField6, "Adicione um funcionário");
    }//GEN-LAST:event_jButton8ActionPerformed

    // @JANELA_VENDER -> BOTÃO CONCLUIR
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (jTextField1.getText().equals("Adicione um cliente")
                || jTextField6.getText().equals("Adicione um funcionário")
                || jTable1.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            adicionaVenda();
            jButton8ActionPerformed(evt);
        }

    }//GEN-LAST:event_jButton9ActionPerformed

    //@JANELA_RELATORIO -> BOTÃO BUSCAR
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
  
        DateUtils dateInicio = new DateUtils(jDateChooser2.getDate().toString().split(" "));
        DateUtils dateFim = new DateUtils(jDateChooser3.getDate().toString().split(" "));
        
        if (DateUtils.condicoes(dateInicio, dateFim)) {
            readTable(jTable4, daoRelatorio.search(dateInicio.date, dateFim.date));
            atualizaGrafico(dateInicio.date, dateFim.date);
        }
    }                                         
//GEN-LAST:event_jButton18ActionPerformed
// @JANELA_SERVIÇOS -> ÁREA_TEXTO "BUSCAR" (AO PERDER FOCUS, VOLTA AO PADRÃO
    // O VALOR DO CAMPO)
    private void jTextField7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusLost
        if (jTextField7.getText().isEmpty()) {
            setTextDefault(jTextField7, "Procurar Serviços");
        }

    }//GEN-LAST:event_jTextField7FocusLost

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        TrocaTela(ConfigScreen, "card2");
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
        if (jTextField5.getText().isEmpty()) {
            setTextDefault(jTextField5, "Procurar Funcionário");
        }
    }//GEN-LAST:event_jTextField5FocusLost

    // @JANELA_RELATORIO -> BOTAO PARA ABRIR DETALHES DAS VENDAS / OS
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (jTable4.getSelectedRow() != -1) {
            if (jTable4.getValueAt(jTable4.getSelectedRow(), 0).equals("OS")) {
                detalheOS(Integer.parseInt(jTable4.getValueAt(jTable4.getSelectedRow(), 1).toString()));
                janelaDetalheOS.setVisible(true);
            } else {
                detalheVenda(Integer.parseInt(jTable4.getValueAt(jTable4.getSelectedRow(), 1).toString()));
                janelaDetalheVenda.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma venda selecionada.");
        }

        janelaDetalheOS.limpaCampos();
    }//GEN-LAST:event_jButton6ActionPerformed
    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        if (jTextField4.getText().isEmpty()){
           setTextDefault(jTextField4, "Procurar Produto");
        }
    }//GEN-LAST:event_jTextField4FocusLost

    // @JANELA_SERVIÇO -> ÁREA_TEXTO "BUSCAR" (AO APERTAR ENTER FARÁ BUSCA DO QUE
    // FOI ESCRITO)
    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
         readTable(jTable7, daoServico.search(jTextField7.getText()));
    }//GEN-LAST:event_jTextField7ActionPerformed

    // @JANELA_FUNCIONÁRIO -> ÁREA_TEXTO "BUSCAR" (AO APERTAR ENTER FARÁ BUSCA DO QUE
    // FOI ESCRITO)
    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        readTable(jTable6, daoFuncionario.search(jTextField5.getText()));
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
       readTable(jTable5, daoProduto.search(jTextField4.getText()));
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        if (jTextField3.getText().isEmpty()){
           setTextDefault(jTextField3, "Procurar Cliente");
        }
    }//GEN-LAST:event_jTextField3FocusLost

    // @JANELA_OS -> ÁREA_TEXTO "BUSCAR" (AO APERTAR ENTER FARÁ BUSCA DO QUE
    // FOI ESCRITO)
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        readTable(jTable2, daoOS.search(jTextField2.getText()));
    }//GEN-LAST:event_jTextField2ActionPerformed
    
    // @JANELA_CLIENTE -> ÁREA_TEXTO "BUSCAR" (AO APERTAR ENTER FARÁ BUSCA DO QUE
    // FOI ESCRITO)
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField3ActionPerformed
        readTable(jTable3, daoCliente.search(jTextField3.getText()));
    }// GEN-LAST:event_jTextField3ActionPerformed

    // @SIDE_MENU -> BOTÃO "VENDER" (ACESSAR JANELA VENDER)
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        TrocaTela(jPanel3, "card2");
        setTextDefault(jTextField1, "Adicione um cliente");
        setTextDefault(jTextField6, "Adicione um funcionário");
    }// GEN-LAST:event_jButton1ActionPerformed

    // @SIDE_MENU -> BOTÃO "ORDEM DE SERVIÇO" (ACESSAR JANELA ORDEM DE SERVIÇO)
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        TrocaTela(jPanel3, "card3");
        setTextDefault(jTextField2, "Procurar Ordem de Serviço");
        readTable(jTable2, daoOS.read());
    }// GEN-LAST:event_jButton2ActionPerformed

    // @SIDE_MENU -> BOTÃO "CLIENTE" (ACESSAR JANELA CLIENTE)
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        TrocaTela(jPanel3, "card4");
        setTextDefault(jTextField3, "Procurar Cliente");
        readTable(jTable3, daoCliente.read());
    }// GEN-LAST:event_jButton3ActionPerformed

    // @SIDE_MENU -> BOTÃO "RELATÓRIO" (ACESSAR JANELA RELATÓRIO)
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        DateUtils dateInicio;
        DateUtils dateFim;
        
        TrocaTela(jPanel3, "card5");

        dateFim = new DateUtils();
        dateInicio = new DateUtils(dateFim);

        jDateChooser3.setDate(dateFim.agora());
        jDateChooser2.setDate(dateInicio.agora());

        readTable(jTable4, daoRelatorio.search(dateInicio.date, dateFim.date));
        atualizaGrafico(dateInicio.date, dateFim.date);
        
    }// GEN-LAST:event_jButton4ActionPerformed

    // @SIDE_MENU -> BOTÃO "CONFIGURAÇÃO" (ACESSAR JANELA CONFIGURAÇÃO)
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
        TrocaTela(jPanel3, "card6");
        jButton39.doClick();
    }// GEN-LAST:event_jButton5ActionPerformed

    // @JANELA_CONFIGURAÇÃO -> BOTÃO "PRODUTO" (ACESSAR JANELA PRODUTO)
    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton19ActionPerformed
        readTable(jTable5, daoProduto.read());
        TrocaTela(ConfigScreen, "card3");
        setTextDefault(jTextField4, "Procurar Produto");
    }// GEN-LAST:event_jButton19ActionPerformed

    // @JANELA_CONFIGURAÇÃO -> BOTÃO "FUNCIONÁRIO" (ACESSAR JANELA FUNCIONÁRIO)
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton20ActionPerformed
        TrocaTela(ConfigScreen, "card4");
        setTextDefault(jTextField5, "Procurar Funcionário");
        readTable(jTable6, daoFuncionario.read());
    }// GEN-LAST:event_jButton20ActionPerformed

    // @JANELA_PRODUTO -> BOTÃO "VOLTAR" (VOLTAR PARA JANELA_CONFIGURAÇÃO)
    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton30ActionPerformed
        TrocaTela(ConfigScreen, "card2");
    }// GEN-LAST:event_jButton30ActionPerformed

    // @JANELA_FUNCIONÁRIO -> BOTÃO "VOLTAR" (VOLTAR PARA JANELA_CONFIGURAÇÃO)
    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton29ActionPerformed
        TrocaTela(ConfigScreen, "card2");
    }// GEN-LAST:event_jButton29ActionPerformed

    // @JANELA_ORDEM_DE_SERVIÇO -> ÁREA_TEXTO "BUSCAR"
    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField2FocusGained
        
         if (jTextField2.getText().equals("Procurar Ordem de Serviço")) {
            jTextField2.setText("");
            jTextField2.setForeground(Color.black);
        }
    }// GEN-LAST:event_jTextField2FocusGained

    // @JANELA_ORDEM_DE_SERVIÇO -> BOTÃO "ATUALIZAR ORDEM DE SERVIÇO" (ABRE JDIALOG PARA ATUALIZAR OS)
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton13ActionPerformed
        janelaAtualizarOS.limpaCampos();
        // Adicionando os valores no Jdialog
        try {
            if (jTable2.getSelectedRow() != -1) {

                ArrayList<String[]> listaInfo, listaAux = new ArrayList();
                listaInfo = DaoOS.infoOS(jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString());

                int index = 0;
                for (String[] i : listaInfo) {
                    if (index == 0) {
                        

                        janelaAtualizarOS.jLabel7.setText(jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString());
                        janelaAtualizarOS.jTextField4.setText(i[3]);
                        janelaAtualizarOS.jTextField6.setText(i[4]);
                        janelaAtualizarOS.jTextField5.setText(i[0]);
                        janelaAtualizarOS.jComboBox1.setSelectedItem(i[2]);
                    }
                    index++;
                }
                 
                    for (int j = 1; j < listaInfo.size(); j++){
                        listaAux.add(listaInfo.get(j));
                    }
                    readTable(janelaAtualizarOS.jTable1, listaAux);
                   janelaAtualizarOS.jFormattedTextField3.setValue(janelaAtualizarOS.valorOS(janelaAtualizarOS.jTable1));
                janelaAtualizarOS.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhuma OS selecionada\n");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Nenhuma OS selecionada\n" + ex);
        }

        if (janelaAdicionarOS.att) {
            readTable(jTable2, daoOS.read());
        }
    }// GEN-LAST:event_jButton13ActionPerformed

    // @JANELA_ORDEM_DE_SERVIÇO -> BOTÃO "ADICIONAR ORDEM DE SERVIÇO" (ABRE JDIALOG PARA ADICIONAR OS)
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton12ActionPerformed
        
        
        janelaAdicionarOS.jLabel7.setText(DaoOS.totalOS());
        AlinhaCelula(janelaAdicionarOS.jTable1);
        janelaAdicionarOS.setVisible(true);
        janelaAdicionarOS.limpaCampos();
        
         
        if (janelaAdicionarOS.att) {
            readTable(jTable2, daoOS.read());
        }
        

    }// GEN-LAST:event_jButton12ActionPerformed

    // @JANELA_ORDEM_DE_SERVIÇO -> BOTÃO "EXCLUIR ORDEM DE SERVIÇO" (ABRE JDIALOG PARA EXCLUIR OS)
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton11ActionPerformed

        if (jTable2.getSelectedRow() != -1) {

            janelaExcluirOS.jTable1.setValueAt(jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString(), 0, 0);
            janelaExcluirOS.jTable1.setValueAt(jTable2.getValueAt(jTable2.getSelectedRow(), 1).toString(), 0, 1);
            janelaExcluirOS.jTable1.setValueAt(jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString(), 0, 2);
            janelaExcluirOS.jTable1.setValueAt(jTable2.getValueAt(jTable2.getSelectedRow(), 3).toString(), 0, 3);

            AlinhaCelula(janelaExcluirOS.jTable1);

            janelaExcluirOS.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma OS selecionada");
        }

        if (janelaExcluirOS.att) {
            readTable(jTable2, daoOS.read());
        }

    }// GEN-LAST:event_jButton11ActionPerformed

    // @JANELA_CLIENTE -> ÁREA_TEXTO "BUSCAR"
    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField3FocusGained
       
         if (jTextField3.getText().equals("Procurar Cliente")) {
            jTextField3.setText("");
            jTextField3.setForeground(Color.black);
        }
    }// GEN-LAST:event_jTextField3FocusGained

    // @JANELA_CLIENTE -> BOTÃO "ATUALIZAR CLIENTE" (ABRE JDIALOG PARA ATUALIZAR CLIENTE)
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton17ActionPerformed

        if (jTable3.getSelectedRow() != -1) { // Condicionar para checar se foi selecionado um cliente ou nao
            ArrayList aux; // ArrayList criada para receber algumas informações do cliente direto do banco de dados.

            aux = daoCliente.getAddress(Integer.parseInt(jTable3.getModel().getValueAt(jTable3.getSelectedRow(), 0).toString())); // Recebendo dados do endereço a partir do "cod_cs" e comando SQL dentro do DaoCliente

            janelaAtualizarCliente.CodCsLabel.setText(jTable3.getModel().getValueAt(jTable3.getSelectedRow(), 0).toString()); // Adicionando o código do cliente (cod_cs) na JanelaAtualizar
            janelaAtualizarCliente.NomeTextField.setText(jTable3.getModel().getValueAt(jTable3.getSelectedRow(), 1).toString()); // Adicionando o nome do cliente na JanelaAtualizarCliente
            janelaAtualizarCliente.EmailTextField.setText(jTable3.getModel().getValueAt(jTable3.getSelectedRow(), 2).toString()); // Adicionando o e-mail do cliente na JanelaAtualizarCliente
            janelaAtualizarCliente.TelefoneTextField.setText(jTable3.getModel().getValueAt(jTable3.getSelectedRow(), 3).toString()); // Adicionando o telefone do cliente na JanelaAtualizarCliente
            if (jTable3.getModel().getValueAt(jTable3.getSelectedRow(), 4).toString().length() == 14) { // Condicional para determinar se é CPF ou CNPJ
                janelaAtualizarCliente.jComboBox1.setSelectedIndex(0);
            } else {
                janelaAtualizarCliente.jComboBox1.setSelectedIndex(1);
            }
            janelaAtualizarCliente.DocumentoTextField.setText(jTable3.getModel().getValueAt(jTable3.getSelectedRow(), 4).toString()); // Adicionando o documento do cliente na JanelaAtualizarCliente
            janelaAtualizarCliente.LograTextField.setText(aux.get(0).toString()); // Adicionando o logradouro do cliente na JanelaAtualizarCliente
            janelaAtualizarCliente.ComplementoTextField.setText(aux.get(1).toString()); // Adicionando o complemento do cliente na JanelaAtualizarCliente
            janelaAtualizarCliente.BairroTextField.setText(aux.get(2).toString()); // Adicionando o bairro do cliente na JanelaAtualizarCliente
            janelaAtualizarCliente.NumTextField.setText(aux.get(3).toString()); // Adicionando logradouro_num do cliente na JanelaAtualizarCliente
            janelaAtualizarCliente.CidadeTextField.setText(aux.get(4).toString());
            janelaAtualizarCliente.CepTextField.setText(aux.get(5).toString());

            janelaAtualizarCliente.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum cliente selecionado");
        }

        if (janelaAtualizarCliente.att) {
            readTable(jTable3, daoCliente.read());
        }
    }// GEN-LAST:event_jButton17ActionPerformed

    // @JANELA_CLIENTE -> BOTÃO "ADICIONAR CLIENTE" (ABRE JDIALOG PARA ADICIONAR CLIENTE)
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton16ActionPerformed

        janelaAdicionarCliente.setVisible(true);

        janelaAdicionarCliente.limpaCampos();
        if (janelaAdicionarCliente.att) {
            readTable(jTable3, daoCliente.read());
        }
    }// GEN-LAST:event_jButton16ActionPerformed

    // @JANELA_CLIENTE -> BOTÃO "EXCLUIR CLIENTE" (ABRIR JDIALOG PARA EXCLUIR CLIENTE)
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton15ActionPerformed

        if (jTable3.getSelectedRow() != -1) { 
// Condicionlar para checar se foi selecionado um cliente ou nao
            AlinhaCelula(janelaExcluirCliente.jTable1);
            janelaExcluirCliente.jTable1.setValueAt(jTable3.getValueAt(jTable3.getSelectedRow(), 0).toString(), 0, 0);
            janelaExcluirCliente.jTable1.setValueAt(jTable3.getValueAt(jTable3.getSelectedRow(), 1).toString(), 0, 1);
            janelaExcluirCliente.jTable1.setValueAt(jTable3.getValueAt(jTable3.getSelectedRow(), 2).toString(), 0, 2);
            janelaExcluirCliente.jTable1.setValueAt(jTable3.getValueAt(jTable3.getSelectedRow(), 3).toString(), 0, 3);
            janelaExcluirCliente.jTable1.setValueAt(jTable3.getValueAt(jTable3.getSelectedRow(), 4).toString(), 0, 4);

            janelaExcluirCliente.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum cliente selecionado");
        }

        if (janelaExcluirCliente.att) {
            readTable(jTable3, daoCliente.read());
        }
    }// GEN-LAST:event_jButton15ActionPerformed

    // @JANELA_PRODUTO -> ÁREA_TEXTO "BUSCAR"
    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField4FocusGained
                
         if (jTextField4.getText().equals("Procurar Produto")) {
            jTextField4.setText("");
            jTextField4.setForeground(Color.black);
        }
    }// GEN-LAST:event_jTextField4FocusGained

    // @JANELA_PRODUTO -> BOTÃO "ATUALIZAR" (ABRIR JDIALOG PARA ATUALIZAR PRODUTO)
    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton24ActionPerformed

        // Adicionando os valores no Jdialog
        try {
            if (jTable5.getSelectedRow() != -1) {
                janelaAtualizarProduto.jLabel5.setText(jTable5.getValueAt(jTable5.getSelectedRow(), 0).toString());
                janelaAtualizarProduto.jTextField5.setText(jTable5.getValueAt(jTable5.getSelectedRow(), 2).toString());
                janelaAtualizarProduto.jFormattedTextField1.setText(jTable5.getValueAt(jTable5.getSelectedRow(), 3).toString().substring(3).replace(".", ","));
                janelaAtualizarProduto.jFormattedTextField2.setText(jTable5.getValueAt(jTable5.getSelectedRow(), 4).toString());
                insertComboBox(janelaAtualizarProduto.jComboBox1, jTable5.getValueAt(jTable5.getSelectedRow(), 1).toString(), daoProduto.categoria());

                janelaAtualizarProduto.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum produto selecionado");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Nenhum produto selecionado");
        }

        if (janelaAtualizarProduto.att) {
            readTable(jTable5, daoProduto.read());
        }
    }// GEN-LAST:event_jButton24ActionPerformed

    // @JANELA_PRODUTO -> BOTÃO "ADICIONAR" (ABRIR JDIALOG PARA ATUALIZAR PRODUTO)
    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton23ActionPerformed
        janelaAdicionarProduto.jLabel5.setText(DaoProduto.totalOS());
        insertComboBox(janelaAdicionarProduto.CategoriaComboBox, "", daoProduto.categoria());
        janelaAdicionarProduto.setVisible(true);
        janelaAdicionarProduto.limpaCampos();
        
        if (janelaAdicionarProduto.att) {
            readTable(jTable5, daoProduto.read());
        }
    }// GEN-LAST:event_jButton23ActionPerformed

    // @JANELA_PRODUTO -> BOTÃO "EXCLUIR" (ABRIR JDIALOG PARA EXCLUIR PRODUTO"
    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton22ActionPerformed
        if (jTable5.getSelectedRow() != -1) {

            janelaExcluirProduto.jTable1.setValueAt(jTable5.getModel().getValueAt(jTable5.getSelectedRow(), 0).toString(), 0, 0);
            janelaExcluirProduto.jTable1.setValueAt(jTable5.getModel().getValueAt(jTable5.getSelectedRow(), 1).toString(), 0, 1);
            janelaExcluirProduto.jTable1.setValueAt(jTable5.getModel().getValueAt(jTable5.getSelectedRow(), 2).toString(), 0, 2);
            janelaExcluirProduto.jTable1.setValueAt(jTable5.getModel().getValueAt(jTable5.getSelectedRow(), 4).toString(), 0, 3);

            AlinhaCelula(janelaExcluirProduto.jTable1);

            janelaExcluirProduto.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum produto selecionado");
        }

        if (janelaExcluirProduto.att) {
            readTable(jTable5, daoProduto.read());
        }
    }// GEN-LAST:event_jButton22ActionPerformed

    // @JANELA_FUNCIONÁRIO -> BOTÃO "ATUALIZAR" (ABRIR JDIALOG PARA ATUALIZAR FUNCIONÁRIO)
    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton28ActionPerformed
        if (jTable6.getSelectedRow() != -1) { // Condicionlar para checar se foi selecionado um cliente ou nao
            // codigo, nome, email, cargo
            janelaAtualizarFuncionario.jLabel7.setText(jTable6.getValueAt(jTable6.getSelectedRow(), 0).toString());
            janelaAtualizarFuncionario.jTextField4.setText(jTable6.getValueAt(jTable6.getSelectedRow(), 1).toString());
            janelaAtualizarFuncionario.jTextField5.setText(jTable6.getValueAt(jTable6.getSelectedRow(), 2).toString());
            insertComboBox(janelaAtualizarFuncionario.jComboBox1, jTable6.getValueAt(jTable6.getSelectedRow(), 3).toString(), daoFuncionario.buscaCargo());

            janelaAtualizarFuncionario.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum(a) funcionário(a) selecionado(a)");
        }

        if (janelaAtualizarFuncionario.att) {
            readTable(jTable6, daoFuncionario.read());
        }
    }// GEN-LAST:event_jButton28ActionPerformed 

    // @JANELA_FUNCIONÁRIO -> BOTÃO "ADICIONAR" (ABRIR JDIALOG PARA ADICIONAR FUNCIONÁRIO)
    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton27ActionPerformed
        janelaAdicionarFuncionario.setVisible(true);
        janelaAdicionarFuncionario.limpaCampos();
        insertComboBox(janelaAdicionarFuncionario.cargoComboBox, "", daoFuncionario.buscaCargo());
        if (janelaAdicionarFuncionario.att) {
            readTable(jTable6, daoFuncionario.read());
        }
    }// GEN-LAST:event_jButton27ActionPerformed

    // @JANELA_FUNCIONÁRIO -> BOTÃO "EXCLUIR" (ABRIR JDIALOG PARA EXCLUIR FUNCIONÁRIO)
    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton26ActionPerformed
        if (jTable6.getSelectedRow() != -1) {
            AlinhaCelula(janelaExcluirFuncionario.jTable1);

            janelaExcluirFuncionario.jTable1.setValueAt(jTable6.getValueAt(jTable6.getSelectedRow(), 0), 0, 0);
            janelaExcluirFuncionario.jTable1.setValueAt(jTable6.getValueAt(jTable6.getSelectedRow(), 1), 0, 1);
            janelaExcluirFuncionario.jTable1.setValueAt(jTable6.getValueAt(jTable6.getSelectedRow(), 2), 0, 2);
            janelaExcluirFuncionario.jTable1.setValueAt(jTable6.getValueAt(jTable6.getSelectedRow(), 3), 0, 3);

            janelaExcluirFuncionario.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum(a) funcionário(a) selecionado(a)");
        }

        if (janelaExcluirFuncionario.att) {
            readTable(jTable6, daoFuncionario.read());
        }
    }// GEN-LAST:event_jButton26ActionPerformed

    // @JANELA_FUNCIONÁRIO -> ÁREA_TEXTO "BUSCAR"
    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField5FocusGained
        if (jTextField5.getText().equals("Procurar Funcionário")) {
            jTextField5.setText("");
            jTextField5.setForeground(Color.black);
        }
    }// GEN-LAST:event_jTextField5FocusGained

    // @JANELA_VENDER -> BOTÃO "ADICIONAR PRODUTO" (ABRIR JDIALOG PARA ADICIONAR PRODUTO AO PEDIDO DE VENDA)
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton7ActionPerformed
        janelaBuscarProduto.setVisible(true);

        janelaBuscarProduto.limpaCampos();
        if (!janelaBuscarProduto.produto.isEmpty()) {
            readTable(jTable1, janelaBuscarProduto.produto);
            calculaValor(jTable1, jFormattedTextField3);
        }

    }// GEN-LAST:event_jButton7ActionPerformed

    // @JANELA_VENDER -> BOTÃO "BUSCAR CLIENTE" (ABRIR JDIALOG PARA ADICIONAR CLIENTE AO PEDIDO DE VENDA)
    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton31ActionPerformed
        janelaBuscarCliente.setVisible(true);

        if (!janelaBuscarCliente.resposta.isBlank()) {
            jTextField1.setForeground(Color.BLACK);
            jTextField1.setText(janelaBuscarCliente.resposta);
        }

    }// GEN-LAST:event_jButton31ActionPerformed

    // @JANELA_VENDER -> BOTÃO "BUSCAR FUNCIONÁRIO" (ABRIR JDIALOG PARA ADICIONAR FUNCIONÁRIO AO PEDIDO DE VENDA)
    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton32ActionPerformed
        janelaBuscarFuncionario.setVisible(true);

        if (!janelaBuscarFuncionario.resposta.isBlank()) {
            jTextField6.setForeground(Color.BLACK);
            jTextField6.setText(janelaBuscarFuncionario.resposta);
        }

    }// GEN-LAST:event_jButton32ActionPerformed

    // @JANELA_CLIENTE -> BOTÃO "BUSCAR" (ATUALIZA JTABLE3 COM OS RESULTADOS DA PESQUISA)
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton14ActionPerformed
        if (daoCliente.search(jTextField3.getText()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado");
            readTable(jTable3, daoCliente.read());
        } else {
            readTable(jTable3, daoCliente.search(jTextField3.getText()));
        }
    }// GEN-LAST:event_jButton14ActionPerformed

    // @JANELA_PRODUTO -> BOTÃO "BUSCAR" (ATUALIZA JTABLE5 COM OS RESULTADOS DA PESQUISA)
    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton21ActionPerformed

        if (daoProduto.search(jTextField4.getText()).isEmpty()) {
            // Informa que nao encontrou um resultado para busca e mostra todas as informacoes
            JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado");
            readTable(jTable5, daoProduto.read());
        } else {
            // Informa na tabela o resultado da busca
            readTable(jTable5, daoProduto.search(jTextField4.getText()));
        }

        jTextField4.setText("Procurar Produto");
        jTextField4.setForeground(Color.LIGHT_GRAY);
    }// GEN-LAST:event_jButton21ActionPerformed

    // @JANELA_FUNCIONARO -> BOTÃO "BUSCAR" (ATUALIZA JTABLE6 COM OS RESULTADOS DA PESQUISA)
    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton25ActionPerformed
        if (daoFuncionario.search(jTextField5.getText()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado");
            readTable(jTable6, daoFuncionario.read());
        } else {
            readTable(jTable6, daoFuncionario.search(jTextField5.getText()));
        }

    }// GEN-LAST:event_jButton25ActionPerformed

    ////////////////////////////////////////////////////////////////////////////
// OBJETOS SQL
    public final DaoCliente daoCliente = new DaoCliente();
    public final DaoFuncionario daoFuncionario = new DaoFuncionario();
    public final DaoOS daoOS = new DaoOS();
    public final DaoProduto daoProduto = new DaoProduto();
    public final DaoVenda daoVenda = new DaoVenda();
    public final DaoServico daoServico = new DaoServico();
    public final DaoParticipa daoParticipa = new DaoParticipa();
    public final DaoRelatorio daoRelatorio = new DaoRelatorio();

    // OBJETOS JANELA
    public final JanelaAdicionarCliente janelaAdicionarCliente = new JanelaAdicionarCliente(this, true);
    public final JanelaAdicionarFuncionario janelaAdicionarFuncionario = new JanelaAdicionarFuncionario(this, true);
    public final JanelaAdicionarOS janelaAdicionarOS = new JanelaAdicionarOS(this, true);
    public final JanelaAdicionarProduto janelaAdicionarProduto = new JanelaAdicionarProduto(this, true);
    public final JanelaAdicionarServico janelaAdicionarServico = new JanelaAdicionarServico(this, true);

    public final JanelaAtualizarCliente janelaAtualizarCliente = new JanelaAtualizarCliente(this, true);
    public final JanelaAtualizarFuncionario janelaAtualizarFuncionario = new JanelaAtualizarFuncionario(this, true);
    public final JanelaAtualizarOS janelaAtualizarOS = new JanelaAtualizarOS(this, true);
    public final JanelaAtualizarProduto janelaAtualizarProduto = new JanelaAtualizarProduto(this, true);
    public final JanelaAtualizarServico janelaAtualizarServico = new JanelaAtualizarServico(this, true);

    public final JanelaBuscarCliente janelaBuscarCliente = new JanelaBuscarCliente(this, true);
    public final JanelaBuscarFuncionario janelaBuscarFuncionario = new JanelaBuscarFuncionario(this, true);
    public final JanelaBuscarProduto janelaBuscarProduto = new JanelaBuscarProduto(this, true);

    public final JanelaExcluirCliente janelaExcluirCliente = new JanelaExcluirCliente(this, true);
    public final JanelaExcluirFuncionario janelaExcluirFuncionario = new JanelaExcluirFuncionario(this, true);
    public final JanelaExcluirOS janelaExcluirOS = new JanelaExcluirOS(this, true);
    public final JanelaExcluirProduto janelaExcluirProduto = new JanelaExcluirProduto(this, true);
    public final JanelaExcluirServico janelaExcluirServico = new JanelaExcluirServico(this, true);

    public final JanelaDetalheOS janelaDetalheOS = new JanelaDetalheOS(null, true);
    public final JanelaDetalheVenda janelaDetalheVenda = new JanelaDetalheVenda(null, true);

    ////////////////////////////////////////////////////////////////////////////
    // FUNÇÕES GERAIS
    // FUNÇÃO PARA ABRIR UMA UM JDIALOG
    private void TrocaTela(JPanel janela, String cardNum) {
        CardLayout c1 = (CardLayout) janela.getLayout();
        c1.show(janela, cardNum);
    }

    // FUNÇÃO PARA DEIXAR OS VALORES CENTRALIZADOS NA TABELA
    public static void AlinhaCelula(JTable t) {

        DefaultTableModel m = (DefaultTableModel) t.getModel();
        DefaultTableCellRenderer a = new DefaultTableCellRenderer();

        a.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < m.getColumnCount(); i++) {
            t.getColumnModel().getColumn(i).setCellRenderer(a);
            t.getColumnModel().getColumn(i).setHeaderRenderer(a);

        }

    }

    // FUNÇÃO GERAL PARA BUSCAR TODOS OS VALORES NA TABELA
    public static void readTable(JTable t, ArrayList<String[]> s) {

        DefaultTableModel m = (DefaultTableModel) t.getModel();

        AlinhaCelula(t);
        t.setAutoCreateRowSorter(true);

        m.setNumRows(0);

        switch (t.getColumnCount()) {
            case 3:
                for (String[] i : s) {
                    m.addRow(new Object[]{i[0], i[1], i[2]});
                }
                break;
            case 4:
                for (String[] i : s) {
                    m.addRow(new Object[]{i[0], i[1], i[2], i[3]});
                }
                break;
            case 5:
                for (String[] i : s) {
                    m.addRow(new Object[]{i[0], i[1], i[2], i[3], i[4]});
                }
                break;
            case 6:
                for (String[] i : s) {
                    m.addRow(new Object[]{i[0], i[1], i[2], i[3], i[4], i[5]});
                }
                break;
            case 7:
                for (String[] i : s) {
                    m.addRow(new Object[]{i[0], i[1], i[2], i[3], i[4], i[5], i[6]});
                }
                break;
        }
    }

    // FUNÇÃO PARA INSERIR VALOR NO JCOMBOBOX DO JDIALOG
    public void insertComboBox(JComboBox j, String s, ArrayList<String> l) {
        JComboBox cb = new JComboBox(l.toArray());
        j.setModel(cb.getModel());
        cb.insertItemAt("-- Adicione uma categoria --", 0);
        cb.insertItemAt("", 1);
        j.setSelectedItem(s);
    }

    // FUNÇÃO PARA DEIXAR OS JTEXT_FIELD NO DEFAULT
    private void setTextDefault(JTextField j, String s) {
        j.setText(s);
        j.setForeground(Color.LIGHT_GRAY);
    }

    // FUNÇÃO PARA CALCULAR O VALOR TOTAL DAS TABELAS
    private void calculaValor(JTable j, JFormattedTextField t) {
        double valor = 0;

        for (int i = 0; i < j.getRowCount(); i++) {
            valor += Double.parseDouble(j.getValueAt(i, 3).toString()) * Double.parseDouble(j.getValueAt(i, 4).toString().substring(3).replace(",", "."));
        }

        System.out.println(valor);

        t.setValue(valor);
    }

    // FUNÇÃO PARA ADICIONAR VENDA NA TABELA
    private void adicionaVenda() {
        ModelVenda v = new ModelVenda();

        String[] aux = jTextField1.getText().split("-");
        v.setFk_cliente_cod_cs(Integer.parseInt(aux[0].trim()));

        aux = jTextField6.getText().split("-");
        v.setFk_funcionario_cod_fun(Integer.parseInt(aux[0].trim()));

        v.setValor_total(Double.parseDouble(jFormattedTextField3.getValue().toString()));
        v.setMetodo_pagamento(jComboBox1.getSelectedItem().toString());

        daoVenda.create(v);

        adicionaParticipa();
    }

    private void adicionaParticipa() {
        ArrayList<String[]> lista = new ArrayList();

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            String[] l = new String[3];
            l[0] = jTable1.getValueAt(i, 0).toString();
            l[1] = Integer.toString(daoVenda.getCodigoVenda());
            l[2] = jTable1.getValueAt(i, 3).toString();

            lista.add(l);
        }

        daoParticipa.create(lista);
    }

    private void detalheOS(int cod_os) {
        String[] s = daoRelatorio.abrirOS(cod_os);

        janelaDetalheOS.jLabel7.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 1).toString()); // Area cod_os
        janelaDetalheOS.jTextField6.setText(s[0]); // Area funcionario
        janelaDetalheOS.jTextField4.setText(s[1]); // Area cliente
        janelaDetalheOS.jTextField5.setText(s[2]); // Area problema
        janelaDetalheOS.jTextField1.setText(s[3]); // Metodo de pagamento
        janelaDetalheOS.jFormattedTextField3.setValue(Double.parseDouble(s[4])); // Valor total

        readTable(janelaDetalheOS.jTable1, daoRelatorio.listaServico(cod_os));
    }

    private void detalheVenda(int cod_vend) {
        String[] s = daoRelatorio.abrirVenda(cod_vend);

        janelaDetalheVenda.jLabel7.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 1).toString()); // Area cod_vend
        janelaDetalheVenda.jTextField6.setText(s[0]);
        janelaDetalheVenda.jTextField4.setText(s[1]);
        janelaDetalheVenda.jTextField1.setText(s[2]);
        janelaDetalheVenda.jFormattedTextField3.setValue(Double.parseDouble(s[3]));
        
        readTable(janelaDetalheVenda.jTable1, daoRelatorio.listaProdutos(cod_vend));
    }
    
    private void atualizaGrafico(LocalDate inicio, LocalDate fim) {
        System.out.println(inicio);
        System.out.println(fim);
        
        JPanel p = GraphUtils.createChartPanel(inicio, fim);
        p.setSize(jPanel4.getSize());
        p.setVisible(true);
        
        jPanel4.removeAll();
        jPanel4.revalidate();
        jPanel4.repaint();
        jPanel4.add(p, BorderLayout.CENTER);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaMain.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaMain.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaMain.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaMain.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ClienteScreen;
    private javax.swing.JPanel ConfigScreen;
    private javax.swing.JPanel FuncionarioScreen;
    private javax.swing.JPanel OsScreen;
    private javax.swing.JPanel ProdutoScreen;
    private javax.swing.JPanel RelatorioScreen;
    private javax.swing.JPanel ServicoScreen;
    private javax.swing.JPanel VenderScreen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    public javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    public javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    public javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private org.jfree.chart.encoders.KeypointPNGEncoderAdapter keypointPNGEncoderAdapter1;
    private org.jfree.chart.renderer.category.LineRenderer3D lineRenderer3D1;
    private org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1;
    // End of variables declaration//GEN-END:variables
}
