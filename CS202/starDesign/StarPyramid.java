package starDesign;

public class StarPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for (int i = 1; i <= n; i++) {
			for (int k = i; k < n; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		pyramidOpposite(n);
	}

	public static void pyramidOpposite(int n) {
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 2 * (n - (i)); j >= 0; j--) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}