// Write a java program to find factorial of a number (taking input from user).

import java.util.Scanner;

public class Factorial {

		public static void main(String ...args) {
			int n;
			long fact=1;               // initialize the variable
			Scanner obj=new Scanner(System.in);
			System.out.print("Enter a number = ");
			n=obj.nextInt();
			for(int i=1;i<=n;i++) {
				fact=fact*i;
			}
			System.out.println(n+"! = "+fact);
	}

}
