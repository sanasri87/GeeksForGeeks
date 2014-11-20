package in.pandiri.geeks.ds.impl;

import in.pandiri.geeks.ds.IStack;

public class LinkedListStack<T> implements IStack<T> {

	private LinkedListNode<T> head = null;

	@Override
	public boolean isEmpty() {
		return this.head == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public void push(T item) throws Exception {

		LinkedListNode<T> newNode = new LinkedListNode<T>(item);
		newNode.setNext(this.head);
		this.head = newNode;
	}

	@Override
	public T pop() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		LinkedListNode<T> temp = head;
		this.head = this.head.getNext();
		return temp.getData();
	}

	@Override
	public T top() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return head.getData();
	}
}