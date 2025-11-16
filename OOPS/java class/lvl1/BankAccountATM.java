import java.util.Scanner;
public class BankAccountATM{
    String holder;
    String accNumber;
    double balance;
    public BankAccountATM(String h,String a,double b){holder=h;accNumber=a;balance=b;}
    public void deposit(double amt){balance+=amt;}
    public boolean withdraw(double amt){ if(amt<=balance){balance-=amt;return true;} return false;}
    public void display(){System.out.println(holder);System.out.println(accNumber);System.out.println(balance);}
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String h=in.nextLine();
        String a=in.nextLine();
        double b=in.nextDouble();
        double dep=in.nextDouble();
        double wit=in.nextDouble();
        BankAccountATM acc=new BankAccountATM(h,a,b);
        acc.deposit(dep);
        acc.withdraw(wit);
        acc.display();
    }
}
