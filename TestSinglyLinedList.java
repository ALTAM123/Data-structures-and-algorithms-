public class TestSinglyLinedList {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.rotate();
        System.out.println(list.last());
        System.out.println(list.find());
    }
    public static SinglyLinkedList convert(SinglyLinkedList l1,SinglyLinkedList l2)
    {
        SinglyLinkedList list = new SinglyLinkedList<>();
        while (! l1.isEmpty())
        {
            list.addLast(l1.removeFirst());
        }
        while (! l2.isEmpty())
        {
            list.addLast(l2.removeFirst());
        }
        return list;
    }

}
