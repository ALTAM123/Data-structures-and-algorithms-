

public class ArrayOfStack <T> implements Stack<T>{
    private T[] data;
    private int t;
    static final int CAP = 10;

    public ArrayOfStack(int c) {
        data = (T[]) new Object[c];
        t = -1;
    }

    public ArrayOfStack() {
        this(CAP);
    }

    @Override
    public boolean isEmpty() {
        return t == -1;
    }

    @Override
    public void push(T e) {
        if (size() == data.length)
            System.out.println("Stack is full");
        else
            data[++t] = e;
    }

    @Override
    public T pop() {
        if (isEmpty())
        return null;
        T x = data[t];
        data[t] = null;
        t--;
        return x;
    }

    @Override
    public T top() {
        if (! isEmpty())
            return data[t];
        return null;
    }

    @Override
    public int size() {
        return t+1;
    }
}
