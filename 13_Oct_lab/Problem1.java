/*  Problem Statement 1:
Write a program which creates a String “Welcome to Java World” and performs the following 
•	Returns the character at 5th position and display it.
•	Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
•	Concatenates “- Let us learn” to the above string and display it.
•	Returns the position of the first occurrence of character ‘a’ and display it.
•	Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
•	Returns string between 4th position and 10th position and display it.
•	Returns the lowercase of the string and display it.

Problem Statement 2:
Write a program which creates a StringBuffer “This is StringBuffer” and performs the following. 
1.	Adds the string ”- This is a sample program” to existing string and display it.
2.	Inserts the string “Object” into the existing string at 21st postion and display it.
3.	Reverses the entire string and displays it.
4.	Replaces the word “Buffer” with “Builder” and display it.

Problem Statement 3:
Write a program which creates a String “C:\IBM\DB2\PROGRAM\DB2COPY1.EXE”. It parses the string with the delimiter as ‘\’ and displays the String in the following format.
Drive: c:\
Folders: IBM || DB2 || PROGRAM 
File: DB2COPY1.EXE

*/package lab4;
import java.util.StringTokenizer;  
public class Problem1 {
       public static void main(String[] args) {
    	   
	   String s="Welcome to Java World";
	   System.out.println(s.charAt(4));    //Returns the character at 5th position and display it
	   System.out.println(s.compareToIgnoreCase("Welcome"));//Compares the  String with “Welcome” lexicographically ignoring case 
	   System.out.println(s.concat(" Let us learn "));  //Concatenates “- Let us learn” to the above string 
	   System.out.println(s.indexOf('a')); // Returns the position of the first occurrence of character ‘a’ 
	   System.out.println(s.replace('a', 'e'));//places all the occurrences of ‘a’ character with the new ‘e’ 
	   System.out.println(s.substring(4, 10));//Returns string between 4th position and 10th position and display it
	   System.out.println(s.toLowerCase());// Returns the lowercase of the string and display it.
	   
	   StringBuffer sb=new StringBuffer("This is StringBuffer");
	   System.out.println(sb.append(" This is a sample program "));
	   System.out.println(sb.insert(21, " Object "));
	   System.out.println(sb.replace(14, 20, " Builder "));
	   System.out.println(sb.reverse());
	   
	   
	   StringTokenizer st = new StringTokenizer("C:\\IBM||DB2||PROGRAM\\DB2COPY1.EXE");  
	   System.out.println("Drive: : " + st.nextToken("\\"));  
	   System.out.println("Folders:  " + st.nextToken("\\"));  
	   System.out.println("File : " + st.nextToken("\\"));
       }
}
