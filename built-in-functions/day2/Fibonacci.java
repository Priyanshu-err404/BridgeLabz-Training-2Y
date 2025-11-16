import java.util.Scanner;
public class Fibonacci {
    public static void fib(int n) {
        int a=0,b=1;
        for(int i=0;i<n;i++){
            System.out.println(a);
            int t=a+b;
            a=b;
            b=t;
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        fib(in.nextInt());
    }
}
