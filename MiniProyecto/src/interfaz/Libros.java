package interfaz;

import dao.LibroDAO;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Libros extends javax.swing.JFrame {
  private String indiceLibroSeleccionado;
  private int filaSeleccionada;
  
  public Libros() {
    initComponents();
    setLocationRelativeTo(null);
    
    cmbGenero.removeAllItems();
    cmbAutor.removeAllItems();
    
    var libroDAO = new LibroDAO();
    libroDAO.cargarLibros(tablaLibros);
    
    ArrayList<String> comboboxGeneros = libroDAO.cargarGeneros();
    for (Iterator<String> genero = comboboxGeneros.iterator(); genero.hasNext();) {
        cmbGenero.addItem(genero.next());
    }
    
    ArrayList<String> comboboxAutores = libroDAO.cargarAutores();
    for (Iterator<String> autor = comboboxAutores.iterator(); autor.hasNext();) {
        cmbAutor.addItem(autor.next());
    }
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLibros = new javax.swing.JTable();
        atras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Ttitulo = new javax.swing.JTextField();
        Tfpublicacion = new javax.swing.JTextField();
        Tisbn = new javax.swing.JTextField();
        Tnpublicacion = new javax.swing.JTextField();
        Tpuntuacion = new javax.swing.JTextField();
        Tprecio = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtArea = new javax.swing.JTextArea();
        btnDeseleccionar = new javax.swing.JButton();
        cmbGenero = new javax.swing.JComboBox<>();
        cmbAutor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel1.setText("LIBROS");

        tablaLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Libro", "Titulo", "ID Autor", "Autor", "Genero", "Fecha de publicación", "ISBN", "Número de páginas", "Puntuación", "Descripción", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaLibrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaLibros);

        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        jLabel3.setText("Titulo:");

        jLabel4.setText("Genero:");

        jLabel5.setText("Precio:");

        jLabel6.setText("Descripción:");

        jLabel7.setText("Fecha de publicación:");

        jLabel8.setText("Autor:");

        jLabel9.setText("ISBN:");

        jLabel10.setText("Número de páginas:");

        jLabel11.setText("Puntuación:");

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

        buscar.setText("Buscar");

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        TxtArea.setColumns(20);
        TxtArea.setLineWrap(true);
        TxtArea.setRows(5);
        jScrollPane2.setViewportView(TxtArea);

        btnDeseleccionar.setText("Deseleccionar");
        btnDeseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeseleccionarActionPerformed(evt);
            }
        });

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbAutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(292, 292, 292)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2)
                                    .addComponent(Tpuntuacion)
                                    .addComponent(Tnpublicacion)
                                    .addComponent(Tisbn)
                                    .addComponent(Tfpublicacion)
                                    .addComponent(Ttitulo)
                                    .addComponent(Tprecio, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(agregar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(editar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buscar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(eliminar))
                                    .addComponent(cmbGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbAutor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(atras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salir)
                        .addGap(356, 356, 356))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDeseleccionar)
                        .addGap(381, 381, 381))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Ttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Tfpublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(Tisbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Tnpublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(Tpuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar)
                    .addComponent(eliminar)
                    .addComponent(editar)
                    .addComponent(buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeseleccionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atras)
                    .addComponent(salir))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        if (Integer.parseInt(indiceLibroSeleccionado) == -1) {
          JOptionPane.showMessageDialog(null, "Debes seleccionar un libro");
        } else {
          String idLibroSeleccionado = tablaLibros.getModel().getValueAt(filaSeleccionada, 0).toString();
          var libroDAO = new LibroDAO();

          libroDAO.editarLibro(
                               idLibroSeleccionado,
                               Ttitulo.getText(),
                               cmbGenero.getSelectedItem().toString(),
                               Tfpublicacion.getText(),
                               Tisbn.getText(),
                                Integer.parseInt(Tnpublicacion.getText()),
                               Integer.parseInt(Tpuntuacion.getText()),
                               TxtArea.getText(),
                               Float.parseFloat(Tprecio.getText())
          );
          limpiarCampos();
          libroDAO.cargarLibros(tablaLibros);
        }
    }//GEN-LAST:event_editarActionPerformed

  private void btnDeseleccionarActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_btnDeseleccionarActionPerformed
        limpiarCampos();
  } // GEN-LAST:event_btnDeseleccionarActionPerformed

  private void tablaLibrosMouseClicked(
      java.awt.event.MouseEvent evt) { // GEN-FIRST:event_tablaLibrosMouseClicked
    DefaultTableModel modelo = (DefaultTableModel) tablaLibros.getModel();
    filaSeleccionada = tablaLibros.getSelectedRow();
    
    indiceLibroSeleccionado = modelo.getValueAt(filaSeleccionada, 0).toString();
    
    Ttitulo.setText(modelo.getValueAt(filaSeleccionada, 1).toString());
    
    cmbAutor.setSelectedItem(modelo.getValueAt(filaSeleccionada, 3).toString());
    cmbGenero.setSelectedItem(modelo.getValueAt(filaSeleccionada, 4).toString()); 
    
    Tfpublicacion.setText(modelo.getValueAt(filaSeleccionada, 5).toString());
    Tisbn.setText(modelo.getValueAt(filaSeleccionada, 6).toString());
    Tnpublicacion.setText(modelo.getValueAt(filaSeleccionada, 7).toString());
    Tpuntuacion.setText(modelo.getValueAt(filaSeleccionada, 8).toString());
    TxtArea.setText(modelo.getValueAt(filaSeleccionada, 9).toString());
    Tprecio.setText(modelo.getValueAt(filaSeleccionada, 10).toString());
  } // GEN-LAST:event_tablaLibrosMouseClicked

  private void eliminarActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_eliminarActionPerformed       
        if (Integer.parseInt(indiceLibroSeleccionado) == -1) {
          JOptionPane.showMessageDialog(null, "Debes seleccionar una fila");
        } else {
          var libroDAO = new LibroDAO();
          libroDAO.eliminarLibro(Integer.parseInt(indiceLibroSeleccionado));
          limpiarCampos();
          libroDAO.cargarLibros(tablaLibros);
        }
  } // GEN-LAST:event_eliminarActionPerformed

  private void agregarActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_agregarActionPerformed
    //    String titulo = Ttitulo.getText();
    //    String autor = Tautor.getText();
    //    String genero = Tgenero.getText();
    //    String fpublicacion = Tfpublicacion.getText();
    //    String isbn = Tisbn.getText();
    //    String publicacion = Tfpublicacion.getText();
    //    String puntuacion = Tnpublicacion.getText();
    //    String descripcion = Tdescripcion.getText();
    //    String precio = Tprecio.getText();
    //
    //    if (titulo.equals("")
    //        || autor.equals("")
    //        || genero.equals("")
    //        || fpublicacion.equals("")
    //        || isbn.equals("")
    //        || publicacion.equals("")
    //        || puntuacion.equals("")
    //        || descripcion.equals("")
    //        || precio.equals("")) {
    //      JOptionPane.showMessageDialog(null, "Los campos estan vacios!!!");
    //    } else {
    //
    //    }
  } // GEN-LAST:event_agregarActionPerformed

  private void salirActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_salirActionPerformed
    dispose();
  } // GEN-LAST:event_salirActionPerformed

  private void atrasActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_atrasActionPerformed
    General Libros = new General();
    Libros.setVisible(true);
    this.setVisible(false);
  } // GEN-LAST:event_atrasActionPerformed

  private void limpiarCampos() {
        Ttitulo.setText("");
        Tfpublicacion.setText("");
        Tisbn.setText("");
        Tnpublicacion.setText("");
        Tpuntuacion.setText("");
        TxtArea.setText("");
        Tprecio.setText("");
  }
  
  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(
        () -> {
          new Libros().setVisible(true);
        });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Tfpublicacion;
    private javax.swing.JTextField Tisbn;
    private javax.swing.JTextField Tnpublicacion;
    private javax.swing.JTextField Tprecio;
    private javax.swing.JTextField Tpuntuacion;
    private javax.swing.JTextField Ttitulo;
    private javax.swing.JTextArea TxtArea;
    private javax.swing.JButton agregar;
    private javax.swing.JButton atras;
    private javax.swing.JButton btnDeseleccionar;
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox<String> cmbAutor;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton salir;
    private javax.swing.JTable tablaLibros;
    // End of variables declaration//GEN-END:variables
}
