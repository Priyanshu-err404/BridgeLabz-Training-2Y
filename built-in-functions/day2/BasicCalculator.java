import java.util.Scanner;
public class BasicCalculator {
    public static double add(double a,double b){return a+b;}
    public static double sub(double a,double b){return a-b;}
    public static double mul(double a,double b){return a*b;}
    public static double div(double a,double b){return a/b;}
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double a=in.nextDouble();
        double b=in.nextDouble();
        String op=in.next();
        if(op.equals("+"))System.out.println(add(a,b));
        else if(op.equals("-"))System.out.println(sub(a,b));
        else if(op.equals("*"))System.out.println(mul(a,b));
        else if(op.equals("/"))System.out.println(div(a,b));
    }
}
