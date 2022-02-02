/**
 * Created by م on 24/01/2022.
 */
public class a2 {public void print (int [] array){
    for (int i = 0; i <array.length ; i++) {
        System.out.println(array[i]);
    }
    System.out.println(" ");
}
    public void remove(int [] array,int z)
    {
        for (int i = 0; i < array.length; i++) {
            if (array[i]==z)
            {
                array[i]=0;
            }
        }
        print(array);
    }

    public static void main(String[] args) {
        int [] x={2,9,7,6,4,3,12,34};
        a2 o=new a2();
        o.print(x);
        o.remove(x,  9);
    }
}
