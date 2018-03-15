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
public class Funcionario {
    private String nome;
    private double salario;
    private Departamento lotacao;
    
    public Funcionario(){
        
    }
    
    public Funcionario(String _nome, double _salario){
        this.nome = _nome;
        this.salario = _salario;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String _nome){
        this.nome = _nome;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setSalario(double _salario){
        this.salario = _salario;
    }
    
    public Departamento getLotacao(){
        return this.lotacao;
    }
    
    public void setLotacao(Departamento _departamento){
        this.lotacao = _departamento;
    }
    
}
