import java.util.Scanner;
public class PalindromeChecker{
    String text;
    public PalindromeChecker(String t){text=t;}
    public boolean isPalindrome(){
        int i=0,j=text.length()-1;
        while(i<j) if(text.charAt(i++)!=text.charAt(j--)) return false;
        return true;
    }
    public void display(){System.out.println(isPalindrome());}
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String t=in.nextLine();
        PalindromeChecker p=new PalindromeChecker(t);
        p.display();
    }
}
