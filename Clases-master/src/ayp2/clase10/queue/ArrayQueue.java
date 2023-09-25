package ayp2.clase10.queue;

public class ArrayQueue<T> implements QueueInterface<T> {

	private T[] queue;
	private int size;
	private int front;
	private int back;

	@SuppressWarnings("unchecked")
	public ArrayQueue(int max) {
		queue = (T[]) new Object[max];
		size = 0;
		front = 0;
		back = 0;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void enqueue(T newItem) {

	}

	@Override
	public T dequeue() {
		return null;
	}

	@Override
	public T peek() {
		if (isEmpty())
			throw new EmptyStackException();
		return queue[front];
	}

}
