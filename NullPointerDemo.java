public class NullPointerDemo{
 public static void generate(){
  String t=null;
  t.length();
 }
 public static void handle(){
  try{
   String t=null;
   t.length();
  }catch(NullPointerException e){
   System.out.println("Handled");
  }
 }
 public static void main(String[] args){
  try{generate();}catch(Throwable e){System.out.println("Thrown");}
  handle();
 }
}
