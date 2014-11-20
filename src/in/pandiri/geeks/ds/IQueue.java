package in.pandiri.geeks.ds;

public interface IQueue<T> {

	public int size();

	public boolean isEmpty();

	public boolean isFull();

	public void enque(T ele) throws Exception;

	public T deque() throws Exception;

	public T front() throws Exception;
}