import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String out="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(out.indexOf(ch)<0)out+=ch;
        }
        System.out.println(out);
    }
}
