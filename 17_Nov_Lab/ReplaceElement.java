/*Write a Java program to replace an element
in a linked list.*/

package lab10;
import java.util.*;   // import package
public class ReplaceElement {

	public static void main(String[] args) {   // main method
		LinkedList<String> name=new LinkedList<String>();  // create LinkedList
		Collections.addAll(name, "Avik","Biplob","Soumen","Ratan");  // adding elements
		System.out.println("before replace="+name); // showing elements before replace
		name.set(0, "Krishnendu"); // replace elements at position 1
		System.out.println("after replace="+name); // showing elements after replace
	}
}
