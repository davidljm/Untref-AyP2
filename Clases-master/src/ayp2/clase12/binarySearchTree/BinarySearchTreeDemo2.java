package ayp2.clase12.binarySearchTree;

import java.util.Iterator;

public class BinarySearchTreeDemo2 {
	public static void main(String[] args) {
		
		BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();
		
		t.insert(16);
		t.insert(14);
		t.insert(19);
		t.insert(11);
		t.insert(58);
		t.insert(1);
		t.insert(22);
		t.insert(12);
		
		Iterator<Integer> it = t.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
