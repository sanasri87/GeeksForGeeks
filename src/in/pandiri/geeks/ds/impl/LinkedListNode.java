package in.pandiri.geeks.ds.impl;

public class LinkedListNode<T> {

	private T data;
	private LinkedListNode<T> next;

	public LinkedListNode(T key) {
		this.data = key;
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public LinkedListNode<T> getNext() {
		return next;
	}

	public void setNext(LinkedListNode<T> next) {
		this.next = next;
	}
}