/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql. *;
import java.util.ArrayList;
import Controlador.Conexion;

/**
 *
 * @author hp
 */
public class CatalogoDB {
    
    public static ArrayList<DProducto> obtenerProductos(){
        
        ArrayList<DProducto> catalogo = new ArrayList<DProducto>();
        try {
            CallableStatement cl=Conexion.getConexion().prepareCall("call listaProductos()");
            ResultSet rs=cl.executeQuery();
            while(rs.next()){
                DProducto p = new DProducto (rs.getString(1),rs.getString(2),rs.getDouble(3),rs.getInt(6),rs.getString(4),rs.getInt(5));
                catalogo.add(p);
            }
        } catch (Exception e) {
        }
        return catalogo;
    }
    
    public static DProducto obtenerProducto(int codigo){
        
        DProducto p=null;
        try {
            CallableStatement cl=Conexion.getConexion().prepareCall("{call agregar(?)}");
            cl.setInt(1, codigo);
            ResultSet rs=cl.executeQuery();
            while(rs.next()){
                p= new DProducto(rs.getString(1),rs.getString(2),rs.getDouble(3),rs.getInt(6),rs.getString(4),rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return p;
    }
}
