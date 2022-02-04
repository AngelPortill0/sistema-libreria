package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LibroDAO {

  private DataBase db;
  private PreparedStatement preparedStatement;
  private Connection conexion;
  private ResultSet resultSet;

  public LibroDAO() {
    db = new DataBase();
  }

  public void cargarLibros() {
    String sqlSelect =
        "SELECT "
            + "libros_autores.idAutor, "
            + "autor.nombre, "
            + "autor.apellido, "
            + "autor.biografia, "
            + "autor.numeroDePublicaciones, "
            + "libros_autores.idLibro, "
            + "libro.titulo, "
            + "libro.fechaDePublicacion, "
            + "libro.isbn, "
            + "libro.numeroDePaginas, "
            + "libro.puntuacion, "
            + "libro.descripcion, "
            + "libro.precio "
            + "FROM "
            + "libros_autores "
            + "INNER JOIN autor "
            + "ON autor.id = libros_autores.idAutor "
            + "INNER JOIN "
            + "libro ON libro.id = libros_autores.idLibro";

    try {
      preparedStatement = db.conectarBaseDeDatos().prepareStatement(sqlSelect);
      resultSet = preparedStatement.executeQuery();
<<<<<<< HEAD

      while (resultSet.next()) {
        // La lógica irá aquí
=======

      modelo = (DefaultTableModel) tablaLibros.getModel();

      while (resultSet.next()) {
        Libro libro =
            new Libro(
                resultSet.getString(2),
                resultSet.getString(3),
                resultSet.getString(4),
                resultSet.getInt(5),
                resultSet.getInt(6),
                resultSet.getString(7),
                resultSet.getFloat(8),
                resultSet.getString(10),
                resultSet.getString(11),
                resultSet.getString(12),
                resultSet.getString(13),
                resultSet.getInt(14));

        String[] datos = {
          libro.getTitulo(),
          libro.getNombreAutor(),
          "Algún género",
          libro.getFechaDePublicacion(),
          libro.getIsbn(),
          String.valueOf(libro.getNumeroDePaginas()),
          String.valueOf(libro.getPuntuacion()),
          libro.getDescripcion(),
          String.valueOf(libro.getPrecio())
        };

        modelo.addRow(datos);
>>>>>>> 759048a90fcfc86681a081846173698137872617
      }
    } catch (SQLException ex) {
      Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
