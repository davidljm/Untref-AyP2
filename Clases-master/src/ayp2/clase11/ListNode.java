package ayp2.clase11;

class ListNode<T> {
	private T element;
	private ListNode<T> next;

	public ListNode() {
		this.element = null;
		this.next = null;
	}

	public ListNode(T elemento) {
		this.element = elemento;
		this.next = null;
	}

	public ListNode(T elemento, ListNode<T> proximo) {
		this.element = elemento;
		this.next = proximo;
	}

	public ListNode<T> getNext() {
		return next;
	}

	public void setNext(ListNode<T> next) {
		this.next = next;
	}

	public T getElement() {
		return element;
	}

}