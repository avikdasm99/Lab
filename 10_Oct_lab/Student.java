/* Create a student class having the following attributes
 1. Student No. (Data type int)
 2. Student Name. (Data type String)
 3. Student Mail Id. (Data type String)
 4. Student Address. (Data type String)
 This class should have 2 methods
 1. void fees (Int Student No.)
 2. void display (Int Student number)
 After the class, you need to create an array of Student having 5 Students
 assign different fees to each Student and also print the details of each
 Student with the array only.
 Now create a static method in the main class which will accept Student
 number and Student fees as parameter and if the fees are less than 2000
 then fees will increase by 10% of their current fees to that Student.
 Call the display method to print the updated details. */ 
package oct10;

public class Student{
	 int no;
	 double fees;
     String name;
     String address;
     String email;
     Student(int no,String name,String address,String email,double fees){
    	 this.no=no;
    	 this.name=name;
    	 this.address=address;
    	 this.email=email;
    	 this.fees=fees;
     }
     void fees(int no,double fees) {
	    	if(fees<2000) {
	    		fees=fees*1.1;
	    	}System.out.println("New Fees : "+fees);
	    }
    void display(int no) {
    	System.out.println("\nStudent No :"+no);
    	System.out.println("Student Name :"+name);
    	System.out.println("Student Address :"+address);
    	System.out.println("Student Mail Id: "+email);
    	System.out.println("Old fees : "+fees);
		fees(no,fees);
        }
public static void main(String[] args) {
		Student  st[]= {new Student(1,"Avik","Abc","A@",1234),
				              new Student(2,"Arup","Arbc","B@",1264),
				              new Student(3,"Ram","Aybc","AD@",2000),
				              new Student(4,"Rahim","Ajbc","AT@",1234),
				              new Student(5,"Ratan","Abuc","AY@",3000)};
		for(int i=0;i<st.length;i++) {
			st[i].display(st[i].no);
		}
	}
}