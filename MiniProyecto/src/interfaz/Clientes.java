package interfaz;

import javax.swing.JOptionPane;

public class Clientes extends javax.swing.JFrame {

  public Clientes() {
    initComponents();
    setLocationRelativeTo(null);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    buttonGroup1 = new javax.swing.ButtonGroup();
    jLabel1 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaClientes = new javax.swing.JTable();
    atras = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    Tci = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    Ttelefono = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    Tdireccion = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    Tnombre = new javax.swing.JTextField();
    Tapellido = new javax.swing.JTextField();
    TFnacimiento = new javax.swing.JTextField();
    agregar = new javax.swing.JButton();
    editar = new javax.swing.JButton();
    eliminar = new javax.swing.JButton();
    buscar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
    jLabel1.setText("CLIENTES");

    tablaClientes.setModel(
        new javax.swing.table.DefaultTableModel(
            new Object[][] {
              {null, null, null, null, null, null},
              {null, null, null, null, null, null},
              {null, null, null, null, null, null},
              {null, null, null, null, null, null}
            },
            new String[] {
              "Nombre",
              "Apellido",
              "Fecha de nacimiento",
              "Cédula",
              "Número de teléfono",
              "Dirección"
            }));
    jScrollPane1.setViewportView(tablaClientes);

    atras.setText("Atrás");
    atras.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            atrasActionPerformed(evt);
          }
        });

    jLabel2.setText("Cédula de identidad:");

    jLabel3.setText("Número de teléfono:");

    Ttelefono.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            TtelefonoActionPerformed(evt);
          }
        });

    jLabel4.setText("Dirección:");

    jLabel6.setText("Nombre:");

    jLabel7.setText("Apellido:");

    jLabel8.setText("Fecha de nacimiento:");

    agregar.setText("Agregar");
    agregar.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            agregarActionPerformed(evt);
          }
        });

    editar.setText("Editar");

    eliminar.setText("Eliminar");

    buscar.setText("Buscar");

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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGap(371, 371, 371)
                                    .addComponent(jLabel1)
                                    .addGap(0, 367, Short.MAX_VALUE)))
                    .addContainerGap())
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addGap(279, 279, 279)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(
                                                jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(
                                                jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(
                                                layout
                                                    .createSequentialGroup()
                                                    .addGap(56, 56, 56)
                                                    .addComponent(jLabel4)))
                                    .addGap(3, 3, 3)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(
                                                Ttelefono,
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Tdireccion)
                                            .addComponent(
                                                Tci,
                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                100,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Tnombre)
                                            .addComponent(Tapellido)
                                            .addComponent(
                                                TFnacimiento,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                100,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                    .addComponent(agregar)
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(editar)
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(buscar)
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(eliminar)
                                    .addGap(253, 253, 253))
                            .addGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                layout
                                    .createSequentialGroup()
                                    .addComponent(atras)
                                    .addGap(370, 370, 370)))));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(
                                Tnombre,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(
                                Tapellido,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(
                                TFnacimiento,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(
                                Tci,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(
                                Ttelefono,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(
                                Tdireccion,
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
                    .addGap(18, 18, 18)
                    .addComponent(
                        jScrollPane1,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        144,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(atras)
                    .addGap(30, 30, 30)));

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void agregarActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_agregarActionPerformed
    Agregar();
  } // GEN-LAST:event_agregarActionPerformed

  private void Agregar() {
    String nombre = Tnombre.getText();
    String apellido = Tapellido.getText();
    String fnacimiento = TFnacimiento.getText();
    String ci = Tci.getText();
    String Ntelefono = Ttelefono.getText();
    String direccion = Tdireccion.getText();

    if (nombre.equals("")
        || apellido.equals("")
        || fnacimiento.equals("")
        || ci.equals("")
        || Ntelefono.equals("")
        || direccion.equals("")) {
      JOptionPane.showMessageDialog(null, "Los campos estan vacios!!!");
    } else {

    }
  }

  private void TtelefonoActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_TtelefonoActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_TtelefonoActionPerformed

  private void atrasActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_atrasActionPerformed
    General Clientes = new General();
    Clientes.setVisible(true);
    this.setVisible(false);
  } // GEN-LAST:event_atrasActionPerformed

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(
        () -> {
          new Clientes().setVisible(true);
        });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField TFnacimiento;
  private javax.swing.JTextField Tapellido;
  private javax.swing.JTextField Tci;
  private javax.swing.JTextField Tdireccion;
  private javax.swing.JTextField Tnombre;
  private javax.swing.JTextField Ttelefono;
  private javax.swing.JButton agregar;
  private javax.swing.JButton atras;
  private javax.swing.JButton buscar;
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.JButton editar;
  private javax.swing.JButton eliminar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tablaClientes;
  // End of variables declaration//GEN-END:variables
}
