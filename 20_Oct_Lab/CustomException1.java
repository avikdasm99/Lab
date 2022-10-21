// Problem: 3
//Write a program to create custom exception in java
package lab5;
class InvalidAgeException  extends Exception  //class representing custom exception  
{  
 public InvalidAgeException (String str)  
 {  
     super(str);   // calling the constructor of parent Exception  
 }  }  
public class CustomException1 { //class that uses custom exception InvalidAgeException  
 static void validate (int age) throws InvalidAgeException{     // method to check the age  
    if(age < 18){      
     throw new InvalidAgeException("age is not valid to vote");    // throw an object of user defined exception  
 }  
    else {   
     System.out.println("welcome to vote");   
     }    }     
 public static void main(String args[])  
 {  
     try  
     {  
         validate(13);  // calling the method   
     }  
     catch (InvalidAgeException ex)  
     {  
         System.out.println("Caught the exception");   
         System.out.println("Exception occured: " + ex);  // printing the message from InvalidAgeException object  
     }  
     System.out.println("rest of the code...");    
 }  }  
