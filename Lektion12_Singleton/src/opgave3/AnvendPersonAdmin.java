package opgave3;

public class AnvendPersonAdmin {
    public static void main(String[] args) {
        PersonAdmin personAdmin = PersonAdmin.getInstance();

        Person p1 = new Person("Emil",12);
        Person p4 = new Person("Emil",12);
        Person p2 = new Person("Jens",13);
        Person p3 = new Person("Maruks",19);

        personAdmin.add(p1);
        personAdmin.add(p2);
        personAdmin.add(p2);
        personAdmin.add(p3);
        personAdmin.add(p4);

        System.out.println(personAdmin.getPersonSet());
        personAdmin.remove(p3);
        System.out.println(personAdmin.getPersonSet());
    }
}
