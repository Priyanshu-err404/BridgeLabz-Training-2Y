import java.util.Scanner;
public class LexicographicalCompare {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String b=in.nextLine();
        int min=Math.min(a.length(),b.length());
        for(int i=0;i<min;i++){
            if(a.charAt(i)<b.charAt(i)){System.out.println(a);return;}
            if(a.charAt(i)>b.charAt(i)){System.out.println(b);return;}
        }
        if(a.length()<b.length())System.out.println(a);
        else if(a.length()>b.length())System.out.println(b);
        else System.out.println("equal");
    }
}
