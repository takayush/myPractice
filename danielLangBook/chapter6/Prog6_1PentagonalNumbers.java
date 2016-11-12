package chapter6;

/*
 * 6.1 (Math: pentagonal numbers) A pentagonal number is defined as n(3n–1)/2 for
 n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, . . . .
 Write a method with the following header that returns a pentagonal number:
 public static int getPentagonalNumber(int n)
 Write a test program that uses this method to display the first 100 pentagonal
 numbers with 10 numbers on each line.
 * 
 * */
import java.util.Scanner;

public class Prog6_1PentagonalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		int n = 100, pentagon = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print((pentagon = getPentagonalNumber(i)) + ", ");
			if (i % 10 == 0)
				System.out.println();
		}

	}

	private static int getPentagonalNumber(int n) {
		// TODO Auto-generated method stub
		int pent;
		pent = n * (3 * n - 1) / 2;
		return pent;
	}

}
