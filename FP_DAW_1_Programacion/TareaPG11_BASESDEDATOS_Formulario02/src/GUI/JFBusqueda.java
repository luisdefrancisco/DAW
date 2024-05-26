
package GUI;

/*
 * @author Luis Martin de Francisco
 * Programa de prueba para conexión a una base de datos MySQL
 *
 * Se utiliza una clase constructora de la Base de Datos magos_del_humor ConstructorBaseMagos.java
 * Se crea un JFrame para interacturar con la BBDD. Para ello se crea un Buscador por el número
 * del album. Desplegará el título y los protagonistas.
 * En esta clase Main, se instancia el Constructor de la BBDD y se arranca el JFrame
 *
 * Presupone que el servidor de base de datos está arrancado (se usa XAMPP), disponible,
 * en el puerto por defecto 80, 443 y MySQL en 3306
 * El usuario y el password de conexión con la base de datos debe cambiarse por el 
 * adecuado a nuestras necesidades
 *
 * En el ConstructorBaseMagos.java ---->
 *    - Al añadir el código que borra la base de datos, hace que no sea necesario haber definido
 *      previamente la estructura de la misma, puesto que todo el control del programa está ahora
 *      en el lado del lenguaje anfitrión. Sin embargo, sí es necesario que haya sido definida para 
 *      que no nos dé problemas la primera vez puesto que no hay nada que borrar.
      - Se le añaden directamente 5 entradas para que puedan ser consultadas
 * 
 * Creamos una base de datos "magos_del_humor" tiene  una tabla de "albumes" con tres campos, 
 * de esta manera:
 *      numAlbum (INT 11 PK) ->(numero del album) 
 *      nombAlbum (VARCHAR 50 NULL)
 *      protagonistas (VARCHAR 25 NULL)
 * 
 * MIS APUNTES:
 * - tenemos que arrancar XAMPP
 * - Incorporar la Librería mysql-connector-java-8.0.19.jar
 * - importar todo lo de abajo 
 * - mucho cuidado con los nombres y demás
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Luis Martin de Francisco
 */



public class JFBusqueda extends javax.swing.JFrame {

    /**
     * Creates new form JFBusqueda
     */
    public JFBusqueda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtNumalb1 = new javax.swing.JTextField();
        jTextNumalb2 = new javax.swing.JTextField();
        jTextTitulo = new javax.swing.JTextField();
        jTextProtagonistas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Búsqueda en Base de Datos Magos del Humor");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Número de album");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Número de album");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Título del Album");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Protagonistas del album");

        jTextNumalb2.setEditable(false);

        jTextTitulo.setEditable(false);

        jTextProtagonistas.setEditable(false);

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Búsqueda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextTitulo)
                            .addComponent(jTextProtagonistas)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jTextNumalb2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtNumalb1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 200, Short.MAX_VALUE)))))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtNumalb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextNumalb2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextProtagonistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(281, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //////// PARTE MÁS IMPORTANTE DEL PROGRAMA /////
        /////// ACTUAMOS SOBRE EL BOTON //////
        
        // Para facilitar, manejaremos variables locales donde almacenaremos las consultas
        int numeroAlbum;
        int numeroBusqueda;
        String numeroTextoBusqueda;
        
        ///// VAMOS A CREAR LA CONEXIÓN CON LA BBDD ///////
        // Hay que meterlo en un try por posibles errores de MySQL
        try
        { // Registramos el Driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost/magos_del_humor", "root", "");
            // Creamos un Statement, para realizar la consulta declarando que pueda actualizarse
            Statement s=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                    ResultSet.CONCUR_UPDATABLE);
            // Ahora haremos una consulta (Query) para ver que es lo que tiene
            ResultSet rs=s.executeQuery("SELECT * FROM albumes");
            
            // Parte IMPORTANTE //
            // antes de recorrer la BBDD colocamos los campos vacíos
            this.jTextNumalb2.setText("");
            this.jTextTitulo.setText("");
            this.jTextProtagonistas.setText("");
             numeroTextoBusqueda = this.jTxtNumalb1.getText();
             numeroBusqueda = Integer.parseInt(numeroTextoBusqueda);
             
             
            // BUSCAMOS EN LA BASE MIENTRAS HAYA REGISTROS
            while(rs.next()){
             numeroAlbum = rs.getInt("numAlbum");
             
             // Condicional para comprobar si el numAlbum existe en la base de datos
             // Si se cumple, insertamos en las cajas de texto el contenido de la info
             if(numeroAlbum == numeroBusqueda){
                this.jTextNumalb2.setText(this.jTxtNumalb1.getText());
                this.jTextTitulo.setText(rs.getString(2));
                this.jTextProtagonistas.setText(rs.getString(3));
                } 
            }
            // Cerramos la conexión después del while
            con.close();
        } catch (Exception ex){
            /////////  Manejamos el error sin hacer nada
            //System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextNumalb2;
    private javax.swing.JTextField jTextProtagonistas;
    private javax.swing.JTextField jTextTitulo;
    private javax.swing.JTextField jTxtNumalb1;
    // End of variables declaration//GEN-END:variables
}
