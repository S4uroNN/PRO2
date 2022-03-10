package opgave2;

public class Counter {

    private static Counter uniqueInstance;
    private int values = 0;

    private Counter() {
//        values = 0;
    }

    public static Counter getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Counter();
        }
        return uniqueInstance;
    }

    public int count(){
        return values++;
    }
    public int times2(){
        return values*2;
    }
    public int zero(){
        return values = 0;
    }
    public int getValues(){
        return values;
    }
}
