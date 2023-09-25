package ayp2.clase10.queue;

public interface QueueInterface<T> {

    public boolean isEmpty();

    public void enqueue(T newItem);

    public T dequeue();

    public T peek();
}
