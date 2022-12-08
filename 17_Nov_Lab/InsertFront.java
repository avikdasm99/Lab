/*Write a Java program to 
insert the specified element at 
the front of a linked list*/


package lab10;
import java.util.*;
public class InsertFront {

	public static void main(String[] args) {
		LinkedList<Character> vowel=new LinkedList<Character>(); // create new LinkedList
		Collections.addAll(vowel, 'e','i','o','u'); // adding elements to ArrayList
		System.out.println("before insert="+vowel); //print ArrayList before insert
		vowel.addFirst('a');  // insert element at position 1
		System.out.println("after insert="+vowel); //print ArrayList after insert
	}
}
