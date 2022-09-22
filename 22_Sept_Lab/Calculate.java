/* 2. Write a java program to illustrate Calculator class with addition, 
subtraction, multiplication methods that can take any number of parameters 
to perform the operation, without using method/constructor overloading.*/

package lab2;

class Number {
    private final int num1, num2;

    Number(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int Add() {
        return num1 + num2;
    }
    public int Subtract() {
        return num1 - num2;
    }
    public int Multiply() {
        return num1 * num2;
    }
}
public class Calculate {
    public static void main(String[] args) {
    	int num1 = 3, num2 = 2;
        Number calc = new Number(num1, num2);
        // show outputs from Number
        System.out.println("Number 1= " + num1);
        System.out.println("Number 2 =" + num2);
        System.out.println("Addition= " + calc.Add());
        System.out.println("Subtraction = " + calc.Subtract());
        System.out.println("Multiplication = " + calc.Multiply());
           }
    }


