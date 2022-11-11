//Write a Java program to store text file content line by line into an array.
package lab9;
import java.io.*;
import java.util.*;
public class StoreText {
    public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String str = "  ";
        ArrayList<String> list = new ArrayList<String>();
        try {
             BufferedReader br = new BufferedReader(new FileReader("D:\\Avik1.txt"));
              while (str != null)
               {
                str = br.readLine();
                sb.append(str);
                sb.append(System.lineSeparator());
                str = br.readLine();
                if (str==null)
                   break;
                list.add(str);
            }
         System.out.println(Arrays.toString(list.toArray()));
             br.close();
        } catch (Exception e) {
            System.err.println("File not found");
        } 
     }
}