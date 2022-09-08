/* Q.4…. Can you create object of a class from inside the scope of
another class constructor.  
ans . YES I can create */

package sep8;
class College1{
	
}
public class College {
	College(){
		College1 a=new College1();
	}
	public static void main(String[] args) {
		College b=new College();
	}
}
