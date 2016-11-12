package universityCodeSprintChallenge;

import java.math.BigInteger;
import java.util.Scanner;

public class minMaxSum {
	 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int min1 = Math.min(a, b);
        int min2 = Math.min(c,d);
        int min3 = Math.min(min1,min2);
        int min = Math.min(min3 , e);
        int max1 = Math.max(a,b);
        int max2 = Math.max(c,d);
        int max3 = Math.max(max1,max2);
        int max = Math.max(max3, e);
        long minSum, maxSum;
        maxSum = a+ b + c + d + e - min;
        minSum = a + b+ c+ d + e - max;
        System.out.println(minSum + " " + maxSum);
        }
}
