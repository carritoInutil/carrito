/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Timestamp;

/**
 *
 * @author hp
 */
public class ECliente_venta {
    private int id_ECliente;
    private CUsuarios usuario;
    private DVenta venta;
    private Timestamp fecha;
    private double importe;
    private double iva;
    private double total;
    private boolean carrito;
    private COrden orden;

    public ECliente_venta(int id_ECliente, CUsuarios usuario, DVenta venta, Timestamp fecha, double importe, double iva, double total, boolean carrito, COrden orden) {
        this.id_ECliente = id_ECliente;
        this.usuario = usuario;
        this.venta = venta;
        this.fecha = fecha;
        this.importe = importe;
        this.iva = iva;
        this.total = total;
        this.carrito = carrito;
        this.orden = orden;
    }

    public int getId_ECliente() {
        return id_ECliente;
    }

    public void setId_ECliente(int id_ECliente) {
        this.id_ECliente = id_ECliente;
    }

    public CUsuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(CUsuarios usuario) {
        this.usuario = usuario;
    }

    public DVenta getVenta() {
        return venta;
    }

    public void setVenta(DVenta venta) {
        this.venta = venta;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isCarrito() {
        return carrito;
    }

    public void setCarrito(boolean carrito) {
        this.carrito = carrito;
    }

    public COrden getOrden() {
        return orden;
    }

    public void setOrden(COrden orden) {
        this.orden = orden;
    }
    
    
}
