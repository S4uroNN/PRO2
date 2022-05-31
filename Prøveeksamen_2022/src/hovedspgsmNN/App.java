package hovedspgsmNN;

public class App {
    public static void main(String[] args) {
        BinaryTree two = new BinaryTree("2");
        BinaryTree four = new BinaryTree("4");

        BinaryTree plus = new BinaryTree("+", two, four);
        BinaryTree seven = new BinaryTree("7");
        BinaryTree three = new BinaryTree("3");
        BinaryTree eight = new BinaryTree("8");

        BinaryTree star = new BinaryTree("*", plus, seven);
        BinaryTree plus1 = new BinaryTree("+", three, eight);
        BinaryTree plus2 = new BinaryTree("+", star, plus1);


        System.out.println(plus2.countElement("+"));
        System.out.println(plus2.value());
        plus2.inorder();
    }
}
