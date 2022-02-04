package interfaz;

import dao.AutorDAO;
import javax.swing.JOptionPane;

public class Autores extends javax.swing.JFrame {

  public Autores() {
    initComponents();
    setLocationRelativeTo(null);
    AutorDAO aDAO = new AutorDAO();
    aDAO.listar(tablaAutores);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaAutores = new javax.swing.JTable();
    atras = new javax.swing.JButton();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    Tnombre = new javax.swing.JTextField();
    Tapellido = new javax.swing.JTextField();
    Tfnacimiento = new javax.swing.JTextField();
    Tpublicaciones = new javax.swing.JTextField();
    Tbiografia = new javax.swing.JTextField();
    agregar = new javax.swing.JButton();
    editar = new javax.swing.JButton();
    eliminar = new javax.swing.JButton();
    buscar = new javax.swing.JButton();
    salir = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
    jLabel1.setText("AUTORES");

    tablaAutores.setModel(
        new javax.swing.table.DefaultTableModel(
            new Object[][] {},
            new String[] {
              "Nombre", "Apellido", "Fecha de nacimiento", "Número de publicaciones", "Biografia"
            }) {
          boolean[] canEdit = new boolean[] {false, false, false, false, false};

          public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
          }
        });
    tablaAutores.addMouseListener(
        new java.awt.event.MouseAdapter() {
          public void mouseClicked(java.awt.event.MouseEvent evt) {
            tablaAutoresMouseClicked(evt);
          }
        });
    jScrollPane1.setViewportView(tablaAutores);

    atras.setText("Atrás");
    atras.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            atrasActionPerformed(evt);
          }
        });

    jLabel3.setText("Nombre:");

    jLabel4.setText("Apellido:");

    jLabel5.setText("Fechas de nacimiento:");

    jLabel6.setText("Número de publicaciones:");

    jLabel7.setText("Biografía:");

    agregar.setText("Agregar");
    agregar.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            agregarActionPerformed(evt);
          }
        });

    editar.setText("Editar");
    editar.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            editarActionPerformed(evt);
          }
        });

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
                layout
                    .createSequentialGroup()
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
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
                                                    .addGap(185, 185, 185)
                                                    .addComponent(
                                                        agregar,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        81,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .RELATED)
                                                    .addComponent(
                                                        editar,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        81,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .RELATED)
                                                    .addComponent(
                                                        buscar,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        81,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .RELATED)
                                                    .addComponent(
                                                        eliminar,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        81,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(
                                                layout
                                                    .createSequentialGroup()
                                                    .addGap(325, 325, 325)
                                                    .addComponent(atras)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(salir))
                                            .addGroup(
                                                layout
                                                    .createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(
                                                        layout
                                                            .createSequentialGroup()
                                                            .addGap(219, 219, 219)
                                                            .addGroup(
                                                                layout
                                                                    .createParallelGroup(
                                                                        javax.swing.GroupLayout
                                                                            .Alignment.TRAILING)
                                                                    .addComponent(jLabel4)
                                                                    .addComponent(jLabel3))
                                                            .addPreferredGap(
                                                                javax.swing.LayoutStyle
                                                                    .ComponentPlacement.RELATED)
                                                            .addGroup(
                                                                layout
                                                                    .createParallelGroup(
                                                                        javax.swing.GroupLayout
                                                                            .Alignment.TRAILING,
                                                                        false)
                                                                    .addComponent(
                                                                        Tnombre,
                                                                        javax.swing.GroupLayout
                                                                            .Alignment.LEADING,
                                                                        javax.swing.GroupLayout
                                                                            .DEFAULT_SIZE,
                                                                        253,
                                                                        Short.MAX_VALUE)
                                                                    .addComponent(
                                                                        Tapellido,
                                                                        javax.swing.GroupLayout
                                                                            .Alignment.LEADING)))
                                                    .addGroup(
                                                        layout
                                                            .createSequentialGroup()
                                                            .addGap(359, 359, 359)
                                                            .addComponent(jLabel1))
                                                    .addGroup(
                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                        layout
                                                            .createSequentialGroup()
                                                            .addContainerGap()
                                                            .addGroup(
                                                                layout
                                                                    .createParallelGroup(
                                                                        javax.swing.GroupLayout
                                                                            .Alignment.TRAILING)
                                                                    .addComponent(jLabel6)
                                                                    .addComponent(jLabel5)
                                                                    .addComponent(jLabel7))
                                                            .addPreferredGap(
                                                                javax.swing.LayoutStyle
                                                                    .ComponentPlacement.RELATED)
                                                            .addGroup(
                                                                layout
                                                                    .createParallelGroup(
                                                                        javax.swing.GroupLayout
                                                                            .Alignment.TRAILING,
                                                                        false)
                                                                    .addComponent(
                                                                        Tfnacimiento,
                                                                        javax.swing.GroupLayout
                                                                            .Alignment.LEADING,
                                                                        javax.swing.GroupLayout
                                                                            .DEFAULT_SIZE,
                                                                        253,
                                                                        Short.MAX_VALUE)
                                                                    .addComponent(
                                                                        Tpublicaciones,
                                                                        javax.swing.GroupLayout
                                                                            .Alignment.LEADING)
                                                                    .addComponent(
                                                                        Tbiografia,
                                                                        javax.swing.GroupLayout
                                                                            .Alignment.LEADING)))))
                                    .addGap(0, 292, Short.MAX_VALUE)))
                    .addContainerGap()));
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
                            .addComponent(
                                jLabel3,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                16,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                Tnombre,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(
                                Tapellido,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(
                                Tfnacimiento,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(
                                Tpublicaciones,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(
                                Tbiografia,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                56,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agregar)
                            .addComponent(
                                editar,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)
                            .addComponent(buscar)
                            .addComponent(eliminar))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(
                        jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(atras)
                            .addComponent(salir))
                    .addGap(49, 49, 49)));

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void editarActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_editarActionPerformed
    editar();
  } // GEN-LAST:event_editarActionPerformed

  private void tablaAutoresMouseClicked(
      java.awt.event.MouseEvent evt) { // GEN-FIRST:event_tablaAutoresMouseClicked
    int autor = tablaAutores.getSelectedRow();

    if (autor == -1) {
      JOptionPane.showMessageDialog(null, "Autor no seleccionado");
    } else {
      String Nombre = (String) tablaAutores.getValueAt(autor, 0);
      String Apellido = (String) tablaAutores.getValueAt(autor, 1);
      String Fnacimiento = (String) tablaAutores.getValueAt(autor, 2);
      String Npublicaciones = (String) tablaAutores.getValueAt(autor, 3);
      String Biografia = (String) tablaAutores.getValueAt(autor, 4);

      Tnombre.setText(Nombre);
      Tapellido.setText(Apellido);
      Tfnacimiento.setText(Fnacimiento);
      Tpublicaciones.setText(Npublicaciones);
      Tbiografia.setText(Biografia);
    }
  }

  void editar() {

    String Nombre = Tnombre.getText();
    String Apellido = Tapellido.getText();
    String Fnacimiento = Tfnacimiento.getText();
    String Npublicaciones = Tpublicaciones.getText();
    String Biografia = Tbiografia.getText();
    String sql =
        "update persona set Nombre = '"
            + Nombre
            + "', Apellido = '"
            + Apellido
            + "', Fecha de nacimiento = '"
            + Fnacimiento
            + "', Número de publicaciones = '"
            + Npublicaciones
            + "', Biografia = '"
            + Biografia
            + "'";

    if (Nombre.equals("")
        || Apellido.equals("")
        || Fnacimiento.equals("")
        || Npublicaciones.equals("")
        || Biografia.equals("")) {
      JOptionPane.showMessageDialog(null, "Debe introducir datos!!!");
    } else {
      try {

      } catch (Exception e) {
      }
    }
  }

  private void eliminarActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_eliminarActionPerformed
    eliminar();
  } // GEN-LAST:event_eliminarActionPerformed

  void eliminar() {

    int seleccionado = tablaAutores.getSelectedRow();

    if (seleccionado == -1) {
      JOptionPane.showMessageDialog(null, "Debes seleccionar una fila");
    } else {
      String sql = "delete from persona where Nombre=" + seleccionado;
      try {

        JOptionPane.showMessageDialog(null, "Autor eliminado satisfactoriamente");

      } catch (Exception e) {

      }
    }
  }

  private void agregarActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_agregarActionPerformed
    String nombre = Tnombre.getText();
    String apellido = Tapellido.getText();
    String fnacimiento = Tfnacimiento.getText();
    String publicaciones = Tpublicaciones.getText();
    String biografia = Tbiografia.getText();

    if (nombre.equals("")
        || apellido.equals("")
        || fnacimiento.equals("")
        || publicaciones.equals("")
        || biografia.equals("")) {
      JOptionPane.showMessageDialog(null, "Los campos estan vacios!!!");
    } else {
      String sql =
          "insert into persona(Nombre, Apellido, Fecha de nacimiento, Número de Publicaciones,"
              + " Biografia)values('"
              + nombre
              + "','"
              + apellido
              + "','"
              + fnacimiento
              + "','"
              + publicaciones
              + "','"
              + biografia
              + "')";
    }
  } // GEN-LAST:event_agregarActionPerformed

  private void salirActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_salirActionPerformed
    dispose();
  } // GEN-LAST:event_salirActionPerformed

  private void atrasActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_atrasActionPerformed
    General Autores = new General();
    Autores.setVisible(true);
    this.setVisible(false);
  } // GEN-LAST:event_atrasActionPerformed

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(
        () -> {
          new Autores().setVisible(true);
        });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField Tapellido;
  private javax.swing.JTextField Tbiografia;
  private javax.swing.JTextField Tfnacimiento;
  private javax.swing.JTextField Tnombre;
  private javax.swing.JTextField Tpublicaciones;
  private javax.swing.JButton agregar;
  private javax.swing.JButton atras;
  private javax.swing.JButton buscar;
  private javax.swing.JButton editar;
  private javax.swing.JButton eliminar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JButton salir;
  private javax.swing.JTable tablaAutores;
  // End of variables declaration//GEN-END:variables
}
