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
public class DProducto {
    private String tipoproduct;
    private String subproduct;
    private int idproduct;
    private String nomproduct;
    private double precio;
    private int stock;
    private String img;

    public DProducto(String tipoproduct, String subproduct, int idproduct, String nomproduct, double precio, int stock, String img) {
        this.tipoproduct = tipoproduct;
        this.subproduct = subproduct;
        this.idproduct = idproduct;
        this.nomproduct = nomproduct;
        this.precio = precio;
        this.stock = stock;
        this.img = img;
    }

    public String getTipoproduct() {
        return tipoproduct;
    }

    public void setTipoproduct(String tipoproduct) {
        this.tipoproduct = tipoproduct;
    }

    public String getSubproduct() {
        return subproduct;
    }

    public void setSubproduct(String subproduct) {
        this.subproduct = subproduct;
    }

    public int getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }

    public String getNomproduct() {
        return nomproduct;
    }

    public void setNomproduct(String nomproduct) {
        this.nomproduct = nomproduct;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    

    
    
    
  
    
    
}
