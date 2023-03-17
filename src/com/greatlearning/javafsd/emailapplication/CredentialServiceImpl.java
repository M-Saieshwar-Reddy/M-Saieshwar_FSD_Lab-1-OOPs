package com.greatlearning.javafsd.emailapplication;

public class CredentialServiceImpl 
implements ICredentialService {

	@Override
	public String generatePassword() {
		
		
		PasswordGenerator generator = new PasswordGenerator();
		String password =generator.generate(); 
		// TODO Auto-generated method stub
		return password;
		
	}

	@Override
	public String generateEmailAddress(Employee employee) {
		String firstName=employee.getFirstName();
		String lastName=employee.getLastName();
		String department=employee.getDepartment();
		StringBuilder emailBuilder = new StringBuilder();
		emailBuilder.append(firstName);
		emailBuilder.append(".");
		emailBuilder.append(lastName);
		emailBuilder.append("@");
		emailBuilder.append(department);
		emailBuilder.append(".abc.com");
		String emailAddress = emailBuilder.toString();
		employee.setEmailAddress(emailAddress);
		
		
		
		
		// TODO Auto-generated method stub
		return emailAddress;
	}

	public void displayCredentials(Employee employee) {
		StringBuilder messageBuilder = new StringBuilder();
		messageBuilder.append("Dear");
		messageBuilder.append(employee.getFirstName());
		messageBuilder.append("  Your credentials are as fallows");
		
		String newline=System.getProperty("line.separator");
		messageBuilder.append(newline);
		messageBuilder.append("Email     -");
		messageBuilder.append(employee.getEmailAddress());
		
		messageBuilder.append(newline);
		messageBuilder.append("Password     -");
		messageBuilder.append(employee.getPassword());
		String finalMessage = messageBuilder.toString();
		System.out.println(finalMessage);
		
}
}
