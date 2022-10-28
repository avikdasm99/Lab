/*1. Create two threads to print even numbers and odd numbers from 1 to 100?
note: after printing of all even numbers only odd numbers should print */
package lab6;
public class EvenOdd {
//main method
    public static void main(String[] args) { 
        Runnable r = new Even();
        Thread t = new Thread(r); // Create thread1
        t.start(); //
        Runnable r2 = new Odd();
        Thread t2 = new Thread(r2); // Create thread2
        t2.start();
    }
}

class Odd implements Runnable{
    public void run(){
    	System.out.println("\nAll odd numbers from 1 to 100 ");
        for(int i=1;i<=100;i++){
            if(i%2 == 1)
                System.out.print(i+" ");
        }
    }
}

class Even implements Runnable{
    public void run(){
    	System.out.println("All Even numbers from 1 to 100");
        for(int i=1;i<=100;i++){
            if(i%2 == 0)
                System.out.print(i+" ");
        }
    }
}
