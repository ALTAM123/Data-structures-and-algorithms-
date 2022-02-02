/**
 * Created by م on 24/01/2022.
 */
public class a {
    int[] array={1,2,3,4,5,6};
    public void printBefore() {
        int i;
        System.out.println("Array = ");
        System.out.print("{");
        for ( i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("}");
    }
    public void printAfter(){
        int j=array.length-1;
        System.out.print("Array Reverse =\n{");
        for ( ; j >=0 ; j--) {
            System.out.print(array[j] + " ");
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        a n=new a();
        n.printBefore();
        n.printAfter();

    }


}
