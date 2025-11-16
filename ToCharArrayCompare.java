import java.util.Scanner;
public class ToCharArrayCompare{
 public static char[] toChars(String t){
  char[] r=new char[t.length()];
  for(int i=0;i<t.length();i++)r[i]=t.charAt(i);
  return r;
 }
 public static boolean compareArr(char[] a,char[] b){
  if(a.length!=b.length)return false;
  for(int i=0;i<a.length;i++)if(a[i]!=b[i])return false;
  return true;
 }
 public static void main(String[] args){
  Scanner s=new Scanner(System.in);
  String t=s.next();
  char[] a=toChars(t);
  char[] b=t.toCharArray();
  System.out.println("same:"+compareArr(a,b));
 }
}
