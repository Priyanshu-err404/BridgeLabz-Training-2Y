import java.util.Scanner;
public class AnagramCheck {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String a=in.nextLine().replace(" ","").toLowerCase();
        String b=in.nextLine().replace(" ","").toLowerCase();
        if(a.length()!=b.length()){System.out.println(false);return;}
        int[] f=new int[256];
        for(char c:a.toCharArray())f[c]++;
        for(char c:b.toCharArray())f[c]--;
        for(int x:f)if(x!=0){System.out.println(false);return;}
        System.out.println(true);
    }
}
