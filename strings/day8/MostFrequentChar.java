import java.util.Scanner;
public class MostFrequentChar {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int[] f=new int[256];
        for(int i=0;i<s.length();i++)f[s.charAt(i)]++;
        int max=0,ch=0;
        for(int i=0;i<256;i++)
            if(f[i]>max){max=f[i];ch=i;}
        System.out.println((char)ch);
    }
}
