package in.pandiri.geeks.test;

import java.util.Random;

import in.pandiri.geeks.algos.Sorting;
import in.pandiri.geeks.algos.StackAlgos;
import in.pandiri.geeks.ds.IQueue;
import in.pandiri.geeks.ds.IStack;
import in.pandiri.geeks.ds.impl.ArrayQueue;
import in.pandiri.geeks.ds.impl.LinkedList;
import in.pandiri.geeks.ds.impl.LinkedListStack;

public class Main {

	private static Random rand = new Random();

	public static void main(String[] args) {
		testNextGreaterElement();
	}

	public static void testNextGreaterElement() {
		int[] arr = Util.createRandomArray(10);
		Util.printArray(arr);
		try {
			StackAlgos.nextGreaterElementElement(arr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testInsertionSort() {

		int[] arr = Util.createRandomArray(10);
		Util.printArray(arr);
		Sorting.insertionSort(arr);
		Util.printArray(arr);
	}

	@SuppressWarnings("unchecked")
	public static void linkedListTest() throws Exception {

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		int len = rand.nextInt(17);
		for (int i = 0; i < len; i++) {
			linkedList.setHead(LinkedList.sortedInsert(linkedList.getHead(),
					rand.nextInt(40)));
		}
		// int k = rand.nextInt(7);
		// System.out.println("Size : " + len + "  k : " + k);
		// LinkedListNode curr = linkedList.getHead();
		// int i = 0;
		// LinkedListNode temp = null;
		// while (curr != null && curr.getNext() != null) {
		// if (i == k) {
		// temp = curr;
		// }
		// curr = curr.getNext();
		// i++;
		// }
		// if (curr != null) {
		// curr.setNext(temp);
		// }
		LinkedList.print(linkedList.getHead());
		System.out.println();
		// LinkedList.print(LinkedList.reverseIterative(linkedList.getHead()));
		// System.out.println(LinkedList.hasCycle(linkedList.getHead()));
		// LinkedList.breakCycle(linkedList.getHead());
		// LinkedList.printIterative(linkedList.getHead());
	}

	public static void queueTest() throws Exception {

		IQueue<Integer> queue = new ArrayQueue<Integer>(17);
		for (int i = 0; i < 12; i++) {
			int x = rand.nextInt(30);
			System.out.println("ENQUEUEING : " + x);
			queue.enque(x);
		}
		for (int i = 0; i < 7; i++) {
			System.out.println("DEQUEUEING : " + queue.deque());
		}
		for (int i = 0; i < 12; i++) {
			int x = rand.nextInt(30);
			System.out.println("ENQUEUEING : " + x);
			queue.enque(x);
		}
		for (int i = 0; i < 7; i++) {
			System.out.println("DEQUEUEING : " + queue.deque());
		}
	}

	public static void stackTest() throws Exception {

		// IStack stack = new ArrayStack(7);
		IStack<Integer> stack = new LinkedListStack<Integer>();
		for (int i = 0; i < 7; i++) {
			int x = rand.nextInt(30);
			System.out.println("PUSHING : " + x);
			stack.push(x);
		}
		while (!stack.isEmpty()) {
			System.out.println("POPPING : " + stack.pop());
		}
	}
}