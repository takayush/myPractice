package chapter1;

import java.util.Iterator;

public class JavaStar {
	public static void main(String[] args) {
		int n = 4;
		// main loop for next line only
		for (int i = 1; i <= n; i++) {
			// for spaces between java letters
			for (int s = 1; s <= 3; s++) {
				System.out.print(" ");
			}
			//******************-----------------------------------------**********************************/////////////////
			// j lettter
			for (int j = 1; j <= i; j++) {
				if(j==i){
					System.out.print("J");
				}
			}


			// /////--------------------------------------------------------------------////////////////////////////////
			// for spaces between java letters
			for (int s = 1; s <= 3; s++) {
				System.out.print(" ");
			}
			// a letter
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			System.out.print("A");
			for (int s = 1; s < i * 2 - 2; s++) {
				if (i == n / 2 + 1)
					System.out.print("A");
				else
					System.out.print(" ");
			}
			if (i != 1)
				System.out.print("A");
			// for spaces between java letters
			// ////********--------------------------------------------------------------------------***************************///////
			for (int s = 1; s <= 3; s++) {
				System.out.print(" ");
			}
			// for spaces before v

			for (int j = 1; j <= i; j++) {
				if (j == i)
					System.out.print("V");
			}
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// for other half of v

			for (int j = 1; j <= n - i - 1; j++) {
				System.out.print(" ");
			}
			//
			if (i < n)
				System.out.print("V");
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			// for spaces between java letters
			for (int s = 1; s <= 3; s++) {
				System.out.print(" ");
			}
			// a letter
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			System.out.print("A");
			for (int s = 1; s < i * 2 - 2; s++) {
				if (i == n / 2 + 1)
					System.out.print("A");
				else
					System.out.print(" ");
			}
			if (i != 1)
				System.out.print("A");
			// for next line only
			System.out.println();
		}
	}
}
