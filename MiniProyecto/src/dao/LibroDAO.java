package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LibroDAO {

  private PreparedStatement preparedStatement;
  private Connection conexion;
  private ResultSet resultSet;
  private DataBase db;

  public LibroDAO() {
    db = new DataBase();
  }

  public void cargarLibros() {
    String sqlSelect =
        "SELECT libro.titulo, libro.fechaDePublicacion, libro.isbn, libro.numeroDePaginas,"
            + " libro.puntuacion, libro.descripcion, libro.precio FROM libro INNER JOIN autor ON"
            + " libro.idAutor=autor.id";

    try {
      preparedStatement = db.conectarBaseDeDatos().prepareStatement(sqlSelect);
      resultSet = preparedStatement.executeQuery();

      while (resultSet.next()) {
        // Se crearán objetos Libro pasándole datos de la BD a su constructor
      }
    } catch (SQLException ex) {
      Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
