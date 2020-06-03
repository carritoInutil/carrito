/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author hp
 */
public class DVentaDB {
    
    public  boolean registrarVenta(Registro r) {
      Connection cn= null;
      PreparedStatement pr=null;
      boolean venta = false;
      
      DVenta v = (DVenta) r;
        try {
           CallableStatement cl=Conexion.getConexion().prepareCall("{call agregarVenta(?,?)}");
            
           cl.setInt(1, v.getProducto());
           cl.setInt(2, v.getCantidad());
            cl.executeUpdate();
            venta=true;
        } catch (Exception e) {
        venta=false;
    }
        return venta;
    }
}
