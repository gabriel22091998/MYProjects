/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contaerror;

import java.util.Scanner;
import model.exceptions.AccountException;
import model.entities.Account;

/**
 *
 * @author Usuário
 */
public class ContaError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter account data");
       System.out.print("Number: ");
       Integer num= sc.nextInt();
       sc.nextLine();
       System.out.print("Holder: ");
       String name=sc.nextLine();
       System.out.print("Initial Balance: ");
       Double balance=sc.nextDouble();
       System.out.print("Withdraw limit: ");
       Double limit =sc.nextDouble();
       
       Account conta =new Account(num, name, balance, limit);
       
       try{
           System.out.print("Enter amount for withdraw: ");
           Double withdraw= sc.nextDouble();
           conta.saque(withdraw);
           System.out.println("New Balance: "+ conta.getSaldo());
       }catch(AccountException e){
           System.out.println("Withdraw error:"+e.getMessage());
       }
        sc.close();
       
    }
    
}
