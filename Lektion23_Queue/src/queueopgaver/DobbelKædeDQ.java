package queueopgaver;

public class DobbelKædeDQ implements DequeI {

    private int size;
    private Node first;
    private Node last;

    public DobbelKædeDQ() {
        size = 0;
        first = null;
        last = null;

    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void addFirst(Object newElement) {
        Node newNode = new Node();
        newNode.data = newElement;
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first.prev = newNode;
            first = newNode;
        }
        size++;
    }

    @Override
    public void addLast(Object newElement) {
        Node newNode = new Node();
        newNode.data = newElement;
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.prev = last;
            last.next = newNode;
            last = newNode;
        }
        size++;
    }


    @Override
    public Object removeFirst() {
        Object removed = null;
        if (first != null) {
            removed = first.data;
            first = first.next;
            size--;
            if (isEmpty()) {
                last = null;
            }
        }
        return removed;
    }

    @Override
    public Object removeLast() {
        Object removed = null;
        if (last != null) {
            removed = last.data;
            last = last.prev;
            size--;
            if (isEmpty()) {
                first = null;
            }
        }

        return removed;
    }

    @Override
    public Object getFirst() {
        return first.data;
    }

    @Override
    public Object getLast() {
        return last.data;
    }

    @Override
    public int size() {
        return size;
    }

    class Node {
        public Object data;
        public Node next;
        public Node prev;
    }


}
