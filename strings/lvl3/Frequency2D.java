import java.util.Scanner;
public class Frequency2D {
    public static String[][] freq2D(String s){
        int[] f=new int[256];
        for(int i=0;i<s.length();i++) f[s.charAt(i)]++;
        int cnt=0;
        for(int i=0;i<256;i++) if(f[i]>0) cnt++;
        String[][] out=new String[cnt][2];
        int k=0;
        for(int i=0;i<256;i++) if(f[i]>0){ out[k][0]=Character.toString((char)i); out[k][1]=Integer.toString(f[i]); k++; }
        return out;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String[][] res=freq2D(s);
        for(int i=0;i<res.length;i++) System.out.println(res[i][0]+":"+res[i][1]);
    }
}
