package week7Challenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LuckBalance {

	public static void main(String[] args) {
		// n no of preliminary contest
		// k maximum no of contests lema can loose
		int n, k;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		Integer[][] l = new Integer[n][2];
		int sum = 0;
		int counter = 0;
		int luck = 0;
		// lema cannot loose more than k
		for (int i = 0; i < n; i++) {
			l[i][0] = sc.nextInt();
			l[i][1] = sc.nextInt();

		}

		l = arraySortFromMaximumtoMinimum(l);
		for (int i = 0; i < n; i++) {

			System.out.println(" " + l[i][0] + " " + l[i][1]);
			if (l[i][1] == 1 && counter < k) {
				counter++;
				luck += l[i][0];
				
			} 
			else if(l[i][1] == 1 && counter == k){
				luck = luck -  l[i][0];

			}else if (l[i][1] == 0) {
				luck += l[i][0];
			}
			System.out.println("counter " +counter +"k = " +k +"luck" +luck);


		}
		System.out.println(luck);
		sc.close();
	}

	public static Integer[][] arraySortFromMaximumtoMinimum(Integer[][] input) {
		Arrays.sort(input, new Comparator<Integer[]>() {

			@Override
			public int compare(Integer[] int1, Integer[] int2) {
				// TODO Auto-generated method stub
				Integer keys1 = int1[0];
				Integer keys2 = int2[0];
				return keys2.compareTo(keys1);
			}

		});
		return input;
	}
}
