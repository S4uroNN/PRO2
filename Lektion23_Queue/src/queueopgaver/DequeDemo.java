package queueopgaver;

public class DequeDemo {
    public static void main(String[] args) {
        DobbelKædeDQ dq = new DobbelKædeDQ();
        dq.addFirst("Tom");
        dq.addFirst("Diana");
        dq.addFirst("Harry");
        dq.addFirst("Thomas");
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        System.out.println();
        while(!dq.isEmpty()){
            System.out.println(dq.removeLast());
        }

        dq.addLast("Tom");
        dq.addLast("Emil");
        dq.addLast("Jens");

        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        System.out.println();
        while(!dq.isEmpty()){
            System.out.println(dq.removeFirst());
        }


    }
}
