package queueopgaver;

public class EnkeltQueue implements QueueI{


    private int size;
    private Node first;
    private Node last;

    public EnkeltQueue(){
       size = 0;
       first = null;
       last = null;

    }
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    //Konstant
    @Override
    public void enqueue(Object newElement) {
        Node newNode = new Node();
        newNode.data = newElement;
        if(first == null){
            first = newNode;
            last = newNode;
            newNode.next = null;
            size++;
        }else{
            last.next = newNode;
            last = newNode;
            size++;
        }
    }
    //Konstant
    @Override
    public Object dequeue() {
        Object removed = first.data;
        first = first.next;
        size--;
        return removed;
    }

    @Override
    public Object getFront() {
        return first.data;
    }

    @Override
    public int size() {
        return size;
    }

    class Node {
        public Object data;
        public Node next;
    }

}
