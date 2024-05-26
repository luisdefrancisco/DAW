package GUI;

import datos.AlbumDAO;
import domain.Album;
import java.util.List;

/**
 * @author Luis Martin de Francisco
 * JFRAME encargado de AÑADIR un nuevo Album a la BBDD
 * Utilizamos una clase AlbumDAO encargada de manipular la insercion, borrado, etc
 * El manejo es a través de un ArrayList de tipo Album
 * Para ello se crea una instancia de Album con todos los datos pasandolos como argumentos
 * al constructor de Album
 */
public class Annadir extends javax.swing.JFrame {

    /**
     * Creates new form Annadir
     */
    public Annadir() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTxtNumAlbumAnnadir = new javax.swing.JTextField();
        jTxtTituloAlbumAnnadir = new javax.swing.JTextField();
        jTxtProtagonistasAlbumAnnadir = new javax.swing.JTextField();
        jBtnAlbumAnnadir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("Introduce los datos del album que quieres añadir");

        jLabel2.setText("Numero de Album");

        jLabel3.setText("Título");

        jLabel4.setText("Protagonistas");

        jBtnAlbumAnnadir.setText("AÑADIR");
        jBtnAlbumAnnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlbumAnnadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBtnAlbumAnnadir)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(208, 208, 208)
                                    .addComponent(jLabel4))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(75, 75, 75)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxtNumAlbumAnnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTxtTituloAlbumAnnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTxtProtagonistasAlbumAnnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtNumAlbumAnnadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtTituloAlbumAnnadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtProtagonistasAlbumAnnadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBtnAlbumAnnadir)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAlbumAnnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlbumAnnadirActionPerformed
        // INSTANCIAMOS UN OBJETO DE TIPO AlbumDAO
        AlbumDAO albumDao = new AlbumDAO(); // instancia de la clase más importante, la que maneja
        
        // INSTANCIAMOS UN OBJETO DE TIPO Album que se basará en los datos recogidos en las cajas de texto
        Album albumAnnadir = new Album(Integer.parseInt(jTxtNumAlbumAnnadir.getText()),
                jTxtTituloAlbumAnnadir.getText(),
                jTxtProtagonistasAlbumAnnadir.getText());
        // Utilizaremos el objeto albumDao que ya hemos utilizado antes
        albumDao.insertar(albumAnnadir);
        this.dispose();

    }//GEN-LAST:event_jBtnAlbumAnnadirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlbumAnnadir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTxtNumAlbumAnnadir;
    private javax.swing.JTextField jTxtProtagonistasAlbumAnnadir;
    private javax.swing.JTextField jTxtTituloAlbumAnnadir;
    // End of variables declaration//GEN-END:variables
}
