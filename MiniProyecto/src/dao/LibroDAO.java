package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
          libro.getNombreAutor(),
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

  public void eliminarLibro(int idLibro) {
      String sqlSelect = "DELETE FROM `libros_autores` WHERE `idLibro` = ".concat(String.valueOf(idLibro));
      
      try {
            preparedStatement = db.conectarBaseDeDatos().prepareStatement(sqlSelect);
            int respuesta = preparedStatement.executeUpdate(sqlSelect);
            
            if (respuesta == -1) {
                JOptionPane.showMessageDialog(null, "El libro se ha elimando Exitosamente");
            }
            
      } catch (SQLException ex) {
        Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  
  public void editarLibro(
                            String idLibro, 
                            String titulo, 
                            String autor, 
                            String genero,
                            String fechaDePublicacion,
                            String numeroDePublicacion,
                            int puntuacion,
                            String descripcion,
                            float precio) {
      
  }
  
  public ArrayList<String> cargarAutores() {
      var autores = new ArrayList<String>();
      String sqlSelect = "SELECT nombre, apellido FROM autor";
      
      try {
            preparedStatement = db.conectarBaseDeDatos().prepareStatement(sqlSelect);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                autores.add( resultSet.getString(1) + " " + resultSet.getString(2));
        }
      } catch (SQLException ex) {
        Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      return autores;
  }
  
  public ArrayList<String> cargarGeneros() {
      var generos = new ArrayList<String>();
      String sqlSelect = "SELECT * FROM genero";
      
      try {
            preparedStatement = db.conectarBaseDeDatos().prepareStatement(sqlSelect);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                generos.add(resultSet.getString(2));
        }
      } catch (SQLException ex) {
        Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      return generos;
  }
}
