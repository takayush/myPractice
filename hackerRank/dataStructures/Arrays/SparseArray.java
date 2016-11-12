package dataStructures.Arrays;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class SparseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] strArray = new String[n];
		Map<String, Integer> map = new HashMap<String, Integer>();
		in.nextLine();
		
		
		for (int i = 0; i < n; i++) {
			strArray[i] = in.nextLine();
			// next can read input separated by space whereas nextLine can read
			// the input separated by \n nextLine
			if (map.containsKey(strArray[i])) {
				// strArray++doesnt work in maps java
				map.put(strArray[i], map.get(strArray[i]) + 1);
			} else {
				map.put(strArray[i], 1);

			}
		}
		int q = in.nextInt();
		in.nextLine();//to move towards nextLine otherwise it will take the input "" i.e empty string
		String[] queryString = new String[q];
		for (int i = 0; i < q; i++) {
			queryString[i] = in.nextLine();
			if (map.containsKey(queryString[i])) {
				System.out.println(map.get(queryString[i]));
			}else
				System.out.println(0);
		}
		in.close();

	}

}
