// Write a java program to check the number is prime or not (taking input from user).

import java.util.Scanner;
public class PrimeNumberCheck {
	public static void main(String[] args) {
		int n;
		boolean a=false;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a number = ");
		n=obj.nextInt();
		for(int i=2;i<=n/2;i++) {                         
			if(n%i==0) {                      // condition for non prime number
				a=true;
				break;
			}
		}
		if(!a) {
			System.out.println(n+" is prime number");
		}
		else {
			System.out.println(n+" is not prime number");
		}
	}
}
