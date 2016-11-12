package dataStructures.linkedLists;

public class MySinglyLinkedList {

}

class LlNode {
	int data;
	LlNode next;

	LlNode Insert(LlNode head, int x) {
		LlNode temp = new LlNode();
		temp.data = x;
		temp.next = null;
		if (head == null) {
			return temp;
		}
		LlNode temp1;
		for (temp1 = head; temp1.next != null; temp1 = temp1.next)
			;
		temp1.next = temp;
		return head;
	}

	void Print(LlNode head) {
		LlNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	LlNode InsertAtHead(LlNode head, int x) {
		LlNode temp = new LlNode();
		temp.data = x;
		temp.next = head;
		return temp;
	}

	LlNode InsertNth(LlNode head, int data, int position) {
		LlNode temp = new LlNode();
		temp.data = data;
		LlNode temp1 = head;
		if (position == 0) {
			temp.next = head;
			return temp;
		}
		for (int i = 0; i < position - 1; temp1 = temp1.next, i++)
			;
		temp.next = temp1.next;
		temp1.next = temp;
		return head;
	}

	LlNode deleteNth(LlNode head, int position) {
		LlNode temp = head;
		if (position == 0) {
			temp = head.next;
			head.next = null;
			return temp;
		}
		for (int i = 0; i < position - 1; i++, temp = temp.next)
			;
		temp.next = temp.next.next;
		return head;
	}

	void recursiveForwardPrint(LlNode head) {
		// base condition
		if (head == null) {
			return;
		}
		// print first
		System.out.println(head.data);
		// recursive call
		recursiveForwardPrint(head.next);
	}

	void reverseRecursivePrint(LlNode head) {
		if (head == null) {
			return;
		}
		// recursive call
		reverseRecursivePrint(head.next);
		// print
		System.out.println(head.data);
	}

	LlNode reverseLinkedList(LlNode head) {

		// base condition
		if (head.next == null) {
			return head;
		}
		LlNode newHead = reverseLinkedList(head.next);

		LlNode temp = head.next;
		temp.next = head;
		head.next = null;

		return newHead;
	}

	LlNode reverseLinkedListIterative(LlNode head) {
		// if list is empty
		if (head == null || head.next == null) {
			return head;
		}

		LlNode current = head;
		LlNode prev = null;
		while (current != null) {
			LlNode next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

	//compare two linked list
	int compareList(LlNode headA, LlNode headB) {
		while (headA != null && headB != null) {
			if (headA.data != headB.data) {
				return 0;
			} else {
				headA = headA.next;
				headB = headB.next;
			}
		}
		if ((headA == null && headB != null) || (headA != null && headB == null)) {
			return 0;
		} else
			return 1;

	}
	
	//Merge two sorted LinkedList
	 

}