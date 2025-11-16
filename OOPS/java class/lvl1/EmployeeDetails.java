import java.util.Scanner;
public class EmployeeDetails{
    String name;
    int id;
    double salary;
    public EmployeeDetails(String n,int i,double s){name=n;id=i;salary=s;}
    public void display(){System.out.println(name);System.out.println(id);System.out.println(salary);}
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String name=in.nextLine();
        int id=in.nextInt();
        double sal=in.nextDouble();
        EmployeeDetails e=new EmployeeDetails(name,id,sal);
        e.display();
    }
}
