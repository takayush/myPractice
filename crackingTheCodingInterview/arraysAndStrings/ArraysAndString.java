/**
 * 
 */
package arraysAndStrings;

import java.util.Scanner;

/**
 * @author takay
 *
 */
public class ArraysAndString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please enter a string: ");
		// input a string
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		ArraysAndString object = new ArraysAndString();
		object.isUnique(inputString);
		input.close();

	}
	/*
	 * 1.1 IsUnique implement an algorithm to determine if a string has all
	 * unique character. what if u cannot use additional data structures?
	 */
	
	public boolean isUnique(String inputString){
		
		return false;
	}

}
