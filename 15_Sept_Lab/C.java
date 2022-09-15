/* 3… Class A serves as a base class for the derived class B, which in turn
serves as a base class for the derived class C. (Which type Of Inheritance
explain with an example)
it is multilevel inheritance */
package lab;

class A{
  A(){
	  System.out.print("My ");
  }
}
class B extends A{
	B(){
		  System.out.print("name is ");
	  }
}
public class C extends B{
	C(){
		  System.out.print("Avik Das");
	  }
	public static void main(String ...args) {
		C obj=new C();
	}
}