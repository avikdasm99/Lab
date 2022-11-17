/*Write a Java program to 
insert the specified element at 
the front of a linked list*/


package lab10;
import java.util.*;
public class InsertFront {

	public static void main(String[] args) {
		LinkedList<Character> vowel=new LinkedList<Character>();
		Collections.addAll(vowel, 'e','i','o','u');
		System.out.println("before insert="+vowel);
		vowel.addFirst('a');
		System.out.println("after insert="+vowel);
	}
}
