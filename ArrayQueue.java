
public class ArrayQueue <E> implements Queue<E>{
    final static int CAPASITY = 100;
    E[] data;
    int sz;
    int f;

    public ArrayQueue(int c) {
        data = (E[]) new Object[c];
        sz = 0;
        f = 0;
    }

    public ArrayQueue() {
        this(CAPASITY);
    }

    @Override
    public boolean isEmpty() {
        return sz == 0;
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public void enqueue(E element) {
        if (sz == data.length)
            throw new IllegalStateException("Queue is full");
        data[ sz + f % data.length] = element;
        sz++;
    }

    @Override
    public E dequeue() {
        if (isEmpty())
        return null;
        E d = data[f];
        data[f] = null;
        f = f + 1;
        sz--;
        return d;
    }

    @Override
    public E top() {
        if (isEmpty())
        return null;
        return data[f];
    }
}
