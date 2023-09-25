package ayp2.clase06;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(2);
		lista.add(4);
		lista.add(6);

		ListIterator<Integer> itr1 = lista.listIterator(0);

		System.out.println("Ascendente:");
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		System.out.println("Descendente:");
		while (itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}

		ListIterator<Integer> itr2 = lista.listIterator(lista.size());

		System.out.println("Descendente:");
		while (itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}

		System.out.println("Ascendente:");
		for (Integer x : lista) {
			System.out.println(x);
		}
	}
}
