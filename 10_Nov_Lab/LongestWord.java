// Write a Java program to find the longest word in a text file
package lab9;
import java.util.Scanner;
import java.io.*;
public class LongestWord {
     public static void main(String [] args) throws Exception {
              new LongestWord().findLongestWords();
         }
     public String findLongestWords() throws Exception {
       String longest_word = "";
       String current;
       Scanner sc = new Scanner(new File("D:\\Avik1.txt"));
       while (sc.hasNext()) {
          current = sc.next();
           if (current.length() > longest_word.length()) {
             longest_word = current;
           }
       }
         System.out.println(longest_word);
            return longest_word;
            }
}