package com.greatlearning.javafsd.emailapplication.test;

import com.greatlearning.javafsd.emailapplication.CredentialServiceImpl;
import com.greatlearning.javafsd.emailapplication.Employee;

public class CredentialServiceImplTest {
	
	
public static void main(String[] args) {
	
	//testEmailAddressGeneration();
	//testPasswordGeneration();
	testDisplayCredentials();
	
}
	static void testEmailAddressGeneration() {
	CredentialServiceImpl serviceImpl=new CredentialServiceImpl();
	Employee Saieshwar=new Employee("Sai","Eshwar","technical");
	String emailAddress=serviceImpl.generateEmailAddress(Saieshwar);
	System.out.println(emailAddress);
		
	}
	static void testPasswordGeneration() {
		CredentialServiceImpl serviceImpl=new CredentialServiceImpl();
		String password = serviceImpl.generatePassword();
		System.out.println("Password->"+password);
		}
	static void testDisplayCredentials() {
		CredentialServiceImpl serviceImpl=new CredentialServiceImpl();
		Employee Saieshwar=new Employee("Sai","Eshwar","technical");
		
		serviceImpl.generateEmailAddress(Saieshwar);
		String password= serviceImpl.generatePassword();
		Saieshwar.setPassword(password);
		
		
	serviceImpl.displayCredentials(Saieshwar);
		
	}
}

