package queueopgaver;

public class QueueDemo {
	public static void main(String[] args) {
//		QueueI q = new ArrayQueue();
//		q.enqueue("Tom");
//		q.enqueue("Diana");
//		q.enqueue("Harry");
//		q.enqueue("Thomas");
//		q.enqueue("Bob");
//		q.enqueue("Brian");
//		q.enqueue("Emil");
//		q.enqueue("Morten");
//		q.enqueue("Jesper");
//		q.enqueue("Jens");
//		q.enqueue("Alin");
//		q.enqueue("Mathias");
//		System.out.println(q.getFront());
//		System.out.println(q.isEmpty() + " " + q.size());
//		while (!q.isEmpty()) {
//			System.out.println(q.dequeue());
//		}
//		System.out.println(q.isEmpty());
//		System.out.println();
//		System.out.println(q.isEmpty() + " " + q.size());
//		System.out.println();
//		q.enqueue("Anna");
//		q.enqueue("Lotte");
//		System.out.println(q.isEmpty() + " " + q.size());
//		while (!q.isEmpty()) {
//			System.out.println(q.dequeue());
//		}
//		System.out.println();
//		System.out.println(q.isEmpty() + " " + q.size());

		QueueI q1 = new EnkeltQueue();
		q1.enqueue("Tom");
		q1.enqueue("Diana");
		q1.enqueue("Harry");
		q1.enqueue("Thomas");
		q1.enqueue("Bob");
		q1.enqueue("Brian");
		q1.enqueue("Emil");
		q1.enqueue("Morten");
		q1.enqueue("Jesper");
		q1.enqueue("Jens");
		q1.enqueue("Alin");
		q1.enqueue("Mathias");
		System.out.println(q1.getFront());
		System.out.println(q1.isEmpty() + " " + q1.size());
		while (!q1.isEmpty()) {
			System.out.println(q1.dequeue());
		}
		System.out.println(q1.isEmpty());
		System.out.println();
		System.out.println(q1.isEmpty() + " " + q1.size());
		System.out.println();
		q1.enqueue("Anna");
		q1.enqueue("Lotte");
		System.out.println(q1.isEmpty() + " " + q1.size());
		while (!q1.isEmpty()) {
			System.out.println(q1.dequeue());
		}
		System.out.println();
		System.out.println(q1.isEmpty() + " " + q1.size());


	}
}
