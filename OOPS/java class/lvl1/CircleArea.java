import java.util.Scanner;
public class CircleArea{
    double radius;
    public CircleArea(double r){radius=r;}
    public double area(){return Math.PI*radius*radius;}
    public double circumference(){return 2*Math.PI*radius;}
    public void display(){System.out.println(area());System.out.println(circumference());}
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double r=in.nextDouble();
        CircleArea c=new CircleArea(r);
        c.display();
    }
}
