package interfaz;

import dao.AutorDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Autor;

public class Autores extends javax.swing.JFrame {
    private String indiceAutorSeleccionado;
    
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
        agregar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        Tdeseleccionar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tbiografia = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel1.setText("AUTORES");

        tablaAutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Fecha de nacimiento", "Número de publicaciones", "Biografia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAutores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAutoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAutores);

        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
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
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        Tdeseleccionar.setText("Deseleccionar");
        Tdeseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TdeseleccionarActionPerformed(evt);
            }
        });

        Tbiografia.setColumns(20);
        Tbiografia.setLineWrap(true);
        Tbiografia.setRows(5);
        jScrollPane2.setViewportView(Tbiografia);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(atras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salir)
                .addGap(335, 335, 335))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Tpublicaciones, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addComponent(Tfnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Tnombre))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Tapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tdeseleccionar)
                .addGap(188, 188, 188))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tfnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Tpublicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(82, 82, 82)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar)
                    .addComponent(eliminar)
                    .addComponent(Tdeseleccionar)
                    .addComponent(editar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir)
                    .addComponent(atras))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TdeseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TdeseleccionarActionPerformed
    Tnombre.setText("");
    Tapellido.setText("");
    Tbiografia.setText("");
    Tfnacimiento.setText("");
    Tpublicaciones.setText("");
    tablaAutores.clearSelection();
    }//GEN-LAST:event_TdeseleccionarActionPerformed

  private void editarActionPerformed(
      java.awt.event.ActionEvent evt) {
      
      if (Integer.parseInt(indiceAutorSeleccionado) == -1){
          
          JOptionPane.showMessageDialog(null, "Debes seleccionar un autor");   
    } else {
          var aDAO = new AutorDAO();
          
          aDAO.editarAutor(
                  indiceAutorSeleccionado,
                  Tnombre.getText(),
                  Tapellido.getText(),
                  Tbiografia.getText(),
                  Tfnacimiento.getText(),
                  Integer.parseInt(Tpublicaciones.getText())
          );
          limpiarCampos();
          aDAO.listar(tablaAutores);
      }
  } 

  private void tablaAutoresMouseClicked(
      java.awt.event.MouseEvent evt) { // GEN-FIRST:event_tablaAutoresMouseClicked
  
      DefaultTableModel modelo = (DefaultTableModel) tablaAutores.getModel();
      int filaSeleccionada = tablaAutores.getSelectedRow();
      
      indiceAutorSeleccionado = modelo.getValueAt(filaSeleccionada, 0).toString();

      Tnombre.setText(modelo.getValueAt(filaSeleccionada, 1).toString());
      Tapellido.setText(modelo.getValueAt(filaSeleccionada, 2).toString());
      Tfnacimiento.setText(modelo.getValueAt(filaSeleccionada, 3).toString());
      Tpublicaciones.setText(modelo.getValueAt(filaSeleccionada, 4).toString());
      Tbiografia.setText(modelo.getValueAt(filaSeleccionada, 5).toString());
  }

  private void eliminarActionPerformed(
      java.awt.event.ActionEvent evt) {
      if (Integer.parseInt(indiceAutorSeleccionado) == -1) {
          JOptionPane.showMessageDialog(null, "Debes seleccionar una fila");
        } else {
          var autorDAO = new AutorDAO();
          autorDAO.eiminarAutor(Integer.parseInt(indiceAutorSeleccionado));
          limpiarCampos();
          autorDAO.listar(tablaAutores);
        }
  } 

  private void agregarActionPerformed(
      java.awt.event.ActionEvent evt) {
      
      if (Tnombre.getText().equals("")
        || Tapellido.getText().equals("")
        || Tfnacimiento.getText().equals("")
        || !(Tpublicaciones.getText().matches("^[1-9]\\d*$"))
        || Tbiografia.getText().equals("")) {

      JOptionPane.showMessageDialog(null, "Por favor compruebe que los datos ingresados son correctos");
    } else {
          
      Autor autor = new Autor(Tnombre.getText(), Tapellido.getText(),Tfnacimiento.getText(), Tbiografia.getText(), Integer.parseInt(Tpublicaciones.getText())); 
      AutorDAO aDAO = new AutorDAO();
    
      aDAO.agregarAutor(autor.getNombre(), autor.getApellido(), autor.getBiografia(), autor.getPublicaciones(), autor.getFnacimiento());
      limpiarCampos();
      aDAO.listar(tablaAutores); 
     
      }
  }
  
    private void limpiarCampos() {
        Tnombre.setText("");
        Tapellido.setText("");
        Tfnacimiento.setText("");
        Tbiografia.setText("");
        Tpublicaciones.setText("");
  }
  
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
    private javax.swing.JTextArea Tbiografia;
    private javax.swing.JButton Tdeseleccionar;
    private javax.swing.JTextField Tfnacimiento;
    private javax.swing.JTextField Tnombre;
    private javax.swing.JTextField Tpublicaciones;
    private javax.swing.JButton agregar;
    private javax.swing.JButton atras;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton salir;
    private javax.swing.JTable tablaAutores;
    // End of variables declaration//GEN-END:variables

}
