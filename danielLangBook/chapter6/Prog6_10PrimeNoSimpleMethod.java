package chapter6;

import java.util.Scanner;

public class Prog6_10PrimeNoSimpleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, counter = 0;
		System.out.println("Please enter the the limit :");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				counter++;
				if (counter % 10 == 0) {
					System.out.printf("%-5s\n", i);
				} else
					System.out.printf("%-5s", i);
			}
		}

	}

	private static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;

	}

}
