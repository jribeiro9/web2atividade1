/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.java;

import java.util.ArrayList;

/**
 *
 * @author jribeiro
 */
public class Departamento {
    private String nome;
    private ArrayList <Funcionario> funcionarios;
    private Chefe chefe;
    
    public void setNome(String _nome){
        this.nome = _nome;
    }
      
    public void setChefe(Chefe _chefe){
        this.chefe = _chefe;
    }  
      
    public String getNome(){
        return this.nome;
    }
    
    public Chefe getChefe(){
        return this.chefe;
    }
}
