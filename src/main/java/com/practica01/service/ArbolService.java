/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practica01.service;

import com.practica01.domain.Arbol;
import java.util.List;

/**
 *
 * @author Laboratorios
 */
public interface ArbolService {
    //Se obtiene un arraylist de objetos tipo Arbol
    public List<Arbol> getArboles();
    
    // Se obtiene un objeto categoria a partir del idArbol que nos pasan\
    public Arbol getArbol(Arbol arbol);
    
    // Se elimina un registro de la tabla categoria a partir del idArbol que nos pasan
    public void deleteArbol(Arbol arbol);
    
    // Si idArbol tiene un valor se actualiza, si idArbol NO tiene un valor
    // se inserta
    public void saveArbol(Arbol arbol);
    
}
