package in.pandiri.geeks.ds.impl;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class LinkedList<T> {

	private LinkedListNode<T> head;

	public LinkedListNode<T> getHead() {
		return head;
	}

	public void setHead(LinkedListNode<T> head) {
		this.head = head;
	}

	public static void print(LinkedListNode head) {
		if (head == null) {
			System.out.print("NULL");
			return;
		}
		System.out.print(head.getData() + " ==> ");
		print(head.getNext());
	}

	public static void printIterative(LinkedListNode head) {

		LinkedListNode curr = head;
		int i = 0;
		while (curr != null && i < 20) {
			System.out.print(curr.getData() + " ==> ");
			curr = curr.getNext();
			i++;
		}
	}

	public static LinkedListNode nthNode(LinkedListNode head, int n) {

		if (head == null || n < 1) {
			return null;
		}
		LinkedListNode currentNode = head;
		int k = 1;
		while (currentNode != null && k < n) {
			currentNode = currentNode.getNext();
			k++;
		}
		return currentNode;
	}

	public static LinkedListNode nthNodeFromEnd(LinkedListNode head, int n) {

		if (head == null || n < 1) {
			return null;
		}
		LinkedListNode iteratorNode = head;
		LinkedListNode currentNode = head;
		int k = 1;
		while (currentNode != null && k < n) {
			currentNode = currentNode.getNext();
			k++;
		}
		while (currentNode != null && currentNode.getNext() != null) {
			iteratorNode = iteratorNode.getNext();
			currentNode = currentNode.getNext();
		}
		return iteratorNode;
	}

	public static LinkedListNode half(LinkedListNode head) {

		if (head == null || head.getNext() == null) {
			return null;
		}
		LinkedListNode slow = head;
		LinkedListNode fast = head.getNext();
		while (fast != null && fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		LinkedListNode retHead = slow.getNext();
		slow.setNext(null);
		return retHead;
	}

	public static LinkedListNode reverseRecursive(LinkedListNode head) {

		if (head == null || head.getNext() == null) {
			return head;
		}
		LinkedListNode next = head.getNext();
		LinkedListNode rev = reverseRecursive(next);
		head.setNext(null);
		next.setNext(head);
		return rev;
	}

	public static LinkedListNode reverseIterative(LinkedListNode head) {

		if (head == null || head.getNext() == null) {
			return head;
		}
		LinkedListNode curr = head;
		LinkedListNode prev = null;
		LinkedListNode next = null;
		while (curr != null) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		return prev;
	}

	public static boolean hasCycle(LinkedListNode head) {
		if (head == null || head.getNext() == null) {
			return false;
		}
		LinkedListNode slow = head;
		LinkedListNode fast = head.getNext();
		while (fast != null && fast.getNext() != null && slow != fast) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		if (fast == null || fast.getNext() == null) {
			return false;
		}
		return true;
	}

	/**
	 * 
	 * 
	 * @param head
	 */
	public static void breakCycle(LinkedListNode head) {

		// TODO:
		// this doesn't seem to be working if the given list is circular linked
		// list. Remember circular linked list is a special case of singly
		// linked list having a cycle.

		if (head == null || head.getNext() == null || !hasCycle(head)) {
			return;
		}
		LinkedListNode slow = head;
		LinkedListNode fast = head.getNext();
		while (slow != fast) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		LinkedListNode curr = head;
		slow = slow.getNext();
		while (curr.getNext() != slow.getNext()) {
			curr = curr.getNext();
			slow = slow.getNext();
		}
		slow.setNext(null);
	}

	public static LinkedListNode sortedInsert(LinkedListNode head, Integer key) {

		LinkedListNode newNode = new LinkedListNode(key);
		if (head == null || (Integer) head.getData() >= key) {
			newNode.setNext(head);
			return newNode;
		}
		LinkedListNode prev = null;
		LinkedListNode curr = head;
		while (curr != null && ((Integer) curr.getData()) < key) {
			prev = curr;
			curr = curr.getNext();
		}
		prev.setNext(newNode);
		newNode.setNext(curr);
		return head;
	}

	public void insert(Object key) {
		LinkedListNode newNode = new LinkedListNode(key);
		newNode.setNext(this.head);
		this.head = newNode;
	}
}