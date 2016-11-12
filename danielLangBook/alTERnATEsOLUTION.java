
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.LinkedList;
	import java.util.Queue;
	import java.util.Scanner;
	import java.util.Stack;
	import java.util.stream.Collectors;

	public class alTERnATEsOLUTION {
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
			Queue<Character> queue = new LinkedList<Character>();
			Stack<Character> stack = new Stack<Character>();
			for (int i = 0; i < expression.length; i++) {

				queue.add(expression[i]);

			}
			ArrayList<Character> list = new ArrayList<Character>();
			while (!queue.isEmpty()) {
				char current = queue.poll();

				if (current == '(') {
					// checkForClosingBracketAndRemove();
					if (stack.isEmpty()) {
						// delete the element
					} else {
						list.add(current);
					}
					stack.push(current);
				} else if (current == ')') {
					stack.pop();
					if (stack.isEmpty()) {
						// delete the element
					} else {
						list.add(current);
					}
				} else {
					list.add(current);
				}
			}
			String string = list.stream().map(c -> c.toString()).collect(Collectors.joining(""));

			char[] charArray = string.toCharArray();
			return charArray;
		}

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


