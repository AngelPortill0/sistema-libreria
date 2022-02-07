package interfaz;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class General extends javax.swing.JFrame {

  public General() {
    initComponents();
    setLocationRelativeTo(null);
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        book = new javax.swing.JButton();
        author = new javax.swing.JButton();
        genero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(189, 195, 199));

        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INICIO");

        book.setText("Libros");
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });

        author.setText("Autores");
        author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorActionPerformed(evt);
            }
        });

        genero.setText("Genero");
        genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    generoActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(Genero.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(author, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(exit)
                        .addGap(124, 124, 124))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(book)
                    .addComponent(author)
                    .addComponent(genero))
                .addGap(18, 18, 18)
                .addComponent(exit)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void generoActionPerformed(
      java.awt.event.ActionEvent evt) throws IOException { // GEN-FIRST:event_generoActionPerformed
    Genero General = new Genero();
    General.setVisible(true);
    this.setVisible(false);
  } // GEN-LAST:event_generoActionPerformed

  private void exitActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_exitActionPerformed
    dispose();
  } // GEN-LAST:event_exitActionPerformed

  private void bookActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_bookActionPerformed
    Libros General = new Libros();
    General.setVisible(true);
    this.setVisible(false);
  } // GEN-LAST:event_bookActionPerformed

  private void authorActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_authorActionPerformed
    Autores General = new Autores();
    General.setVisible(true);
    this.setVisible(false);
  } // GEN-LAST:event_authorActionPerformed

  public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(
        () -> {
          new General().setVisible(true);
        });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton author;
    private javax.swing.JButton book;
    private javax.swing.JToggleButton exit;
    private javax.swing.JButton genero;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
