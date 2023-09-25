package binaryTree;

public class BinaryTree<Integer> {

	private BinaryNode<Integer> root;

	public BinaryTree() {
		root = null;
	}

	public BinaryTree(Integer root) {
		this.root = new BinaryNode<Integer>(root, null, null);
	}

	public BinaryTree(Integer root, BinaryTree<Integer> leftTree, BinaryTree<Integer> rightTree) {
		if (leftTree == null) {
			this.root = new BinaryNode<Integer>(root, null, rightTree.root);
		} else if (rightTree == null) {
			this.root = new BinaryNode<Integer>(root, leftTree.root, null);
		} else {
			this.root = new BinaryNode<Integer>(root, leftTree.root, rightTree.root);
		}
	}

	public void printPreOrder() {
		if (root != null)
			root.printPreOrder();
	}

	public void printInOrder() {
		if (root != null)
			root.printInOrder();
	}

	public void printPostOrder() {
		if (root != null)
			root.printPostOrder();
	}

	public void makeEmpty() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public int size() {
		if (root != null)
			return root.size();
		else
			return 0;
	}

	public int height() {
		if (root != null)
			return root.height();
		else
			return -1;
	}

	public BinaryNode<Integer> getRoot() {
		return root;
	}

	public BinaryNode<Integer> ejArbol(BinaryNode<Integer> root) {

		if (root != null) {
			if (root.left != null) {
				this.root = ejArbol(root.left);
			} else {
				this.root = root.left.getElement() + root.right.getElement();
			}

			if (root.right != null) {
				this.root = ejArbol(root.right);
			}

		}

		return 0;

	}

}