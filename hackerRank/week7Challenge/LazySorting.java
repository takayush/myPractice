package week7Challenge;

import java.util.Scanner;

public class LazySorting {
	public static void main(String[] args) {
		// N = SIZE OF PERMUTAION

		int n;
		double expectedNoOfMinutes=1;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		double sum= 0 ;
		for (int i = 1; i < n; i++) {
			
			expectedNoOfMinutes *= i+1;
			//System.out.println("sum"+ Math.pow(.5, i));
		}
		System.out.printf("%.6f", expectedNoOfMinutes);
		sc.close();

	}
}
