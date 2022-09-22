 /* 3.Movie Theatre Management System, 
 * where you can create two classes one is main another one is movie, 
movie class can have two methods setMovie, getMovie 
where you can create movieName, movieStartTime, movieEndTime,
 MovieTicketPrice as instance variables.*/

package lab2;
class Movie{
	
	String movieName, movieStartTime, movieEndTime,MovieTicketPrice;
    
	String  getMovie(){
		return ( "\n MovieName : " + movieName+ "\n MovieStartTime:" +movieStartTime+ "\n MovieEndTime : "+movieEndTime+"\n MovieTicketPrice: "+MovieTicketPrice);
		
	}
	
	void setMovie(String movieName, String movieStartTime, String movieEndTime,String MovieTicketPrice){
		this.movieName=movieName;
		this.movieStartTime=movieStartTime;
		this.movieEndTime=movieEndTime;
		this.MovieTicketPrice= MovieTicketPrice;	
	} 
}
public class Main{
	public static void main(String[] args) {
		Movie m=new Movie();
		m.setMovie("ABCD of  Java", " 11:00 am"," 12:00 pm","100");
		System.out.println(m.getMovie());
	}
}