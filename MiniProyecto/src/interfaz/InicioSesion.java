package interfaz;

import javax.swing.JOptionPane;

public class InicioSesion extends javax.swing.JFrame {

  public InicioSesion() {
    initComponents();
    setLocationRelativeTo(null);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jDesktopPane1 = new javax.swing.JDesktopPane();
    jInternalFrame1 = new javax.swing.JInternalFrame();
    jInternalFrame2 = new javax.swing.JInternalFrame();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    salir = new javax.swing.JButton();
    aceptar = new javax.swing.JButton();
    usuario = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    contasena = new javax.swing.JPasswordField();

    javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
    jDesktopPane1.setLayout(jDesktopPane1Layout);
    jDesktopPane1Layout.setHorizontalGroup(
        jDesktopPane1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE));
    jDesktopPane1Layout.setVerticalGroup(
        jDesktopPane1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE));

    jInternalFrame1.setVisible(true);

    javax.swing.GroupLayout jInternalFrame1Layout =
        new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
    jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
    jInternalFrame1Layout.setHorizontalGroup(
        jInternalFrame1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE));
    jInternalFrame1Layout.setVerticalGroup(
        jInternalFrame1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE));

    jInternalFrame2.setVisible(true);

    javax.swing.GroupLayout jInternalFrame2Layout =
        new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
    jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
    jInternalFrame2Layout.setHorizontalGroup(
        jInternalFrame2Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE));
    jInternalFrame2Layout.setVerticalGroup(
        jInternalFrame2Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE));

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Inicio de Sesión");
    setBackground(new java.awt.Color(200, 214, 229));
    setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    setForeground(java.awt.Color.green);

    jLabel1.setText("Usuario:");

    jLabel2.setText("Contraseña:");

    salir.setText("Salir");
    salir.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            salirActionPerformed(evt);
          }
        });

    aceptar.setText("Aceptar");
    aceptar.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            aceptarActionPerformed(evt);
          }
        });

    usuario.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            usuarioActionPerformed(evt);
          }
        });

    jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("Iniciar Sesión");
    jLabel3.setToolTipText("");
    jLabel3.setPreferredSize(new java.awt.Dimension(74, 20));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(
                                usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(contasena))
                    .addGap(50, 50, 50))
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addComponent(salir)
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                    .addComponent(aceptar)
                    .addContainerGap())
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addComponent(
                        jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addContainerGap()));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addComponent(
                        jLabel3,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(
                                usuario,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(
                                contasena,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salir)
                            .addComponent(aceptar))
                    .addContainerGap()));

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void salirActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_salirActionPerformed
    dispose();
  } // GEN-LAST:event_salirActionPerformed

  private void aceptarActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_aceptarActionPerformed

    String opcional_user = "mega";
    String opcional_con = "123";

    String user = usuario.getText();
    String con = contasena.getText();

    if (user.isEmpty() || con.isEmpty()) {
      JOptionPane.showMessageDialog(
          null, "Los campos estan vacios, inserte el usuario y contraseña");
    } else {
      if (user.equals(opcional_user) && con.equals(opcional_con)) {

        General principal = new General();
        principal.setVisible(true);
        this.setVisible(false);

      } else {
        JOptionPane.showMessageDialog(null, "Usuario o contraseña invalido, intentelo de nuevo!!!");
      }
    }
  } // GEN-LAST:event_aceptarActionPerformed

  private void usuarioActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_usuarioActionPerformed
  } // GEN-LAST:event_usuarioActionPerformed

  public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(
        () -> {
          new InicioSesion().setVisible(true);
        });
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton aceptar;
  private javax.swing.JPasswordField contasena;
  private javax.swing.JDesktopPane jDesktopPane1;
  private javax.swing.JInternalFrame jInternalFrame1;
  private javax.swing.JInternalFrame jInternalFrame2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JButton salir;
  private javax.swing.JTextField usuario;
  // End of variables declaration//GEN-END:variables

  private static class string {

    public string() {}
  }
}
