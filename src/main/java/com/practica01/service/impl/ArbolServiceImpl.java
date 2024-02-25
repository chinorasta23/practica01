
package com.practica01.service.impl;

import com.practica01.domain.Arbol;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.practica01.dao.ArbolDao;
import com.practica01.service.ArbolService;


@Service
public class ArbolServiceImpl implements ArbolService {

    
    @Autowired
    private ArbolDao arbolDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Arbol> getArboles() {
        var lista = arbolDao.findAll();
        /*        if (activos) {
        lista.removeIf(c -> !c.isActivo());
        }*/
        return lista;
    }

    @Override
    public Arbol getArbol(Arbol arbol) {
       return arbolDao.findById(arbol.getIdArbol()).orElse(null);
    }

    @Override
    public void deleteArbol(Arbol arbol) {
        arbolDao.delete(arbol);
    }

    @Override
    public void saveArbol(Arbol arbol) {
        arbolDao.save(arbol);
    }
    
}
