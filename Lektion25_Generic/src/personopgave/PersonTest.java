package personopgave;

import bagopgave.ArrayBag;

import java.util.ArrayList;
import java.util.Collections;

public class PersonTest {
    public static void main(String[] args) {
        Navn n = new Navn("Mathias","Røvbanan");
        Navn n2 = new Navn("Mads","Nørskov");
        Navn n3 = new Navn("Claus","Bajer");
        Navn n4 = new Navn("Anders","And");
        Person p0 = new Person(n4);
        Person p = new Person(n);
        Person p1 = new Person(n2);
        Person p2 = new Person(n3);
        Person p3 = new Person("Anders");
        Person p4 = new Person("Xlll");

//        System.out.println(p.getNavn());
//
//        System.out.println();
//        p.setNavn("Markus DALAAAGER");
//        System.out.println(p.getNavn());

        ArrayList<Person<Navn>> personer = new ArrayList<>();
        personer.add(p);
        personer.add(p0);
        personer.add(p1);
        personer.add(p2);
        ArrayList<Person<String>> personerString = new ArrayList<>();
        personerString.add(p4);
        personerString.add(p3);


        System.out.println(personer);
        System.out.println(personerString);
        Collections.sort(personer);
        Collections.sort(personerString);
        System.out.println();
        System.out.println(personer);
        System.out.println(personerString);


    }
}
