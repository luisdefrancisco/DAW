/* https://www.youtube.com/watch?v=iJmZ_lVkaEE Paso de Valores entre Formularios
*  https://www.youtube.com/watch?v=uBUpjXAHEJs Abrir JFrame en el centro de la pantalla
*  El de abajo es una lista completa de aplicacion con Swing
*  https://youtube.com/playlist?list=PLAlpGdBI2ecdumH8xmjF9czp-Leyz38jw&si=524IJ1T-_D4H4XKu
*  https://www.youtube.com/watch?v=Gw5C_exCLEg JDIalog modal, que significa = bloqueo de atras
*  https://www.youtube.com/watch?v=kH8aUAs4NFQ JDialog desde JFrame
*
*  https://www.youtube.com/watch?v=Fc4uFeMXBS8 Swing TODOCODE Bueno para empezar
*  https://www.youtube.com/watch?v=DAU0rDqcArs
*  https://www.youtube.com/watch?v=8ahuIJEOxf4 Agenda electronica TOTOCODE bueno
*/
package GUI;

import tarea10.*;

/**
 * @author Luis Martin de Francisco
 * CLASE PRINCIPAL DONDE INICIAREMOS 
 */
public class Principal extends javax.swing.JFrame {
    // VARIABLES GLOBALES
    // INSTANCIAMOS LOS COMICS de manera individual y mediante Constructor
    Comic cMaus = new Comic("Maus", "Maus Art Spiegelman narra la historia real de su padre, "
            + "\nVladek Spiegelman, judío polaco, durante la Segunda Guerra Mundial, "
            + "\nasí como las complicadas relaciones entre padre e hijo durante el proceso de "
            + "\nelaboración de la historieta, ya en Estados Unidos, donde llegaron los padres de Art "
            + "\ntras la guerra. La historia se desarrolla por una parte en Rego Park (Nueva York), "
            + "\ndonde Vladek Spiegelman cuenta su historia a su hijo Art, que está desarrollando un cómic. "
            + "\nY, en otro plano, se narra en los flash-backs de Vladek sobre sus vivencias durante la guerra. ");

    Comic cWatchmen = new Comic("Watchmen", "Watchmen es una serie compuesta de 12 números que "
            + "\nfueron publicados por DC Cómics durante 1986 y 1987. Alan Moore está a los mandos del guión, "
            + "\nmientras que Dave Gibbons se encarga del dibujo, y John Higgins como entintador. "
            + "\nEl contexto en el que ocurre los acontecimientos que se nos presentan en el cómic es "
            + "\ncasi tan importante como los acontecimientos en sí. Según nos cuenta el cómic, los superhéroes "
            + "\nsurgen a partir de 1938. A pesar de ser un cómic cuyos protagonistas se consideran superhéroes, lo "
            + "\ncierto es que sólo uno de ellos (el Doctor Manhattan) posee poderes. "
            + "\nLa acción principal ocurre en la década de 1980. La existencia de los superhéroes a afectado a "
            + "\nla vida normal hasta tal punto, que unos años antes de los acontecimientos que se nos cuentan, "
            + "\nse aprobó la ley que prohibe a los superhéroes (con excepción de dos de ellos, que continuan "
            + "\ntrabajando para el gobierno). Alan Moore utiliza esto para críticar el concepto de superhéroe. "
            + "\nMuestra de ellos son las continuas pintadas que aparecen en los escenarios con el lema "
            + "\n¿Quién vigila a los vigilantes?");

    Comic cFromHell = new Comic("From Hell", "Podríamos decir que From Hell es la obra maestra de "
            + "\nAlan Moore, considerado como el mejor escritor de cómics de la historia, y de Eddie Campbell, "
            + "\nel dibujante perfecto para esta obra, en la que se puede asistir a la representación definitiva "
            + "\ndel mito de Jack el Destripador así como una disección sin piedad de la sociedad victoriana.");

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnWatchmen = new javax.swing.JButton();
        btnMaus = new javax.swing.JButton();
        btnFromhell = new javax.swing.JButton();
        jlTituloventana = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnWatchmen.setIcon(new javax.swing.ImageIcon("D:\\FPDAW\\FP_DAW_1_Programacion\\02 DAW 2024 TAREAS PROGRAMACION\\TAREA 10\\WATCHMEN 173x250.jpg")); // NOI18N
        btnWatchmen.setMaximumSize(new java.awt.Dimension(173, 250));
        btnWatchmen.setMinimumSize(new java.awt.Dimension(173, 250));
        btnWatchmen.setName(""); // NOI18N
        btnWatchmen.setPreferredSize(new java.awt.Dimension(173, 250));
        btnWatchmen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWatchmenActionPerformed(evt);
            }
        });

        btnMaus.setIcon(new javax.swing.ImageIcon("D:\\FPDAW\\FP_DAW_1_Programacion\\02 DAW 2024 TAREAS PROGRAMACION\\TAREA 10\\MAUS 173x250.jpg")); // NOI18N
        btnMaus.setMaximumSize(new java.awt.Dimension(173, 250));
        btnMaus.setMinimumSize(new java.awt.Dimension(173, 250));
        btnMaus.setName(""); // NOI18N
        btnMaus.setPreferredSize(new java.awt.Dimension(173, 250));
        btnMaus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMausActionPerformed(evt);
            }
        });

        btnFromhell.setIcon(new javax.swing.ImageIcon("D:\\FPDAW\\FP_DAW_1_Programacion\\02 DAW 2024 TAREAS PROGRAMACION\\TAREA 10\\FROMHELL 173x250.jpg")); // NOI18N
        btnFromhell.setMaximumSize(new java.awt.Dimension(173, 250));
        btnFromhell.setMinimumSize(new java.awt.Dimension(173, 250));
        btnFromhell.setName(""); // NOI18N
        btnFromhell.setPreferredSize(new java.awt.Dimension(173, 250));
        btnFromhell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFromhellActionPerformed(evt);
            }
        });

        jlTituloventana.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jlTituloventana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTituloventana.setText("Los mejores comics europeos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(280, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnWatchmen, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149)
                        .addComponent(btnFromhell, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlTituloventana, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(279, 279, 279))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(btnMaus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(736, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jlTituloventana, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFromhell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWatchmen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(197, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(173, 173, 173)
                    .addComponent(btnMaus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(199, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMausActionPerformed
        // TODO add your handling code here:
        // Las Imágenes están en un botón 
        // ¿Podría hacerse con panel clickeable?
        // Los tres llevarán lo mismo: 
        Comic queComic = cMaus; //Variable local referenciada al Objeto MAUS para enviar a los otros frames
        
        // Creamos JDialog cuyo padre es this, modal true y pasamos el objeto queComic que recibirá el constructor
        JDPregunta vPregunta = new JDPregunta(this, true, queComic);
        vPregunta.setLocationRelativeTo(null); // Centra JDialog
        vPregunta.setVisible(true); // lo ponemos visible

    }//GEN-LAST:event_btnMausActionPerformed

    private void btnWatchmenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWatchmenActionPerformed
        // TODO add your handling code here:
        Comic queComic = cWatchmen;
        JDPregunta vPregunta = new JDPregunta(this, true, queComic);
        vPregunta.setLocationRelativeTo(null); // Centra JDialog
        vPregunta.setVisible(true);
    }//GEN-LAST:event_btnWatchmenActionPerformed

    private void btnFromhellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFromhellActionPerformed
        // TODO add your handling code here:
        Comic queComic = cFromHell;
        JDPregunta vPregunta = new JDPregunta(this, true, queComic);
        vPregunta.setLocationRelativeTo(null); // Centra JDialog
        vPregunta.setVisible(true);
    }//GEN-LAST:event_btnFromhellActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFromhell;
    private javax.swing.JButton btnMaus;
    private javax.swing.JButton btnWatchmen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlTituloventana;
    // End of variables declaration//GEN-END:variables
}
