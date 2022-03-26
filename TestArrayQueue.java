import java.util.Scanner;

public class TestArrayQueue {
    public static void main(String[] args) {
        String n=" ";
        ArrayQueue<Character> q = new ArrayQueue<>(5);
        Scanner in = new Scanner(System.in);
        System.out.println("input the element");

        q.enqueue(in.next().charAt(0));
        System.out.println("size is "+ q.size());
        System.out.println("top is "+q.top());

        q.enqueue(in.next().charAt(0));
        System.out.println("size is "+ q.size());
        System.out.println("top is "+q.top());
        q.dequeue();
        System.out.println("size is "+ q.size());
        System.out.println("top is "+q.top());

        q.enqueue(in.next().charAt(0));
        System.out.println("size is "+ q.size());
        System.out.println("top is "+q.top());


       /* for (int i = 0; i < 5; i++) {
            q.enqueue(in.next().charAt(0));
            System.out.println("size is "+ q.size());
            System.out.println("top is "+q.top());
        }
        for (int i = 0; i < 5; i++) {
            n += q.dequeue();
            System.out.println("size is "+ q.size());
            System.out.println("top is "+q.top());
        }
        System.out.println(n);*/
    }
}
