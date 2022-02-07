package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import logica.Libro;

public class LibroDAO {
  private DataBase db;
  private Statement statement;
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
            + "libros_autores.idGenero, "
            + "genero.genero, "
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
            + "INNER JOIN genero "
            + "ON genero.id = libros_autores.idGenero "
            + "INNER JOIN "
            + "libro ON libro.id = libros_autores.idLibro";

    try {
      preparedStatement = db.conectarBaseDeDatos().prepareStatement(sqlSelect);
      resultSet = preparedStatement.executeQuery();

      modelo = (DefaultTableModel) tablaLibros.getModel();
      modelo.setRowCount(0);

      while (resultSet.next()) {
        Libro libro =
            new Libro(
                resultSet.getString(2), // Titulo Libro
                resultSet.getString(3), // Fecha De Pub.
                resultSet.getString(4), // ISBN
                resultSet.getInt(5), // Nº pag.
                resultSet.getInt(6), // Puntuacion
                resultSet.getString(7), // Descripcion
                resultSet.getFloat(8), // Precio
                resultSet.getString(10), // Genero Liter.
                resultSet.getString(12), // Nombre Aut.
                resultSet.getString(13), // Apellido Aut.
                resultSet.getString(14), // Fecha Nacimiento
                resultSet.getString(15), // Biografia
                resultSet.getInt(16));
        
        String[] datos = {
          String.valueOf(resultSet.getInt(1)),
          libro.getTitulo(),
          String.valueOf(resultSet.getInt(11)),
          libro.getNombreAutor(),
          String.valueOf(resultSet.getInt(9)),
          libro.getGenero(),
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

  public void agregarLibro(
                            String titulo, 
                            String fechaDePublicacion, 
                            String isbn, 
                            int numeroDePaginas, 
                            int puntuacion, 
                            String descripcion, 
                            float precio,
                            int idGenero,
                            int idAutor) {
      
      String sqlInsertLibro = "INSERT INTO libro VALUES (NULL, '" + titulo + "', '" + fechaDePublicacion + "', '" + isbn + "', " + numeroDePaginas + ", " + puntuacion + ", '" + descripcion + "', " + precio + ");";

      try {
            statement = db.conectarBaseDeDatos().createStatement();
            statement.executeUpdate(sqlInsertLibro);
            
            String sqlSelectIdLibroCreado = "SELECT MAX(id) FROM libro;";
            preparedStatement = db.conectarBaseDeDatos().prepareStatement(sqlSelectIdLibroCreado);
            resultSet = preparedStatement.executeQuery();
            
            int idLibro = 0;
            if (resultSet.next()) {
                idLibro = resultSet.getInt(1);
            }
            
            String sqlInsertLibroGeneroAutor = "INSERT INTO libros_autores VALUES "
              + "(" + idLibro + ", " + idGenero + ", " + idAutor + ");";
            
            statement = db.conectarBaseDeDatos().createStatement();
            statement.executeUpdate(sqlInsertLibroGeneroAutor);
            
      } catch (SQLException ex) {
        Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  
  public void eliminarLibro(int idLibro) {
      String sqlDelete = "DELETE FROM `libro` WHERE `id` = ".concat(String.valueOf(idLibro));
      
      try {
            preparedStatement = db.conectarBaseDeDatos().prepareStatement(sqlDelete);
            preparedStatement.executeUpdate();           
      } catch (SQLException ex) {
        Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  
  public void editarLibro(
                            int idLibro, 
                            String titulo, 
                            int idAutor, 
                            int idGenero,
                            String fechaDePublicacion,
                            String isbn,
                            int numeroDePaginas,
                            int puntuacion,
                            String descripcion,
                            float precio) {
      String sqlUpdateLibro = "UPDATE libro SET titulo = '" + titulo + "', "
              + "fechaDePublicacion = '" + fechaDePublicacion + "', "
              + "isbn = '" + isbn + "', "
              + "numeroDePaginas = " + numeroDePaginas + ", "
              + "puntuacion = " + puntuacion + ", "
              + "descripcion = '" + descripcion + "', "
              + "precio = " + precio + " "
              + "WHERE id = " + idLibro;
      
      String sqlUpdateAutorGenero = "UPDATE libros_autores SET idAutor = " + idAutor + ","
              + "idGenero = " + idGenero + " WHERE idLibro = " + idLibro + ";";
      
      
      try {
            preparedStatement = db.conectarBaseDeDatos().prepareStatement(sqlUpdateLibro);
            preparedStatement.executeUpdate();
            
            preparedStatement = db.conectarBaseDeDatos().prepareStatement(sqlUpdateAutorGenero);
            preparedStatement.executeUpdate();
            

      } catch (SQLException ex) {
        Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  
  public HashMap<String, Integer> cargarAutores() {
      var autores = new HashMap<String, Integer>();
      String sqlSelect = "SELECT id, nombre, apellido FROM autor";
      
      try {
            preparedStatement = db.conectarBaseDeDatos().prepareStatement(sqlSelect);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String nombreAutor = resultSet.getString(2);
                autores.put(nombreAutor, resultSet.getInt(1));
        }
      } catch (SQLException ex) {
        Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      return autores;
  }
  
  public HashMap<String, Integer> cargarGenerosPorNombre() {
      var generos = new HashMap<String, Integer>();
      String sqlSelect = "SELECT * FROM genero";
      
      try {
            preparedStatement = db.conectarBaseDeDatos().prepareStatement(sqlSelect);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                generos.put(resultSet.getString(2), resultSet.getInt(1));
        }
      } catch (SQLException ex) {
        Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      return generos;
  }
  
}

