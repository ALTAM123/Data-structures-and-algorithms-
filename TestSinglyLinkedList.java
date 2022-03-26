import javax.swing.*;
import java.util.Scanner;

public class TestSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        Scanner in = new Scanner(System.in);
        String c ;
        int choies=-1 ;
        while (choies !=0)
        {
            JOptionPane.showMessageDialog(null,"1 اضافة في البداية و 2 اضافة في النهاية و 3 للحذف");
            c = JOptionPane.showInputDialog("ادخل إختيارك");
            if (c == null)
                break;
            if (c.equals("")) {
                continue;
            }
            choies = Integer.parseInt(c);
            switch (choies){
                case 1:
                    list.addFirst(JOptionPane.showInputDialog("ادخل الاسم"));
                    break;
                case 2:
                list.addLast(JOptionPane.showInputDialog("أدخل الاسم"));
                break;
                case 3:
                    JOptionPane.showMessageDialog(null,"الاسم المحذوف هو" + list.removeFirst());
                    break;
                case 0:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null,"الرقم المدخل غير صحيح"+ "\n الرجاء ادخال الرقم مرة اخرى ");
            }
            JOptionPane.showMessageDialog(null, "اول اسم هو "+ "\t"+list.first()+"اخر اسم هو"+list.last()+"\t" +"عدد العناصر تساوي" +"\t" +list.size());
        }
    }
}
