import java.util.Scanner;
public class FactorialRecursion {
    public static long fact(long n){
        if(n<=1)return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println(fact(in.nextInt()));
    }
}
