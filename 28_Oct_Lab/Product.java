/*Problem 2 :
Take two numbers x and y. Throw the exception if the two numbers are negative else print the 
Product of x and y.
Input Format
The only line of input consist of two integers, x and y.
Constraints
-20<= x, y <=20
Output Format
Print the product if both are positive else print the output as below:
java.lang.Exception: x and y should not be zero.*/

package lab6;
import java.util.Scanner;
public class Product {
public static void main(String[] args) throws Exception{
	Scanner sc=new Scanner(System.in);
	System.out.print("x = ");
	int x=sc.nextInt();
	System.out.print("y = ");
	int y=sc.nextInt();
	try {
		if(x<0 || y<0) {
			throw new Exception("x and y should not be zero.");
		}
		else {
		     System.out.println("x * y = "+x*y);	
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
  }
}
