package dao;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClienteDAO {
    
    private Statement statement;
    private Connection conexion;
    private ResultSet resultSet;
    private DefaultTableModel modelo;
    private DataBase db;
    
    public ClienteDAO() {
    
        db = new DataBase();
    }
    
    public void listar(JTable tablaAutor){
    
        String sql = "SELECT * FROM cliente";
        
        try {
        
            conexion = db.conectarBaseDeDatos();
            statement = conexion.createStatement();
            resultSet = statement.executeQuery(sql);
            Object[] persona = new Object[6];
            modelo = (DefaultTableModel) tablaAutor.getModel();
            
            while(resultSet.next()) {
            
                persona[0] = resultSet.getString("nombre");
                persona[1] = resultSet.getString("apellido");
                persona[2] = resultSet.getString("fechaDeNacimiento");
                persona[3] = resultSet.getInt("cedula");
                persona[4] = resultSet.getInt("numeroDeTelefono");
                persona[5] = resultSet.getString("direccion");
                modelo.addRow(persona);
                
                
            }
        } catch (SQLException e) {}
    }
}
