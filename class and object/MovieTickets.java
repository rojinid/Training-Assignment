package Assignment;
import java.util.Scanner;

class ticket
{
	private int movieid;
	private int noOfSeats;
	
	public ticket(int id,int seat)
	{
		movieid=id;
		noOfSeats=seat;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int id) {
		this.movieid = id;
	}

	public int getnoOfSeats() {
		return noOfSeats;
	}

	public void setnoOfSeats(int seat) {
		this.noOfSeats = seat;
	}
	public double getCost1()
	{
		
		return((double)noOfSeats*7);	
		
	}
	public double getCost2()
	{
		
		return((double)noOfSeats*8);	
		
	}
	public double getCost3()
	{
		
		return((double)noOfSeats*8.5);	
		
	}
	
}

public class MovieTickets {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int id,seat;
		System.out.println("Enter Movie Id:");
		id=s.nextInt();
		System.out.println("Enter No of Seat:");
		seat=s.nextInt();
		ticket t=new ticket(id,seat);
		if(id==111)
		System.out.println("Cost :"+t.getCost1());
		else if(id==112)
			System.out.println("Cost :"+t.getCost2());
		else if(id==113)
			System.out.println("Cost :"+t.getCost3());
		else
			System.out.println("Inavlid Movie Id");
	}
}