/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.catalogo.dao;

import com.catalogo.bean.ProductoBean;
import java.util.ArrayList;

/**
 *
 * @author Elvis
 */
public interface ProductoDao {
    public int add(ProductoBean productoBeanBean);
    public int update(ProductoBean productoBean);
    public int delete(ProductoBean productoBean);
    public ArrayList<ProductoBean> List( );
    public ArrayList<ProductoBean> buscar(String nombre);
}
