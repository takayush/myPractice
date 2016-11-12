package chapter6;

import java.util.Scanner;

/*
 * 
 * (Palindrome integer) Write the methods with the following headers
 // Return the reversal of an integer, i.e., reverse(456) returns 654
 public static int reverse(int number)
 // Return true if number is a palindrome
 * 
 public static boolean isPalindrome(int number)
 Use the reverse method to implement isPalindrome. A number is a palindrome
 if its reversal is the same as itself. Write a test program that prompts the
 user to enter an integer and reports whether the integer is a palindrome.
 * 
 * */
public class Prog6_3PallindromeReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reversedNumber, n = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		n = in.nextInt();
		reversedNumber = reverse(n);
		System.out.println("Reversed number is:: " + reversedNumber);
		boolean ispal = isPalindrome(n);
		if (ispal)
			System.out.println("The no is pallindrome");
		else
			System.out.println("The no is not Palindrome.");
	}

	private static boolean isPalindrome(int n) {
		// TODO Auto-generated method stub
		boolean pal = false;
		if (n == reverse(n))
			pal = true;
		return pal;
	}

	private static int reverse(int n) {
		// TODO Auto-generated method stub
		int reversedInteger = 0;
		while (n != 0) {
			reversedInteger = (reversedInteger * 10) + n % 10;
			n = n / 10;
		}
		return reversedInteger;
	}

}
