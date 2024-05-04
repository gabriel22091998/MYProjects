/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Usuário
 */
public class UsedProduct extends Product{
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(Date manufactureDate, String name, Double price) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    
    @Override
 public String priceTag(){
 return super.priceTag()+"(Manufacture Date: "+ sdf.format(manufactureDate)+")"; 
 }
    
}
