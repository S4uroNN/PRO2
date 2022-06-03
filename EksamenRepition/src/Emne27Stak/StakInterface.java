package Emne27Stak;

import javax.lang.model.element.Element;

public interface StakInterface {
    /*
    En stak er en datastruktur, hvor man kun kan manipulere objekter fra toppen af stakken.
    Altså, man har 3 "hovedmetoder : Push, pop, og peek"
     */

    /**
     * add element on top of stack
     * @param element
     */
    void push(Object element);

    /**
     * remove the topmost item
     * @return object
     */
    Object pop();

    /**
     * look at the top object
     * @return object
     */
    Object peek();

    /**
     * check if stack is empty
     * @return boolean
     */
    boolean isEmpty();

    /**
     * size of stack
     * @return size
     */
    int size();
}
