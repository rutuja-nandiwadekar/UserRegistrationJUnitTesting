package com.blz.user.registration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void givenFirstName_WhenValid_ShouldReturnTrue() {
		boolean result = userRegistration.firstName("Rutuja");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
		boolean result = userRegistration.firstName("rutuja");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenValid_ShouldReturnTrue() {
		boolean result = userRegistration.lastName("Nandiwadekar");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenInvalid_ShouldReturnFalse() {
		boolean result = userRegistration.lastName("patil");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue() {
		boolean result = userRegistration.email("abc.xyz@bl.co.in");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenInvalid_ShouldReturnFalse() {
		boolean result = userRegistration.email("abc.xyz.in");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
		boolean result = userRegistration.mobileNumber("91 9919819801");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenMobileNumber_WhenInvalid_ShouldReturnFalse() {
		boolean result = userRegistration.mobileNumber("9919819801");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() {
		boolean result = userRegistration.password("imrutuja");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPassword_WhenInvalid_ShouldReturnFalse() {
		boolean result = userRegistration.password("ru");
		Assert.assertEquals(false, result);
	}
}
