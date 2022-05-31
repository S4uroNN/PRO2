package binartreestuderende;

/**
 * A binary tree in which each node has two children.
 */
public class BinaryTree<E> {
	private Node root;

	/**
	 * Constructs an empty tree.
	 */
	public BinaryTree() {
		root = null;
	}

	/**
	 * Constructs a tree with one node and no children.
	 *
	 * @param rootData
	 *            the data for the root
	 */
	public BinaryTree(E rootData) {
		root = new Node();
		root.data = rootData;
		root.left = null;
		root.right = null;
	}

	/**
	 * Constructs a binary tree.
	 *
	 * @param rootData
	 *            the data for the root
	 * @param left
	 *            the left subtree
	 * @param right
	 *            the right subtree
	 */
	public BinaryTree(E rootData, BinaryTree<E> left, BinaryTree<E> right) {
		root = new Node();
		root.data = rootData;
		if (left != null) {
			root.left = left.root;
		}
		if (right != null) {
			root.right = right.root;
		}
	}

	/**
	 * Checks whether this tree is empty.
	 *
	 * @return true if this tree is empty
	 */
	public boolean isEmpty() {
		return root == null;
	}

	/**
	 * Gets the data at the root of this tree.
	 *
	 * @return the root data
	 */
	public E data() {
		return root.data;
	}

	/**
	 * Gets the left subtree of this tree.
	 *
	 * @return the left child of the root
	 */
	public BinaryTree<E> left() {
		BinaryTree<E> result = new BinaryTree<E>();
		result.root = root.left;
		return result;
	}

	/**
	 * Gets the right subtree of this tree.
	 *
	 * @return the right child of the root
	 */
	public BinaryTree<E> right() {
		BinaryTree <E> result = new BinaryTree<E>();
		result.root = root.right;
		return result;

	}

	/**
	 *
	 * @param rootData
	 *            the new data for the root
	 *
	 * @return the data previous in the root
	 */
	public E replace(E rootData) {
		E old = root.data;
		root.data = rootData;
		return old;
	}

	/**
	 *
	 * @param n
	 * @return true in n has no children
	 */
	private boolean isLeaf(Node n) {
		return root.left == null && root.right== null;
	}

	/**
	 *
	 * @param n
	 * @return true in n has at least one child
	 */
	private boolean isInternal(Node n) {
		return n.left != null || n.right != null;
	}

	/**
	 *
	 * @return the number of nodes in the tree
	 */
	public int size() {
		return size(root);
	}

	private int size(Node n) {
		int size = 0;
		if (n==null){
			size = 0;
		} else{
			size = size(n.left) + size(n.right) + 1;
		}

		return size;
	}

	public int height(){
		return height(root);
	}
	private int height(Node n){
		int height = 0;
		if(n == null){
			height = 0;
		}else{
			if(height(n.left) > height(n.right)){
				height = height(n.left) + 1;
			}else{
				height = height(n.right) + 1;
			}
		}
		return height;

	}

	public void preorder(){
		if (root != null) {
			System.out.println(root.data);
			left().preorder();
			right().preorder();
		}
	}
	public void inorder(){
		if(root != null){
			left().inorder();
			System.out.println(root.data);
			right().inorder();
		}
	}
	public void postorder(){
		if(root != null){
			left().postorder();
			right().postorder();
			System.out.println(root.data);
		}
	}

	public int sum(){
		return sum(root);
	}
	private int sum(Node n) {
		if (n == null) {
			return 0;
		} else {
			return sum(n.left) + sum(n.right) + (Integer) n.data;
		}
	}


	private class Node {
		public E data;
		public Node left;
		public Node right;
	}
}
