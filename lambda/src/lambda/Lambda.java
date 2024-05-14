/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lambda;

import entities.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import service.EmployeeService;

/**
 *
 * @author Usuário
 */
public class Lambda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String path = sc.nextLine();
        

        try ( BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Employee> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
                
            }
            System.out.print("Enter salary: ");
            Double salary = sc.nextDouble();
            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
            List<String> email = list.stream()
                    .filter(x -> x.getSalary() > salary)
                    .map(x -> x.getEmail()).sorted()
                    .collect(Collectors.toList());

            email.forEach(System.out::println);
           EmployeeService es =new EmployeeService();
           double sum = es.filteredSum(list, p -> p.getName().charAt(0) == 'M');
            System.out.println("Sum of salary of people whose name starts with 'M' :" + String.format("%.2f", sum));
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

}
