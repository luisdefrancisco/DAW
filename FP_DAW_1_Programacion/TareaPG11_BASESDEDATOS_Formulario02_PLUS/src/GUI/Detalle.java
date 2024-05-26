package GUI;

import datos.AlbumDAO;
import domain.Album;
import java.util.List;

/**
 * @author Luis Martin de Francisco
 * JFRAME encargado de MOSTRAR EL DETALLE DEL Album que se pide mediante el numAlbum
 * Utilizamos una clase AlbumDAO encargada de manipular la insercion, borrado, etc
 * El manejo es a través de un ArrayList de tipo Album
 * Para ello se crea recorremos el ArrayList que contiene todo el contenido de la BBDD
 * y cuado coincida el numAlbum con el solicitado colocaremos la información en las cajas de texto
 */
public class Detalle extends javax.swing.JFrame {

    /**
     * Creates new form Detalle
     */
    public Detalle() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxtNumAlbumDetalles = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTxtAlbumDetalles = new javax.swing.JTextField();
        jTxtProtagonistasDetalles = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jBtnAlbumDetalles = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("De que Album deseas saber los detalles");

        jLabel2.setText("Numero de Album");

        jTxtNumAlbumDetalles.setPreferredSize(new java.awt.Dimension(64, 25));

        jLabel3.setText("Titulo");

        jLabel4.setText("Protagonistas");

        jTxtAlbumDetalles.setEditable(false);

        jTxtProtagonistasDetalles.setEditable(false);

        jButton1.setText("CERRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBtnAlbumDetalles.setText("BUSCAR");
        jBtnAlbumDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlbumDetallesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(107, 107, 107)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(131, 131, 131)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))))
                            .addGap(53, 53, 53)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxtAlbumDetalles)
                                    .addComponent(jTxtProtagonistasDetalles, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTxtNumAlbumDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(jBtnAlbumDetalles))))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtNumAlbumDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAlbumDetalles))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtAlbumDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtProtagonistasDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(jButton1)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBtnAlbumDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlbumDetallesActionPerformed
        // PARTE PARA PROBAR SELECT E IMPRIMIRLO
        AlbumDAO albumDao = new AlbumDAO();
        List<Album> albumes = albumDao.seleccionar();
        for (Album album : albumes) {
            if(Integer.parseInt(jTxtNumAlbumDetalles.getText()) == album.getIdAlbum()){
                jTxtAlbumDetalles.setText(album.getTitulo());
                jTxtProtagonistasDetalles.setText(album.getProtagonistas());
            }
        }
        
        
        
    }//GEN-LAST:event_jBtnAlbumDetallesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlbumDetalles;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTxtAlbumDetalles;
    private javax.swing.JTextField jTxtNumAlbumDetalles;
    private javax.swing.JTextField jTxtProtagonistasDetalles;
    // End of variables declaration//GEN-END:variables
}
