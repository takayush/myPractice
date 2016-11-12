package week7Challenge;

import java.util.Scanner;

public class Kangaroo {
	public static void main(String[] args) {
		int x1, x2, v1, v2;
		Scanner scan = new Scanner(System.in);
		x1 = scan.nextInt();
		v1 = scan.nextInt();
		x2 = scan.nextInt();
		v2 = scan.nextInt();
		if (v2 >= v1) {
			System.out.println("NO");
		} else {
			while (true) {
				x2 += v2;
				x1 += v1;
				if (x1 == x2) {
					System.out.println("YES");
					break;
				} else if (x2 < x1) {
					System.out.println("NO");
					break;
				}
			}
			if (x1 == Integer.MAX_VALUE) {
				if (x1 != x2) {
					System.out.println("NO");

				}
			}
		}
		scan.close();
	}
}
