package interfaz;

public class Clientes extends javax.swing.JFrame {

  public Clientes() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    atras = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
    jLabel1.setText("CLIENTES");

    jTable1.setModel(
        new javax.swing.table.DefaultTableModel(
            new Object[][] {
              {null, null, null},
              {null, null, null},
              {null, null, null},
              {null, null, null}
            },
            new String[] {"Cédula de identidad", "Número de teléfono", "Dirección"}));
    jScrollPane1.setViewportView(jTable1);

    atras.setText("Atrás");
    atras.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            atrasActionPerformed(evt);
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
                    .addComponent(
                        jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addContainerGap())
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addGap(164, 164, 164)
                    .addComponent(jLabel1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout
                    .createSequentialGroup()
                    .addContainerGap(182, Short.MAX_VALUE)
                    .addComponent(atras)
                    .addGap(181, 181, 181)));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(
                        jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(atras)
                    .addContainerGap()));

    pack();
  } // </editor-fold>//GEN-END:initComponents

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
  private javax.swing.JButton atras;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTable1;
  // End of variables declaration//GEN-END:variables
}
