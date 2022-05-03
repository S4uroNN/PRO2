package opgave3sortedlinkelistdouble;

import opgave2sortedlinkedlist.SortedLinkedList;

public class SortedLinkedListDouble {

	private Node first;
	private Node last;
	private int size;

	public SortedLinkedListDouble() {
		first = new Node();
		last = new Node();
		first.next = last;
		last.prev = first;
		size = 0;
	}

	/**
	 * Tilføjer e til listen, så listen fortsat er sorteret i henhold til den
	 * naturlige ordning på elementerne
	 */
	public void addElement(String e) {
		Node newNode  = new Node();
		newNode.data = e;
		// If we have a first element after header.
		if(first.next.data != null){
			boolean found = false;
			Node temp = first.next;
			// If e is alphabetically before the first (after header) data.
			if(e.toLowerCase().compareTo(first.next.data.toLowerCase()) <= 0){
				newNode.next = first.next;
				newNode.next.prev = newNode;
				newNode.prev = first;
				first.next = newNode;
			}
			// Else we will look through the rest of the list.
			else{
				while(!found && temp.next.data != null){
					if(e.toLowerCase().compareTo(temp.next.data.toLowerCase()) <= 0){
						found = true;
					}
					else{
						temp = temp.next;
					}
				}
				newNode.next = temp.next;
				newNode.prev = temp;
				temp.next.prev = newNode;
				temp.next = newNode;
			}
		}
		// Else we make a first insertion.
		else{
			newNode.next = last;
			newNode.prev = first;
			first.next = newNode;
			last.prev = newNode;
		}
		// Count up size
		size++;
	}

	/**
	 * Fjerner den første forekomst af e i listen. Listen skal fortsat være
	 * sorteret i henhold til den naturlige ordning på elementerne.
	 *
	 * @return true hvis e blev fjernet fra listen ellers returneres false.
	 */
	public boolean removeElement(String e) {
	// TODO
		return false;
	}

	/**
	 * Udskriver elementerne fra listen i sorteret rækkefølge 
	 */
	public void udskrivElements() {
		Node temp = first;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	/**
	 * Udskriver elementerne fra listen i sorteret rækkefølge bagfra
	 */
	public void udskrivBagfra() {
		Node temp = last;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.prev;
		}
	}

	/**
	 * Returnerer antallet af elementer i listen
	 */
	public int countElements() {
		return size;
	}

	// Privat indre klasse der modellerer en node i en dobbeltkædet liste
	class Node {
		public String data;
		public Node next;
		public Node prev;
	}
}
