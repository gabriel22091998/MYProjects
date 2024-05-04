/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Usuário
 */
public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    

    public ImportedProduct(Double customsFee, String name, Double price) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

 @Override
 public String priceTag(){
 return super.priceTag()+ totalPrice()+"(Customs fee: $"+ customsFee+")"; 
 }
 
 public Double totalPrice(){
     return super.getPrice()+customsFee;
             }
}
