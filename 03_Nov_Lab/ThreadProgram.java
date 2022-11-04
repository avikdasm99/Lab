package lab8;
import java.util.*;
public class ThreadProgram {
void ThreadProgram(int startNumber,int lastNumber) {
	ArrayList<Integer> a=new ArrayList<Integer>();
	for(int i=startNumber;i<=lastNumber;i++) {
		a.add(i);
	}}
public static void main(String[] args) {
	long startTime=System.currentTimeMillis();
	ThreadProgram t0= new ThreadProgram();
	t0.ThreadProgram(0, 10000000);
	System.out.println("The response time is = "+(System.currentTimeMillis()-startTime+" ms"));
	long EnhancedStartTime=System.currentTimeMillis();
	Firstthread t1=new Firstthread();
	Secondthread t2=new Secondthread();
	t1.start();
    try {
	t2.join();
    }
    catch(Exception e) {
	   System.out.println(e);
    }
	t2.start();
	System.out.println("After multithreading new response time is = "+(System.currentTimeMillis()-EnhancedStartTime));
}
}


class Firstthread extends Thread{
	public void run() {
		ArrayList<Integer> a=new ArrayList<Integer>();	
		for(int i=0;i<=5000000;i++) {
			a.add(i);
		}
	}}
class Secondthread extends Thread{
	public void run() {
		ArrayList<Integer> a=new ArrayList<Integer>();	
		for(int i=0;i<=5000000;i++) {
			a.add(i);
		}
	}}
