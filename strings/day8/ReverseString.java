import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String r="";
        for(int i=s.length()-1;i>=0;i--)r+=s.charAt(i);
        System.out.println(r);
    }
}
