import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintFiles {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayQueue<String> files = new ArrayQueue<>(3);
        System.out.println("input the file name");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            files.enqueue(in.next());
        }
        System.out.println("print file in queue");
        while (! files.isEmpty() )
        {
            Scanner fileScan = new Scanner(new File(files.dequeue()));
            while ( fileScan.hasNextLine())
            {
                System.out.println(fileScan.nextLine());
            }
        }
    }
}
