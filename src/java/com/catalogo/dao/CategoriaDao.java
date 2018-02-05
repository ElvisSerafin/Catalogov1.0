/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.catalogo.dao;

import com.catalogo.bean.CategoriaBean;
import java.util.ArrayList;

/**
 *
 * @author Elvis
 */
public interface CategoriaDao {
    public int add(CategoriaBean categoriaBean);
    public int update(CategoriaBean categoriaBean);
    public int delete(CategoriaBean categoriaBean);
    public ArrayList<CategoriaBean> List( );
    public ArrayList<CategoriaBean> buscar(String nombre);
}
