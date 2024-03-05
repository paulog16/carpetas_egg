/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author pguid
 */
public abstract class DAO {

    protected Connection conexion = null;
    protected Statement stmt = null;
    protected ResultSet resultado = null;

    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.jdbc.Driver";

    //CONECTAR
    protected void conectarBase() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
                    
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
    }

    //DESCONECTAR
    protected void desconectarBase() throws Exception {
        try {
            if (resultado != null) {
                resultado.close();
            }

            if (stmt != null) {
                stmt.close();
            }

            if (conexion != null) {
                conexion.close();
            }

        } catch (SQLException e) {
            throw e;
        }
    }

    //CONSULTAR
    protected void consultar(String sql) throws Exception {
        try {
            conectarBase();
            stmt = conexion.createStatement();
            resultado = stmt.executeQuery(sql);
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }

    }

    //TODO ESTO
    protected void modificarInsertarEliminar(String sql) throws Exception {

        try {
            conectarBase();
            stmt = conexion.createStatement();
            stmt.executeUpdate(sql);

        } catch (ClassNotFoundException | SQLException e) {
            throw e;

        }finally{
            desconectarBase();
        }

    }
    
    
    
    

}
