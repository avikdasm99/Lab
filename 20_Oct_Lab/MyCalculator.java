/*Create a class MyCalculator which consists of a single method long power(int, int).
This method takes two integers, n and p, as parameters and finds n^p . If either n or
p is negative, then the method must throw an exception which says "n or p should
not be negative.". Also, if both n and p are zero, then the method must throw an
exception which says "n and p should not be zero."*/
package lab5;
public class MyCalculator {
	public long power(int n, int p) throws Exception{
		if(n==0 && p==0) {
			throw new Exception("n and p should not be zero"); }   
		else if(n<0 || p<0) {
			throw new Exception("n or p should not be negative"); }
		else
			return (long)(Math.pow(n,p));	 }
	public static void main(String[] args) {
		MyCalculator calculate=new MyCalculator();
		try {System.out.println(calculate.power(12, 2));   } // calling the method
		catch (Exception e) { System.out.println(e);  }
		
		try {  System.out.println(calculate.power(2, 10));   } // calling the method
		catch (Exception e) { System.out.println(e);  }
		
		try {System.out.println(calculate.power(0, 0));   }  // calling the method
		catch (Exception e) {System.out.println(e); }
		
		try { System.out.println(calculate.power(2, -1));   }// calling the method
        catch (Exception e) {System.out.println(e); } } }
        