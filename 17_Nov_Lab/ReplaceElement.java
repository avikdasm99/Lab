/*Write a Java program to replace an element
in a linked list.*/

package lab10;
import java.util.*;
public class ReplaceElement {

	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<String>();
		Collections.addAll(name, "Avik","Biplob","Soumen","Ratan");
		System.out.println("before replace="+name);
		name.set(0, "Krishnendu");
		System.out.println("after replace="+name);
	}
}
