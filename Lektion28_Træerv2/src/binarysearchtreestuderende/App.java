package binarysearchtreestuderende;

public class App {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.add(45);
        tree.add(22);
        tree.add(11);
        tree.add(15);
        tree.add(30);
        tree.add(25);
        tree.add(77);
        tree.add(90);
        tree.add(88);

        tree.print();
        System.out.println("Max = " + tree.findMax());
        System.out.println("Min = " + tree.findMin());
        System.out.println(tree.removeMin());
        System.out.println(tree.removeMin());
        tree.print();
        System.out.println(tree.removeMax());
        System.out.println(tree.removeMax());
        tree.print();
        System.out.println("DAOS ramnøgle");
        System.out.println();
        System.out.println("Proces 1");
        System.out.println("Offset " + 1570 % 512);
        System.out.println("Page " + 1570 / 512);
        System.out.println("Fysiske adresse " + (4 * 512 + 34));
        System.out.println();
        System.out.println("Proces 2");
        System.out.println("Offset " + 1100 % 512);
        System.out.println("Page " + 1100 / 512);
        System.out.println("Fysiske adresse " + (0 * 512 + 76));
        System.out.println();


    }
}
