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

	/*
	 * @purpose: As a User need to enter a valid last Name. Last name starts with
	 * Cap and has minimum 3 characters
	 * 
	 * @param: lastName
	 * 
	 * @function: To check last name is Valid or not
	 * 
	 * @returns true or false
	 */
	public boolean lastName(String lastName) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}

	/*
	 * @purpose: As a User need to enter a valid email E.g. abc.xyz@bl.co.in - Email
	 * has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @
	 * and . positions
	 * 
	 * @param: email
	 * 
	 * @function: To check email is Valid or not
	 * 
	 * @returns true or false
	 */
	public boolean email(String email) {
		String regex = "^[a-z]+[+-_.]*[a-z]*[@][a-z]+[.][a-z]{2,4}[.]*([a-z]{2})*$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
}
