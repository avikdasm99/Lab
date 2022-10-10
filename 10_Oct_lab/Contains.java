// Q.1 Write a Java program to test if an array contains a specific value.
package oct10;
public class Contains {

	public static void main(String[] args) {
		int a[]= {1789,2035,1899,1456,1234};
		int num = 1234;

	      for(int i = 0; i<a.length; i++){
	         if(num == a[i]){
	            System.out.println("Array contains the given element");
	         }
	      }
	}
}
