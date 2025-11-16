import java.util.Scanner;
public class MobilePhoneDetails{
    String brand;
    String model;
    double price;
    public MobilePhoneDetails(String b,String m,double p){brand=b;model=m;price=p;}
    public void display(){System.out.println(brand);System.out.println(model);System.out.println(price);}
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String b=in.next();
        String m=in.next();
        double p=in.nextDouble();
        MobilePhoneDetails phone=new MobilePhoneDetails(b,m,p);
        phone.display();
    }
}
