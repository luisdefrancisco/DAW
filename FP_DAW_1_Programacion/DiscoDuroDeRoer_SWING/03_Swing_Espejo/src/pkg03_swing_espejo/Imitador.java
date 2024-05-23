/* VIDEO DEL EJERCICIO
 * https://www.youtube.com/watch?v=otpcr8YXZm0&list=PLaxZkGlLWHGXs8cv0EhPJHA1g6O2PFaZ4&index=3
 * LISTA DE TODOS LOS VIDEOS DiscoDurodeRoer
 * https://youtube.com/playlist?list=PLaxZkGlLWHGXs8cv0EhPJHA1g6O2PFaZ4&si=O4fH8KK0aW-CUVUZ
 */
package pkg03_swing_espejo;

/**
 *
 * @author Luis Martin de Francisco
 */
public class Imitador extends javax.swing.JFrame {

    
    public Imitador() {
        initComponents();
        // Para que los Radio buttons sean seleciones únicas:
            // Se arrastra un button group al panel NO SE VE NADA
            // Copiamos el nombre de abajo del button grupo y añadimos 
            // los Radio buton que estan enlazados
        buttonGroup1.add(this.rdb1Original);
        buttonGroup1.add(this.rdb2Original);
        buttonGroup1.add(this.rdb3Original);
        // Para el espejo hacemos lo mismo
        buttonGroup2.add(this.rdb1Espejo);
        buttonGroup2.add(this.rdb2Espejo);
        buttonGroup2.add(this.rdb3Espejo);

        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        rdb1Original = new javax.swing.JRadioButton();
        rdb2Original = new javax.swing.JRadioButton();
        rdb3Original = new javax.swing.JRadioButton();
        cbb4Original = new javax.swing.JCheckBox();
        cbb5Original = new javax.swing.JCheckBox();
        cbb6Original = new javax.swing.JCheckBox();
        txtOriginal = new javax.swing.JTextField();
        cbOriginal = new javax.swing.JComboBox<>();
        jsOriginal = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        rdb1Espejo = new javax.swing.JRadioButton();
        rdb2Espejo = new javax.swing.JRadioButton();
        rdb3Espejo = new javax.swing.JRadioButton();
        cbb4Espejo = new javax.swing.JCheckBox();
        cbb5Espejo = new javax.swing.JCheckBox();
        cbb6Espejo = new javax.swing.JCheckBox();
        txtEspejo = new javax.swing.JTextField();
        cbEspejo = new javax.swing.JComboBox<>();
        jsEspejo = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rdb1Original.setText("Opcion 1");
        rdb1Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb1OriginalActionPerformed(evt);
            }
        });

        rdb2Original.setText("Opcion 2");
        rdb2Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb2OriginalActionPerformed(evt);
            }
        });

        rdb3Original.setText("Opcion 3");
        rdb3Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb3OriginalActionPerformed(evt);
            }
        });

        cbb4Original.setText("Opcion 4");
        cbb4Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb4OriginalActionPerformed(evt);
            }
        });

        cbb5Original.setText("Opcion 5");
        cbb5Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb5OriginalActionPerformed(evt);
            }
        });

        cbb6Original.setText("Opcion 6");
        cbb6Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb6OriginalActionPerformed(evt);
            }
        });

        txtOriginal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOriginalKeyTyped(evt);
            }
        });

        cbOriginal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbOriginal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbOriginalItemStateChanged(evt);
            }
        });

        jsOriginal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsOriginalStateChanged(evt);
            }
        });

        rdb1Espejo.setText("Opcion 1");
        rdb1Espejo.setEnabled(false);

        rdb2Espejo.setText("Opcion 2");
        rdb2Espejo.setEnabled(false);

        rdb3Espejo.setText("Opcion 3");
        rdb3Espejo.setEnabled(false);

        cbb4Espejo.setText("Opcion 4");
        cbb4Espejo.setEnabled(false);

        cbb5Espejo.setText("Opcion 5");
        cbb5Espejo.setEnabled(false);

        cbb6Espejo.setText("Opcion 6");
        cbb6Espejo.setEnabled(false);

        txtEspejo.setEnabled(false);

        cbEspejo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbEspejo.setEnabled(false);

        jsEspejo.setEnabled(false);

        jLabel2.setText("ESPEJO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdb1Espejo)
                            .addComponent(rdb2Espejo)
                            .addComponent(rdb3Espejo))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbb4Espejo)
                            .addComponent(cbb5Espejo)
                            .addComponent(cbb6Espejo))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEspejo)
                            .addComponent(jsEspejo)
                            .addComponent(cbEspejo, 0, 133, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel2)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb1Espejo)
                    .addComponent(cbb4Espejo)
                    .addComponent(txtEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdb2Espejo)
                            .addComponent(cbb5Espejo)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(cbEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdb3Espejo)
                            .addComponent(cbb6Espejo)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jsEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jLabel1.setText("ORIGINAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdb1Original)
                    .addComponent(rdb2Original)
                    .addComponent(rdb3Original))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbb4Original)
                            .addComponent(cbb5Original)
                            .addComponent(cbb6Original))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtOriginal)
                            .addComponent(jsOriginal)
                            .addComponent(cbOriginal, 0, 133, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb1Original)
                    .addComponent(cbb4Original)
                    .addComponent(txtOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdb2Original)
                            .addComponent(cbb5Original)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(cbOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdb3Original)
                            .addComponent(cbb6Original)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jsOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdb1OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb1OriginalActionPerformed
        // Event - ActionPerformed
        this.rdb1Espejo.setSelected(this.rdb1Original.isSelected());
    }//GEN-LAST:event_rdb1OriginalActionPerformed

    private void rdb2OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb2OriginalActionPerformed
        this.rdb2Espejo.setSelected(this.rdb2Original.isSelected());
    }//GEN-LAST:event_rdb2OriginalActionPerformed

    private void rdb3OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb3OriginalActionPerformed
        this.rdb3Espejo.setSelected(this.rdb3Original.isSelected());
    }//GEN-LAST:event_rdb3OriginalActionPerformed

    private void cbb4OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb4OriginalActionPerformed
        // Event - ActionPerformed
        this.cbb4Espejo.setSelected(this.cbb4Original.isSelected());
    }//GEN-LAST:event_cbb4OriginalActionPerformed

    private void cbb5OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb5OriginalActionPerformed
        this.cbb5Espejo.setSelected(this.cbb5Original.isSelected());
    }//GEN-LAST:event_cbb5OriginalActionPerformed

    private void cbb6OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb6OriginalActionPerformed
        this.cbb6Espejo.setSelected(this.cbb6Original.isSelected());
    }//GEN-LAST:event_cbb6OriginalActionPerformed

    private void txtOriginalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOriginalKeyTyped
        // ESTE ES IMPORTANTE escojemos Keytyped. Va a ir escribiendo a medida que escribimos
        this.txtEspejo.setText(this.txtOriginal.getText());
    }//GEN-LAST:event_txtOriginalKeyTyped

    private void cbOriginalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbOriginalItemStateChanged
        // PARA EL COMBOBOX - Event - Item. Los combobox tienen indices
        // OJO con setSelectedIndex y getSelectedIndex
        this.cbEspejo.setSelectedIndex(this.cbOriginal.getSelectedIndex());
    }//GEN-LAST:event_cbOriginalItemStateChanged

    private void jsOriginalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsOriginalStateChanged
        // Para el Spinner (Subir y bajar) Event - Change - Change State
        this.jsEspejo.setValue((Integer)this.jsOriginal.getValue());
    }//GEN-LAST:event_jsOriginalStateChanged

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
            java.util.logging.Logger.getLogger(Imitador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Imitador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Imitador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Imitador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Imitador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbEspejo;
    private javax.swing.JComboBox<String> cbOriginal;
    private javax.swing.JCheckBox cbb4Espejo;
    private javax.swing.JCheckBox cbb4Original;
    private javax.swing.JCheckBox cbb5Espejo;
    private javax.swing.JCheckBox cbb5Original;
    private javax.swing.JCheckBox cbb6Espejo;
    private javax.swing.JCheckBox cbb6Original;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jsEspejo;
    private javax.swing.JSpinner jsOriginal;
    private javax.swing.JRadioButton rdb1Espejo;
    private javax.swing.JRadioButton rdb1Original;
    private javax.swing.JRadioButton rdb2Espejo;
    private javax.swing.JRadioButton rdb2Original;
    private javax.swing.JRadioButton rdb3Espejo;
    private javax.swing.JRadioButton rdb3Original;
    private javax.swing.JTextField txtEspejo;
    private javax.swing.JTextField txtOriginal;
    // End of variables declaration//GEN-END:variables
}
