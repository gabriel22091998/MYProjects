/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contribuintes;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class Contribuintes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        
       System.out.print("Enter the number of tax payers:");
       int x =sc.nextInt();
       sc.nextLine();
       List<Pessoa> list = new ArrayList<>();
       for(int i=1;i<=x;i++){
        System.out.println("Tax payer #" + i + " data:");
        System.out.print("Individual or company (i/c)? ");
        char ch = sc.next().charAt(0);
        System.out.print("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Anual income: ");
        Double AnualIncome=sc.nextDouble();
        sc.nextLine();
        if(ch=='i'){
        System.out.print("Health expenditures: ");
	Double HealthExp = sc.nextDouble();
            list.add(new PessoaFisica(HealthExp,name,AnualIncome));
        }else{
       System.out.print("Number of employees: ");
       int NumFunc=sc.nextInt();
       list.add(new PessoaJuridica(NumFunc,name,AnualIncome));
       }
         
    }
       
       Double total=0.0;
         System.out.println();
		System.out.println("PRICE TAGS:");
		for (Pessoa pessoa : list) {
			System.out.println(pessoa.getName()+": $ "+String.format("%.2f", pessoa.Imposto()));
                        total=total+pessoa.Imposto();
		}
                
                System.out.println("TOTAL TAXES: $ "+String.format("%.2f", total));
       sc.close();
    
}}
