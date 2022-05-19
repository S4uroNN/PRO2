package opgave1;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        Bil b1 = new Bil("CY44019","Hyundai","i30","blå");
        Bil b2 = new Bil("DH86117","Ford","Kuga","blå");
        Bil b3 = new Bil("CK78241","Peugeot","208","blå");
        Bil b4 = new Bil("CY44019","Hyundai","i30","blå");

        HashSet biler = new HashSet();
        biler.add(b1);
        biler.add(b2);
        biler.add(b3);
        biler.add(b4);

        //System.out.println(biler);
        System.out.println(biler.size());
        biler.remove(b4);
        System.out.println(biler.size());
        biler.add(b4);
        System.out.println(biler.size());
    }
}
