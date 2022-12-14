/*1. Develop a java class with a method storeEvenNumbers(int N) using ArrayList to store
even numbers from 2 to N, where N is a integer which is passed as a parameter to the
method storeEvenNumbers(). The method should return the ArrayList (A1) created.
2. In the same class create a method printEvenNumbers()which iterates through the
arrayList A1 in step 1, and It should multiply each number with 2 and display it in format
4,8,12ā¦.2*N. and add these numbers in a new ArrayList (A2). The new ArrayList (A2)
created needs to be returned.
3. Create a method retrieveEvenNumber(int N) parameter is a number N. This method
should search the arrayList (A1) for the existence of the number āNā passed. If exists it
should return the Number else return zero.
Hint: Use instance variable for storing the ArrayList A1 and A2.
NOTE: You can test the methods using a main method.*/
package lab11;
import java.util.*;
public class Number {
	static ArrayList<Integer> list1=new ArrayList<Integer>();
	static ArrayList<Integer> list2=new ArrayList<Integer>();

	static ArrayList<Integer> storeEvenNumbers(int a) {
		for(int i=2;i<=a;i++) {
			if(i%2==0) {
				list1.add(i);
			}
		}return list1;
	}
	static ArrayList<Integer>  printEvenNumbers(){
		for(int i=0;i<list1.size();i++) {
			list2.add(list1.get(i)*2);
		}return list2;
	}

	static int  retrieveEvenNumber(int a) {
		if(list1.contains(a)) {
			return a;
		}else {
			return 0;
		}
	}
	public static void main(String[] args) {
		System.out.println("1st ArrayList : "+storeEvenNumbers(8));
		System.out.println("2nd ArrayList : "+printEvenNumbers());
		System.out.println("Search Result : "+retrieveEvenNumber(4));
	}
}
