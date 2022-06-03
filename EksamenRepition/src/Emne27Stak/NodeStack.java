package Emne27Stak;

import org.w3c.dom.Node;

import java.util.NoSuchElementException;

public class NodeStack implements StakInterface{
    private Node top;
    private int size;

    /**
     * contruct empty stak
     */
    public NodeStack(){
        this.top = null;
        this.size = 0;
    }
    @Override
    public void push(Object element) {
        Node newnode = new Node();
        newnode.data = element;
        newnode.next = top; //Reference til den første item
        top = newnode; // Lav newnode om til top
        size++;
    }

    @Override
    public Object pop() {
        if(top == null){
            throw new NoSuchElementException();
        }
        Object element = top.data; //set element that gets returned.
        top = top.next; // set top to be the next node
        size--;
        return element; // return element
    }

    @Override
    public Object peek() {
        return top.data;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int size() {
        return size; // only doable if size variable
    }
    // Gennemløb hele Kædet liste for at finde size. Linær tidskompleksitet i antal af elementer i listen.
//    int count = 0;
//    Node temp = top;
//		while (temp != null) {
//        count++;
//        temp = temp.next;
//    }
//		return count;

    class Node{
        public Object data;
        public Node next;
    }
}