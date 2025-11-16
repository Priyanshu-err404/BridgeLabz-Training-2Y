import java.util.Scanner;
public class PalindromeChecks {
    public static boolean isPalIter(String s){
        int i=0,j=s.length()-1;
        while(i<j) if(s.charAt(i++)!=s.charAt(j--)) return false;
        return true;
    }
    public static boolean isPalRec(String s,int i,int j){
        if(i>=j) return true;
        if(s.charAt(i)!=s.charAt(j)) return false;
        return isPalRec(s,i+1,j-1);
    }
    public static boolean isPalReverse(String s){
        int n=s.length();
        char[] rev=new char[n];
        for(int i=0;i<n;i++) rev[i]=s.charAt(n-1-i);
        char[] orig=s.toCharArray();
        for(int i=0;i<n;i++) if(orig[i]!=rev[i]) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(isPalIter(s));
        System.out.println(isPalRec(s,0,s.length()-1));
        System.out.println(isPalReverse(s));
    }
}
