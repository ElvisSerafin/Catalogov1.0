/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.catalogo.dao;

import com.catalogo.bean.ClienteBean;
import java.util.ArrayList;

/**
 *
 * @author Elvis
 */
public interface ClienteDao {
    public int add(ClienteBean clienteBean);
    public int update(ClienteBean clienteBean);
    public int delete(ClienteBean clienteBean);
    public ArrayList<ClienteBean> List( );
    public ArrayList<ClienteBean> buscar(String nombre);
}
