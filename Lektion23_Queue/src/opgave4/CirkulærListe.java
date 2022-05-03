package opgave4;

public class CirkulærListe{
    private int size;
    private Node position;

    public CirkulærListe(){
        size = 0;
        position = null;
    }
    public void addPerson(Person person){
        Node newNode = new Node();
        newNode.data = person;
        if(position == null){
            position = newNode;
            newNode.next = position;
            size++;
        }else{
            position.next = newNode;
            newNode.next = position;
            size++;
        }
    }
    public void print(){
        for (int i = 0; i < size; i++) {
            Node temp = position.next;
            System.out.println(temp.data);
        }
    }
    class Node{
        public Object data;
        public Node next;
    }


}
