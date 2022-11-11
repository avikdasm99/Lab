// Write a Java program to read first 3 lines from a file.
package lab9;
import java.io.*;
public class ReadFirstThreeLines {
 
    public static void main(String a[]){
        BufferedReader br = null;
        String str = "";
        try {
            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("D:\\Avik1.txt")));
             while (((str = reader.readLine()) != null) && reader.getLineNumber() <= 3){
                System.out.println(str);
            }
           reader.close();
        } catch (Exception e) {
            System.err.println("File not found");
        } 
     }
}