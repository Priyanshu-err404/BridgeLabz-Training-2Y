import java.util.Scanner;
public class StringIndexOutOfBoundsDemo{
 public static void generate(String s){
  s.charAt(s.length());
 }
 public static void handle(String s){
  try{ s.charAt(s.length()); }catch(StringIndexOutOfBoundsException e){ System.out.println("Handled"); }
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String t=sc.next();
  try{generate(t);}catch(Throwable e){System.out.println("Thrown");}
  handle(t);
 }
}
