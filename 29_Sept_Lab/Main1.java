/* Problem 2.
Banking Operations create a class with customer private instance
variables as accountNumber,accountName,accountBalance and
create methods as
1. create account => accnumber,accname,accbal
2. setAmount=> add amount to accbal
3. getAmount=>print accbal and name account 
4. withDrawAmount()=to withdraw amount from accBalance
create a main class to use customer and create atleast two
customers      */

package lab3;

 class Customer {
	 private long accountNumber;
	 private String accountName;
	 private double accountBalance; 
	 private double deposit;
	 private double withDraw;
	       void createaccount(long accnumber,String accname,double accbal) {
		  accountNumber=accnumber;
		  accountName=accname;
		  accountBalance=accbal;
		 System.out.println("A/c Number :"+accnumber+"\nAccount Name : "+accname+"\nInitial Balance : "+accbal);
		 System.out.println(" \n   Account Created Successfully \n\n");
	 }
	void  setAmount( double d){  // method 1
		 accountBalance+=d;
		 System.out.println("Deposite : "+d+"\t\tAccount Balance = "+accountBalance);
	}
	 
	 void withDrawAmount(double w) {            // method 2
		 accountBalance-=w;
		  System.out.println("Withdraw : "+w+"\t\tAccount Balance = "+accountBalance);
		 
		  
	 }
	 void getAmount(){               // method 3
		 System.out.println("\n\nAccount Name : "+accountName);
		 System.out.println("Account Balance :"+accountBalance);
	 }
}
 public class Main1{
	 public static void main(String[] args) {
		 Customer c=new Customer();
		 c.createaccount(1234,"AVIK DAS", 10000.0);
		 c.setAmount(1056.00);
		 c.withDrawAmount(5000);
		 c.getAmount();
		 System.out.println("\n\n-------------------------------------------");
		 c.createaccount(4321,"Ratan Samanta", 5000.00);
		 c.setAmount(2000.00);
		 c.withDrawAmount(3000.00);
		 c.getAmount();
		 
		 
	}
 }
