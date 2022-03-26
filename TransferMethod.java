import java.util.Scanner;

public class TransferMethod {
    public static void main(String[] args) {
        ArrayOfStack<Integer> s = new ArrayOfStack<>(5);
        ArrayOfStack<Integer> t = new ArrayOfStack<>();
        Scanner in = new Scanner(System.in);
        System.out.println("input the element");
        for (int i = 0; i < 5; i++) {
            s.push(in.nextInt());
        }
        System.out.println(s.size());
        System.out.println("The stack T after transfer");
        transfer(s,t);
        System.out.println("The stack after remove");
        recursive_removing(t);
    }
    public static void transfer(ArrayOfStack s,ArrayOfStack t)           //Question 1
    {
        int size = s.size();
        for (int i = 0; i < size; i++) {
            t.push(s.pop());
            System.out.println(t.top());
        }
    }
    public static void recursive_removing(ArrayOfStack t)           //Question 2
    {
        int sz = t.size();
        for (int i = 0; i < sz; i++) {
            if (sz == 0)
                break;
            System.out.println(t.pop() +"\tThe size = "+t.size() );
        }
    }
}
