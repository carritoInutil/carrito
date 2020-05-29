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
public class CProducto {
    private int id_cproducto;
    private String tipo_producto;

    public CProducto(int id_cproducto, String tipo_producto) {
        this.id_cproducto = id_cproducto;
        this.tipo_producto = tipo_producto;
    }

    public int getId_cproducto() {
        return id_cproducto;
    }

    public void setId_cproducto(int id_cproducto) {
        this.id_cproducto = id_cproducto;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }
    
}
