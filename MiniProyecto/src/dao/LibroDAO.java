package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import logica.Libro;

public class LibroDAO {
  private DataBase db;
  private PreparedStatement preparedStatement;
  private ResultSet resultSet;
  private DefaultTableModel modelo;

  public LibroDAO() {
    db = new DataBase();
  }

  public void cargarLibros(JTable tablaLibros) {
    String sqlSelect =
        "SELECT "
            + "libros_autores.idLibro, "
            + "libro.titulo, "
            + "libro.fechaDePublicacion, "
            + "libro.isbn, "
            + "libro.numeroDePaginas, "
            + "libro.puntuacion, "
            + "libro.descripcion, "
            + "libro.precio, "
            + "libros_autores.idAutor, "
            + "autor.nombre, "
            + "autor.apellido, "
            + "autor.fechaDeNacimiento, "
            + "autor.biografia, "
            + "autor.numeroDePublicaciones "
            + "FROM "
            + "libros_autores "
            + "INNER JOIN autor "
            + "ON autor.id = libros_autores.idAutor "
            + "INNER JOIN "
            + "libro ON libro.id = libros_autores.idLibro";

    try {
      preparedStatement = db.conectarBaseDeDatos().prepareStatement(sqlSelect);
      resultSet = preparedStatement.executeQuery();

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
      }
    } catch (SQLException ex) {
      Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
