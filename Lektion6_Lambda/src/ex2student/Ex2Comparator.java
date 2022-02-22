package ex2student;

import java.util.Comparator;

public class Ex2Comparator implements Comparator<Runner> {

    @Override
    public int compare(Runner o1, Runner o2) {
        return o1.getLapTime() - o2.getLapTime();
    }
}
