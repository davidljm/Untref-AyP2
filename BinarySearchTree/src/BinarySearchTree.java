
public class BinarySearchTree<T extends Comparable<? super T>> {
	protected BinaryNode<T> root;

	public BinarySearchTree() {
		root = null;
	}

	public void insert(T element) {
		root = insert(element, root);
	}

	private BinaryNode<T> insert(T element, BinaryNode<T> node) {
		if (node == null)
			node = new BinaryNode<T>(element);
		else if (element.compareTo(node.element) < 0)
			node.left = insert(element, node.left);
		else if (element.compareTo(node.element) > 0)
			node.right = insert(element, node.right);
		else
			throw new DuplicateItemException(element.toString());
		return node;
	}

	public void remove(T element) {
		root = remove(element, root);
	}

	private BinaryNode<T> remove(T element, BinaryNode<T> node) {
		if (node == null)
			throw new ItemNotFoundException(element.toString());

		if (element.compareTo(node.element) < 0)
			node.left = remove(element, node.left);
		else if (element.compareTo(node.element) > 0)
			node.right = remove(element, node.right);
		else if (node.left != null && node.right != null) // Two children
		{
			node.element = findMin(node.right).element;
			node.right = removeMin(node.right);
		} else
			node = (node.left != null) ? node.left : node.right;

		return node;
	}

	public void removeMin() {
		root = removeMin(root);
	}

	private BinaryNode<T> removeMin(BinaryNode<T> node) {
		if (node == null)
			throw new ItemNotFoundException();
		else if (node.left != null) {
			node.left = removeMin(node.left);
			return node;
		} else
			return node.right;
	}

	public T findMin() {
		return elementAt(findMin(root));
	}

	private BinaryNode<T> findMin(BinaryNode<T> node) {
		if (node != null)
			while (node.left != null)
				node = node.left;

		return node;
	}

	public T findMax() {
		return elementAt(findMax(root));
	}

	private BinaryNode<T> findMax(BinaryNode<T> node) {
		if (node != null)
			while (node.right != null)
				node = node.right;

		return node;
	}

	public T find(T element) {
		return elementAt(find(element, root));
	}

	private BinaryNode<T> find(T element, BinaryNode<T> node) {
		while (node != null) {
			if (element.compareTo(node.element) < 0)
				node = node.left;
			else if (element.compareTo(node.element) > 0)
				node = node.right;
			else
				return node;
		}

		return null;
	}

	public void makeEmpty() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	private T elementAt(BinaryNode<T> node) {
		return node == null ? null : node.element;
	}

	public InOrderIterator<T> iterator() {
		return new InOrderIterator<T>(this.root);
	}

	public int sumarHijoContrario() {
		int suma = 0;

		if (root != null) {
			if (root.left != null) {
				suma = +sumarHijoContrario(root.left);
			}

			if (root.right != null) {
				suma = +sumarHijoContrario(root.right);
			}

		}

		return suma;
	}

	private int sumarHijoContrario(BinaryNode<T> node) {
		int suma = 0;

		if (node.left != null && node.left.right != null) {
			suma = +(int) node.left.right.element;
		}

		if (node.right != null && node.right.left != null) {
			suma = +(int) node.right.left.element;
		}

		if (node.left != null) {
			suma = +sumarHijoContrario(node.left);
		}

		if (node.right != null) {
			suma = +sumarHijoContrario(node.right);
		}
		return suma;

	}

	public int sumarNodosDerechosImpares() {
		int suma = 0;

		if (root != null) {
			if (root.left != null) {
				suma = +sumarNodosDerechosImpares(root.left);
			}

			if (root.right != null) {
				suma = +sumarNodosDerechosImpares(root.right);
			}

		}

		return suma;
	}

	private int sumarNodosDerechosImpares(BinaryNode<T> node) {
		int suma = 0;		

		if (node.right != null ) {
			if (((int) node.right.element % 2) != 0) {
				suma = +(int) node.right.element;
			}
		}
		if (node.left != null) {
			suma = +sumarNodosDerechosImpares(node.left);
		}

		if (node.right != null) {
			suma = +sumarNodosDerechosImpares(node.right);
		}
		return suma;
	}

}
