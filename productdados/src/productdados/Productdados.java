/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productdados;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class Productdados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
       Scanner sc = new Scanner(System.in);
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       
       List<Product> list = new ArrayList<>();
       System.out.print("Enter the number of products:");
       int x =sc.nextInt();
       sc.nextLine();
       
       
       
        for (int i =1 ; i <=x; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
	    char ch = sc.next().charAt(0);
	    System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price=sc.nextDouble();
            sc.nextLine();
            
        if(ch=='i'){
        System.out.print("Customs fee:: ");
	Double Customsfee = sc.nextDouble();
        list.add(new ImportedProduct(Customsfee, name, price));     
        } else if (ch=='u'){ 
            System.out.print("Manufacture date (DD/MM/YYYY): ");
            Date manufacDate = sdf.parse(sc.next()); 
            list.add(new UsedProduct(manufacDate, name, price) );   
        }else{
        list.add(new Product(name,price));
        }
       
        }
        System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product xProduct : list) {
			System.out.println(xProduct.priceTag());
		}
       sc.close();
    }
    
}
