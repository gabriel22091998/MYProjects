/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paymentservice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

/**
 *
 * @author Usuário
 */
public class PaymentService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("Entre os dados do contrato:");
        System.out.print("Número: ");
        Integer number=sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date =LocalDate.parse(sc.nextLine(), fmt);
        System.out.print("Valor do contrato: ");
        Double value=sc.nextDouble();
        Contract contract =new Contract(number, date, value);
        
        System.out.print("Entre com o numero de parcelas: ");
        int x = sc.nextInt();
        ContractService service =new ContractService(new  PaypalService());
        service.processContract(contract, x);
           
        System.out.println("Parcelas: ");
        for(Installment installments: contract.getInstallments()){
        System.out.println(installments.getDueDate().format(fmt)+" - "+installments.getAmount());
        }
        
    }
    
}
