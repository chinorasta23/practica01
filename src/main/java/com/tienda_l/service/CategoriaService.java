/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda_l.service;

import com.tienda_l.domain.Categoria;
import java.util.List;

/**
 *
 * @author Laboratorios
 */
public interface CategoriaService {
    //Se obtiene un arraylist de objetos tipo Categoria
    public List<Categoria> getCategorias(boolean activos);
    
}
