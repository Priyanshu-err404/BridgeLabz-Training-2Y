import java.util.Scanner;
public class SubstringOccurrences {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String sub=in.nextLine();
        int count=0;
        for(int i=0;i<=s.length()-sub.length();i++)
            if(s.substring(i,i+sub.length()).equals(sub))count++;
        System.out.println(count);
    }
}
