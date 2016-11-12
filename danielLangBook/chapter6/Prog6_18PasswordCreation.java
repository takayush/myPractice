package chapter6;

import java.util.Scanner;

/*(Check password) Some websites impose certain rules for passwords. Write a
 method that checks whether a string is a valid password. Suppose the password
 rules are as follows:
 A password must have at least eight characters.
 A password consists of only letters and digits.
 A password must contain at least two digits.
 Write a program that prompts the user to enter a password and displays Valid
 Password if the rules are followed or Invalid Password otherwise.
 * 
 * */
public class Prog6_18PasswordCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password;
		int counter = 0;
		Scanner in = new Scanner(System.in);
		for (;;) {
			System.out.println("Please enter your password:");
			password = in.next();
			for (int i = 0; i < password.length(); i++) {
				if (Character.isDigit(password.charAt(i)))
					counter++;
			}
			if (password.matches("^[a-zA-Z_0-9]{8,}+$") && counter >= 2) {
				System.out.println("Valid Password");
				break;
				/*
				 * System.out
				 * .println("A password must contain at least two digits.");
				 */} else {
				System.out.println("InvalidPassword");
				System.out
						.println("A password must have at least eight characters.");
				System.out
						.println("A password consists of only letters and digits.");
			}
		}
		in.close();

	}

}
