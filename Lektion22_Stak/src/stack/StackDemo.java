package stack;

import java.util.Arrays;

public class StackDemo {
    public static void main(String[] args) {
      //  StackI s = new NodeStack();
         StackI s = new ArrayStack(5);
        s.push("Tom");
        s.push("Diana");
        s.push("Harry");
        s.push("Thomas");
        s.push("Bob");
        s.push("Brian");
        System.out.println(s.peek());
        System.out.println(s.isEmpty() + " " + s.size());
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
        System.out.println();
        System.out.println(s.isEmpty() + " " + s.size());
        System.out.println();

        System.out.println();

        EnkeltKædeDrop edrop = new EnkeltKædeDrop(5);
        edrop.push("A");
        edrop.push("b");
        edrop.push("c");
        edrop.push("d");
        edrop.push("e");
        edrop.push("f");
        while (!edrop.isEmpty()) {
            System.out.println(edrop.pop());
        }
        System.out.println();


        ArrayDrop adrop = new ArrayDrop(5);
        adrop.push("A");
        adrop.push("b");
        adrop.push("c");
        adrop.push("d");
        adrop.push("e");
        adrop.push("f");
        adrop.push("g");

        System.out.println(adrop.size());
        //System.out.println(adrop.peek());
        System.out.println();

        while (!adrop.isEmpty()) {
            System.out.println(adrop.pop());
        }
        System.out.println();






        // -------- test af reverse --------
        
//        Integer[] tal = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//        reverse(tal);
//        for (int i = 0; i < tal.length; i++) {
//            System.out.print(tal[i] + " ");
//        }

        // Check parantes check
//        System.out.println(checkParantes("(3+{5{99{*}}[23[{67}67]]})"));
//        System.out.println(checkParantes("(}){"));
    }
    
    public static void reverse(Object[] tabel) {
        StackI stack = new ArrayStack(tabel.length);
        // StackI stack = new NodeStack();
        for (int i = 0; i < tabel.length; i++) {
            stack.push(tabel[i]);
        }
        int i = 0;
        while (!stack.isEmpty()) {
            tabel[i] = stack.pop();
            i++;
        }
        
    }

    public static boolean checkParantes(String s){
        StackI stack = new ArrayListStack();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' ||s.charAt(i) == '['|| s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' && stack.peek().equals('(')){
                stack.pop();
            }
            else if(s.charAt(i) == ']' && stack.peek().equals('[')){
                stack.pop();
            }
            else if(s.charAt(i) == '}'&& stack.peek().equals('{')){
                stack.pop();
            }
        }
        return stack.size() == 0;
    }
}
