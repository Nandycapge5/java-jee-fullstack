package com.cap.ui;

import java.util.Scanner;

import com.cap.bean.Employee;
import com.cap.service.EmployeeService;
import com.cap.service.EmployeeServiceImpl;

public class MainUi {
	static EmployeeService service=new EmployeeServiceImpl();
	 static Scanner scanner=new Scanner(System.in);
public static void main(String[]args)
{
	while(true){
		
	
	System.out.println("welcome to EmployeeApp");
	
	System.out.println("1.create employee");
	System.out.println("2.select employee");
	System.out.println("3.exit");
	System.out.println("enter the option");
	int option=scanner.nextInt();
	
	switch(option)
	{
	 case 1:
	
	System.out.println("enter the employeeId:");
int empId=scanner.nextInt();
	System.out.println("enter the employeeName:");
	String empName=scanner.next();
	System.out.println("enter the employeeSalary:");
	int empSal=scanner.nextInt();
	
	Employee employee=new Employee();
	employee.setEmpId(empId);
	employee.setEmpName(empName);
	employee.setEmpSal(empSal);

//calling service method to store employee info
	service.insertEmployee(employee);
	System.out.println("*****");
	System.out.println("employee inserted");
	System.out.println("***");
	 case 2:
		 System.out.println("Fetching data");
		 System.out.println("enter the employeeId:");
		 int empId1=scanner.nextInt();
		 
	Employee emp=((EmployeeServiceImpl) service).retrieveEmployee(empId1);
	System.out.println(emp);
	break;
	 case 3:
	System.out.println("THANK YOU");
	scanner.close();
	System.exit(0);
}}
}
}

