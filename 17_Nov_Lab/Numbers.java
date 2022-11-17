/* 1. Develop a java class with a method storeEvenNumbers(int N) using ArrayList to store 
even numbers from 2 to N, where N is a integer which is passed as a parameter to the 
method storeEvenNumbers(). The method should return the ArrayList (A1) created. 
2. In the same class create a method printEvenNumbers()which iterates through the 
arrayList A1 in step 1, and It should multiply each number with 2 and display it in format 
4,8,12….2*N. and add these numbers in a new ArrayList (A2). The new ArrayList (A2)
created needs to be returned.
3. Create a method retrieveEvenNumber(int N) parameter is a number N. This method 
should search the arrayList (A1) for the existence of the number ‘N’ passed. If exists it 
should return the Number else return zero.
Hint: Use instance variable for storing the ArrayList A1 and A2.
 */
package lab10;
import java.util.*;
public class Numbers {
	
	ArrayList<Integer> A1=new ArrayList<Integer>();
	
	public ArrayList<Integer> storeEvenNumbers(int N) {
		A1 = new ArrayList<Integer>();
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) {A1.add(i);}
		}   return A1;	}
	
	public ArrayList<Integer> printEvenNumbers() {
		ArrayList<Integer> A2 = new ArrayList<Integer>();
		for (int j : A2) {
			A2.add(j * 2);
			System.out.println(j * 2);
		} return A2; }
		
	public int retrieveEvenNumber(int N){
		int n=0;
		for(int k:A1) {
			if(k==N) {
				System.out.println("number found "+k);}
		}	
			return n;
		}  
			
	public static void main(String[] args) {
		Numbers num=new Numbers();
		//Scanner sc=new Scanner(System.in);
		//System.out.print("Enter the value of N = ");
		//int N=sc.nextInt();
		System.out.println(num.storeEvenNumbers(25));
		System.out.println(num.printEvenNumbers());
		System.out.println(num.retrieveEvenNumber(14));
		System.out.println(num.retrieveEvenNumber(30));
	
	}
}
