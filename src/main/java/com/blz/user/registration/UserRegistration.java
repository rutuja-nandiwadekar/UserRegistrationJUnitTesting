package com.blz.user.registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	static String regex;

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
		regex = "^[A-Z]{1}[a-z]{2,}$";
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
		regex = "^[A-Z]{1}[a-z]{2,}$";
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
		regex = "^[a-z]+[+-_.]*[a-z0-9]*[@][a-z]+[.][a-z]{2,4}[.]*([a-z]{2})*$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	/*
	 * @purpose: As a User need to follow pre defined Mobile Format - E.g. 91
	 * 9919819801 - Country code follow by space and 10 digit number
	 * 
	 * @param: mobileNumber
	 * 
	 * @function: To check mobile Number is Valid or not
	 * 
	 * @returns true or false
	 */
	public boolean mobileNumber(String mobileNumber) {
		regex = "^[91]+[ ]?[6-9]{1}[0-9]{9}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobileNumber);
		return matcher.matches();
	}

	/*
	 * @purpose: As a User need to follow pre-defined Password rules. RULE1 –
	 * minimum 8 Characters - NOTE – All rules must be passed
	 * 
	 * @param: password
	 * 
	 * @function: To check password is Valid or not
	 * 
	 * @returns true or false
	 */
	public boolean password(String password) {
		regex = "^[a-z]{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}
}
