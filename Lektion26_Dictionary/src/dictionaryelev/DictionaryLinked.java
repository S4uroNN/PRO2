package dictionaryelev;

public class DictionaryLinked<K, V> implements Dictionary<K, V> {

    private Node start;
    private int size;

    /**
     * HashingMap constructor comment.
     */

    public DictionaryLinked() {
        // Sentinel (tomt listehoved - der ikke indeholder data)
        start = new Node();
        size = 0;
    }

    @Override
    public V get(K key) {
        Node temp = start.next;
        boolean found = false;

        if (!isEmpty()) {
            while (!found && temp.next != null) {
                if (temp.key == key) {
                    found = true;
                } else {
                    temp = temp.next;
                }
            }
        }
        return temp.value;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public V put(K key, V value) {


        Node temp = start.next;
        boolean found = false;
        V old = null;


        if (!isEmpty()) {
            while (!found && temp.next != null) {
                if (temp.key == key) {
                    found = true;
                    old = temp.value;
                    temp.value = value;
                } else {
                    temp = temp.next;
                }

            }
            if (!found) {
                Node newNode = new Node();
                newNode.key = key;
                newNode.value = value;
                temp.next = newNode;
                size++;
            }
        } else {
            Node newNode = new Node();
            newNode.key = key;
            newNode.value = value;
            start.next = newNode;
            size++;
        }

        return old;
    }

    @Override
    public V remove(K key) {
        V removed = null;
        boolean found = false;
        Node temp = start;

        if (!isEmpty()) {
            while (!found && temp.next != null) {
                if (temp.next.key == key) {
                    removed = temp.next.value;
                    temp.next.value = null;
                    temp.next.key = null;
                    found = true;
                    size--;
                }else{
                    temp = temp.next;
                }
            }
        }

        return removed;
    }

    @Override
    public int size() {

        return size;
    }

    private class Node {
        Node next;
        K key;
        V value;
    }

}
