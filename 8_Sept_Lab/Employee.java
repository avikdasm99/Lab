/* Q.2... java program to create employee object without using new keyword
take 5 input as id & name */

package sep8;
class Employee1{
	static void show(int eid,String name) {
		System.out.println("Employee id   "+eid+"    Employee name   "+ name);
	}
}

public class Employee {
	public static void main(String[] args) {
		Employee1.show(1,"Avik");
		Employee1.show(2,"Amal");
		Employee1.show(3,"Anik");
		Employee1.show(4,"Avas");
		Employee1.show(5,"Amar");
	}
}
