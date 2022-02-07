package dao;

import java.util.logging.Level;
import java.util.logging.Logger;
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
      Object[] autor = new Object[6];
      modelo = (DefaultTableModel) tablaAutor.getModel();
      modelo.setRowCount(0);

      while (resultSet.next()) {
        autor[0] = resultSet.getString("id");
        autor[1] = resultSet.getString("nombre");
        autor[2] = resultSet.getString("apellido");
        autor[3] = resultSet.getString("fechaDeNacimiento");
        autor[4] = resultSet.getInt("numeroDePublicaciones");
        autor[5] = resultSet.getString("biografia");
        modelo.addRow(autor);
      }
    } catch (SQLException e) {
    }
  }
  
    public void agregarAutor(String nombre, String apellido, String biografia, int publicaciones, String fnacimiento) {
        
      String sql = "INSERT INTO autor VALUES (NULL,'"+ nombre +"','"+ apellido +"',"
              + "'"+ fnacimiento +"','"+ biografia +"','"+ publicaciones +"')";

      try {
        statement = db.conectarBaseDeDatos().createStatement();
        statement.executeUpdate(sql);

        JOptionPane.showMessageDialog(null, "Autor agregado");

      } catch (SQLException e) {
      }
    }
    
    public void eiminarAutor (int idAutor){
        int confirmar = JOptionPane.showConfirmDialog(null, "Desea eliminar este autor?");
         String sqlSelect = "DELETE FROM `autor` WHERE `id` = ".concat(String.valueOf(idAutor));
         
      if (confirmar == JOptionPane.OK_OPTION) { 
             try {
            prepareStatement = db.conectarBaseDeDatos().prepareStatement(sqlSelect);
            prepareStatement.executeUpdate(sqlSelect);
            JOptionPane.showMessageDialog(null, "El autor se ha elimando exitosamente");
      
      } catch (SQLException ex) { 
      }
            }
    }

    public void editarAutor(String idAutor,
            String nombre,
            String apellido,
            String biografia,
            String fnacimiento,
            int publicaciones) {
      String sqlUpdate = "UPDATE autor SET nombre = '" + nombre + "', "
              + "apellido = '" + apellido + "', "
              + "fechaDeNacimiento = '" + fnacimiento + "', "
              + "biografia = '" + biografia + "', "
              + "numeroDePublicaciones = '" + publicaciones + "' "
              + "WHERE id = " + idAutor;
      
              try {
            prepareStatement = db.conectarBaseDeDatos().prepareStatement(sqlUpdate);
            prepareStatement.executeUpdate(sqlUpdate);
            JOptionPane.showMessageDialog(null, "El autor se ha editado exitosamente");
            
            
      } catch (SQLException ex) {
        Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
              
        
    }
  
}
