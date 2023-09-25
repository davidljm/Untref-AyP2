package ayp2.clase11;

public class LinkedListIterator<T> {
	ListNode<T> current; // elemento actual

	/**
	 * Construye un iterador para la lista enlazada
	 *
	 * @param nodo
	 *            un nodo de la lista.
	 */
	public LinkedListIterator(ListNode<T> nodo) {
		current = nodo;
	}

	/**
	 * Verifica si current apunta a un nodo válido de la lista.
	 *
	 * @return true if the current position is valid.
	 */
	public boolean isValid() {
		return current != null;
	}

	/**
	 * Devuelve el ítem guardado en la posición actual del iterador.
	 *
	 * @return el ítem actual, o null si el iterador no apunta a un nodo válido.
	 */
	public T retrieve() {
		return isValid() ? current.getElement() : null;
	}

	/**
	 * Avanza el iterador al próximo elemento de la lista. Si la posición actual del
	 * iterador es null, entonces no hace nada
	 */
	public void advance() {
		if (isValid()) {
			current = current.getNext();
		}
	}
}