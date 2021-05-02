package com.umanizales.apiperros.controller;

import com.umanizales.apiperros.model.Empleado;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/capacitacion")
@Validated
public class CapacitacionController {

    @GetMapping

    public Empleado getEmployee(){
        Empleado orozco= new Empleado("Andres Orozco", "1053478965", 3500000);
        return orozco;
    }

    @GetMapping(path = "/empleados")
    public Empleado[] getAllEmployees(){
        Empleado[] empleados=new Empleado[3];
        empleados[0]=new Empleado("Andres Orozco", "1053478965",3500000);
        empleados[1]=new Empleado("Eilyn Buitrago", "1002619297",1500000);
        empleados[2]=new Empleado("Michael Herrada", "24646213",200000);

        return empleados;
    }
    @PostMapping
    public Empleado crearEmpleado(@RequestBody Empleado employee){
        // Simulación se recibe empleado y se asigno en la base de datos
        // Recalcular Bonificación del 15%
        // Guarda base de datos
        employee.setSalario(employee.getSalario()*1.15);
        return employee;
    }
}
