/*Q.4
Write a Java program to compute the specified expressions and print the
output.
Specified Expression:
(25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5) */


class Specified_Expression{
public static void main(String ...args){

float a=25.5f;
float b=3.5f;
float c=40.5f;
float d=4.5f;

float result;

result =(a*b-b*b)/(c-d); 

System.out.println(" (25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5) = "+result);
}
}