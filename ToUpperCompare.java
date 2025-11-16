import java.util.Scanner;
public class ToUpperCompare{
 public static String toUpperCustom(String t){
  StringBuilder sb=new StringBuilder();
  for(int i=0;i<t.length();i++){
   char c=t.charAt(i);
   if(c>='a'&&c<='z')sb.append((char)(c-32));
   else sb.append(c);
  }
  return sb.toString();
 }
 public static boolean compare(String a,String b){
  if(a.length()!=b.length())return false;
  for(int i=0;i<a.length();i++)if(a.charAt(i)!=b.charAt(i))return false;
  return true;
 }
 public static void main(String[] args){
  Scanner s=new Scanner(System.in);
  String t=s.nextLine();
  String a=toUpperCustom(t);
  String b=t.toUpperCase();
  System.out.println("same:"+compare(a,b));
 }
}
