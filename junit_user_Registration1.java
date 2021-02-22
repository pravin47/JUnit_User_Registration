package com.junit.user.registration;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitUserRegistrationSystemTest {

	@Test
	public void validateFirstNameWhenProperShouldReturnTrue() {
		boolean status = JunitUserRegistrationSystem.fName();
		assertEquals(true, status);
	}

	@Test
	public void validateFirstNameWhenProperShouldReturnFalse() {
		boolean status = JunitUserRegistrationSystem.fName();
		assertEquals(false, status);
	}

	@Test
	public void validateLastNameWhenProperShouldReturnTrue() {
		boolean status = JunitUserRegistrationSystem.lName();
		assertEquals(true, status);

	}

	@Test
	public void validateLastNameWhenProperShouldReturnFalse() {
		boolean status = JunitUserRegistrationSystem.lName();
		assertEquals(false, status);

	}

	@Test
	public void validateEmailWhenProparShouldReturnTrue() {
		boolean status = JunitUserRegistrationSystem.email();
		assertEquals(true, status);
	}

	@Test
	public void validateEmailWhenProparShouldReturnFalse() {
		boolean status = JunitUserRegistrationSystem.email();
		assertEquals(false, status);
	}

	@Test
	public void validatePhoneNumberWhenProperShouldReturnTrue() {
		boolean status = JunitUserRegistrationSystem.phoneNumber();
		assertEquals(true, status);

	}

	@Test
	public void validatePhoneNumberWhenProperShouldReturnFalse() {
		boolean status = JunitUserRegistrationSystem.phoneNumber();
		assertEquals(false, status);

	}

	@Test
	public void validatePasswordWhenProparShouldReturnTrue() {
		boolean status = JunitUserRegistrationSystem.password();
		assertEquals(true, status);
	}

	@Test
	public void validatePasswordWhenProparShouldReturnFalse() {
		boolean status = JunitUserRegistrationSystem.password();
		assertEquals(false, status);
	}
}
