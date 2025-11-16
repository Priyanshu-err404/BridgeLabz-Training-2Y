import java.util.Scanner;
public class ToggleCase {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine(),out="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z')out+=(char)(ch-32);
            else if(ch>='A'&&ch<='Z')out+=(char)(ch+32);
            else out+=ch;
        }
        System.out.println(out);
    }
}
