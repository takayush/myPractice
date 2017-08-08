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

	// compare two linked list
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

	// to find the length of the list
	int length(LlNode head) {
		if (head == null) {
			return 0;
		}
		int length = 0;
		LlNode current = head;
		while (current != null) {
			current = current.next;
			length++;
		}
		return length;
	}

	// Brute Force method to find the intersection of given list
	LlNode findMergePointBrute(LlNode headA, LlNode headB) {
		int lengthA = length(headA);
		int lengthB = length(headB);

		// overall complexity O(mn);
		LlNode B = headB;
		for (int i = 0; i < lengthA; i++) {
			// reset B
			B = headB;
			for (int j = 0; j < lengthB; j++) {
				if (headA == B) {
					return headA;
				}
				B = B.next;
			}
			headA = headA.next;
		}
		// if nothing found
		return null;
	}

	// use set and improve the efficiancy

	// insert in set takes logn if c++
	// insert in java HashSet use O(1)

	// use another method
	LlNode findMergePointOptimum(LlNode headA, LlNode headB) {
		int lengthA = length(headA); // O(lengthA+lengthB)
		int lengthB = length(headB);
		int difference = lengthB - lengthA;
		if (lengthA > lengthB) {
			difference = lengthA - lengthB;
			// swap the LinkedList
			LlNode temp = headA;
			headA = headB;
			headB = temp;
		}

		// walk through the nodes
		for (int i = 0; i < difference; i++) {
			headB = headB.next;
		}

		while (headA != null && headB != null) {
			if (headA == headB) {
				return headA;
			}
			headA = headA.next;
			headB = headB.next;
		}
		return null;
	}

	/*
 * @formatter:off
 * algorithm for 
 * while A not empty or B not empty:
   if first element of A < first element of B:
      remove first element from A
      insert element into C
   end if
   else:
      remove first element from B
      insert element into C
	end while
	
	@formatter:on
 * 
*/

	// Merge two sorted LinkedList
	LlNode mergeLists(LlNode headA, LlNode headB) {
		LlNode newHead = new LlNode();
		LlNode current = null;
		LlNode p = headA;
		LlNode q = headB;

		if (p != null || q != null) {
			if (p.data < q.data) {
				current = p;
				p = p.next;
			} else if (p.data > q.data) {
				current = q;
				q = q.next;
			} else {
				current = q;
				q = q.next;
				p = p.next;
			}
		}
		newHead = current;
		current = new LlNode();
		newHead.next = current;
		while (p != null || q != null) {
			if (p.data < q.data) {
				current = p;
				p = p.next;
			} else if (p.data > q.data) {
				current = q;
				q = q.next;
			} else {
				current = q;
				q = q.next;
				p = p.next;
			}
			current.next = null;
			current = current.next;

		}

		return newHead;
	}

	// recursive mergeList function
	// TODO understand the recursive mergelist function:
	LlNode mergeListRecursive(LlNode list1, LlNode list2) {
		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;

		if (list1.data < list2.data) {
			list1.next = mergeListRecursive(list1.next, list2);
			return list1;
		} else {
			list2.next = mergeListRecursive(list2.next, list1);
			return list2;
		}
	}

	int getNodeValue(LlNode head, int n) {
		return 0;
	}

}