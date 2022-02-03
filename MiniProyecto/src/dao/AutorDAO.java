package dao;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AutorDAO {

  private Statement statement;
  private Connection conexion;
  private ResultSet resultSet;
  private DefaultTableModel modelo;
  private DataBase db;

  public AutorDAO() {

    db = new DataBase();
  }

  public void listar(JTable tablaAutor) {

    String sql = "SELECT * FROM autor";

    try {

      conexion = db.conectarBaseDeDatos();
      statement = conexion.createStatement();
      resultSet = statement.executeQuery(sql);
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
}
