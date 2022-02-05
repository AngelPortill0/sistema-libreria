package dao;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AutorDAO {

  private Statement statement;
  private PreparedStatement prepareStatement;
  private ResultSet resultSet;
  private DefaultTableModel modelo;
  private DataBase db;
 

  public AutorDAO() {

    db = new DataBase();
  }

  public void listar(JTable tablaAutor) {

    String sql = "SELECT * FROM autor";

    try {

      prepareStatement = db.conectarBaseDeDatos().prepareStatement(sql);
      resultSet = prepareStatement.executeQuery(sql);
      Object[] autor = new Object[5];
      modelo = (DefaultTableModel) tablaAutor.getModel();

      while (resultSet.next()) {

        autor[0] = resultSet.getString("nombre");
        autor[1] = resultSet.getString("apellido");
        autor[2] = resultSet.getString("fechaDeNacimiento");
        autor[3] = resultSet.getInt("numeroDePublicaciones");
        autor[4] = resultSet.getString("biografia");
        modelo.addRow(autor);
      }
    } catch (SQLException e) {
    }
  }
  
    public void agregarAutor(String nombre, String apellido, String biografia, int publicaciones, String fnacimiento) {
        
      String sql =
          "insert into autor(nombre, apellido, fechaDeNacimiento, biografia,"
              + " numeroDePublicaciones)values('"
              + nombre
              + "','"
              + apellido
              + "','"
              + fnacimiento
              + "','"
              + biografia
              + "','"
              + publicaciones
              + "')";

      try {

        statement = db.conectarBaseDeDatos().createStatement();
        statement.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Autor agregado!!!");

      } catch (SQLException e) {
      }
    }



}
