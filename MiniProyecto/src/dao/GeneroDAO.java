package dao;

import java.sql.*;
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
    
    public void listar(JTable tablaAutor){
    
        String sql = "SELECT * FROM genero";
        
        try {
        
            conexion = db.conectarBaseDeDatos();
            statement = conexion.createStatement();
            resultSet = statement.executeQuery(sql);
            Object[] persona = new Object[1];
            modelo = (DefaultTableModel) tablaAutor.getModel();
            
            while(resultSet.next()) {
            
                persona[0] = resultSet.getString("genero");
                modelo.addRow(persona);
                
                
            }
        } catch (SQLException e) {}
    }
}
