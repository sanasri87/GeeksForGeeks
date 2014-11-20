package in.pandiri.geeks.ds.impl;

import in.pandiri.geeks.ds.IStack;

@SuppressWarnings("unchecked")
public class ArrayStack<T> implements IStack<T> {

	private int index = -1;
	private T[] arr;

	public ArrayStack() {
		this(100);
	}

	public ArrayStack(int n) {
		this.arr = (T[]) new Object[n];
	}

	public boolean isEmpty() {
		return this.index < 0;
	}

	public boolean isFull() {
		return this.index == this.arr.length - 1;
	}

	public void push(T item) throws Exception {

		if (this.isFull()) {
			throw new Exception("Stack is Full");
		}
		this.arr[++index] = item;
	}

	public T pop() throws Exception {

		if (this.isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return arr[index--];
	}

	public T top() throws Exception {

		if (this.isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return arr[index];
	}
}