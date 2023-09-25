package ayp2.clase12.binaryTree;

public class BInaryTreeDemo {

	public static void main(String[] args) {
		BinaryTree<Integer> t1 = new BinaryTree<Integer>(1);
		BinaryTree<Integer> t3 = new BinaryTree<Integer>(3);
		BinaryTree<Integer> t5 = new BinaryTree<Integer>(5);
		BinaryTree<Integer> t7 = new BinaryTree<Integer>(7);
		BinaryTree<Integer> t2 = new BinaryTree<Integer>(2, t1, t3);
		BinaryTree<Integer> t6 = new BinaryTree<Integer>(6, t5, t7);
		BinaryTree<Integer> t4 = new BinaryTree<Integer>(4, t2, t6);

		System.out.println("t4 should be perfect 1-7; t2 empty");
		System.out.println("----------------");
		System.out.println("t4");
		t4.printInOrder();
		System.out.println("----------------");
		System.out.println("t2");
		t2.printInOrder();
		System.out.println("----------------");
		System.out.println("t4 size: " + t4.size());
		System.out.println("t4 height: " + t4.height());
	}
}
