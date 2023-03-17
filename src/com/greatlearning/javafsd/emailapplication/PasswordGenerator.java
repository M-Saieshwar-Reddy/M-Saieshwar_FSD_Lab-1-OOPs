package com.greatlearning.javafsd.emailapplication;

import java.util.Random;

public class PasswordGenerator {
	
public String generate() {

	String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters="abcdefghijlkmnopqrstuvwxyz";
	String numbers="0123456789";
	String specialCharacter="~!@#$%^&*()_;";
	String combinedString=capitalLetters+smallLetters
			+numbers+specialCharacter;
	
	Random randomObj = new Random();
	StringBuilder passwordBuilder=new StringBuilder();
	
	for(int index=1;index<=8;index++) {
		
	int lenght= combinedString.length();
	System.out.println("Length->"+lenght);
	int randomIndex =randomObj.nextInt(lenght);
	System.out.println("RandomIndex->"+randomIndex);
	char charValve=combinedString.charAt(randomIndex);
	System.out.println("Char Valve->"+charValve);
	passwordBuilder.append(charValve);

	}
	String password=passwordBuilder.toString();
	return password;
}
}
