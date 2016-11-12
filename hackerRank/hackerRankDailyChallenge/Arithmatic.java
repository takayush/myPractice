package hackerRankDailyChallenge;

import java.util.Scanner;

public class Arithmatic {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      double tip,tax;
        // Write your calculation code here.
        tip = mealCost * ((float)tipPercent/100);
        tax = mealCost *((float)taxPercent/100);
       System.out.println("tip = " +tip +"tax = " +tax);
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(mealCost + tip + tax);
      
        // Print your result
        System.out.println("The total meal cost is " + totalCost +" dollars.");
    }
}
