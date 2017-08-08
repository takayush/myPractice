/**
 * 
 */
package linkedLists;

/**
 * @author takay
 *
 */
public class Node {
	int		data;
	Node	next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}

	Node() {

	}

	// to print the linked list node
	public static void Print(Node head) {
		if (head == null) {
			return;
		}
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	void ReversePrint(Node head) {
		if (head == null) {
			return;
		}
		ReversePrint(head.next);
		System.out.println(head.data);
	}

	Node insertAtTail(Node head, int data) {
		// This is a "method-only" submission.
		// You only need to complete this method.
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		if (head == null) {
			return temp;
		}
		Node current = head;
		while (current.next != null) {// we want to stop on current
			current = current.next;
		}
		current.next = temp;
		return head;
	}

	// insertathead
	Node insertAtHead(Node head, int x) {
		Node temp = new Node();
		temp.data = x;
		temp.next = head;
		return temp;

	}

	Node InsertNth(Node head, int data, int position) {
		Node temp = new Node();
		temp.data = data;
		if (position == 0) {
			temp.next = head;
			return temp;
		}
		Node current = head;
		for (int i = 0; i < position - 1; i++, current = current.next)
			;
		temp.next = current.next;
		current.next = temp;
		return head;
	}

	Node Delete(Node head, int position) {
		// Complete this method
		if (position == 0) {
			return head.next;
		}
		Node current = head;
		for (int i = 0; i < position - 1; i++, current = current.next)
			;
		current.next = current.next.next;
		return head;
	}

}