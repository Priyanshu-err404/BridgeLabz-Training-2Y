import java.util.Scanner;
public class ArrayIndexOutOfBoundsDemo{
 public static void generate(String[] arr,int idx){
  String x=arr[idx];
  System.out.print(x);
 }
 public static void handle(String[] arr,int idx){
  try{ String x=arr[idx]; System.out.print(x); }
  catch(ArrayIndexOutOfBoundsException e){ System.out.println("Handled"); }
  catch(RuntimeException e){ System.out.println("Handled"); }
 }
 public static void main(String[] args){
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  String[] arr=new String[n];
  for(int i=0;i<n;i++)arr[i]=s.next();
  int idx=s.nextInt();
  try{generate(arr,idx);}catch(Throwable e){System.out.println("Thrown");}
  handle(arr,idx);
 }
}
