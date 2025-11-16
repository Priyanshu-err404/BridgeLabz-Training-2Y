import java.util.Scanner;
public class ShoppingCart{
    static class CartItem{ String itemName; double price; int quantity; CartItem(String n,double p,int q){itemName=n;price=p;quantity=q;} }
    CartItem[] items=new CartItem[100];
    int size=0;
    public void add(String n,double p,int q){ items[size++]=new CartItem(n,p,q); }
    public void remove(String n){
        for(int i=0;i<size;i++) if(items[i].itemName.equals(n)){ for(int j=i;j<size-1;j++) items[j]=items[j+1]; size--; break; }
    }
    public double total(){
        double t=0;
        for(int i=0;i<size;i++) t+=items[i].price*items[i].quantity;
        return t;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int addCount=in.nextInt();
        ShoppingCart cart=new ShoppingCart();
        for(int i=0;i<addCount;i++){
            String name=in.next();
            double price=in.nextDouble();
            int qty=in.nextInt();
            cart.add(name,price,qty);
        }
        int remCount=in.nextInt();
        for(int i=0;i<remCount;i++){
            String rn=in.next();
            cart.remove(rn);
        }
        System.out.println(cart.total());
    }
}
