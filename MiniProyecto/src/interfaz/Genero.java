package interfaz;

import dao.GeneroDAO;
import javax.swing.JOptionPane;

public class Genero extends javax.swing.JFrame {

  public Genero() {
    initComponents();
    setLocationRelativeTo(null);
    GeneroDAO gDAO = new GeneroDAO();
    gDAO.listar(tablaGenero);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaGenero = new javax.swing.JTable();
    jLabel3 = new javax.swing.JLabel();
    Tgenero = new javax.swing.JTextField();
    agregar = new javax.swing.JButton();
    editar = new javax.swing.JButton();
    eliminar = new javax.swing.JButton();
    buscar = new javax.swing.JButton();
    atras1 = new javax.swing.JButton();
    salir = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
    jLabel1.setText("Genero");

    tablaGenero.setModel(
        new javax.swing.table.DefaultTableModel(new Object[][] {}, new String[] {"Genero"}));

    tablaGenero.addMouseListener(
        new java.awt.event.MouseAdapter() {
          public void mouseClicked(java.awt.event.MouseEvent evt) {
            tablaGeneroMouseClicked(evt);
          }
        });
    jScrollPane1.setViewportView(tablaGenero);

    jLabel3.setText("Genero:");

    agregar.setText("Agregar");
    agregar.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            agregarActionPerformed(evt);
          }
        });

    editar.setText("Editar");

    eliminar.setText("Eliminar");
    eliminar.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            eliminarActionPerformed(evt);
          }
        });

    buscar.setText("Buscar");

    atras1.setText("Atrás");
    atras1.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            atras1ActionPerformed(evt);
          }
        });

    salir.setText("Salir");
    salir.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            salirActionPerformed(evt);
          }
        });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                layout
                                    .createSequentialGroup()
                                    .addComponent(jScrollPane1)
                                    .addContainerGap())
                            .addGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                layout
                                    .createSequentialGroup()
                                    .addGap(0, 249, Short.MAX_VALUE)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout
                                                    .createSequentialGroup()
                                                    .addComponent(jLabel1)
                                                    .addGap(376, 376, 376))
                                            .addGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout
                                                    .createSequentialGroup()
                                                    .addGroup(
                                                        layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING)
                                                            .addGroup(
                                                                layout
                                                                    .createSequentialGroup()
                                                                    .addGap(93, 93, 93)
                                                                    .addComponent(jLabel3)
                                                                    .addPreferredGap(
                                                                        javax.swing.LayoutStyle
                                                                            .ComponentPlacement
                                                                            .RELATED)
                                                                    .addComponent(
                                                                        Tgenero,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE,
                                                                        100,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE)
                                                                    .addPreferredGap(
                                                                        javax.swing.LayoutStyle
                                                                            .ComponentPlacement
                                                                            .RELATED,
                                                                        84,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE))
                                                            .addGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .TRAILING,
                                                                layout
                                                                    .createSequentialGroup()
                                                                    .addComponent(agregar)
                                                                    .addPreferredGap(
                                                                        javax.swing.LayoutStyle
                                                                            .ComponentPlacement
                                                                            .UNRELATED)
                                                                    .addComponent(editar)
                                                                    .addPreferredGap(
                                                                        javax.swing.LayoutStyle
                                                                            .ComponentPlacement
                                                                            .UNRELATED)
                                                                    .addComponent(buscar)
                                                                    .addPreferredGap(
                                                                        javax.swing.LayoutStyle
                                                                            .ComponentPlacement
                                                                            .UNRELATED)
                                                                    .addComponent(eliminar)))
                                                    .addGap(246, 246, 246))))))
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout
                    .createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atras1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(salir)
                    .addGap(329, 329, 329)));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(
                                Tgenero,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agregar)
                            .addComponent(eliminar)
                            .addComponent(editar)
                            .addComponent(buscar))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(
                        jScrollPane1,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        249,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salir)
                            .addComponent(atras1))
                    .addContainerGap(17, Short.MAX_VALUE)));

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void tablaGeneroMouseClicked(
      java.awt.event.MouseEvent evt) { // GEN-FIRST:event_tablaGeneroMouseClicked
    int fila = tablaGenero.getSelectedRow();

    if (fila == -1) {
      JOptionPane.showMessageDialog(null, "Autor no seleccionado");
    } else {

    }
  } // GEN-LAST:event_tablaGeneroMouseClicked

  private void eliminarActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_eliminarActionPerformed
    int seleccionado = tablaGenero.getSelectedRow();

    if (seleccionado == -1) {
      JOptionPane.showMessageDialog(null, "Debes seleccionar una fila");
    } else {
      try {

      } catch (Exception e) {

      }
    }
  } // GEN-LAST:event_eliminarActionPerformed

  private void agregarActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_agregarActionPerformed
    String genero = Tgenero.getText();

    if (genero.equals("")) {
      JOptionPane.showMessageDialog(null, "Los campos estan vacios!!!");
    } else {

    }
  } // GEN-LAST:event_agregarActionPerformed

  private void atras1ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_atras1ActionPerformed
    General Genero = new General();
    Genero.setVisible(true);
    this.setVisible(false);
  } // GEN-LAST:event_atras1ActionPerformed

  private void salirActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_salirActionPerformed
    dispose();
  } // GEN-LAST:event_salirActionPerformed

  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info :
          javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(Genero.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Genero.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Genero.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Genero.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }
    // </editor-fold>

    java.awt.EventQueue.invokeLater(
        () -> {
          new Genero().setVisible(true);
        });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField Tgenero;
  private javax.swing.JButton agregar;
  private javax.swing.JButton atras1;
  private javax.swing.JButton buscar;
  private javax.swing.JButton editar;
  private javax.swing.JButton eliminar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JButton salir;
  private javax.swing.JTable tablaGenero;
  // End of variables declaration//GEN-END:variables
}
