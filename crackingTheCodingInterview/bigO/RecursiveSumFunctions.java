package bigO;

import java.util.Scanner;

public class RecursiveSumFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1. Permutation of a string");
			System.out.println("2. recursive fibonacci:");
			System.out.println("3. factorial of a no");
			System.out.println("4. sum of a number");
			// add more cases
			System.out.println("5. Memorisation fibonacci series: ");
			System.out
					.println("6. all strings of length k and then cheecking if it is sorted.");

			System.out.println("99. Exit");
			System.out.println("Please enter your choice:");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				String str = "abcd";
				permutation(str);
				System.out.println(str.length());
				for (int i = 0; i < str.length(); i++) {
					System.out.println("  str.substring(0, i) = "
							+ str.substring(0, i) + "str.substring(i+1)"
							+ str.substring(i + 1));
				}
				break;
			case 2:
				System.out.println("Please enter index number");
				int a = input.nextInt();
				for (int i = 0; i < a; i++) {
					System.out.println(i + ":" + fib(i));
				}
				break;
			case 3:
				System.out.println("Please enter a number for factorial: ");
				a = input.nextInt();
				System.out.println("The factorial is " + factorial(a));
				break;
			case 4:
				System.out.println("Please enter no b");
				int b = input.nextInt();
				System.out.println("The sum is" + sum(b));
				break;
			case 5:
				System.out.println("please enter the index for fibonacci");
				int n = input.nextInt();
				allFib(n);
				break;
			case 6:
				System.out
						.println("Please enter the value of k for the string...");
				int k = input.nextInt();
				printSortedStrings(k);

			default:
				if (choice != 99)
					System.out.println("Sorry wrong choice please enter again");
				else
					System.out.println("bye");

			}
		} while (choice != 99);

	}

	static int numChars = 26;

	private static void printSortedStrings(int remaining) {
		// TODO Auto-generated method stub
		printSortedStrings(remaining, "");

	}

	private static void printSortedStrings(int remaining, String prefix) {
		// TODO Auto-generated method stub
		if (remaining == 0) {
			if (isInOrder(prefix)) {
				System.out.println(prefix);
			}
		} else {
			for (int i = 0; i < numChars; i++) {
				System.out.println("i = " + +i);
				char c = ithLetter(i);
				System.out.println("char c = " + c);
				System.out.println("remaining -1 = " + (remaining - 1) +"prefix = " +prefix +"prefix + c =" +(prefix+c));
				printSortedStrings(remaining - 1, prefix + c);
			}
		}

	}

	private static char ithLetter(int i) {
		// TODO Auto-generated method stub
		return (char) ((int) 'a' + i);
	}

	private static boolean isInOrder(String s) {
		// TODO Auto-generated method stub
		for (int i = 1; i < s.length(); i++) {
			int prev = ithLetter(s.charAt(i - 1));
			int curr = ithLetter(s.charAt(i));
			if (prev > curr) {
				return false;
			}

		}
		return true;
	}

	static void allFib(int n) {
		int[] memo = new int[n + 1];
		for (int i = 0; i < n; i++) {
			System.out.println(i + ":" + fib(i, memo));
		}
	}

	public static int sum(int n) {
		if (n <= 0)
			return 0;
		return n + sum(n - 1);
	}

	static int factorial(int n) {
		if (n < 0) {
			return -1;
		} else if (n == 0) {
			return 1;
		} else
			return n * factorial(n - 1);
	}

	static void permutation(String str) {
		permutation(str, "");
	}

	static void permutation(String str, String prefix) {
		if (str.length() == 0) {
			System.out.println(prefix);
		} else {
			for (int i = 0; i < str.length(); i++) {
				String rem = str.substring(0, i) + str.substring(i + 1);
				System.out.println("str" + str);
				System.out.println("str.substring(0, " + i + ") = "
						+ str.substring(0, i) + "str.substring(i(" + i
						+ ")+1)= " + str.substring(i + 1));
				System.out.println("rem = " + rem);
				System.out.println("prefix= " + prefix
						+ " prefix+str.charAt(i(" + i + "))= " + prefix
						+ str.charAt(i));
				System.out
						.println("----------------------------------------recursive call ---------------------------------------------------");
				permutation(rem, prefix + str.charAt(i));
			}
		}
	}

	static int fib(int n) {
		if (n <= 0) {
			return 0;
		} else if (n == 1)
			return 1;
		return fib(n - 1) + fib(n - 2);
	}

	static int fib(int n, int[] memo) {
		if (n <= 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else if (memo[n] > 0) {
			return memo[n];
		}
		memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
		return memo[n];
	}
	
	
}
