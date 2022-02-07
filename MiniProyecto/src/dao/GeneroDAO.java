package dao;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GeneroDAO {

  private Statement statement;
  private Connection conexion;
  private ResultSet resultSet;
  private DefaultTableModel modelo;
  private DataBase db;

  public GeneroDAO() {

    db = new DataBase();
  }

  public void listar(JTable tablaAutor) {

    String sql = "SELECT * FROM genero";

    try {

      conexion = db.conectarBaseDeDatos();
      statement = conexion.createStatement();
      resultSet = statement.executeQuery(sql);
      Object[] registro = new Object[2];
      modelo = (DefaultTableModel) tablaAutor.getModel();
      modelo.setRowCount(0);

      while (resultSet.next()) {

        registro[0] = resultSet.getInt("id");
        registro[1] = resultSet.getString("genero");
        modelo.addRow(registro);
      }
    } catch (SQLException e) {
    }
  }
  
  public void agregar(String genero){
  
      if(genero.equals(""))
          
          JOptionPane.showMessageDialog(null, "Ingrese un dato!!!");
      
      else {
          
          String sql = "INSERT INTO genero values(NULL, '"+ genero +"')";
      
          try {
          
              statement = db.conectarBaseDeDatos().createStatement();
              statement.executeUpdate(sql);
              JOptionPane.showMessageDialog(null, "Autor agregado!!!");
          } 
          catch(SQLException e){}
      }
  }
  
  public void eliminar(String genero){
      
      int confirmar = JOptionPane.showConfirmDialog(null, "Desea eliminar este genero?");
      
      if (confirmar == JOptionPane.OK_OPTION){
          try {
              String sql = "DELETE FROM genero" + "WHERE genero = ?";
              statement = db.conectarBaseDeDatos().createStatement();
              statement.executeUpdate(sql);
          } catch (Exception e) {
          }
      
      }
  
  
  }
}
