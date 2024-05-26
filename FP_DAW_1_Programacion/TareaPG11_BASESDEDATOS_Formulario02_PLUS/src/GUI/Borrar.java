/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import datos.AlbumDAO;
import domain.Album;
import static java.lang.Integer.parseInt;
import java.util.List;

/**
 *
 * @author Luis Martin de Francisco
 * JFRAME encargado de BORRAR un Album a la BBDD
 * Utilizamos una clase AlbumDAO encargada de manipular la insercion, borrado, etc
 * El manejo es a través de un ArrayList de tipo Album
 * Para ello se crea una instancia de Album con el numAlbum pasado como argumento
 * al constructor de Album
 */
public class Borrar extends javax.swing.JFrame {

    /**
     * Creates new form Borrar
     */
    public Borrar() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxtidAlbumBorrar = new javax.swing.JTextField();
        jTxtMensajeBorrar = new javax.swing.JTextField();
        jBtnBorrarAlbum = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("Elige el album que quieres borrar de la base de datos");

        jLabel2.setText("Numero de Album");

        jTxtMensajeBorrar.setEditable(false);

        jBtnBorrarAlbum.setText("BORRAR");
        jBtnBorrarAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBorrarAlbumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addComponent(jTxtidAlbumBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jBtnBorrarAlbum))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jTxtMensajeBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtidAlbumBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBorrarAlbum))
                .addGap(28, 28, 28)
                .addComponent(jTxtMensajeBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnBorrarAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBorrarAlbumActionPerformed
        
        // PARTE PARA PROBAR-DELETE DE UN OBJETO ALBUM
        // Para BORRAR tenemos que crear una instancia de un solo album: albumDelete
        // La forma de seleccionarlo es mediante el idAlbum por lo que tenemos que instanciarlo
        // mediante un argumento que será recogido por el jTxtAlbumBorrar.
        // Despues tenemos que crear una instancia de AlbumDAO porque es la encargada de manejar
        // las operaciones de borrar, añadir, etc.
        AlbumDAO albumDao = new AlbumDAO(); // instancia de la clase más importante, la que maneja
        // todas las opciones de borrar, insertar, modificar, etc.
        // albumDelete es la instancia de un Album con id recogido del cuadro de texto
        Album albumDelete = new Album(Integer.parseInt(jTxtidAlbumBorrar.getText()));
        // Utilizaremos el objeto AlbumDAO que ya hemos utilizado antes
        albumDao.eliminar(albumDelete);
        this.dispose();
        
    }//GEN-LAST:event_jBtnBorrarAlbumActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBorrarAlbum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTxtMensajeBorrar;
    private javax.swing.JTextField jTxtidAlbumBorrar;
    // End of variables declaration//GEN-END:variables
}
