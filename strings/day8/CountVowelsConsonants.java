import java.util.Scanner;
public class CountVowelsConsonants {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine().toLowerCase();
        int v=0,c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z'){
                if("aeiou".indexOf(ch)>=0)v++;
                else c++;
            }
        }
        System.out.println(v+" "+c);
    }
}
