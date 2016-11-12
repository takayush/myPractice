package sortingAlorithms;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 5, 4, 6, 8, 7 };
		int len = a.length;
		int key, i, j;
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + ", ");
		}
		System.out.println();
		for (j = 1; j < a.length; j++) {
			key = a[j];
			i = j - 1;
			while (i > -1 && a[i] < key) {
				a[i + 1] = a[i];
				i -= 1;
			}
			a[i + 1] = key;
		}
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + ", ");

		}

	}

}
