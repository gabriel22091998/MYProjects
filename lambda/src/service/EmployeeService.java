/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entities.Employee;
import java.util.List;
import java.util.function.Predicate;


public class EmployeeService {
    public double filteredSum(List<Employee> list, Predicate<Employee> criteria) {
		double sum = 0.0;
		for (Employee e : list) {
			if (criteria.test(e)) {
				sum += e.getSalary();
			}
		}
		return sum;
	}
    
}
