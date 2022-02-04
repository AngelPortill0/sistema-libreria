package interfaz;

import javax.swing.JOptionPane;

public class Venta extends javax.swing.JFrame {

  public Venta() {
    initComponents();
    setLocationRelativeTo(null);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    atras = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaVenta = new javax.swing.JTable();
    jLabel1 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    Tlibro = new javax.swing.JTextField();
    Tcliente = new javax.swing.JTextField();
    agregar = new javax.swing.JButton();
    editar = new javax.swing.JButton();
    eliminar = new javax.swing.JButton();
    buscar = new javax.swing.JButton();
    salir = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    atras.setText("Atrás");
    atras.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            atrasActionPerformed(evt);
          }
        });

    tablaVenta.setModel(
        new javax.swing.table.DefaultTableModel(
            new Object[][] {}, new String[] {"Libro", "Cliente"}) {

          boolean[] canEdit = new boolean[] {false, false};

          public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
          }
        });
    tablaVenta.addMouseListener(
        new java.awt.event.MouseAdapter() {
          public void mouseClicked(java.awt.event.MouseEvent evt) {
            tablaVentaMouseClicked(evt);
          }
        });
    jScrollPane1.setViewportView(tablaVenta);

    jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
    jLabel1.setText("VENTA");

    jLabel3.setText("Libro:");

    jLabel4.setText("Cliente:");

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
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout
                    .createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                layout
                                    .createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(386, 386, 386))
                            .addGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                layout
                                    .createSequentialGroup()
                                    .addComponent(atras)
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(salir)
                                    .addGap(329, 329, 329))))
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(
                                                layout
                                                    .createSequentialGroup()
                                                    .addGap(323, 323, 323)
                                                    .addGroup(
                                                        layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .TRAILING)
                                                            .addComponent(jLabel4)
                                                            .addComponent(jLabel3))
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .RELATED)
                                                    .addGroup(
                                                        layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING,
                                                                false)
                                                            .addComponent(Tlibro)
                                                            .addComponent(
                                                                Tcliente,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                100,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE)))
                                            .addGroup(
                                                layout
                                                    .createSequentialGroup()
                                                    .addGap(253, 253, 253)
                                                    .addComponent(agregar)
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .UNRELATED)
                                                    .addComponent(editar)
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .UNRELATED)
                                                    .addComponent(buscar)
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .UNRELATED)
                                                    .addComponent(eliminar)))
                                    .addGap(0, 248, Short.MAX_VALUE))
                            .addGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                layout
                                    .createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jScrollPane1)))
                    .addContainerGap()));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(
                                Tlibro,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(
                                Tcliente,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agregar)
                            .addComponent(eliminar)
                            .addComponent(editar)
                            .addComponent(buscar))
                    .addGap(18, 18, 18)
                    .addComponent(
                        jScrollPane1,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        222,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(atras)
                            .addComponent(salir))
                    .addContainerGap(19, Short.MAX_VALUE)));

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void tablaVentaMouseClicked(
      java.awt.event.MouseEvent evt) { // GEN-FIRST:event_tablaVentaMouseClicked
    int fila = tablaVenta.getSelectedRow();

    if (fila == -1) {
      JOptionPane.showMessageDialog(null, "Autor no seleccionado");
    } else {

    }
  } // GEN-LAST:event_tablaVentaMouseClicked

  private void eliminarActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_eliminarActionPerformed
    int seleccionado = tablaVenta.getSelectedRow();

    if (seleccionado == -1) {
      JOptionPane.showMessageDialog(null, "Debes seleccionar una fila");
    } else {
      try {

      } catch (Exception e) {

      }
    }
  } // GEN-LAST:event_eliminarActionPerformed

  private void salirActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_salirActionPerformed
    dispose();
  } // GEN-LAST:event_salirActionPerformed

  private void agregarActionPerformed(java.awt.event.ActionEvent evt) {
    String libro = Tlibro.getText();
    String cliente = Tcliente.getText();

    if (libro.equals("") || cliente.equals("")) {
      JOptionPane.showMessageDialog(null, "Los campos estan vacios!!!");
    } else {

    }
  }

  private void atrasActionPerformed(java.awt.event.ActionEvent evt) {
    General Venta = new General();
    Venta.setVisible(true);
    this.setVisible(false);
  }

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(
        () -> {
          new Venta().setVisible(true);
        });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField Tcliente;
  private javax.swing.JTextField Tlibro;
  private javax.swing.JButton agregar;
  private javax.swing.JButton atras;
  private javax.swing.JButton buscar;
  private javax.swing.JButton editar;
  private javax.swing.JButton eliminar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JButton salir;
  private javax.swing.JTable tablaVenta;
  // End of variables declaration//GEN-END:variables
}
