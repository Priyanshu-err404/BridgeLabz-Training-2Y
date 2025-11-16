import java.util.Scanner;
public class IllegalArgumentDemo{
 public static void generate(String s,int a,int b){
  s.substring(a,b);
 }
 public static void handle(String s,int a,int b){
  try{ s.substring(a,b); }
  catch(IllegalArgumentException e){ System.out.println("Handled"); }
  catch(RuntimeException e){ System.out.println("Handled"); }
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String t=sc.next();
  int a=sc.nextInt();
  int b=sc.nextInt();
  try{generate(t,a,b);}catch(Throwable e){System.out.println("Thrown");}
  handle(t,a,b);
 }
}
