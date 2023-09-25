package ayp2.clase11;

public class OrderedLinkedList <T extends Comparable<? super T>> extends LinkedList<T>{
	
	public OrderedLinkedList() {
		super();
	}
	
	public void insert(T x) {
		LinkedListIterator<T> it = this.zeroth();
		ListNode<T> actual = it.current;
		while(actual != null &&(actual.getNext() != null)){
			
		    if (x.compareTo(actual.getNext().getElement()) > 0) {
		    	it.advance();
		    	actual=it.current;}
		    else {
		    	break;
		    }
		}
		super.insert(x, it);
	}

	public void insert(T x, LinkedListIterator<T> p) {
		throw new RuntimeException("No implementado");
		
	}
	
}
