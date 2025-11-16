import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String[] w=in.nextLine().split(" ");
        String max=w[0];
        for(String x:w)if(x.length()>max.length())max=x;
        System.out.println(max);
    }
}
