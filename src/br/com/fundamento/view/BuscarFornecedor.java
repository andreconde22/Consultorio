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
public class BuscarFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form BuscarConvenio
     */
    public BuscarFornecedor() {
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

        BotaoFecharFornecedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCoFornecedor = new javax.swing.JTable();
        txtPesquisarFornecedor = new javax.swing.JTextField();
        BotaoAdicionarFornecedor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 134));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1160, 500));

        BotaoFecharFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        BotaoFecharFornecedor.setForeground(new java.awt.Color(0, 0, 204));
        BotaoFecharFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fundamento/resource/cross.png"))); // NOI18N
        BotaoFecharFornecedor.setText("Fechar");

        TabelaCoFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null},
                {"", null, null},
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
                "Nome Fantasia", "Razao Social", "Cnpj"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaCoFornecedor.setRowHeight(25);
        TabelaCoFornecedor.setSelectionBackground(new java.awt.Color(153, 204, 255));
        TabelaCoFornecedor.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(TabelaCoFornecedor);

        BotaoAdicionarFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        BotaoAdicionarFornecedor.setForeground(new java.awt.Color(0, 0, 204));
        BotaoAdicionarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fundamento/resource/plus.png"))); // NOI18N
        BotaoAdicionarFornecedor.setText("Adicionar");
        BotaoAdicionarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAdicionarFornecedorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Felix Titling", 0, 24)); // NOI18N
        jLabel1.setText("BUSCAR FORNECEDOR");

        jLabel2.setText("Pesquisar:");

        jPanel1.setBackground(new java.awt.Color(0, 57, 69));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtPesquisarFornecedor)
                .addGap(33, 33, 33)
                .addComponent(BotaoAdicionarFornecedor)
                .addGap(42, 42, 42)
                .addComponent(BotaoFecharFornecedor)
                .addGap(33, 33, 33))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoFecharFornecedor)
                    .addComponent(BotaoAdicionarFornecedor)
                    .addComponent(txtPesquisarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoAdicionarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAdicionarFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoAdicionarFornecedorActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAdicionarFornecedor;
    private javax.swing.JButton BotaoFecharFornecedor;
    private javax.swing.JTable TabelaCoFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPesquisarFornecedor;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the BotaoAdicionarFornecedor
     */
    public javax.swing.JButton getBotaoAdicionarFornecedor() {
        return BotaoAdicionarFornecedor;
    }

    /**
     * @param BotaoAdicionarFornecedor the BotaoAdicionarFornecedor to set
     */
    public void setBotaoAdicionarFornecedor(javax.swing.JButton BotaoAdicionarFornecedor) {
        this.BotaoAdicionarFornecedor = BotaoAdicionarFornecedor;
    }

    

    /**
     * @return the BotaoFecharFornecedor
     */
    public javax.swing.JButton getBotaoFecharFornecedor() {
        return BotaoFecharFornecedor;
    }

    /**
     * @param BotaoFecharFornecedor the BotaoFecharFornecedor to set
     */
    public void setBotaoFecharFornecedor(javax.swing.JButton BotaoFecharFornecedor) {
        this.BotaoFecharFornecedor = BotaoFecharFornecedor;
    }

    

    /**
     * @return the TabelaCoFornecedor
     */
    public javax.swing.JTable getTabelaCoFornecedor() {
        return TabelaCoFornecedor;
    }

    /**
     * @param TabelaCoFornecedor the TabelaCoFornecedor to set
     */
    public void setTabelaCoFornecedor(javax.swing.JTable TabelaCoFornecedor) {
        this.TabelaCoFornecedor = TabelaCoFornecedor;
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
     * @return the txtPesquisarFornecedor
     */
    public javax.swing.JTextField getTxtPesquisarFornecedor() {
        return txtPesquisarFornecedor;
    }

    /**
     * @param txtPesquisarFornecedor the txtPesquisarFornecedor to set
     */
    public void setTxtPesquisarFornecedor(javax.swing.JTextField txtPesquisarFornecedor) {
        this.txtPesquisarFornecedor = txtPesquisarFornecedor;
    }

    

}
