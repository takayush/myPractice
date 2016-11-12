import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		s = s.trim().replaceAll("\\s", "");
		String sequenceOfOperations = s.substring(s.indexOf('/') + 1);
		String expressionTree = s.substring(0, s.indexOf('/'));
		System.out.println("You entered: " + s + " <ExpressionTree>: " + expressionTree + " sequenceOfOperation: "
				+ sequenceOfOperations);
		char[] sequenceOfOperationsArray = sequenceOfOperations.toCharArray();
		String result = doOperations(expressionTree.toCharArray(), sequenceOfOperationsArray);

		System.out.println("result: " + result);

	}

	private static String doOperations(char[] expression, char[] sequenceOfOperationsArray) {
		for (int i = 0; i < sequenceOfOperationsArray.length; i++) {
			if (sequenceOfOperationsArray[i] == 'R')
				expression = doReverse(expression);
			else {
				expression = doSimplify(expression);
			}
		}
		return new String(expression);
	}

	private static char[] doSimplify(char[] expression) {
		ArrayList<Character> list = new ArrayList<Character>();
		Stack<Character> newStack = new Stack<Character>();
		Stack<Character> stack = new Stack<Character>();
		StringBuilder newString = new StringBuilder();
		for (int i = 0; i < expression.length; i++) {
			stack.push(expression[i]);
		}
		newStack.push(')');
		while (!stack.isEmpty()) {
			newStack.push(stack.pop());
		}
		newStack.push('(');

		stack = newStack;
		newStack = new Stack();
		Queue queue;
		int count = 0;
		boolean flag = false;
		while (!stack.isEmpty()) {
			char temp = (char) stack.pop();
			char temp1;
			if (temp == '(') {
				if (stack.peek().equals('(')) {
					flag = true;
					temp1 = (char) stack.pop();
					newString.append(temp1);
					newStack.push(temp1);
				} else {
					newString.append(temp);
					newStack.push(temp);
				}
			} else if (temp == ')') {
				if (flag) {
					flag = false;
				} else {
					newString.append(temp);
					newStack.push(temp);
				}

			} else {
				newString.append(temp);
				newStack.push(temp);
			}
		}

		int length = newString.length();
		String str = newString.substring(1, length - 1);
		newString = new StringBuilder(str);

		stack = newStack;
		return str.toCharArray();
	} /*else

	{
		while (!stack.isEmpty()) {
			newString.append(stack.pop());
		}

	}*/


	private static char[] doReverse(char[] expression) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < expression.length; i++) {
			stack.push(expression[i]);
		}
		for (int i = 0; i < expression.length; i++) {
			char c = stack.pop();
			if (c == '(') {
				expression[i] = ')';
			} else if (c == ')') {
				expression[i] = '(';
			} else
				expression[i] = c;
		}
		return expression;
	}

	// Java program for expression tree
	class Node {

		char value;
		Node left, right;

		// default Constructor
		Node(char item) {
			value = item;
			left = right = null;
		}
	}

	class ExpressionTree {

		// A utility function to check if 'c'
		// is an parenthesis

		boolean isOpeningParenthesis(char c) {
			if (c == '(') {
				return true;
			}
			return false;
		}

		boolean isClosingParenthesis(char c) {
			if (c == ')') {
				return true;
			}
			return false;
		}

	}

}
