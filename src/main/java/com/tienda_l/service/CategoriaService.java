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
    
    // Se obtiene un objeto categoria a partir del idCategoria que nos pasan\
    public Categoria getCategoria(Categoria categoria);
    
    // Se elimina un registro de la tabla categoria a partir del idCategoria que nos pasan
    public void deleteCategoria(Categoria categoria);
    
    // Si idCategoria tiene un valor se actualiza, si idCategoria NO tiene un valor
    // se inserta
    public void saveCategoria(Categoria categoria);
    
}
