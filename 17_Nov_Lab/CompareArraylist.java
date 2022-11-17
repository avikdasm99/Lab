/* Write a Java program to compare
 *  two array lists.*/
package lab10;
import java.util.*;
public class CompareArraylist {

	public static void main(String[] args) {
		ArrayList<String> color1=new ArrayList<String>();
		Collections.addAll(color1, "red","green","black","white","pink");
		ArrayList<String> color2=new ArrayList<String>();
		Collections.addAll(color2, "red","green","black","pink");
		ArrayList<String> result = new ArrayList<String>();
        for (String s : color1)
        	result.add(color2.contains(s) ? "yes" : "no");
        System.out.println(result);
	}
}
