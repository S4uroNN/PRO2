package opgave1;

import java.util.Collection;
import java.util.HashSet;

public class ogpave1{

    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<Integer>();
        hash.add(32);
        hash.add(12);
        hash.add(23);
        hash.add(45);
        hash.add(67);
        hash.add(98);

        System.out.println(hash);
        hash.add(23);
        System.out.println(hash);
        hash.remove(67);
        System.out.println(hash);
        System.out.println(hash.contains(23));
        System.out.println(hash.size());
    }
}
