/*  Q.1 Write a Java program to find the value of specified expression.
a) 101 + 0) / 3
b) 3.0e-6 * 10000000.1
c) true && true
d) false && true
e) (false && false) || (true && true)
f) (false || false) && (true && true) */


package lab;

public class Specified_Expression {

	public static void main(String[] args) {
		
		int a=(102+0)/3;
		double b=3.0e-6 * 10000000.1;
		boolean c =true && true;
		boolean d=false && true;
		boolean e=(false && false) || (true && true);
		boolean f=(false || false) && (true && true);
		
		System.out.println("(102 + 0) / 3="+a);
		System.out.println("3.0e-6 * 10000000.1="+b);
		System.out.println("false && tru="+c);
		System.out.println("false && true="+d);
		System.out.println("(false && false) || (true && true)="+e);
		System.out.println("(false || false) && (true && true)="+f);
		

	}

}
