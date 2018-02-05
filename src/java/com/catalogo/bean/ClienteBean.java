/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.catalogo.bean;

/**
 *
 * @author Elvis
 */
public class ClienteBean {
    private int idcliente;
    private String nombres;
    private String dni;
    private String direccion;
    private String genero;

    public ClienteBean() {
    }

    public ClienteBean(int idcliente, String nombres, String dni, String direccion, String genero) {
        this.idcliente = idcliente;
        this.nombres = nombres;
        this.dni = dni;
        this.direccion = direccion;
        this.genero = genero;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
            
    
}
