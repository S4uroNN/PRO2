package Opgave1;

import java.util.Arrays;

public class opgave3 {
    public static double[] prefixAverage(int[] list) {
        double list1[] = new double[list.length];
        double temp = 0.0;
        for (int i = 0; i < list.length; i++) {
            temp = temp + list[i];
            list1[i] = temp / (i + 1);
        }
        return list1;
    }

    public static void main(String[] args) {
        int list[] = {5, 10, 5, 6, 4, 9, 8};

        prefixAverage(list);
        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(prefixAverage(list)));
    }
}
