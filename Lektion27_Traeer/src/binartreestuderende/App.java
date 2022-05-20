package binartreestuderende;

public class App {
    public static void main(String[] args) {
        BinaryTree<Integer> fifteen = new BinaryTree<Integer>(15);
        BinaryTree<Integer> twentyfive = new BinaryTree<Integer>(25);
        BinaryTree<Integer> eighteight = new BinaryTree<Integer>(88);

        BinaryTree<Integer> eleven = new BinaryTree<Integer>(11,null, fifteen);
        BinaryTree<Integer> thirty = new BinaryTree<Integer>(30,twentyfive, null);
        BinaryTree<Integer> ninety = new BinaryTree<Integer>(90,eighteight, null);

        BinaryTree<Integer> twotwo = new BinaryTree<Integer>(22,eleven, thirty);
        BinaryTree<Integer> sevenseven = new BinaryTree<Integer>(77,null, ninety);

        BinaryTree<Integer> fourfive = new BinaryTree<Integer>(45,twotwo,sevenseven);


        System.out.println(fourfive.height());
        System.out.println();

        //Opgave3

        //preorder  : 45,22,11,15,30,25,77,90,88
        //inorder   : 11,15,22,30,25,45,77,90,88
        //postorder : 15,11,25,30,22,88,90,77,45

        fourfive.preorder();
        System.out.println();
        System.out.println("Inorder");
        fourfive.inorder();
        System.out.println();
        System.out.println("Post");
        fourfive.postorder();
        System.out.println();
        System.out.println("Sum");
        System.out.println(fourfive.sum());

    }
}
