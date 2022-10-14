/*Write a Java program to find sequences of lowercase letters joined 
with a underscore.*/

package lab4;
import java.util.regex.Pattern;
public class Problem3 {
 
   public static void main(String[] args) {
	   System.out.println(Pattern.matches("^[a-z]+_[a-z]+", "avik_das"));
	   System.out.println(Pattern.matches("^[a-z]+_[a-z]+", "Avik_das"));
	   System.out.println(Pattern.matches("^[a-z]+_[a-z]+", "avik_Das"));
   }
}
