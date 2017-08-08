/**
 * 
 */
package arraysAndStrings;

import java.util.Arrays;
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
		String inputString2 = input.nextLine();
		ArraysAndString object = new ArraysAndString();
		try{
		System.out.println("is unique: " + object.isUnique(inputString));
		}catch(NullPointerException e){
			e.printStackTrace();
		}
		System.out.println("is permutation: " + object.permutationBest(inputString, inputString2));

		input.close();
	}
	/*
	 * 1.1 IsUnique implement an algorithm to determine if a string has all
	 * unique character. what if u cannot use additional data structures?
	 */

	/*
	 * String is ascii(0-127) , extended ascii(0-255) or unicode
	 * 
	 * difference between both-->
	 * 
	 * ASCII defines 128 characters, which map to the numbers 0–127. Unicode
	 * defines (less than) 221 characters, which, similarly, map to numbers
	 * 0–221 (though not all numbers are currently assigned, and some are
	 * reserved).
	 * 
	 * Unicode is a superset of ASCII, and the numbers 0–128 have the same
	 * meaning in ASCII as they have in Unicode. For example, the number 65
	 * means "Latin capital 'A'".
	 * 
	 * Because Unicode characters don't generally fit into one 8-bit byte, there
	 * are numerous ways of storing Unicode characters in byte sequences, such
	 * as UTF-32 and UTF-8.
	 */

	// time -->O(1) space O(1)
	public boolean isUnique(String inputString) throws NullPointerException {
		int length = inputString.length();// the length of a java string is O(1)
											// because java's string class
											// stores the length as a field.
		if (length > 128) {
			return false;
		}
		if (length == 1) {
			return true;
		}
		if(length==0){
			throw new NullPointerException("please enter string of atleast 1 length");
		}
		boolean[] charSet = new boolean[128];
		for (int i = 0; i < length; i++) {
			int val = inputString.charAt(i);
			if (charSet[val] == true) {
				return false;
			}
			charSet[val] = true;

		}
		return true;
	}

	// space complexity is o(1) and time complexity is O(n2)
	public boolean isUniqueNSquare(String inputString) {
		int length = inputString.length();
		if (length <= 1) {
			return true;
		}
		inputString = inputString.toLowerCase();
		System.out.println("white spaces" + inputString);
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length - 1; j++) {
				if (inputString.charAt(i) == inputString.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean permutation(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}
		return sort(a).equals(sort(b));
	}

	// helper method for sorting two strings
	String sort(String s) {
		char[] charArray = s.toCharArray();
		/*
		 * When it comes to Java, the Arrays.sort() has two methods to sort an
		 * array.
		 * 
		 * It uses dual-pivot quicksort for primitives, which though better than
		 * a standard quicksort could still degrade into a quadratic running
		 * time.
		 * 
		 * For non-primitive types, it uses TimSort, essetially a hybrid of
		 * merge sort and insertion sort, which makes it adapt to the test cases
		 * with a worst case run-time of Θ(nlogn)Θ(nlog⁡n)
		 * 
		 * For that reason, whenever you need a sorted array, it’s better to use
		 * a non-primitive if your array is huge and may contain nearly sorted
		 * sequences.
		 */
		Arrays.sort(charArray);
		return new String(charArray);
	}

	public boolean permutationBest(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}
		int[] asciiArray = new int[128];// assuming ascii String
		char[] charArrayA = a.toCharArray();
		char[] charArrayB = b.toCharArray();
		for (char first : charArrayA) {
			asciiArray[first]++;
		}
		for (char second : charArrayB) {
			asciiArray[second]--;
			if (asciiArray[second] < 0) {
				return false;
			}
		}
		return true;
	}

}
