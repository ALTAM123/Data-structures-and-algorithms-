/**
 * Created by م on 02/02/2022.
 */
public class a3 {
    int[] array = {1, 2, 3, 4, 5, 6};
    int[] cloneArray = array.clone();

    public void printArray() {
        System.out.println("Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public void printcloneArray(){
        System.out.println("clone Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(cloneArray[i] + " ");
        }
    }

    public static void main(String[] args) {
        a3 a=new a3();
        a.printArray();
        a.printcloneArray();
    }
}


