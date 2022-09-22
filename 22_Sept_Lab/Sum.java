//  1.write a java program to print sum of odd numbers up to N?
 
package lab2;
import java.util.Scanner;
public class Sum{
public static void main(String[] args) {
	
	int n;
	int sum=0;
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter the value of  N =");
	n=sc.nextInt();
	for(int i =0;i<=n;i++) {
		if(i%2!=0) {
			sum=sum+i;	
			System.out.println(i);
		}
	}
	System.out.println("sum of odd numbers up to  "+ n+"  is  "+sum);
}
}
