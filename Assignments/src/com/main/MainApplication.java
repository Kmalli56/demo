package com.main;

import com.model.Employee;
import com.service.EmployeeService;
/**
 * 
 * @author mounika.kuna
 *
 */
public class MainApplication {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Mounika Kuna",20000f);
		Employee employee2 = new Employee("Jason Daniel",50000f);		

		//Assignment - 1 (Create 2 employee and let know who is drawing higher salary ??)
		EmployeeService employeeService = new EmployeeService();
		Employee maxSalaryEmpDetails = employeeService.displayMaximumSalary(employee1, employee2);		
		System.out.println("Employee having maximum salary");
		System.out.println("	Employee Name	:"+maxSalaryEmpDetails.getEmpName()+"\n"+
							   "	Salary		:"+maxSalaryEmpDetails.getSalary()+"\n");

		//Assignment - 2 (create an array and sum the number)
		float[] salaryArray = new float[2];
		salaryArray[0]=employee1.getSalary();
		salaryArray[1]=employee2.getSalary();
		float sumOfArrayElements = employeeService.displaySumArray(salaryArray);
		System.out.println("Sum of the elements in the array : "+sumOfArrayElements+"\n");	

		//Assignment - 3 (create an array of employee and display the total salary == budget )
		Employee[] employeesArray = new Employee[2];
		employeesArray[0]=employee1;
		employeesArray[1]=employee2;
		float totalBudget = employeeService.displayBudget(employeesArray);
		System.out.println("Total budget : "+totalBudget+"\n");

		//Assignment - 4 (create an array of employee and search for a particular employee)
		try {
			Employee  employeeDetails = employeeService.searchEmployee(employeesArray, "Mounika Kuna");
			System.out.println("Employee details are \n"+
								   "	Employee Name	:"+employeeDetails.getEmpName()+"\n"+
								   "	Salary		:"+employeeDetails.getSalary());
		}catch(NullPointerException npe) {
			System.out.println("Employee details are not found ");
		}
	}
}
