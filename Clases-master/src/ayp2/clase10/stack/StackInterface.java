package ayp2.clase10.stack;

public interface StackInterface<T> {

	public boolean isEmpty();

	public void push(T newItem);

	public T pop() throws java.util.NoSuchElementException;

	public T peek() throws java.util.NoSuchElementException;
}
