package personcollection;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("Jens");
        Person p2 = new Person("Emil");
        Person p3 = new Person("Jens");

        PersonCollection pc = new PersonCollection(3);
        pc.add(p1);
        pc.add(p2);
        pc.add(p3);



    }
}
