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
public class ProductoBean {
    private int idproducto;
    private CategoriaBean categoriaBean;
    private ProveedorBean proveedorBean;
    private String nombrepro;
    private String modelo;
    private double precio;
    private double descuento;
    private String imagen;

    public ProductoBean() {
    }

    public ProductoBean(int idproducto, CategoriaBean categoriaBean, ProveedorBean proveedorBean, String nombrepro, String modelo, double precio, double descuento, String imagen) {
        this.idproducto = idproducto;
        this.categoriaBean = categoriaBean;
        this.proveedorBean = proveedorBean;
        this.nombrepro = nombrepro;
        this.modelo = modelo;
        this.precio = precio;
        this.descuento = descuento;
        this.imagen = imagen;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public CategoriaBean getCategoriaBean() {
        return categoriaBean;
    }

    public void setCategoriaBean(CategoriaBean categoriaBean) {
        this.categoriaBean = categoriaBean;
    }

    public ProveedorBean getProveedorBean() {
        return proveedorBean;
    }

    public void setProveedorBean(ProveedorBean proveedorBean) {
        this.proveedorBean = proveedorBean;
    }

    public String getNombrepro() {
        return nombrepro;
    }

    public void setNombrepro(String nombrepro) {
        this.nombrepro = nombrepro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
   
    
}
