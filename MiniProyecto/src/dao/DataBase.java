package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
  private static final String URL = "jdbc:mysql://localhost:3306/libreria_db";
  private static final String USUARIO_BD = "root";
  private static final String CONTRASENA_BD = "";

  public Connection conectarBaseDeDatos() {
    Connection conexion = null;

    try {
      conexion = (Connection) DriverManager.getConnection(URL, USUARIO_BD, CONTRASENA_BD);
      System.out.println("Base de Datos conectada exitosamente a: ".concat(URL));
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }

    return conexion;
  }
}
