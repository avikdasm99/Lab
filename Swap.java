/*Q.2
Java: Swapping two variables
Swapping two variables refers to mutually exchanging the values of the
variables. Generally, this is done with the data in memory.
The simplest method to swap two variables is to use a third temporary
variable :
 */
class Swap{
public static void main(String ...args){

int a=10;
int b=20;

System.out.println(" before swapping ");
System.out.println(" a= "+a);
System.out.println(" b= "+b);



 int c = a;
 a = b;
 b= c;

System.out.println(" after swapping ");
System.out.println(" a= "+a);
System.out.println(" b= "+b);


}
}