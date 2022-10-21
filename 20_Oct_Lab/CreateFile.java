// Problem: 2
//Wite a program in Java to create a file in Java using Exception Handling.
package lab5;
import java.io.File;
import java.io.IOException;
public class CreateFile {
 public static void main(String[] args) {
	try {
		File f=new File("20_Oct_lab");
		if(f.createNewFile()) {
			System.out.println(f.getName()+" file is created");
		}
		else {
			System.out.println("file already exist");
		}
	}
	catch(IOException e){
		System.out.println("Errors are found");
		e.printStackTrace();
	}}}


