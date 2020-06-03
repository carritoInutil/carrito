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
public class CUsuarios extends Registro {
    
    /**
     * Default constructor
     */
    public CUsuarios() {
    }

    public CUsuarios(String id) {
        super(id);
    }

    /**
     * 
     */
    
    private int id_usuarios;
    private String nombre;
    private String appaterno;
    private String apmaterno;
    private String user;
    private String password;
    private int privilegio;

    public CUsuarios(int id_usuarios, String nombre, String appaterno, String apmaterno, String user, String password, int privilegio) {
        this.id_usuarios = id_usuarios;
        this.nombre = nombre;
        this.appaterno = appaterno;
        this.apmaterno = apmaterno;
        this.user = user;
        this.password = password;
        this.privilegio = privilegio;
    }

    public int getId_usuarios() {
        return id_usuarios;
    }

    public void setId_usuarios(int id_usuarios) {
        this.id_usuarios = id_usuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppaterno() {
        return appaterno;
    }

    public void setAppaterno(String appaterno) {
        this.appaterno = appaterno;
    }

    public String getApmaterno() {
        return apmaterno;
    }

    public void setApmaterno(String apmaterno) {
        this.apmaterno = apmaterno;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(int privilegio) {
        this.privilegio = privilegio;
    }
    
    
}
