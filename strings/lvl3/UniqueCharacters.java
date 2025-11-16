import java.util.Scanner;
public class UniqueCharacters {
    public static int lengthNoLen(String s){
        int c=0;
        try{ while(true){ s.charAt(c); c++; } }catch(IndexOutOfBoundsException e){}
        return c;
    }
    public static char[] uniqueChars(String s){
        int n=lengthNoLen(s);
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
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        char[] u=uniqueChars(s);
        for(char c:u) System.out.print(c);
        System.out.println();
    }
}
