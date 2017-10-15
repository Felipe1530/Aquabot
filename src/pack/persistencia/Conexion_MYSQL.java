/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author root
 */
public class Conexion_MYSQL implements Conexion {
    private static Connection conexion;

    public Conexion_MYSQL() {
        start();
    }

    @Override
    public void start() {
        conexion = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/AquaBot","root","");
            if(conexion != null){
                System.out.println("Conexión Establecida");
            }
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar" + e);
        }
    }

    public static Connection getConexion() {
        return conexion;
    }
    @Override
    public void close(){
        conexion = null;
        if(conexion == null){
            System.out.println("Conexión Terminada");
        }
    }
}












