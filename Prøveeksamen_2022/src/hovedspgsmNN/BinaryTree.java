package hovedspgsmNN;

import javax.management.ValueExp;

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
     * @param rootData the data for the root
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
     * @param rootData the data for the root
     * @param left     the left subtree
     * @param right    the right subtree
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
        BinaryTree<E> result = new BinaryTree<>();
        result.root = root.left;
        return result;
    }

    /**
     * Gets the right subtree of this tree.
     *
     * @return the right child of the root
     */
    public BinaryTree<E> right() {
        BinaryTree<E> result = new BinaryTree<>();
        result.root = root.right;
        return result;
    }

    /**
     * @param rootData the new data for the root
     * @return the data previous in the root
     */
    public E replace(E rootData) {
        E toReturn = root.data;
        root.data = rootData;
        return toReturn;
    }

    public int size() {
        return size(root);
    }

    private int size(Node n) {

        if (n != null) {
            return 1 + size(n.left) + size(n.right);
        } else {
            return 0;
        }
    }

    public int countElement(E element) {
        return countElement(root, element);
    }

    private int countElement(Node n, E element) {
        int sum = 0;
        int left = 0;
        int right = 0;

        if (n == null) {
            sum = 0;
        } else {
            Node temp = n;
            if (temp.data.equals(element)) {
                sum = 1;
            }

            left += countElement(temp.left, element);
            right += countElement(temp.right, element);

            sum += left + right;
        }
        return sum;
    }

    public int value() {
        return value(root);
    }

    private int value(Node n) {
        int result = 0;
        if (n.left == null && n.right == null) {
            String data = (String) n.data;
            result = Integer.parseInt(data);
        } else if (n.left != null && n.right != null) {
            String data = (String) n.data;
            int left = (int) value(n.left);
            int right = (int) value(n.right);
            if (data.equals("+")) {
                result = left + right;
            } else {
                result = left + right;
            }
        }
        return result;
    }

    public void inorder() {
        if (root != null) {
            left().inorder();
            System.out.print(root.data);
            right().inorder();
        }
    }

    private class Node {
        public E data;
        public Node left;
        public Node right;
    }
}
