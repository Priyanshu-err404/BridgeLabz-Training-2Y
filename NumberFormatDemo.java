import java.util.Scanner;
public class NumberFormatDemo{
 public static void generate(String t){
  Integer.parseInt(t);
 }
 public static void handle(String t){
  try{ Integer.parseInt(t); }
  catch(NumberFormatException e){ System.out.println("Handled"); }
  catch(RuntimeException e){ System.out.println("Handled"); }
 }
 public static void main(String[] args){
  Scanner s=new Scanner(System.in);
  String t=s.next();
  try{generate(t);}catch(Throwable e){System.out.println("Thrown");}
  handle(t);
 }
}
