/* Q.2 Write a Java program to convert minutes into a number of years
  and
days.
 */
package lab;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		
		double minutes = 60 * 24 * 365;

        Scanner obj = new Scanner(System.in);

        System.out.print(" enter  minutes = ");

        double min = obj.nextDouble();

        long years = (long) (min / minutes);
        
        int days = (int) (min / 60 / 24) % 365;
        
        System.out.println((int) min + " minutes is = " + years + " years and " + days + " days");
	}

}
