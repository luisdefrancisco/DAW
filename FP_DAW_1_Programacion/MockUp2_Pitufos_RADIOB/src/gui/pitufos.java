package gui;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Luis Martin de Francisco
 * Para EJERCICIO 2 poner Iconos en JLabel
 * https://www.youtube.com/watch?v=wdoiH4c44pA
 */
public class pitufos extends javax.swing.JFrame {
    public pitufos() {
            
        initComponents();
         // Para que los Radio buttons sean seleciones únicas:
         // Se arrastra un button group al panel NO SE VE NADA
         // Copiamos el nombre de abajo del button grupo y añadimos 
         // los Radio buton que estan enlazados
        buttonGroup1.add(this.jRadioPitufo1);
        buttonGroup1.add(this.jRadioPitufo2);
        buttonGroup1.add(this.jRadioPitufo3);
        buttonGroup1.add(this.jRadioPitufo4);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jRadioPitufo1 = new javax.swing.JRadioButton();
        jRadioPitufo2 = new javax.swing.JRadioButton();
        jRadioPitufo3 = new javax.swing.JRadioButton();
        jRadioPitufo4 = new javax.swing.JRadioButton();
        jTxtImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Ejemplo de uso de Botones Radiales");

        jRadioPitufo1.setText("Pitufo 1");
        jRadioPitufo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPitufo1ActionPerformed(evt);
            }
        });

        jRadioPitufo2.setText("Pitufo2");
        jRadioPitufo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPitufo2ActionPerformed(evt);
            }
        });

        jRadioPitufo3.setText("Pitufo 3");
        jRadioPitufo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPitufo3ActionPerformed(evt);
            }
        });

        jRadioPitufo4.setText("Pitufo 4");
        jRadioPitufo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPitufo4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioPitufo1)
                            .addComponent(jRadioPitufo2))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioPitufo3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioPitufo4)
                                .addGap(62, 62, 62)
                                .addComponent(jTxtImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioPitufo1)
                    .addComponent(jRadioPitufo3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioPitufo2)
                    .addComponent(jRadioPitufo4)
                    .addComponent(jTxtImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioPitufo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPitufo1ActionPerformed
        Icon miIcono = new ImageIcon(new ImageIcon(getClass().getResource("/icons/pitufo1.png")).getImage().getScaledInstance(jTxtImagen.getWidth(), jTxtImagen.getHeight(), 0));
        jTxtImagen.setIcon(miIcono);
    }//GEN-LAST:event_jRadioPitufo1ActionPerformed

    private void jRadioPitufo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPitufo2ActionPerformed
        // TODO add your handling code here:
        Icon miIcono = new ImageIcon(new ImageIcon(getClass().getResource("/icons/pitufo2.png")).getImage().getScaledInstance(jTxtImagen.getWidth(), jTxtImagen.getHeight(), 0));
        jTxtImagen.setIcon(miIcono);
    }//GEN-LAST:event_jRadioPitufo2ActionPerformed

    private void jRadioPitufo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPitufo3ActionPerformed
        // TODO add your handling code here:
        Icon miIcono = new ImageIcon(new ImageIcon(getClass().getResource("/icons/pitufo3.png")).getImage().getScaledInstance(jTxtImagen.getWidth(), jTxtImagen.getHeight(), 0));
        jTxtImagen.setIcon(miIcono);
    }//GEN-LAST:event_jRadioPitufo3ActionPerformed

    private void jRadioPitufo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPitufo4ActionPerformed
        // TODO add your handling code here:
        Icon miIcono = new ImageIcon(new ImageIcon(getClass().getResource("/icons/pitufo4.png")).getImage().getScaledInstance(jTxtImagen.getWidth(), jTxtImagen.getHeight(), 0));
        jTxtImagen.setIcon(miIcono);
    }//GEN-LAST:event_jRadioPitufo4ActionPerformed

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
            java.util.logging.Logger.getLogger(pitufos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pitufos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pitufos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pitufos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pitufos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioPitufo1;
    private javax.swing.JRadioButton jRadioPitufo2;
    private javax.swing.JRadioButton jRadioPitufo3;
    private javax.swing.JRadioButton jRadioPitufo4;
    private javax.swing.JLabel jTxtImagen;
    // End of variables declaration//GEN-END:variables
}
