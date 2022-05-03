package opgave4;

public class KannibalApp {
    public static void main(String[] args) {
        Person p1 = new Person("Emil");
        Person p2 = new Person("Jens");
        Person p3 = new Person("Mads");

        CirkulærListe c1 = new CirkulærListe();
        c1.addPerson(p1);
        c1.addPerson(p2);
        c1.addPerson(p3);

        c1.print();
    }
}
