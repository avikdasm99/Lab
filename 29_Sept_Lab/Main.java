/*  Problem 3. Program to create library book Management system  to store and display book details in library where you can
create two classes one is main another one is library, where you can create two methods as addBook,dispanseBook and
bookId,bookName,bookAuthor as instance variables  */

package lab3;
 public class Main  {
      public static void main(String[] args) {
    	  Library obj1=new Library();
    	  obj1.addBook(21, "Basics of Java", "Amal Roy");
    	  obj1.dispanseBook(34, "Basics of Python", "Suresh Roy");
   }
}
class Library {
	int bookId;
	String bookName;
	String bookAuthor ;
	
	void addBook(int bookId,String bookName,String bookAuthor){
		System.out.println("Add Book Details");
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		System.out.println("\nbookId :"+bookId+" \nbookName:"+bookName+" \nbookAuthor: "+bookAuthor);
	}
    void dispanseBook(int bookId,String bookName,String bookAuthor){
    	System.out.println("\n\nDispanse Book Details");
    	this.bookId=bookId;
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		System.out.println("\nbookId :"+bookId+" \nbookName:"+bookName+" \nbookAuthor : "+bookAuthor);
	}
 }
