package opgave2;

public class AnvendCounter {
    public static void main(String[] args) {
        Counter counter = Counter.getInstance();

        //System.out.println(counter.getValues());
        System.out.println(counter.count());
        System.out.println(counter.count());
        System.out.println(counter.count());
        System.out.println(counter.count());
        System.out.println(counter.count());
        System.out.println(counter.count());
        System.out.println(counter.getValues());
        System.out.println(counter.times2());
        System.out.println(counter.getValues());
        System.out.println(counter.zero());
    }
}
