package starDesign;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int k = i; k < 5; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
