import java.util.Scanner;
public class FrequencyUsingUnique {
    public static char[] uniqueChars(String s){
        int n=s.length();
        char[] temp=new char[n];
        int idx=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            boolean uniq=true;
            for(int j=0;j<i;j++) if(s.charAt(j)==ch){ uniq=false; break; }
            if(uniq) temp[idx++]=ch;
        }
        char[] res=new char[idx];
        for(int i=0;i<idx;i++) res[i]=temp[i];
        return res;
    }
    public static String[][] freqFromUnique(String s){
        char[] u=uniqueChars(s);
        String[][] out=new String[u.length][2];
        for(int i=0;i<u.length;i++){
            int c=0;
            for(int j=0;j<s.length();j++) if(s.charAt(j)==u[i]) c++;
            out[i][0]=Character.toString(u[i]);
            out[i][1]=Integer.toString(c);
        }
        return out;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String[][] res=freqFromUnique(s);
        for(int i=0;i<res.length;i++) System.out.println(res[i][0]+":"+res[i][1]);
    }
}
