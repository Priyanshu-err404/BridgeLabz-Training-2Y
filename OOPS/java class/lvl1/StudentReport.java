import java.util.Scanner;
public class StudentReport{
    String name;
    int roll;
    int marks;
    public StudentReport(String n,int r,int m){name=n;roll=r;marks=m;}
    public String grade(){
        if(marks>=90) return "A";
        if(marks>=75) return "B";
        if(marks>=60) return "C";
        if(marks>=50) return "D";
        return "F";
    }
    public void display(){System.out.println(name);System.out.println(roll);System.out.println(marks);System.out.println(grade());}
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String n=in.nextLine();
        int r=in.nextInt();
        int m=in.nextInt();
        StudentReport s=new StudentReport(n,r,m);
        s.display();
    }
}
