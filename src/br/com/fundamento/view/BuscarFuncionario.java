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
public class BuscarFuncionario extends javax.swing.JFrame {

    /**
     * @return the labelFuncionario
     */
    public javax.swing.JLabel getLabelFuncionario() {
        return labelFuncionario;
    }

    /**
     * @param labelFuncionario the labelFuncionario to set
     */
    public void setLabelFuncionario(javax.swing.JLabel labelFuncionario) {
        this.labelFuncionario = labelFuncionario;
    }

    /**
     * Creates new form BuscarFuncionario
     */
    public BuscarFuncionario() {
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

        txtPesquisar = new javax.swing.JTextField();
        BotaoAdicionarFuncionario = new javax.swing.JButton();
        BotaoFecharFuncionario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaFunionario = new javax.swing.JTable();
        labelFuncionario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 134));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1160, 500));

        BotaoAdicionarFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        BotaoAdicionarFuncionario.setForeground(new java.awt.Color(0, 0, 204));
        BotaoAdicionarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fundamento/resource/plus.png"))); // NOI18N
        BotaoAdicionarFuncionario.setText("Adicionar");
        BotaoAdicionarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAdicionarFuncionarioActionPerformed(evt);
            }
        });

        BotaoFecharFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        BotaoFecharFuncionario.setForeground(new java.awt.Color(0, 0, 204));
        BotaoFecharFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fundamento/resource/cross.png"))); // NOI18N
        BotaoFecharFuncionario.setText("Fechar");

        TabelaFunionario.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Salario", "Função", "Data Nascimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaFunionario.setRowHeight(25);
        TabelaFunionario.setSelectionBackground(new java.awt.Color(153, 204, 255));
        TabelaFunionario.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(TabelaFunionario);

        labelFuncionario.setFont(new java.awt.Font("Felix Titling", 0, 24)); // NOI18N
        labelFuncionario.setText("BUSCAR FUNCIONARIO");

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
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtPesquisar)
                .addGap(27, 27, 27)
                .addComponent(BotaoAdicionarFuncionario)
                .addGap(29, 29, 29)
                .addComponent(BotaoFecharFuncionario)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelFuncionario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelFuncionario)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoAdicionarFuncionario)
                    .addComponent(BotaoFecharFuncionario)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoAdicionarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAdicionarFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoAdicionarFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAdicionarFuncionario;
    private javax.swing.JButton BotaoFecharFuncionario;
    private javax.swing.JTable TabelaFunionario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFuncionario;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the BotaoAdicionarFuncionario
     */
    public javax.swing.JButton getBotaoAdicionarFuncionario() {
        return BotaoAdicionarFuncionario;
    }

    /**
     * @param BotaoAdicionarFuncionario the BotaoAdicionarFuncionario to set
     */
    public void setBotaoAdicionarFuncionario(javax.swing.JButton BotaoAdicionarFuncionario) {
        this.BotaoAdicionarFuncionario = BotaoAdicionarFuncionario;
    }


    /**
     * @return the BotaoFecharFuncionario
     */
    public javax.swing.JButton getBotaoFecharFuncionario() {
        return BotaoFecharFuncionario;
    }

    /**
     * @param BotaoFecharFuncionario the BotaoFecharFuncionario to set
     */
    public void setBotaoFecharFuncionario(javax.swing.JButton BotaoFecharFuncionario) {
        this.BotaoFecharFuncionario = BotaoFecharFuncionario;
    }

    

    /**
     * @return the TabelaFunionario
     */
    public javax.swing.JTable getTabelaFunionario() {
        return TabelaFunionario;
    }

    /**
     * @param TabelaFunionario the TabelaFunionario to set
     */
    public void setTabelaFunionario(javax.swing.JTable TabelaFunionario) {
        this.TabelaFunionario = TabelaFunionario;
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
     * @return the txtPesquisar
     */
    public javax.swing.JTextField getTxtPesquisar() {
        return txtPesquisar;
    }

    /**
     * @param txtPesquisar the txtPesquisar to set
     */
    public void setTxtPesquisar(javax.swing.JTextField txtPesquisar) {
        this.txtPesquisar = txtPesquisar;
    }
}
