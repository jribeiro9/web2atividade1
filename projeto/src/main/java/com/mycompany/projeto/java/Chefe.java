/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.java;

/**
 *
 * @author jribeiro
 */
public class Chefe extends Funcionario{
    private Departamento departamento;
    
    public void setDepartamento(Departamento _departamento){
        this.departamento = _departamento;
    }
    
    public Departamento getDepartamento(){
        return this.departamento;
    }
}
