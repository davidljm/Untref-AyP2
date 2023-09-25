package ayp2.clase06;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		List<String> lista = new LinkedList<String>();
		lista.add("A");
		lista.add("B");
		lista.add("C");
		lista.add("D");

		// Empezar el iterador desde el índice 1
		ListIterator<String> itr1 = lista.listIterator(1);

		// Borrar mientras recorre desde la posición 1:
		while (itr1.hasNext()) {
			itr1.next();
			itr1.remove();
		}

		ListIterator<String> itr2 = lista.listIterator();
		
		// Comprobamos que elementos quedaron en la lista
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
