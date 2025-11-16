import java.util.Scanner;
public class SubstringCharAt{
 public static String subCharAt(String t,int start,int end){
  StringBuilder sb=new StringBuilder();
  for(int i=start;i<end && i<t.length();i++)sb.append(t.charAt(i));
  return sb.toString();
 }
 public static void main(String[] args){
  Scanner s=new Scanner(System.in);
  String t=s.next();
  int start=s.nextInt();
  int end=s.nextInt();
  String a=subCharAt(t,start,end);
  String b=t.substring(Math.max(0,start),Math.min(t.length(),end));
  System.out.println("substring1:"+a);
  System.out.println("substring2:"+b);
  System.out.println("same:"+a.equals(b));
 }
}
