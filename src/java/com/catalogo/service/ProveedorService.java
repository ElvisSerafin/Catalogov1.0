/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.catalogo.service;

import com.catalogo.bean.ProveedorBean;
import java.util.ArrayList;

/**
 *
 * @author Elvis
 */
public interface ProveedorService {
    public int add(ProveedorBean proveedorBean);
    public int update(ProveedorBean proveedorBean);
    public int delete(ProveedorBean proveedorBean);
    public ArrayList<ProveedorBean> List( );
    public ArrayList<ProveedorBean> buscar(String nombre);
}
