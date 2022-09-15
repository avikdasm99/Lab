/* 4…Consider a scenario where Bank is a class that provides functionality to get the rate
of interest. However, the rate of interest varies according to banks. For example, SBI,
ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest.
 */
package lab;
class Bank{  
int interest(){
	return 0;
	}  }  
class SBI extends Bank{  
int interest(){
	return 8;
	}  }   
class ICICI extends Bank{  
int interest(){
	return 7;
	}  } 
class AXIS extends Bank{  
int interest(){
	return 9;
	}  }
//BankInterest class to create objects and call the methods  
public class BankInterest{  
public static void main(String args[]){  
SBI a=new SBI();  
ICICI b=new ICICI();  
AXIS c=new AXIS();  
System.out.println("SBI Rate of Interest: "+a.interest());  
System.out.println("ICICI Rate of Interest: "+b.interest());  
System.out.println("AXIS Rate of Interest: "+c.interest());  
}  }
