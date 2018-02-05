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
public class ProveedorBean {
    private int idprovvedor;
    private String nombre;
    private String direccion;
    private String ciudad;
    private String telefono;
    private String web;

    public ProveedorBean() {
    }

    public ProveedorBean(int idprovvedor, String nombre, String direccion, String ciudad, String telefono, String web) {
        this.idprovvedor = idprovvedor;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.web = web;
    }

    public int getIdprovvedor() {
        return idprovvedor;
    }

    public void setIdprovvedor(int idprovvedor) {
        this.idprovvedor = idprovvedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
    
    
}
