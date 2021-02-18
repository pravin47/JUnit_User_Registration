package com.junit.user.registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JunitUserRegistrationSystem {
	static Scanner sc = new Scanner(System.in);

	public static void fName() {

		System.out.println("Enter The First Name First Latter Should Be Capital And Atleast 3 Letter Mandatory");
		String fName = sc.next();
		String regex = "[A-Z]{1}[a-z]{3,}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(fName);
		System.out.println("String Result Is :" + m.matches());
	}

	public static void main(String args[]) {

		fName();
	}

}
