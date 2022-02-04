package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Libro;

public class LibroDAO {
    
    private PreparedStatement preparedStatement;
    private Connection conexion;
    private ResultSet resultSet;
    private DataBase db;

    public LibroDAO(){
        db = new DataBase();
    }
    
    public void cargarLibros() {
        String sqlSelect = "SELECT " 
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
            
            while (resultSet.next()) {
                // La lógica irá aquí
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
