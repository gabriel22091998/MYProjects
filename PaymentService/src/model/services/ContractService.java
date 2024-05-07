/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.services;

import java.time.LocalDate;
import model.entities.Contract;
import model.entities.Installment;

/**
 *
 * @author Usuário
 */
public class ContractService {
    
    private OnlinePaymentService service;

    public ContractService(OnlinePaymentService service) {
        this.service = service;
    }

    public OnlinePaymentService getService() {
        return service;
    }

    public void setService(OnlinePaymentService service) {
        this.service = service;
    }
    

    public ContractService() {
    }

  
    
    public void processContract(Contract contract,Integer months){
        
        Double value =contract.getTotalValue()/months;
        System.out.println(value);
       
    for(int i=1 ; i<=months;i++){
    LocalDate dueDate =contract.getDate().plusMonths(i);
    Double interest =service.interest(value,i);
    Double fee = service.paymentFee(interest+value);
    Double valueDouble=value+fee+interest;
    Installment installments=new Installment(dueDate, valueDouble);
    contract.addInstallments(installments);
    }
    }
    
}
