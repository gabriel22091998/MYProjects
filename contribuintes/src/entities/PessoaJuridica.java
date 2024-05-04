/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Usuário
 */
public class PessoaJuridica extends Pessoa{
    private Integer NumFunc;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(Integer NumFunc, String name, Double anualIncome) {
        super(name, anualIncome);
        this.NumFunc = NumFunc;
    }

    public Integer getNumFunc() {
        return NumFunc;
    }

    public void setNumFunc(Integer NumFunc) {
        this.NumFunc = NumFunc;
    }

    @Override
    public Double Imposto() {
      if(NumFunc<=10){
       return getAnualIncome()*0.16;
       }else {
       return getAnualIncome()*0.14;
       
       }
    }
    
    
    
    
}
