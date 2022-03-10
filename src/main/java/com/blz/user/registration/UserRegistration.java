package com.blz.user.registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	/*
	 * @purpose: As a User need to enter a valid First Name. First name starts with
	 * Cap and has minimum 3 characters
	 * 
	 * @param: firstName
	 * 
	 * @function: To check first name is Valid or not
	 * 
	 * @returns true or false
	 */
	public boolean firstName(String firstName) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}
}
