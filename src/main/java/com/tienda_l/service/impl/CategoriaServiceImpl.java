/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda_l.service.impl;

import com.tienda_l.domain.Categoria;
import com.tienda_l.dao.CategoriaDao;
import com.tienda_l.service.CategoriaService;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 *
 * @author Laboratorios
 */
@Service
public class CategoriaServiceImpl implements CategoriaService {

    
    @Autowired
    private CategoriaDao categoriaDao;
   
    
    
    
    
    @Override
    public List<Categoria> getCategorias(boolean activos) {
        return categoriaDao.findAll();
    }
    
}
