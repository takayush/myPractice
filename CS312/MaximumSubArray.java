import java.util.ArrayList;
import java.util.Scanner;

public class MaximumSubArray {
	public static void main(String[] args) {

		int[] arrayInt = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the array:");
		for (int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = sc.nextInt();
		}
		int answer = findMaxCrossingSubArray(arrayInt);
		System.out.println("The maximum sum is: " + answer);
		//divide and conquer
		System.out.println("*******divide and conquer********");
		answer = findByDivideMaximumSubarray(arrayInt, arrayInt.length);
		
	}

	private static int findByDivideMaximumSubarray(int[] arrayInt, int n) {
		// TODO Auto-generated method stub
		if(arrayInt.length==1)
			return arrayInt[0];
		else{
			int mid= n/2;
			int left_MSS = findByDivideMaximumSubarray(arrayInt, mid);
			int right_MSS = findByDivideMaximumSubarray(arrayInt, n-mid);
		}
		return 0;
	}

	private static int findMaxCrossingSubArray(int[] arrayInt) {
		// TODO Auto-generated method stub
		int answer = Integer.MIN_VALUE;
		for (int subArraySizes = 1; subArraySizes <= arrayInt.length; subArraySizes++) {
			for (int startIndex = 0; startIndex < arrayInt.length; startIndex++) {
				
				if (startIndex + subArraySizes > arrayInt.length)
					break;
				int sum = 0;
				for (int i = startIndex; i < startIndex + subArraySizes; i++) {
					System.out.print("sum = ");
					System.out.println(sum + " + " + arrayInt[i]);
					sum = sum + arrayInt[i];
					
				}
				answer = Integer.max(answer, sum);

			}
		}
		return answer;
	}
}
