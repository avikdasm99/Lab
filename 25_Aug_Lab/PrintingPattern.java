// Write a java program to draw the pattern(taking input from user).

import java.util.Scanner;
public class PrintingPattern {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Number = ");
		int n=obj.nextInt();
		 for (int i=0; i<n; i++) 
	        { 
	            for (int j=n-i; j>1; j--) 
	                System.out.print(" "); 
	            for (int j=0; j<=i; j++ ) 
	                System.out.print(" *"); 
	            System.out.println(); 
	        } 
	}

}
