/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entities;

import model.exceptions.AccountException;

/**
 *
 * @author Usuário
 */
public class Account {
     private  Integer Numconta;
     private String nome;
     private double saldo;
     private double limit;
    public Account() {
    }

    public Account(Integer Numconta, String nome, double saldo,double limit) {
        this.Numconta = Numconta;
        this.nome = nome;
        this.saldo = saldo;
        this.limit=limit;
    }

    public double getLimit() {
        return limit;
    }

 
   

    public Integer getNumconta() {
        return Numconta;
    }

 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    
    
    
    
public void deposito(double valor){
    this.saldo+= valor;
}
public void saque(double valor) throws AccountException{
    if(limit<valor){
    throw new AccountException("The amount exceeds withdraw limit");
    }
    if(saldo<valor){
    throw new AccountException("Not enough balance");
    }
    this.saldo-= valor;
}
    
    @Override
    public String toString() {
        return "Numero da conta:" + Numconta + ", Titular=" + nome + ", saldo=" + String.format("%.2f", saldo) ;
    }
     
     
    
}
