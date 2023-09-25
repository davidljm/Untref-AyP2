package finalEJ3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Ej3 {

	public Ej3() {

	}

	public ArrayList<Integer> devolverArray(Queue<Integer> cola, int k) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		int aux;
		int tamano = cola.size();
		aux = cola.size() - k;
		for (int i = 0; i < k; i++) {
			if (k >= tamano) {
				array.add(cola.poll());
			} else {
				if (cola.size() == k) {
					array.add(cola.poll());
				}
				for (int j = 0; j < aux; j++) {
					cola.poll();
				}

			}

		}

		return array;

	}

	public static void main(String[] args) {
		Ej3 ej3 = new Ej3();
		Queue<Integer> cola = new ArrayDeque<Integer>();
		cola.add(1);
		cola.add(2);
		cola.add(3);
		cola.add(4);
		cola.add(5);

		System.out.println(ej3.devolverArray(cola, 3));

	}
}
