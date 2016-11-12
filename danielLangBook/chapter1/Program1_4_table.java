package chapter1;

public class Program1_4_table {
	public static void main(String[] args) {
		int n = 4;
		System.out.println("a a^2 a^3");
		for (int i = 1; i <= n; i++) {
			int mul=1;
			for (int j = 1; j<n; j++) {
				System.out.print(mul=i*mul);
				System.out.print("  ");
			}
			System.out.println();
		}

	}
}
