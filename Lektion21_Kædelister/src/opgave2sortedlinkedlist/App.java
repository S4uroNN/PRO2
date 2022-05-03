package opgave2sortedlinkedlist;

import java.net.SocketTimeoutException;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        SortedLinkedList s1 = new SortedLinkedList();

        s1.addElement("Smth");
        s1.addElement("I am missing an element");
        s1.addElement("AmthElse");

        //s1.udskrivElements();
        //System.out.println(s1.removeLast());
        //s1.udskrivElements();
        s1.udskrivElements();

        System.out.println();
        System.out.println();

//        Iterator itr = s1.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

        for(String s : s1){
            System.out.println(s);
        }
    }
}
