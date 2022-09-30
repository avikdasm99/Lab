/* Problem 5.
Write a Java program to find common elements from three sorted (in
non-decreasing order) arrays */

package lab3;
import java.util.Arrays;
public class CommonElements {
   public static void main(String[] args) {
       int a[] = {2, 4, 8};
       int b[] = {2, 3, 4};
       int c[] = {4, 2, 14};
       Arrays.sort(a);
       Arrays.sort(b);
       Arrays.sort(c);
       System.out.println(Arrays.toString(a));
       System.out.println(Arrays.toString(b));
       System.out.println(Arrays.toString(c));
       for (int i = 0; i< a.length; i++){
           for (int j = 0; j< b.length; j++){
        	   for (int k = 0; k< c.length; k++){
                       if (  (a[i] == b[j]) && ((b[j] == c[k]) )){
                   System.out.println("Common Element : "+a[i]);
                       } } } } } }
