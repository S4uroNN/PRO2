package queueopgaver;

import java.lang.annotation.ElementType;
import java.util.Arrays;

/**
 * An implementation of a queue as a array.
 */
public class ArrayQueue implements QueueI {

	private Object[] queue;
	private int size;
	/**
	 * Constructs an empty queue.
	 */
	public ArrayQueue() {
		size = 0;
		queue = new Object[10];
	}

	/**
	 * Checks whether this queue is empty.
	 *
	 * @return true if this queue is empty
	 */
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Adds an element to the tail of this queue.
	 *
	 * @param newElement
	 *            the element to add
	 */

	//O(n), så snart man kommer ind og skal lave listen større.
	@Override
	public void enqueue(Object newElement) {
		growIfNeccassary();
		queue[size] = newElement;
		size++;
	}

	/**
	 * Removes an element from the head of this queue.
	 *
	 * @return the removed element
	 */
	@Override
	public Object dequeue() {
		Object removed = queue[0];
		for (int i = 1; i < size; i++) {
			queue[i-1] = queue[i];
		}
		size--;
		return removed;
	}

	/**
	 * Returns the head of this queue. The queue is unchanged.
	 *
	 * @return the head element
	 */
	@Override
	public Object getFront() {
		return queue[0];
	}

	/**
	 * The number of elements on the queue.
	 *
	 * @return the number of elements in the queue
	 */
	@Override
	public int size() {
		return size;
	}

	private void growIfNeccassary() {
		if (size == queue.length) {
			Object[] newElements = new Object[queue.length * 2];
			for (int i = 0; i < queue.length; i++) {
				newElements[i] = queue[i];
			}
			queue = newElements;
		}
	}
}
