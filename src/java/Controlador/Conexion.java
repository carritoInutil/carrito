/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public class Conexion {
     public static Connection getConexion(){
         Connection cn= null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/carrito";
            String usuario="root";
            String clave="LAGC2589";
            cn=DriverManager.getConnection(url,usuario,clave);
            return cn;
        }catch(SQLException ex){
            System.out.println("Error de conexion");
            ex.printStackTrace();
        }catch(Exception ex){
            System.out.println("Error de conexion");
            ex.printStackTrace();
        }
        return null;
    }
}
