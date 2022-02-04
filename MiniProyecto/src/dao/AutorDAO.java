package dao;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AutorDAO {

  private PreparedStatement preparedStatement;
  private ResultSet resultSet;
  private DefaultTableModel modelo;
  private DataBase db;

  public AutorDAO() {

    db = new DataBase();
  }

  public void listar(JTable tablaAutor) {

    String sql = "SELECT * FROM autor";

    try {

      preparedStatement = db.conectarBaseDeDatos().prepareStatement(sql);
      resultSet = preparedStatement.executeQuery();
      Object[] persona = new Object[5];
      modelo = (DefaultTableModel) tablaAutor.getModel();

      while (resultSet.next()) {

        persona[0] = resultSet.getString("nombre");
        persona[1] = resultSet.getString("apellido");
        persona[2] = resultSet.getString("fechaDeNacimiento");
        persona[3] = resultSet.getInt("numeroDePublicaciones");
        persona[4] = resultSet.getString("biografia");
        modelo.addRow(persona);
      }
    } catch (SQLException e) {
    }
  }
  
//  void editar() {
//
//    String Nombre = Tnombre.getText();
//    String Apellido = Tapellido.getText();
//    String Fnacimiento = Tfnacimiento.getText();
//    String Npublicaciones = Tpublicaciones.getText();
//    String Biografia = Tbiografia.getText();
//    String sql =
//        "update persona set Nombre = '"
//            + Nombre
//            + "', Apellido = '"
//            + Apellido
//            + "', Fecha de nacimiento = '"
//            + Fnacimiento
//            + "', Número de publicaciones = '"
//            + Npublicaciones
//            + "', Biografia = '"
//            + Biografia
//            + "'";
//
//    if (Nombre.equals("")
//        || Apellido.equals("")
//        || Fnacimiento.equals("")
//        || Npublicaciones.equals("")
//        || Biografia.equals("")) {
//      JOptionPane.showMessageDialog(null, "Debe introducir datos!!!");
//    } else {
//      try {
//
//      } catch (Exception e) {
//      }
//    }
//  }
//  
//  void eliminar() {
//
//    int seleccionado = tablaAutores.getSelectedRow();
//
//    if (seleccionado == -1) {
//      JOptionPane.showMessageDialog(null, "Debes seleccionar una fila");
//    } else {
//      String sql = "delete from persona where Nombre=" + seleccionado;
//      try {
//
//        JOptionPane.showMessageDialog(null, "Autor eliminado satisfactoriamente");
//
//      } catch (Exception e) {
//
//      }
//    }
//  }
//  
//  void agregar(){
//          String apellido = Tapellido.getText();
//    String fnacimiento = Tfnacimiento.getText();
//    String publicaciones = Tpublicaciones.getText();
//    String biografia = Tbiografia.getText();
//
//    if (nombre.equals("")
//        || apellido.equals("")
//        || fnacimiento.equals("")
//        || publicaciones.equals("")
//        || biografia.equals("")) {
//      JOptionPane.showMessageDialog(null, "Los campos estan vacios!!!");
//    } else {
//      String sql =
//          "insert into persona(Nombre, Apellido, Fecha de nacimiento, Número de Publicaciones,"
//              + " Biografia)values('"
//              + nombre
//              + "','"
//              + apellido
//              + "','"
//              + fnacimiento
//              + "','"
//              + publicaciones
//              + "','"
//              + biografia
//              + "')";
//  
//  }
//  
}
