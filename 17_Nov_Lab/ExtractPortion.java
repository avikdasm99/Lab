/* Write a Java program to extract a 
 * portion of an array list.
 */
package lab10;
import java.util.*;
public class ExtractPortion {

	public static void main(String[] args) { // main method
		ArrayList<String> color=new ArrayList<String>(); // create new ArrayList
		Collections.addAll(color, "red","green","orange","white","black"); // adding elements 
		System.out.println("Before Extract="+color); // print before Extract
		System.out.println("After Extract="+color.subList(0, 3)); //print  after extract

	}
}
