package com.bridgelabz.lambda.UserRegistration_Labmda;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface Regex {
	Boolean validate(String string);
}

public class UserRegistrationLamda {
	private static final String NAME_PATTERN = ("^[A-Z]{1}[a-z]{2,}$");
	private static final String EMAIL_PATTERN = ("^[a-z0-9+_.-]+@[a-zA-Z0-9.-]+$");
	private static final String MOBILE_NUMBER_PATTERN = ("^(0|91)?[7-9][0-9]{9}$");
	private static final String PASSWORD_PATTERN = ("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()�[{}]:;',?/*~$^+=<>]).{8,}$");
	static Scanner input = new Scanner(System.in);

	private static String validFirstName() {
		System.out.println("Enter the FirstName");
		return input.nextLine();
	}

	private static String validLastName() {
		System.out.println("Enter the LastNamel");
		return input.nextLine();
	}

	private static String validEmail() {
		System.out.println("Enter The Email Address");
		return input.next();
	}

	private static String validMobileNumber() {
		System.out.println("Enter The Mobile Number");
		return input.next();
	}

	private static String validPassword() {
		System.out.println("Enter The PassWord");
		return input.next();
	}

	public static String printResult(Boolean result) {
		if (Boolean.TRUE.equals(result))
			return "Your Entry is Valid";
		else
			return "Your Enter is Invalid";
	}

	public static void main(String[] args) {
		Regex validateFirstName = firstName -> Pattern.matches(NAME_PATTERN, firstName);
		Regex validateLastName = lastName -> Pattern.matches(NAME_PATTERN, lastName);
		Regex validateEmail = email -> Pattern.matches(EMAIL_PATTERN, email);
		Regex validateMobileNumber = mobileNumber -> Pattern.matches(MOBILE_NUMBER_PATTERN, mobileNumber);
		Regex validatePassword = password -> Pattern.matches(PASSWORD_PATTERN, password);
		System.out.println(printResult(validateFirstName.validate(validFirstName())));
		System.out.println(printResult(validateLastName.validate(validLastName())));
		System.out.println(printResult(validateEmail.validate(validEmail())));
		System.out.println(printResult(validateMobileNumber.validate(validMobileNumber())));
		System.out.println(printResult(validatePassword.validate(validPassword())));

	}

}