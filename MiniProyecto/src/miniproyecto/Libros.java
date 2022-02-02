package miniproyecto;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

public class Libros extends javax.swing.JFrame {

  public Libros() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    Tlibros = new javax.swing.JTable();
    atras = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
    jLabel1.setText("LIRBROS");

    Tlibros.setModel(
        new javax.swing.table.DefaultTableModel(
            new Object[][] {
              {null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null}
            },
            new String[] {
              "Título",
              "Autor",
              "Descripción",
              "Número de páginas",
              "Fecha de publicación",
              "isbn",
              "Puntuación",
              "Precio"
            }));
    jScrollPane1.setViewportView(Tlibros);

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
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(
                                        jScrollPane1,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        725,
                                        Short.MAX_VALUE))
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
                                                    .addComponent(jLabel1))
                                            .addGroup(
                                                layout
                                                    .createSequentialGroup()
                                                    .addGap(327, 327, 327)
                                                    .addComponent(atras)))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()));
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
    General Libros = new General();
    Libros.setVisible(true);
    this.setVisible(false);
  } // GEN-LAST:event_atrasActionPerformed

  public void setBox(JTable Tlibros, TableColumn columna) {

    JComboBox c = new JComboBox();
    c.addItem("MegaBlacksTer");

    columna.setCellEditor(new DefaultCellEditor(c));
    DefaultTableCellRenderer render = new DefaultTableCellRenderer();
  }

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(
        () -> {
          new Libros().setVisible(true);
        });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTable Tlibros;
  private javax.swing.JButton atras;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane1;
  // End of variables declaration//GEN-END:variables
}
