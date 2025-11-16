import java.util.Scanner;
public class MovieTicketBooking{
    String movieName;
    String seatNumber;
    double price;
    public MovieTicketBooking(){}
    public void book(String m,String s,double p){movieName=m;seatNumber=s;price=p;}
    public void display(){System.out.println(movieName);System.out.println(seatNumber);System.out.println(price);}
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String m=in.nextLine();
        String s=in.next();
        double p=in.nextDouble();
        MovieTicketBooking t=new MovieTicketBooking();
        t.book(m,s,p);
        t.display();
    }
}
