package com.greatlearning.javafsd.emailapplication;

public interface ICredentialService {
  String generatePassword();
  //generateEmailAddress(String firstName,
	//	  String lastName,String department);
  String generateEmailAddress(Employee employee);
  void displayCredentials(Employee employee);
  
  
  

}
