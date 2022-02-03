package interfaz;

public class Autores extends javax.swing.JFrame {

  public Autores() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    atras = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    Tid = new javax.swing.JTextField();
    jLabel7 = new javax.swing.JLabel();
    Tnombre = new javax.swing.JTextField();
    Tapellido = new javax.swing.JTextField();
    Tfecha = new javax.swing.JTextField();
    Tpublicaciones = new javax.swing.JTextField();
    Tbiografia = new javax.swing.JTextField();
    agregar = new javax.swing.JToggleButton();
    editar = new javax.swing.JToggleButton();
    eliminar = new javax.swing.JToggleButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
    jLabel1.setText("AUTORES");

    jTable1.setModel(
        new javax.swing.table.DefaultTableModel(
            new Object[][] {
              {null, null, null, null, null, null},
              {null, null, null, null, null, null},
              {null, null, null, null, null, null},
              {null, null, null, null, null, null}
            },
            new String[] {
              "ID",
              "Nombre",
              "Apellido",
              "Fecha de nacimiento",
              "Número de publicaciones",
              "Biografia"
            }));
    jScrollPane1.setViewportView(jTable1);

    atras.setText("Atrás");
    atras.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            atrasActionPerformed(evt);
          }
        });

    jLabel2.setText("ID:");

    jLabel3.setText("Nombre:");

    jLabel4.setText("Apellido:");

    jLabel5.setText("Fechas de nacimiento:");

    jLabel6.setText("Número de publicaciones:");

    Tid.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            TidActionPerformed(evt);
          }
        });

    jLabel7.setText("Biografía:");

    agregar.setText("Agregar");

    editar.setText("Editar");

    eliminar.setText("Eliminar");
    eliminar.setToolTipText("");

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
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGap(185, 185, 185)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(
                                                layout
                                                    .createSequentialGroup()
                                                    .addGap(174, 174, 174)
                                                    .addComponent(jLabel1))
                                            .addGroup(
                                                layout
                                                    .createSequentialGroup()
                                                    .addGroup(
                                                        layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .TRAILING)
                                                            .addComponent(jLabel7)
                                                            .addGroup(
                                                                layout
                                                                    .createParallelGroup(
                                                                        javax.swing.GroupLayout
                                                                            .Alignment.LEADING)
                                                                    .addComponent(jLabel6)
                                                                    .addComponent(
                                                                        jLabel5,
                                                                        javax.swing.GroupLayout
                                                                            .Alignment.TRAILING)
                                                                    .addComponent(
                                                                        jLabel4,
                                                                        javax.swing.GroupLayout
                                                                            .Alignment.TRAILING)
                                                                    .addComponent(
                                                                        jLabel3,
                                                                        javax.swing.GroupLayout
                                                                            .Alignment.TRAILING)
                                                                    .addComponent(
                                                                        jLabel2,
                                                                        javax.swing.GroupLayout
                                                                            .Alignment.TRAILING)))
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .RELATED)
                                                    .addGroup(
                                                        layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .TRAILING,
                                                                false)
                                                            .addComponent(
                                                                Tnombre,
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING,
                                                                javax.swing.GroupLayout
                                                                    .DEFAULT_SIZE,
                                                                253,
                                                                Short.MAX_VALUE)
                                                            .addComponent(
                                                                Tapellido,
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING)
                                                            .addComponent(
                                                                Tfecha,
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING)
                                                            .addComponent(
                                                                Tpublicaciones,
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING)
                                                            .addComponent(
                                                                Tbiografia,
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING)
                                                            .addComponent(Tid)))))
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGap(362, 362, 362)
                                    .addComponent(atras)))
                    .addContainerGap(243, Short.MAX_VALUE))
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout
                    .createSequentialGroup()
                    .addGap(0, 305, Short.MAX_VALUE)
                    .addComponent(agregar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(editar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(eliminar)
                    .addGap(292, 292, 292))
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1)
                    .addContainerGap()));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(5, 5, 5)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(
                                Tid,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(
                                Tfecha,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
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
                    .addGap(18, 18, 18)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agregar)
                            .addComponent(editar)
                            .addComponent(eliminar))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(
                        jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(atras)
                    .addGap(11, 11, 11)));

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void TidActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_TidActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_TidActionPerformed

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
  private javax.swing.JTextField Tfecha;
  private javax.swing.JTextField Tid;
  private javax.swing.JTextField Tnombre;
  private javax.swing.JTextField Tpublicaciones;
  private javax.swing.JToggleButton agregar;
  private javax.swing.JButton atras;
  private javax.swing.JToggleButton editar;
  private javax.swing.JToggleButton eliminar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTable1;
  // End of variables declaration//GEN-END:variables
}
