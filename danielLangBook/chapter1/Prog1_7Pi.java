package chapter1;

public class Prog1_7Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double no = 1.0, pi = 1;
		int j = -1;
		for (int i = 3; i < 13; i += 2) {

			pi = pi + j * (no / i);
			System.out.println("insideloop  " + pi + "  i===" + i + "j=" + j);
			j=-j;
		}
		
		
		System.out.println(4 * pi);
		pi = 1;
		for (int i = 3; i <= 13; i += 2) {
			pi = pi - no / i;
			i += 2;
			if (i <= 13){
				pi += no / i;
				System.out.println("if i " +i);
			}
		}
		System.out.println(4 * pi);
	}

}
