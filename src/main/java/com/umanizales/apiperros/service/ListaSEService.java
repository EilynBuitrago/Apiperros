package com.umanizales.apiperros.service;

import com.umanizales.apiperros.model.Empleado;
import com.umanizales.apiperros.model.ListaSE;
import org.springframework.stereotype.Service;

@Service
public class ListaSEService {
    private ListaSE listaSE;

    public ListaSEService(){
        this.listaSE=new ListaSE();
        // Llenara la Lista de la base de datos
        listaSE.adicionarNodo(new Empleado("Bety Duque","4505764",2300000));
        listaSE.adicionarNodo(new Empleado("Maria Gomez","24646213",100000));

    }

    public int contarNodos(){
        return listaSE.getCont();
    }
}
