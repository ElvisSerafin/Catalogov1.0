/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.catalogo.bean;

import java.util.Date;

/**
 *
 * @author Elvis
 */
public class CarritoBean {
    private int idcarrito;
    private ClienteBean clienteBean;
    private ProductoBean productoBean;
    private int unidades;
    private double subtotal;
    private double total;
    private Date fecha;

    public CarritoBean() {
    }

    public CarritoBean(int idcarrito, ClienteBean clienteBean, ProductoBean productoBean, int unidades, double subtotal, double total, Date fecha) {
        this.idcarrito = idcarrito;
        this.clienteBean = clienteBean;
        this.productoBean = productoBean;
        this.unidades = unidades;
        this.subtotal = subtotal;
        this.total = total;
        this.fecha = fecha;
    }

    public int getIdcarrito() {
        return idcarrito;
    }

    public void setIdcarrito(int idcarrito) {
        this.idcarrito = idcarrito;
    }

    public ClienteBean getClienteBean() {
        return clienteBean;
    }

    public void setClienteBean(ClienteBean clienteBean) {
        this.clienteBean = clienteBean;
    }

    public ProductoBean getProductoBean() {
        return productoBean;
    }

    public void setProductoBean(ProductoBean productoBean) {
        this.productoBean = productoBean;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

  
    
            
  
}
