/* Q.5
Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24 */


class Calculator{
public static void main(String ...args){
int a=125;
int b=24;
 int sum =a+b;
int subtract=a-b;
int multiply=a*b;
float divide=a/b;
int remainder= a%b;

System.out.println("sum ="+sum);
System.out.println("subtract ="+subtract);
System.out.println("multiply ="+multiply);
System.out.println("divide ="+divide);
System.out.println("remainder ="+remainder);



}
}