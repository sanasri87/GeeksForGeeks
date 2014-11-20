package in.pandiri.geeks.ds;

public interface IStack<T> {

	public boolean isEmpty();

	public boolean isFull();

	public void push(T item) throws Exception;

	public T pop() throws Exception;

	public T top() throws Exception;
}