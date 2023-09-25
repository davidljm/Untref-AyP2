package binaryTree;

public class BinaryNode<Integer> {
    protected Integer element;
    protected BinaryNode<Integer> left;
    protected BinaryNode<Integer> right;

    public BinaryNode(Integer element, BinaryNode<Integer> left, BinaryNode<Integer> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    public BinaryNode(Integer x) {
        this.element = x;
        this.left = null;
        this.right = null;
    }

    public int size() {
        int size = 1;
        if (left != null)
            size += left.size();
        if (right != null)
            size += left.size();
        return size;
    }

    public int height() {
        int leftHeight = -1;
        int rightHeight = -1;
        if (left != null)
            leftHeight = left.height();
        if (right != null)
            rightHeight = left.height();
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public void printPreOrder() {
        System.out.println(element);
        if (left != null)
            left.printPreOrder();
        if (right != null)
            right.printPreOrder();
    }

    public void printPostOrder() {
        if (left != null)
            left.printPostOrder();
        if (right != null)
            right.printPostOrder();
        System.out.println(element);
    }

    public void printInOrder() {
        if (left != null)
            left.printInOrder();
        System.out.println(element);
        if (right != null)
            right.printInOrder();
    }

    public BinaryNode<Integer> duplicate() {
        BinaryNode<Integer> root = new BinaryNode<Integer>(element, null, null);

        if (left != null)
            root.left = left.duplicate();
        if (right != null)
            root.right = right.duplicate();
        return root;
    }

    public Integer getElement() {
        return element;
    }

    public BinaryNode<Integer> getLeft() {
        return left;
    }

    public BinaryNode<Integer> getRight() {
        return right;
    }

    public void setElement(Integer element) {
        this.element = element;
    }

    public void setLeft(BinaryNode<Integer> left) {
        this.left = left;
    }

	public void setRight(BinaryNode<Integer> right) {
        this.right = right;
    }
    
    
    
    
    
    
}