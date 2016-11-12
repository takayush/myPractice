package chapter2;

import java.util.Scanner;

public class Chapter2_Miscelleneous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(25.0 / 4.0);
		// *******************************
		System.out.println(2 * (5 / 2 + 5 / 2));
		System.out.println(2 * 5 / 2 + 2 * 5 / 2);
		System.out.println(2 * (5 / 2));
		System.out.println(2 * 5 / 2);
		// ******************************
		System.out.println("25 / 4 is " + 25 / 4);
		System.out.println("25 / 4.0 is " + 25 / 4.0);
		System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
		System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);
		// ******************************
		System.out.println(Math.pow(2, 3.5));
		// *******************************
		int m = 3, r = 2;
		System.out.println((float) m * r * r);
		// *********************************************
		long totalMilliseconds, totalSeconds, totalMinutes, totalHours, currentSeconds, currentMinute, currentHour;
		totalMilliseconds = System.currentTimeMillis();
		totalSeconds = (totalMilliseconds / (1000));
		totalMinutes = totalSeconds / 60;
		totalHours = totalMinutes / 60;
		currentSeconds = totalSeconds % 60;
		currentMinute = totalMinutes % 60;
		currentHour = totalHours % 24;
		System.out.println("Total Minutes: " + totalMinutes);
		System.out.println(totalSeconds);
		System.out.println("Time: " + currentHour + ":" + currentMinute + ":"
				+ currentSeconds);
		// *******************************
		// no of days
		long totalDays = totalHours / 24;
		long totalYears = totalDays / 365;
		long totalMonth, currentDay, currentMonth, currentYear;
		totalMonth = totalDays / 30;
		currentYear = (totalYears + 1970) % 2000;
		currentMonth = (totalMonth + 5) % 12;// **************
		currentDay = (totalDays + 2) % 30;
		System.out.println("no os total days: " + totalDays + "total month: "
				+ totalMonth + " and years: " + totalYears);
		System.out.println("Date:" + currentDay + ":" + currentMonth + ":"
				+ currentYear);
		// *************************************************
		System.out
				.println("***********************************Change*********************************************");
		Change2_6();
	}

	public static void Change2_6() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number");
		float x = in.nextFloat();
		int remainingAmount = (int) (x * 100), dollars, quarters, dimes, nickels, pennies;
		dollars = remainingAmount / 100;
		System.out.println("dollar: " + dollars);
		remainingAmount = remainingAmount % 100;
		quarters = remainingAmount / 25;
		System.out.println("Quarter: " + quarters);
		remainingAmount = remainingAmount % 25;
		dimes = remainingAmount / 10;
		System.out.println("dimes: " + dimes);
		remainingAmount = remainingAmount % 10;
		nickels=remainingAmount/5;
		System.out.println("Nickels: "+nickels);
		remainingAmount=remainingAmount%5;
		pennies=remainingAmount;
		System.out.println("Pennies: "+pennies);
	}
}
