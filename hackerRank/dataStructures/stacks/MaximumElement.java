package dataStructures.stacks;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n, x, type;
		Stack<StackNode> stack = new Stack<StackNode>();
		n = in.nextInt();
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			type = in.nextInt();
			
			if (type == 1) {
				x = in.nextInt();

				if (max < x) {
					max = x;
				}
				StackNode curNode = new StackNode(x, max);
				stack.push(curNode);
			} else if (type == 2) {
				if (!stack.isEmpty())
					stack.pop();
				if (stack.isEmpty()) {
					max = Integer.MIN_VALUE;
				} else {
					max = stack.peek().curMax;
				}
			} else {
				if (!stack.isEmpty())
					System.out.println(stack.peek().curMax);
			}
		}

		in.close();
	}
}

class StackNode {
	int data;
	int curMax;

	public StackNode(int data, int curMax) {
		this.data = data;
		this.curMax = curMax;
	}

	public String toString() {
		return data + "[" + curMax + "]";
	}

}
