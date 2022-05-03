package opgave2sortedlinkedlist;

import java.util.Iterator;

public class SortedLinkedList implements Iterable<String> {

    private Node first;

    public SortedLinkedList() {
        first = null;
    }

    /**
     * Tilføjer e til listen, så listen fortsat er sorteret i henhold til den
     * naturlige ordning på elementerne
     */
    public void addElement(String e) {
        if (first == null) {
            Node newNode = new Node();
            newNode.data = e;
            newNode.next = null;
            first = newNode;
        } else if (e.compareTo(first.data) < 0) {
            Node newNode = new Node();
            newNode.data = e;
            newNode.next = first;
            first = newNode;
        } else {
            Node temp = first;
            while (temp.next != null && e.compareTo(temp.next.data) > 0) {
                temp = temp.next;
            }
            Node newNode = new Node();
            newNode.data = e;
            newNode.next = temp.next;
            temp.next = newNode;

        }
    }

    /**
     * Udskriver elementerne fra listen i sorteret rækkefølge
     */
    public void udskrivElements() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    /**
     * Returnerer antallet af elementer i listen
     */
    public int countElements() {
        Node temp = first;
        int count = 0;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }


    /**
     * Fjerner det sidste (altså det største) element i listen. Listen skal fortsat være
     * sorteret i henhold til den naturlige ordning på elementerne.
     *
     * @return true hvis der blev fjernet fra listen ellers returneres false.
     */
    public boolean removeLast() {
        Node temp = first;
        boolean deleted = false;
        if(first == null){
            deleted = false;
        }else if(first.next == null){
            first = null;
            deleted =  true;
        }else{
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            deleted = true;

        }
        return deleted;
    }

    /**
     * Fjerner den første forekomst af e i listen. Listen skal fortsat være
     * sorteret i henhold til den naturlige ordning på elementerne.
     *
     * @return true hvis e blev fjernet fra listen ellers returneres false.
     */
    public boolean removeElement(String e) {
        Node temp = first;
        boolean removed = false;

        if(first != null && first.data.equals(e)){
            first = first.next;
        }else{
            while(!removed && temp.next !=null){
                if(temp.next.data.equals(e)){
                    removed =true;
                } else{
                    temp = temp.next;
                }
            }
        }
        if(removed){
            Node temp2 = temp.next;
            temp.next = temp2.next;
            temp2.next = null;
        }
        return removed;
    }

    @Override
    public Iterator<String> iterator() {
        return new SortedLinkIterator();
    }


    // Privat indre klasse der modellerer en node i listen
    private class Node {
        public String data;
        public Node next;
    }

    private class SortedLinkIterator implements Iterator<String>{

        private Node position;
        public SortedLinkIterator(){
            position = first;
        }

        @Override
        public boolean hasNext() {
            return position != null;
        }

        @Override
        public String next() {
            String result = position.data;
            position = position.next;
            return result;
        }
    }
}
