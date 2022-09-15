/* 1… Write the following code:
1. A class named Arithmetic with a method named add that takes 
integers as parameters and
returns an integer denoting their sum.
2. A class named Adder that inherits from a superclass named 
Arithmetic.
Input Format
test your submission by calling the add method on an Adder object and 
passing it integer parameters
 */
package lab;

class Arithmetic{
	int add(int a,int b) {
		return a+b;
	}
}
public class Adder  extends Arithmetic {
	public static void main(String[] args) {
		Adder obj=new Adder();
		System.out.println("Addition = "+obj.add(20,10 ));
	}
}
