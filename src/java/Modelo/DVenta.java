/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author hp
 */
public class DVenta {
    private int id_dventa;
    private int cantidad;
    private DProducto producto;

    public DVenta(int id_dventa, int cantidad, DProducto producto) {
        this.id_dventa = id_dventa;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getId_dventa() {
        return id_dventa;
    }

    public void setId_dventa(int id_dventa) {
        this.id_dventa = id_dventa;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public DProducto getProducto() {
        return producto;
    }

    public void setProducto(DProducto producto) {
        this.producto = producto;
    }
    
    
}
