package dao;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class VentaDAO {

  private Statement statement;
  private Connection conexion;
  private ResultSet resultSet;
  private DefaultTableModel modelo;
  private DataBase db;

  public VentaDAO() {

    db = new DataBase();
  }
}
