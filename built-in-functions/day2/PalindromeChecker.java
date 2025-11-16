import java.util.Scanner;
public class PalindromeChecker {
    public static boolean pal(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;j--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println(pal(in.nextLine()));
    }
}
