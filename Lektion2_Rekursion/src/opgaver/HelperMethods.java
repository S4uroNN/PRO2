package opgaver;

import java.util.ArrayList;

public class HelperMethods {
    public static int sum1(ArrayList<Integer> list) {
        int result;
        if (list.size() == 0) {
            result = 0;
        } else {
            result = list.get(0);
            list.remove(0);
            result = result + sum(list);
        }
        return result;
    }

    public static int sum(ArrayList<Integer> list) {
        return sum(list, 0);
    }

    // Rekursiv hjælpemetode med de nødvendige parametre

    private static int sum(ArrayList<Integer> list, int index) {
        int result;
        if (index == list.size()) {
            result = 0;
        } else {
            result = list.get(index) + sum(list, index + 1);
        }
        return result;
    }

    public static int length(ArrayList<Integer> list) {
        return length(list, 0);

    }

    // Rekursiv hjælpemetode med de nødvendige parametre
    private static int length(ArrayList<Integer> list, int index) {
        int result;
        if (index == list.size()) {
            result = 0;
        } else {
            result = 1 + length(list, index + 1);
        }
        return result;

    }

    // OPGAVE 1
    // UDEN
    public static int grimligeTal(ArrayList<Integer> list) {
        int result = 0;
        if (list.size() == 0) {
            result = 0;
        } else if (list.get(0) % 2 == 0) {
            list.remove(0);
            result = 1 + ligeTal(list);
        } else {
            list.remove(0);
            result = ligeTal(list);
        }
        return result;
    }

    //MED
    public static int ligeTal(ArrayList<Integer> list) {
        return ligeTal(list, 0);
    }

    private static int ligeTal(ArrayList<Integer> list, int index) {
        int result = 0;
        if (index == list.size()) {
            result = 0;
        } else if (list.get(index) % 2 == 0) {
            result = 1 + ligeTal(list, index + 1);
        } else {
            result = ligeTal(list, index + 1);
        }
        return result;
    }

    //opgave 2
    private static boolean isPalindrome(String word, int start, int end) {
        if (start >= end) {
            return true;
        } else {
            char first = Character.toLowerCase(word.charAt(start));
            char last = Character.toLowerCase(word.charAt(end));
            if (Character.isLetter(first) && Character.isLetter(last)) {
                if (first == last) {
                    return isPalindrome(word, start + 1, end - 1);
                } else
                    return false;
            } else if (!Character.isLetter(last)) {
                return isPalindrome(word, start, end - 1);

            } else
                return isPalindrome(word, start + 1, end);
        }
    }

    public static boolean isPalindrom(String text) {
        return isPalindrome(text, 0, text.length() - 1);
    }

    public static boolean søgningafHeltal(int[]list, int target){
        return søgningafHeltal(list, target,0,list.length-1);
    }
    //opgave 3
    private static boolean søgningafHeltal(int[] list, int target,int left, int right) {
        int middle = (left + right)/2;
        if(left > right){
            return false;
        } else if(target == list[middle]){
            return true;
        }else if(target <= list[middle]){
            return søgningafHeltal(list, target, left , right-1);
        }else{
            return søgningafHeltal(list, target,left+1 ,right);
        }
    }
    //opgave 4
    public static int ackerman(int x, int y){
        int result = 0;
        if(x == 0){
            result = y+1;
        } else if (y == 0){
            result = ackerman(x-1, 1);
        } else{
            result = ackerman(x-1,ackerman(x,y-1));
        }
        return result;
    }


    //opgave 5
    public static int binomial(int n, int m) {
        int result = 0;
        if (m == 0 || m == n) {
            result = 1;

        } else {
            result = binomial(n-1,m) + binomial(n-1, m-1);
        }
        return result;
    }

    //ogpave 7
    public static int talFølge(int n){
        int result = 0;
        if (n == 0){
            result = 2;
        }
        else if (n == 1){
            result = 1;
        }
        else if (n == 2) {
            result = 5;
        }
        else if (n % 2 == 0){
            result = 2 * talFølge(n - 3) - talFølge(n - 1);
        }
        else {
            result = talFølge(n-1) + talFølge(n-2) + 3 * talFølge(n-3);
        }
        return result;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(10);
        list.add(17);
        list.add(4);
        list.add(8);
        list.add(45);
        list.add(29);
        System.out.println(list);
        System.out.println("sum: " + sum(list));
        System.out.println("length: " + length(list));
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);

        int[] list2 = {1,2,3,4,5,6,7,9,10};

        System.out.println(ligeTal(list));
        System.out.println(isPalindrom("ABBA"));
        System.out.println(søgningafHeltal(list2,10));

        System.out.println(list1);
        System.out.println("Tal 3: " + (5 + 1 + 3 * 2));
        System.out.println("Tal 4: " + (2 * 1 - 12));
        System.out.println("Tal 5: " + ((-10) + 12 + (3 * 5)));
        System.out.println("Tal 6: " + (2 * 12 - 17));

        System.out.println("Talfølg : " + talFølge(2));
        System.out.println("Binomial: " + binomial(7,4));
        System.out.println("Ackerman: " + ackerman(1,3));
    }

}
