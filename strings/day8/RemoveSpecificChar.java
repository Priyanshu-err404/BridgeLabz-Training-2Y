import java.util.Scanner;
public class RemoveSpecificChar {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        char rem=in.next().charAt(0);
        String out="";
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)!=rem)out+=s.charAt(i);
        System.out.println(out);
    }
}
