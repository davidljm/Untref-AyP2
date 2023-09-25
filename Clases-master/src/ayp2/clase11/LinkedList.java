package ayp2.clase11;

public class LinkedList<T> {
	private ListNode<T> header;

	public LinkedList() {
		this.header = new ListNode<T>();
	}

	/**
	 * Verifica si la lista está vacía.
	 *
	 * @return true si está vacía, false en caso contrario.
	 */
	public boolean isEmpty() {
		return this.header.getNext() == null;
	}

	/**
	 * Elimina (lógicamente) todos los elemento de la lista.
	 */
	public void makeEmpty() {
		this.header = null;
	}

	/**
	 * @return un iterador apuntando al nodo header.
	 */
	public LinkedListIterator<T> zeroth() {
		LinkedListIterator<T> itr = new LinkedListIterator<T>(header);
		return itr;
	}

	/**
	 * @return un iterador posicionado en el primer elemento de la lista. Si la
	 *         lista está vacía devuelve null.
	 */
	public LinkedListIterator<T> first() {
		LinkedListIterator<T> itr = new LinkedListIterator<T>(header.getNext());
		return itr;
	}

	/**
	 * Devuelve un iterador apuntando al primer nodo que contiene x.
	 *
	 * @param x
	 *            el ítem buscado.
	 * @return un iterador; el iterador no es válido si no encuentra x.
	 */
	public LinkedListIterator<T> find(T x) {
		ListNode<T> itr = header.getNext();

		while (itr != null && !itr.getElement().equals(x))
			itr = itr.getNext();

		return new LinkedListIterator<T>(itr);
	}

	/**
	 * Devuelve un iterador posicionado en el elemento anterior a x.
	 *
	 * @param x
	 *            el ítem buscado
	 * @return si encuentra x devuelve el iterador. Si no encuentra x, devuelve un
	 *         iterador posicionado en el último elemento de la lista.
	 */
	public LinkedListIterator<T> findPrevious(T x) {
		ListNode<T> itr = header;

		while (itr.getNext() != null && !itr.getNext().getElement().equals(x))
			itr = itr.getNext();

		return new LinkedListIterator<T>(itr);
	}

	/**
	 * Inserta x a continuación del nodo apuntado por el iterador p
	 *
	 * @param x
	 *            el elemento a insertar
	 * @param p
	 *            posición después de la cual se insertará x.
	 */
	public void insert(T x, LinkedListIterator<T> p) {
		if (p.isValid() && p.current != null) {
			p.current.setNext(new ListNode<T>(x, p.current.getNext()));
		}

	}

	/**
	 * Elimina la primera ocurrencia de x en la lista.
	 *
	 * @param x
	 *            el ítem a remover.
	 */
	public void remove(T x) {
		LinkedListIterator<T> p = findPrevious(x);

		if (p.current.getNext() != null) {
			p.current.setNext(p.current.getNext().getNext()); // Bypass deleted node
		}

	}

	public int listSize() {
		int contador = 0;
		ListNode<T> actual;

		for (actual = header; actual.getNext() != null; actual = actual.getNext()) {
			contador++;
		}
		return contador;
	}

	public void printList() {

		ListNode<T> actual;

		for (actual = header; actual.getNext() != null; actual = actual.getNext()) {
			System.out.println(actual.getNext().getElement());
		}

	}

}