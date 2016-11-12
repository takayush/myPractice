package chapter6;

import java.util.Scanner;

/**
 * (Display patterns) Write a method to display a pattern as follows: 1 2 1 3 2
 * 1 ... n n-1 ... 3 2 1 The method header is public static void
 * displayPattern(int n)
 * */

public class Prog6_6NumberDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the no: ");
		int n = in.nextInt();
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				System.out.print(" ");
			}
			for(int j=i+1;j>0;j--){
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
