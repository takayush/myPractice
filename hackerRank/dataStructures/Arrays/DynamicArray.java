package dataStructures.Arrays;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n, q;
		n = in.nextInt();
		q = in.nextInt();
		int[] queryType = new int[q];
		int[] x = new int[q];
		int[] y = new int[q];

		for (int i = 0; i < q; i++) {
			queryType[i] = in.nextInt();
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}

		getDynamicArray(n, queryType, x, y);

	}

	private static void getDynamicArray(int n, int[] queryType, int[] x, int[] y) {
		int lastAns = 0;
		// cannot create array of parameterized type
		// so
		List<List<Integer>> seqList = new ArrayList<List<Integer>>(n);
		for (int i = 0; i < n; i++) {
			seqList.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < x.length; i++) {
			if (queryType[i] == 1) {
				int seq = (x[i] ^ lastAns) % n;
				seqList.get(seq).add(y[i]);
			} else {
				int seq = (x[i] ^ lastAns) % n;
				int valueIndex = y[i] % seqList.get(seq).size();

				lastAns = seqList.get(seq).get(valueIndex);
				System.out.println(lastAns);
			}
		}
	}

}
