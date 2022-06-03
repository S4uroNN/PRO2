package Emne27Stak;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayListStack implements StakInterface {
    private ArrayList<Object> stack;


    public ArrayListStack(){
        stack = new ArrayList<>();

    }
    @Override
    public void push(Object element) {
        stack.add(element);
        /*
        Eftersom det er en arraylist, så vil toppen af stakken altid være den sidste indsatte element
         */
    }

    @Override
    public Object pop() {
        if(stack.size() == 0) {
            throw new NoSuchElementException();
        }
        Object pop = stack.get(stack.size()-1); // få fat på den sidste element i min arraylist (Stack)
        stack.remove(pop); //delete elemet from stack

        return pop;
    }

    @Override
    public Object peek() {
        return stack.get(stack.size()-1); //return last item
    }

    @Override
    public boolean isEmpty() {
        return stack.size() == 0;
    }

    @Override
    public int size() {
        return stack.size();
    }
}
