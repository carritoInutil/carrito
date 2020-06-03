/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Conexion;
import java.sql.*;
import java.util.ArrayList;

/**
 * 
 * @autor 
 * Archivo: Usuario.java
 * Creado: 6/5/2009 02:35:26 PM
 */
public class UsuariosDB{	
     public static CUsuarios obtenerUsuario(String user, String pass){
        
         
         
        CUsuarios u=null;
        try {
            CallableStatement cl=Conexion.getConexion().prepareCall("{call obtenerUser(?,?)}");
            cl.setString(1, user);
            cl.setString(2, pass);
            ResultSet rs=cl.executeQuery();
            while(rs.next()){
                u= new CUsuarios(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7));
            }
            cl.close();
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            u=null;
        }
        return u;
    }

    public  boolean registrarUsuario(Registro r) {
      Connection cn= null;
      PreparedStatement pr=null;
      boolean registrado = false;
      
      CUsuarios u = (CUsuarios) r;
        try {
           cn= Conexion.getConexion();
           String sql="INSERT INTO Cusuarios (nombreUser,appaterno,apmaterno,usuario,password,id_privilegio)"
                   + "VALUES(?,?,?,?,?,?)";
            pr=cn.prepareStatement(sql);
            pr.setString(1, u.getNombre());
            pr.setString(2, u.getAppaterno());
            pr.setString(3, u.getApmaterno());
            pr.setString(4, u.getUser());
            pr.setString(5, u.getPassword());
            pr.setInt(6, u.getPrivilegio());
            pr.executeUpdate();
            registrado=true;
        } catch (Exception e) {
        registrado=false;
    }
        return registrado;
    }

}

