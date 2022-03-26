public class TestLinkedStack {
    public static void main(String[] args) {
        LinkedStack<Integer> s = new LinkedStack<>();
        s.push(5);
        s.push(4);
        s.push(3);
        System.out.println(s.top());
    }
}
