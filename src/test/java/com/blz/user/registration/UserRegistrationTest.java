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
}
