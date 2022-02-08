package opgaver;

import java.util.ArrayList;

public class opgave {

    //opgave 1
    public static int sumArray(ArrayList<Integer> list){
        return sumArray(list, 0, list.size()-1);
    }

    private static int sumArray(ArrayList<Integer> list, int left, int right){
        int result = 0;
        int sum1 = 0;
        int sum2 = 0;
        if(left == right){
            return list.get(left);
        } else {
            int m = (left + right) / 2;
            sum1 = sum1 + sumArray(list, left, m);
            sum2 = sum2 + sumArray(list, m+1, right);
        }
        result = sum1 + sum2;

        return result;
    }

    //opgave 2
    public static int numberofNobodies(ArrayList<Integer> list){
        return numberofNobodies(list, 0, list.size()-1);
    }

    private static int numberofNobodies(ArrayList<Integer> list, int left, int right) {
        int result = 0;
        if (left == right) {
            if (list.get(left) == 0) {
                result = 1;
            } else {
                result = 0;
            }
        } else {
            int m = (left + right) / 2;
            int zero =numberofNobodies(list, left, m);
            int zero1 =numberofNobodies(list, m+1,right);
            result = zero + zero1;
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(9);
        list.add(0);
        list.add(4);
        list.add(7);
        list.add(1);
        list.add(8);
        list.add(3);
        list.add(11);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(69);

        System.out.println(sumArray(list));
        System.out.println(numberofNobodies(list));
    }
}
