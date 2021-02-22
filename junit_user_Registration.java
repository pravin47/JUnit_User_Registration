package com.junit.user.registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JunitUserRegistrationSystem {
	static Scanner sc = new Scanner(System.in);

	public static boolean fName() {

		System.out.println("Enter The First Name First Latter Should Be Capital And Atleast 3 Letter Mandatory");
		String fName = sc.next();
		String regex = "[A-Z]{1}[a-z]{2,}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(fName);
		System.out.println("String Result Is :" + m.matches());
		boolean check = m.matches();
		if (check == true) {
			System.out.println("FIrst Name Is Valid");
		} else {
			System.out.println("First Name Is Invalid");
		}
		return check;
	}

	public static boolean lName() {

		System.out.println("Enter The Last Name First Letter Should Be Capital And Atleast 3 Letter Mandatory");
		String lName = sc.next();
		String regex = "[A-Z]{1}[a-z]{2,}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lName);
		System.out.println("String Result Is:" + m.matches());
		boolean check = m.matches();
		if (check == true) {
			System.out.println("Last Name Is Valid");
		} else {
			System.out.println("Last Name Is Invalid");

		}
		return check;
	}

	public static boolean email() {

		System.out.println("Enter the Valid Email Id");
		String email = sc.next();
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		System.out.println("String Result Is:" + m.matches());
		boolean check = m.matches();
		if (check == true) {
			System.out.println("Email Id Is Valid");
		} else {
			System.out.println("Email Id Is Invalid");
		}

		return check;
	}

	public static boolean phoneNumber() {

		System.out.println("Enter The Mobile Number It Should Be Start From Country Code 91");
		String phoneNumber = sc.next();
		String regex = "[91]+[0-9]{9}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(phoneNumber);
		System.out.println("String Result Is:" + m.matches());
		boolean check = m.matches();
		if (check == true) {
			System.out.println("Phone Number Is Valid");
		} else {
			System.out.println("Phone Number is Invalid");
		}
		return check;
	}

	public static boolean password() {
		System.out.print("1 Enter The At Least 8 Character Password");
		System.out.print("2 At Least One Upper Case");
		System.out.print("3 At Least One Numeric Number");
		String password = sc.next();
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#&$])(?=\\S+$).{8,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		System.out.println("String Result Is:" + m.matches());
		boolean check = m.matches();
		if (check == true) {
			System.out.println("Password Is Valid");
		} else {
			System.out.println("Password Is Invalid");
		}
		return check;
	}

	public static void main(String args[]) {

		fName();
		lName();
		email();
		phoneNumber();
		password();
	}

}
