package chapter6;

import java.util.Scanner;

/**
 * (Sum the digits in an integer) Write a method that computes the sum of the
 * digits in an integer. Use the following method header: public static int
 * sumDigits(long n) For example, sumDigits(234) returns 9 (2 + 3 + 4). (Hint:
 * Use the % operator to extract digits, and the / operator to remove the
 * extracted digit. For instance, to extract 4 from 234, use 234 % 10 (= 4). To
 * remove 4 from 234, use 234 / 10 (= 23). Use a loop to repeatedly extract and
 * remove the digit until all the digits are extracted. Write a test program
 * that prompts the user to enter an integer and displays the sum of all its
 * digits.
 * 
 *
 */

public class Prog6_2SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n;
		int sum;
		System.out.println("Please enter a number: ");
		Scanner in = new Scanner(System.in);
		n = in.nextLong();
		sum = sumDigits(n);
		System.out.println("The sum of digits are : " + sum);

	}

	private static int sumDigits(long n) {
		// TODO Auto-generated method stub
		int r = 0, sum = 0;
		;
		do {
			r = (int) (n % 10);
			sum = sum + r;
			n /= 10;
		} while (n!=0);

		return sum;
	}

}
