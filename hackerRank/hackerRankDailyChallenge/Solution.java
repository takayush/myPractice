package hackerRankDailyChallenge;
//next and nextline difference
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i = 4;
		double d = 4.0;
		String s="HackerRank ";
		/* Declare second integer, double, and String variables. */
        int i2;
        double d2;
        String s2;

        /* Read and save an integer, double, and String to your variables.*/
        i2 = scan.nextInt();
        d2 = scan.nextDouble();
        s2 = scan.next(); //waits for the string to enter, even if we enter space than it stops reading
        s2 += scan.nextLine();//Skips when it doesnt gets any value but reads the whole line untill it gets the \\n character 
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+i2);
        /* Print the sum of the double variables on a new line. */
		System.out.println(d+d2);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
		System.out.println("input string " + s2);
    System.out.println(s.concat(s2));


	}

}
