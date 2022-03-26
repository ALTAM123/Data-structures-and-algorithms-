public class TestLinkedQueue {
    public static void main(String[] args) {
        LinkedQueue<Integer> q = new LinkedQueue<>();
        q.enqueue(5);
        q.enqueue(4);
        q.enqueue(3);
        System.out.println(q.dequeue());
        System.out.println(q.front());
        System.out.println(q.size());
    }
}
