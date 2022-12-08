/* Write a Java program to compare
 *  two array lists.*/
package lab10;
import java.util.*;
public class CompareArraylist {

	public static void main(String[] args) {   // main method
		ArrayList<String> color1=new ArrayList<String>();   // create ArrayList color1
		Collections.addAll(color1, "red","green","black","white","pink");   //adding elements to color1
		ArrayList<String> color2=new ArrayList<String>();  // create ArrayList color2
		Collections.addAll(color2, "red","green","black","pink");  //adding elements to color1
		ArrayList<String> result = new ArrayList<String>(); // create ArrayList Result where the compare values are stored using For loop
        for (String s : color1)
        	result.add(color2.contains(s) ? "yes" : "no");
        System.out.println(result);  // show the result Arraylist
	}
}
