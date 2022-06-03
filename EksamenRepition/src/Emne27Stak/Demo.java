package Emne27Stak;

public class Demo {
    public static void main(String[] args) {
        ArrayListStack stack1 = new ArrayListStack();

        stack1.push("Test");
        stack1.push("test 2");
        stack1.push("Test 3");

        System.out.println(stack1.peek());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.size());
        System.out.println(stack1.isEmpty());

        System.out.println();
        System.out.println("NodeStack");
        NodeStack nodeStack = new NodeStack();
        System.out.println(nodeStack.isEmpty());
        nodeStack.push(2);
        nodeStack.push(3);
        nodeStack.push(4);
        System.out.println(nodeStack.peek());
        System.out.println(nodeStack.pop());
        System.out.println(nodeStack.size());

        System.out.println();
        System.out.println("ArrayStack");
        ArrayStack arrayStack = new ArrayStack(10);
        arrayStack.push(10);
        arrayStack.push(95);
        arrayStack.push(24);
        System.out.println(arrayStack.size());
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.size());
    }
}
