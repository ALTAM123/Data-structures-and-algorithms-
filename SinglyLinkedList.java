
public class SinglyLinkedList <E>{
   private Node<E> head = null;
   private Node<E> tail = null;
   private int size =0;

    public SinglyLinkedList() {
    }
    public boolean isEmpty()
    {
        return size == 0;
    }
    public int size ()
    {
        return size;
    }
    public E first()
    {
        if (isEmpty())return null;
        return head.getElement();
    }
    public E tail()
    {
        if (isEmpty())return null;
        return tail.getElement();
    }
    public void addFirst(E element)
    {
        Node<E> n = new Node<>(element,head);
        head = n;
        if (isEmpty())
            tail = head;
        size++;
    }
    public void addLast(E element)
    {
        Node<E> n = new Node<>(element,null);
        if (isEmpty())
        {
            tail = n;
            head = tail;
        }
        else {
            tail.setNext(n);
            tail = n;
        }
        size++;
    }
    public E removeFirst()
    {
        if (isEmpty())return null;
        E del = head.getElement();
        head = head.next;
        size--;
        if (size == 0)
            tail = null;
        return del;
    }





    public static class Node<E>
    {
        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
