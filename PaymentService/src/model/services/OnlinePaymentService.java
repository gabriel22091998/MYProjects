/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model.services;

/**
 *
 * @author Usuário
 */
public interface OnlinePaymentService {
    
     Double paymentFee( Double amount);
     Double interest(Double amount,Integer months);
}
