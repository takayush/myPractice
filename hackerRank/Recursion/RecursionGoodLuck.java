package Recursion;

import java.util.Scanner;

public class RecursionGoodLuck {
	public static int summation (int n ){
		//base case
		if(n<=0){
			return 0;
		}
		//recursive case keep going 
		else
			return n + summation (n-1);
	}
	public static int  exponentiation(int n, int p){
		//base case
		if(p<=0){
			return 1;
		}else
			//recursive case
			return n*exponentiation(n,  p-1 );
	}public static int factorial(int n){
	    if(n<=1){
	        return 1;
	    }else
	        return n * factorial (n-1);
	}
	  
	
	public static void main(String[] args) {
		int sum =summation (3);
		int exp = exponentiation(5, 2);
		System.out.println(sum +"exp = "+exp);
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
	}

}
