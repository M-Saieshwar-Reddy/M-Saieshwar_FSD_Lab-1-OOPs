package com.greatlearning.javafsd.emailapplication;

import java.util.Scanner;

public class DriverClass {
private static Scanner input;

public static void main(String[] args) {
	input = new Scanner(System.in);
	String firstName="Sai";
	String lastName="Eshwar";
	
	System.out.println("Welcome to Emaul Application");
	System.out.println("To sepcify your department,enter the corresponding department number->");
	System.out.println("1.Technical");
	System.out.println("2.Admin");
	System.out.println("3.Human Resourse");
	System.out.println("4.Legal");
	int departmentOption=input.nextInt();
	String departmentName = null;
	switch(departmentOption) {
	case 1:{
		departmentName="technical";
		break;
	}
    case 2:{
    	departmentName="admin";
		break;
		
	}
    case 3:{
    	departmentName="hr";
    	break;
    
	}
    case 4:{
    	departmentName="legal";
    	break;
	}
    default:{
    	System.out.println("Invalid department choosen ,Please select correct option between 1 and 4 only");
    	System.exit(-1);
	}
	}
	Employee employee = new Employee(firstName,lastName,departmentName);
			CredentialServiceImpl credentialServiceImpl=new CredentialServiceImpl();
	       credentialServiceImpl.generateEmailAddress(employee);
	       String password= credentialServiceImpl.generatePassword();
	        employee.setPassword(password);
	        credentialServiceImpl.displayCredentials (employee);
	       input.nextLine();
}
}
