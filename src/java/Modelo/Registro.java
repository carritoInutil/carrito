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
public abstract class Registro {
    public Registro() {
    }

    public Registro(String id) {
        this.id = id;
    }

    /**
     * 
     */
    private String id;

    /**
     * @return
     */
    public String getId() {
        // TODO implement here
        return id;
    }
}
