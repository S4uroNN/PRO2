package opgave3;

import java.util.*;

public class opgave3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(22);
        list.add(34);
        list.add(67);
        list.add(98);
        list.add(2);
        list.add(3);
        list.add(5);

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

//        System.out.println(list);
        System.out.println();


        Map<Integer, Integer> map = new HashMap<>();
        map.put(2, 4);
        map.put(3, 9);
        map.put(4, 16);
        map.put(5, 25);
        map.put(6, 36);

        Iterator<Integer> itr2 = map.keySet().iterator();
        while (itr2.hasNext()) {
            int i = itr2.next();
            System.out.println(i + " , " +map.get(i));
        }
    }
}
