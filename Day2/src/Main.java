public class Main {
    public static void main(String[] args) {
//QueueArrayImpl queue = new QueueArrayImpl(2);
//queue.enqueue(2);
//        queue.enqueue(22);
//        queue.enqueue(23);
//        queue.enqueue(562);
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.peek());
//
//        System.out.println(queue.search(562));
//        System.out.println(queue.search(2002));

        QueueArrayListImpl ql = new QueueArrayListImpl();
        ql.enqueue(5);
        ql.enqueue(25);
        ql.enqueue(533);
        System.out.println(ql.dequeue());
        System.out.println(ql.peek());
        System.out.println(ql.search(25));



    }
}
