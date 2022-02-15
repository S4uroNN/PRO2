package opgave2;

public class App {
    public static void main(String[] args) {
        Skole skole = new Skole("EAAAA");
        Studerende s1 = new Studerende(1,"Emil");
        Studerende s2 = new Studerende(2,"Jens");
        Studerende s3 = new Studerende(3,"Sidsel");


        s1.addKarakter(02);
        s1.addKarakter(12);
        s1.addKarakter(-3);

        s2.addKarakter(4);
        s2.addKarakter(10);
        s2.addKarakter(2);

        s3.addKarakter(7);
        s3.addKarakter(12);
        s3.addKarakter(4);

        skole.addStuderende(s1);
        skole.addStuderende(s2);
        skole.addStuderende(s3);

        System.out.println(s1.getGennemsnit());
        System.out.println(skole.gennemsnit());
        System.out.println(skole.findStuderende(2));

    }
}
