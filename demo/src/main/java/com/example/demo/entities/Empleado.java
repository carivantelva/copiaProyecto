package com.example.demo.entities;

import javax.persistence.*;
import java.io.Serializable;
public class Empleado implements Serializable{

    //Se agrega el @id
    private static final Integer serialVersionUID = 432;
    @id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    //Atributos
    private String nombreEmpleado;
    private String correoEmpleado;
    private Enum rolEmpleado{Admin , Operario};
    private int idEmpleado;
    private Empresa empresaEmpleado;

    // Método constructor


    public Empleado() {
    }

    public Empleado(String nombreEmpleado, String correoEmpleado, Enum rolEmpleado, int idEmpleado, Empresa empresaEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.rolEmpleado = rolEmpleado;
        this.idEmpleado = idEmpleado;
        this.empresaEmpleado = empresaEmpleado;
    }

    // Métodos getter and setter
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public Enum getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(Enum rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Empresa getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(Empresa empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

}


