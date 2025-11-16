import java.util.Scanner;
public class TemperatureConverter {
    public static double f2c(double f){return (f-32)*5/9;}
    public static double c2f(double c){return (c*9/5)+32;}
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double x=in.nextDouble();
        System.out.println(f2c(x));
        System.out.println(c2f(x));
    }
}
