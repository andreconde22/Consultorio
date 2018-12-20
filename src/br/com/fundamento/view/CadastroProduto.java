/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fundamento.view;

/**
 *
 * @author Glenda Alves de Lima
 */
public class CadastroProduto extends javax.swing.JFrame {

    /**
     * @return the txtFabricante
     */
    public javax.swing.JTextField getTxtFabricante() {
        return txtFabricante;
    }

    /**
     * @param txtFabricante the txtFabricante to set
     */
    public void setTxtFabricante(javax.swing.JTextField txtFabricante) {
        this.txtFabricante = txtFabricante;
    }

    /**
     * Creates new form CadastroProduto
     */
    public CadastroProduto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel28 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblnomeproduto = new javax.swing.JLabel();
        lblvalor = new javax.swing.JLabel();
        txtcnpj = new javax.swing.JFormattedTextField();
        txtnomeproduto = new javax.swing.JTextField();
        lblfornecedor = new javax.swing.JLabel();
        txtquantidade = new javax.swing.JFormattedTextField();
        lblquantidade = new javax.swing.JLabel();
        txtvalorunitario = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        txtFabricante = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listafornecedor = new javax.swing.JList<>();
        Botaonovo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Listestoque = new javax.swing.JList<>();
        BotaoSalvarProduto = new javax.swing.JButton();
        BotaoCancelarProduto = new javax.swing.JButton();
        labelproduto = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 134));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1160, 610));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Principal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblnomeproduto.setText("Nome do produto:");

        lblvalor.setText("Valor Unitário:");

        try {
            txtcnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcnpj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcnpjFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcnpjFocusLost(evt);
            }
        });
        txtcnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcnpjActionPerformed(evt);
            }
        });

        txtnomeproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeprodutoActionPerformed(evt);
            }
        });

        lblfornecedor.setText("CNPJ do Fornecedor:");

        txtquantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        lblquantidade.setText("Quantidade :");

        txtvalorunitario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtvalorunitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalorunitarioActionPerformed(evt);
            }
        });

        jLabel1.setText("Fabricante:");

        jLabel4.setText("Pesquisar Fornecedor:");

        jScrollPane1.setViewportView(listafornecedor);

        Botaonovo.setBackground(new java.awt.Color(255, 255, 255));
        Botaonovo.setForeground(new java.awt.Color(0, 0, 204));
        Botaonovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fundamento/resource/plus.png"))); // NOI18N
        Botaonovo.setText("Novo Fornecedor");

        jLabel2.setText("Estoque:");

        jScrollPane2.setViewportView(Listestoque);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lblnomeproduto))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(lblquantidade))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblfornecedor)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtcnpj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                .addComponent(txtquantidade, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtnomeproduto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblvalor))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtvalorunitario, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                            .addComponent(txtFornecedor, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(36, 36, 36)
                        .addComponent(Botaonovo)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnomeproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnomeproduto)
                    .addComponent(lblvalor)
                    .addComponent(txtvalorunitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblquantidade)
                    .addComponent(jLabel1)
                    .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfornecedor))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Botaonovo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        BotaoSalvarProduto.setBackground(new java.awt.Color(255, 255, 255));
        BotaoSalvarProduto.setForeground(new java.awt.Color(0, 0, 204));
        BotaoSalvarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fundamento/resource/tick.png"))); // NOI18N
        BotaoSalvarProduto.setText("Salvar");
        BotaoSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarProdutoActionPerformed(evt);
            }
        });

        BotaoCancelarProduto.setBackground(new java.awt.Color(255, 255, 255));
        BotaoCancelarProduto.setForeground(new java.awt.Color(0, 0, 204));
        BotaoCancelarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fundamento/resource/cross.png"))); // NOI18N
        BotaoCancelarProduto.setText("Cancelar");
        BotaoCancelarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarProdutoActionPerformed(evt);
            }
        });

        labelproduto.setFont(new java.awt.Font("Felix Titling", 0, 24)); // NOI18N
        labelproduto.setText("CADASTRO DE PRODUTO");

        jPanel6.setBackground(new java.awt.Color(0, 57, 69));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoSalvarProduto)
                .addGap(18, 18, 18)
                .addComponent(BotaoCancelarProduto)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelproduto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(908, Short.MAX_VALUE)
                    .addComponent(jLabel28)
                    .addGap(161, 161, 161)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(labelproduto)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoCancelarProduto)
                    .addComponent(BotaoSalvarProduto))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabel28)
                    .addContainerGap(462, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcnpjFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcnpjFocusGained

    }//GEN-LAST:event_txtcnpjFocusGained

    private void txtcnpjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcnpjFocusLost

    }//GEN-LAST:event_txtcnpjFocusLost

    private void txtcnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcnpjActionPerformed

    private void txtvalorunitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalorunitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalorunitarioActionPerformed

    private void BotaoCancelarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoCancelarProdutoActionPerformed

    private void BotaoSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoSalvarProdutoActionPerformed

    private void txtnomeprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeprodutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeprodutoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelarProduto;
    private javax.swing.JButton BotaoSalvarProduto;
    private javax.swing.JButton Botaonovo;
    private javax.swing.JList<String> Listestoque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelproduto;
    private javax.swing.JLabel lblfornecedor;
    private javax.swing.JLabel lblnomeproduto;
    private javax.swing.JLabel lblquantidade;
    private javax.swing.JLabel lblvalor;
    private javax.swing.JList<String> listafornecedor;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JFormattedTextField txtcnpj;
    private javax.swing.JTextField txtnomeproduto;
    private javax.swing.JFormattedTextField txtquantidade;
    private javax.swing.JFormattedTextField txtvalorunitario;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the BotaoCancelarProduto
     */
    public javax.swing.JButton getBotaoCancelarProduto() {
        return BotaoCancelarProduto;
    }

    /**
     * @param BotaoCancelarProduto the BotaoCancelarProduto to set
     */
    public void setBotaoCancelarProduto(javax.swing.JButton BotaoCancelarProduto) {
        this.BotaoCancelarProduto = BotaoCancelarProduto;
    }

    /**
     * @return the BotaoSalvarProduto
     */
    public javax.swing.JButton getBotaoSalvarProduto() {
        return BotaoSalvarProduto;
    }

    /**
     * @param BotaoSalvarProduto the BotaoSalvarProduto to set
     */
    public void setBotaoSalvarProduto(javax.swing.JButton BotaoSalvarProduto) {
        this.BotaoSalvarProduto = BotaoSalvarProduto;
    }

    /**
     * @return the Botaonovo
     */
    public javax.swing.JButton getBotaonovo() {
        return Botaonovo;
    }

    /**
     * @param Botaonovo the Botaonovo to set
     */
    public void setBotaonovo(javax.swing.JButton Botaonovo) {
        this.Botaonovo = Botaonovo;
    }

    /**
     * @return the jPanel1
     */
    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    /**
     * @param jPanel1 the jPanel1 to set
     */
    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    /**
     * @return the jScrollPane1
     */
    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    /**
     * @param jScrollPane1 the jScrollPane1 to set
     */
    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    /**
     * @return the lblfornecedor
     */
    public javax.swing.JLabel getLblfornecedor() {
        return lblfornecedor;
    }

    /**
     * @param lblfornecedor the lblfornecedor to set
     */
    public void setLblfornecedor(javax.swing.JLabel lblfornecedor) {
        this.lblfornecedor = lblfornecedor;
    }

    /**
     * @return the lblnomeproduto
     */
    public javax.swing.JLabel getLblnomeproduto() {
        return lblnomeproduto;
    }

    /**
     * @param lblnomeproduto the lblnomeproduto to set
     */
    public void setLblnomeproduto(javax.swing.JLabel lblnomeproduto) {
        this.lblnomeproduto = lblnomeproduto;
    }

    /**
     * @return the lblquantidade
     */
    public javax.swing.JLabel getLblquantidade() {
        return lblquantidade;
    }

    /**
     * @param lblquantidade the lblquantidade to set
     */
    public void setLblquantidade(javax.swing.JLabel lblquantidade) {
        this.lblquantidade = lblquantidade;
    }

    /**
     * @return the lblvalor
     */
    public javax.swing.JLabel getLblvalor() {
        return lblvalor;
    }

    /**
     * @param lblvalor the lblvalor to set
     */
    public void setLblvalor(javax.swing.JLabel lblvalor) {
        this.lblvalor = lblvalor;
    }

    /**
     * @return the listafornecedor
     */
    public javax.swing.JList<String> getListafornecedor() {
        return listafornecedor;
    }

    /**
     * @param listafornecedor the listafornecedor to set
     */
    public void setListafornecedor(javax.swing.JList<String> listafornecedor) {
        this.listafornecedor = listafornecedor;
    }

    /**
     * @return the txtFornecedor
     */
    public javax.swing.JTextField getTxtFornecedor() {
        return txtFornecedor;
    }

    /**
     * @param txtFornecedor the txtFornecedor to set
     */
    public void setTxtFornecedor(javax.swing.JTextField txtFornecedor) {
        this.txtFornecedor = txtFornecedor;
    }

    /**
     * @return the txtcnpj
     */
    public javax.swing.JFormattedTextField getTxtcnpj() {
        return txtcnpj;
    }

    /**
     * @param txtcnpj the txtcnpj to set
     */
    public void setTxtcnpj(javax.swing.JFormattedTextField txtcnpj) {
        this.txtcnpj = txtcnpj;
    }

    /**
     * @return the txtnomeproduto
     */
    public javax.swing.JTextField getTxtnomeproduto() {
        return txtnomeproduto;
    }

    /**
     * @param txtnomeproduto the txtnomeproduto to set
     */
    public void setTxtnomeproduto(javax.swing.JTextField txtnomeproduto) {
        this.txtnomeproduto = txtnomeproduto;
    }

    /**
     * @return the txtquantidade
     */
    public javax.swing.JFormattedTextField getTxtquantidade() {
        return txtquantidade;
    }

    /**
     * @param txtquantidade the txtquantidade to set
     */
    public void setTxtquantidade(javax.swing.JFormattedTextField txtquantidade) {
        this.txtquantidade = txtquantidade;
    }

    /**
     * @return the txtvalorunitario
     */
    public javax.swing.JFormattedTextField getTxtvalorunitario() {
        return txtvalorunitario;
    }

    /**
     * @param txtvalorunitario the txtvalorunitario to set
     */
    public void setTxtvalorunitario(javax.swing.JFormattedTextField txtvalorunitario) {
        this.txtvalorunitario = txtvalorunitario;
    }

    /**
     * @return the labelproduto
     */
    public javax.swing.JLabel getLabelproduto() {
        return labelproduto;
    }

    /**
     * @param labelproduto the labelproduto to set
     */
    public void setLabelproduto(javax.swing.JLabel labelproduto) {
        this.labelproduto = labelproduto;
    }

    /**
     * @return the Listestoque
     */
    public javax.swing.JList<String> getListestoque() {
        return Listestoque;
    }

    /**
     * @param Listestoque the Listestoque to set
     */
    public void setListestoque(javax.swing.JList<String> Listestoque) {
        this.Listestoque = Listestoque;
    }

    
}
