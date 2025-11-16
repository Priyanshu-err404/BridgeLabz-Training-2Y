import java.util.Scanner;
public class ItemInventory{
    String itemCode;
    String itemName;
    double price;
    public ItemInventory(String c,String n,double p){itemCode=c;itemName=n;price=p;}
    public double totalCost(int qty){return price*qty;}
    public void display(){System.out.println(itemCode);System.out.println(itemName);System.out.println(price);}
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String code=in.next();
        String name=in.next();
        double price=in.nextDouble();
        int qty=in.nextInt();
        ItemInventory it=new ItemInventory(code,name,price);
        it.display();
        System.out.println(it.totalCost(qty));
    }
}
