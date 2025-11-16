import java.util.Scanner;
public class FirstNonRepeating {
    public static char firstNonRepeat(String s){
        int[] f=new int[256];
        for(int i=0;i<s.length();i++) f[s.charAt(i)]++;
        for(int i=0;i<s.length();i++) if(f[s.charAt(i)]==1) return s.charAt(i);
        return 0;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        char r=firstNonRepeat(s);
        if(r==0) System.out.println("None"); else System.out.println(r);
    }
}
