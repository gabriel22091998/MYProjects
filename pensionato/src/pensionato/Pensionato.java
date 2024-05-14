/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pensionato;

import java.util.Scanner;
import quarto.quarto;

/**
 *
 * @author Usuário
 */
public class Pensionato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int x =sc.nextInt();
        sc.nextLine();
        quarto[] hosp= new quarto[10];
        for (int i = 0; i < x; i++) {
        System.out.printf("Rent %d: %n",i+1);
        System.out.print("informe o nome: ");
        String nome = sc.nextLine();
        System.out.print("informe email: ");
        String email = sc.nextLine();
        System.out.print("informe o quarto: ");
        int nq =sc.nextInt();
        sc.nextLine();
        hosp[nq]= new quarto(nome, email);
        }
        System.out.println("Busy rooms:");
        for(int i = 0; i < hosp.length; i++){
            if(hosp[i]!=null){
                System.out.println(i+": " + hosp[i]);
            
            }
            
        }
    }
    
}
