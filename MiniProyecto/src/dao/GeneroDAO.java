package dao;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
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

  public void agregar(String genero) {

    if (genero.equals("")) JOptionPane.showMessageDialog(null, "Ingrese un dato");
    else {

      String sql = "INSERT INTO genero values(NULL, '" + genero + "')";

      try {

        statement = db.conectarBaseDeDatos().createStatement();
        statement.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Genero agregado");
      } catch (SQLException e) {
      }
    }
  }

  public void eliminar(String idGenero) {

    int confirmar = JOptionPane.showConfirmDialog(null, "Desea eliminar este genero?");
    String sql = "DELETE FROM genero WHERE id = " + idGenero;

    if (confirmar == JOptionPane.OK_OPTION) {
      try {

        statement = db.conectarBaseDeDatos().createStatement();
        statement.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Genero eliminado exitosamente");

      } catch (Exception e) {
      }
    }
  }

  public void modificar(String idGenero, String genero) {

    String sqlUpdate = "UPDATE genero SET genero = '" + genero + "' WHERE id = " + idGenero;

    if (genero.equals("")) JOptionPane.showMessageDialog(null, "Ingrese datos");
    else {

      try {

        statement = db.conectarBaseDeDatos().createStatement();
        statement.executeUpdate(sqlUpdate);
        JOptionPane.showMessageDialog(null, "Genero editado");

      } catch (SQLException e) {
      }
    }
  }

  public HashMap<Integer, Integer> generarListaDeFrecuenciasGeneros() {
    String sqlSelectIdGeneros =
        "SELECT idGenero, COUNT(*) freq FROM libros_autores GROUP BY idGenero;";

    var freqGeneros = new HashMap<Integer, Integer>();

    try {
      conexion = db.conectarBaseDeDatos();
      statement = conexion.createStatement();
      resultSet = statement.executeQuery(sqlSelectIdGeneros);

      while (resultSet.next()) {
        freqGeneros.put(resultSet.getInt(1), resultSet.getInt(2));
      }

    } catch (SQLException ex) {
      Logger.getLogger(GeneroDAO.class.getName()).log(Level.SEVERE, null, ex);
    }

    return freqGeneros;
  }

  public HashMap<Integer, String> cargarGenerosPorId() {
    var generos = new HashMap<Integer, String>();
    String sqlSelect = "SELECT * FROM genero";

    try {
      conexion = db.conectarBaseDeDatos();
      statement = conexion.createStatement();
      resultSet = statement.executeQuery(sqlSelect);

      while (resultSet.next()) {
        generos.put(resultSet.getInt(1), resultSet.getString(2));
      }
    } catch (SQLException ex) {
      Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
    }

    return generos;
  }

  public HashMap<String, Integer> cargarGenerosConFreq(
      HashMap<Integer, Integer> freq, HashMap<Integer, String> generos) {
    var generosConFreq = new HashMap<String, Integer>();

    for (Map.Entry<Integer, String> genero : generos.entrySet()) {

      //          System.out.println(genero.getKey());
      //          System.out.println(genero.getValue());
      //          System.out.println(freq.containsKey(genero.getKey()));

      if (freq.containsKey(genero.getKey())) {
        generosConFreq.put(genero.getValue(), freq.get((genero.getKey())));
      }

      //            if (generos.containsKey(frecuencia.getKey())) {
      //                generosConFreq.put(generos.get(frecuencia.getKey()), frecuencia.getValue());
      //            }

    }

    return generosConFreq;
  }
}
