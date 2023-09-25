package ayp2.clase11;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Integer> lista = new LinkedList<Integer>();
		LinkedListIterator<Integer> itr = lista.zeroth();
		lista.printList();
		for (int i = 0; i < 10; i++) {
			lista.insert(i, itr);
			lista.printList();
			itr.advance();
		}
		System.out.println("Size was: " + lista.listSize());
		for (int i = 0; i < 10; i += 2) {
			lista.remove(i);
		}
		for (int i = 0; i < 10; i++) {
			if ((i % 2 == 0) == (lista.find(i).isValid())) {
				System.out.println("Find fails!");
			}
		}
		System.out.println("Finished deletions");
		lista.printList();

		OrderedLinkedList<Integer> lista2 = new OrderedLinkedList<Integer>();
		System.out.println("Lista ordenada\n\n");
		lista2.insert(10);
		lista2.insert(-1);
		lista2.insert(100);
		lista2.insert(1);
		lista2.insert(10);
		
		lista2.printList();
	
	}

	
	
	
}