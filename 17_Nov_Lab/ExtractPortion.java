/* Write a Java program to extract a 
 * portion of an array list.
 */
package lab10;
import java.util.*;
public class ExtractPortion {

	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<String>();
		Collections.addAll(color, "red","green","orange","white","black");
		System.out.println("Before Extract="+color);
		System.out.println("After Extract="+color.subList(0, 3));

	}
}
