/**
 * Created by م on 24/01/2022.
 */
public class Hm4 {
    public void print (int [] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
        System.out.println(" ");
    }
    public void removeElemente(int [] array){
        Random r= new Random();
        while (array.length > 0) {
            int index = r.nextInt(array.length);
            System.out.println("index ="+ index +" , elemnt =" + array[index]);
            int [] array1 = new int[array.length-1] ;
            for (int i = 0; i <index ; i++) {
                array1[i]=array[i];
                for (int j = 0; j <array.length-1 ; j++) {
                    array1[i]=array[i+1];
                    array=array1;   } } } }

    public static void main(String[] args) {
        int[] x={2,4,5,6,7,9};
        Hm4 o=new Hm4();
        o.removeElemente(x);
        o.print(x);
    }

}
