package sortingAlorithms;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 5, 6, 1 };
		int min, temp;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		for (int i = 0; i < a.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < a.length;j++) {
				if (a[j] < a[min]) {
					min = j;
					System.out.println("min" +a[min]);
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;

		}
		System.out.println("After selection sort");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

}
