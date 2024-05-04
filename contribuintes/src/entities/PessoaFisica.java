/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Usuário
 */
public class PessoaFisica extends Pessoa{
    private Double gastos;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(Double gastos, String name, Double anualIncome) {
        super(name, anualIncome);
        this.gastos = gastos;
    }

    public Double getGastos() {
        return gastos;
    }

    public void setGastos(Double gastos) {
        this.gastos = gastos;
    }

    @Override
    public Double Imposto() {
       if(getAnualIncome()<20000){
       return getAnualIncome()*0.15-gastos*0.5;
       }else {
       return getAnualIncome()*0.25-gastos*0.5;
       
       }
    }
    
    
}
