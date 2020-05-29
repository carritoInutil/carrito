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
public class CPrivilegio {
    private int id_privilegio;
    private String tipo_privilegio;

    public CPrivilegio(int id_privilegio, String tipo_privilegio) {
        this.id_privilegio = id_privilegio;
        this.tipo_privilegio = tipo_privilegio;
    }

    public int getId_privilegio() {
        return id_privilegio;
    }

    public void setId_privilegio(int id_privilegio) {
        this.id_privilegio = id_privilegio;
    }

    public String getTipo_privilegio() {
        return tipo_privilegio;
    }

    public void setTipo_privilegio(String tipo_privilegio) {
        this.tipo_privilegio = tipo_privilegio;
    }
    
}
