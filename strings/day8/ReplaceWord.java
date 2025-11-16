import java.util.Scanner;
public class ReplaceWord {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String oldW=in.next();
        String newW=in.next();
        String[] arr=s.split(" ");
        String out="";
        for(String w:arr){
            if(w.equals(oldW))out+=newW+" ";
            else out+=w+" ";
        }
        System.out.println(out.trim());
    }
}
