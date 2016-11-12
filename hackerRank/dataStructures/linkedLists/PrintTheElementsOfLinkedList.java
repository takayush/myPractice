package dataStructures.linkedLists;

import java.util.Scanner;

public class PrintTheElementsOfLinkedList {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t;
		t = in.nextInt();
		while (t-- > 0) {
			int x;
			x = in.nextInt();
			LlNode head = new LlNode();
			int l = x;
			while(l-- > 0){
				int y;
				y = in.nextInt();
				head = head.Insert(head, y);
			}
			head.Print(head.next);
		}

	}

}