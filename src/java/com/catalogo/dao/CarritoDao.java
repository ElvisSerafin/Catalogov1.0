/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.catalogo.dao;

import com.catalogo.bean.CarritoBean;
import java.util.ArrayList;

/**
 *
 * @author Elvis
 */
public interface CarritoDao {
    public int add(CarritoBean carritoBean);
    public int update(CarritoBean carritoBean);
    public int delete(CarritoBean carritoBean);
    public ArrayList<CarritoBean> List( );
    public ArrayList<CarritoBean> buscar(String nombre);
}
