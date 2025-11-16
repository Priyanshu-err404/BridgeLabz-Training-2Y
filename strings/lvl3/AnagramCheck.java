import java.util.Scanner;
public class AnagramCheck {
    public static boolean isAnagram(String a,String b){
        if(a.length()!=b.length()) return false;
        int[] f=new int[256];
        for(int i=0;i<a.length();i++){ f[a.charAt(i)]++; f[b.charAt(i)]--; }
        for(int i=0;i<256;i++) if(f[i]!=0) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String b=in.nextLine();
        System.out.println(isAnagram(a,b));
    }
}
