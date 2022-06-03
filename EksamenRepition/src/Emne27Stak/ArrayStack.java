package Emne27Stak;

import java.util.NoSuchElementException;

public class ArrayStack implements StakInterface{

    private Object[] stack;
    private int top;

    public ArrayStack(int size){
        stack = new Object[size];
        top = -1;
    }
    @Override
    public void push(Object element) {
        top++; // bliver dannet med top som -1;
        stack[top] = element;
    }

    @Override
    public Object pop() {
        if(top == -1){
            throw new NoSuchElementException();
        }
        Object element = stack[top];
        stack[top] = null;
        top--;
        return element;
    }

    @Override
    public Object peek() {
        return stack[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top+1;
    }
}
