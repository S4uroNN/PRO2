package opgave4;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Vare> varer = new ArrayList();

        Vare v1 = new ElVare(100,"Emil's Computer");
        Vare v2 = new FoedeVare(20,"Emil's Booster");
        Spiritus v3 = new Spiritus(80,"Vodka");

        Vare v4 = new SpiritusAdapter(v3);

        varer.add(v1);
        varer.add(v2);
        varer.add(v4);

        for(Vare v : varer){
            System.out.println(v.beregnMoms());
        }
        System.out.println();
        for (Vare v : varer){
            System.out.println(v.getNavn());
        }
    }
}
