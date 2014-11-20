package in.pandiri.geeks.ds.impl;

import in.pandiri.geeks.ds.IQueue;

@SuppressWarnings("unchecked")
public class ArrayQueue<T> implements IQueue<T> {

	private T[] arr;
	private int f = 0, r = 0;

	public ArrayQueue(int n) {

		arr = (T[]) new Object[n];
		f = 0;
		r = 0;
	}

	@Override
	public int size() {
		return Math.abs(r - f) % arr.length;
	}

	@Override
	public boolean isEmpty() {
		if (f == r) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if (size() == arr.length - 1) {
			return true;
		}
		return false;
	}

	@Override
	public void enque(T ele) throws Exception {

		if (isFull()) {
			throw new Exception("Queue is Full");
		}

		arr[r++] = ele;
		r = r % arr.length;
	}

	@Override
	public T deque() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue us Empty");
		}
		T ele = arr[f++];
		f = f % arr.length;
		return ele;
	}

	@Override
	public T front() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue us Empty");
		}
		return arr[f];
	}
}