/* 2… In this example, you have a base class Teacher and a sub class ITTeacher. Since
class ITTeacher extends the designation and college properties and work () method from
base class, we need not to declare these properties and method in sub class.
Here we have college Name, designation and work () method which are common to all the
teachers so we have declared them in the base class, this way the child classes like Math
Teacher, Music Teacher and PhysicsTeacher do not need to write this code and can be used
directly from base class.*/
package lab;

class Teacher {   
	   void work() {
		    String designation = "Teacher";
		    String collegeName = "Anudip";
	    	System.out.println("College Name : "+collegeName);
	    	System.out.println("Designation :  "+designation);
	    }   
	}
class ITTeacher extends Teacher{
	String subject="IT";
	ITTeacher() {
		super.work();
		System.out.println("Teaching : "+subject);
		System.out.println("  ");
	}
}
class MathTeacher extends Teacher{
	String subject="Math";
	MathTeacher() {
		super.work();
		System.out.println("Teaching : "+subject);
		System.out.println("  ");
	}
}
class MusicTeacher extends Teacher{
	String subject="Music";
	MusicTeacher() {
		super.work();
		System.out.println("Teaching : "+subject);
		System.out.println("  ");
	}
}
public class PhysicsTeacher extends Teacher{
	   String subject = "Physics";
	   PhysicsTeacher() {
			super.work();
			System.out.println("Teaching : "+subject);
		}
	   public static void main(String args[]){
		   ITTeacher obj1=new ITTeacher();
		   MathTeacher obj2=new MathTeacher();
		   MusicTeacher obj3=new MusicTeacher();
		PhysicsTeacher obj4 = new PhysicsTeacher();
	   }
	}
	