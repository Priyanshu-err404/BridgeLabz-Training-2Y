class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void add(int q) {
        quantity += q;
    }

    void remove(int q) {
        if (q <= quantity) quantity -= q;
    }

    double total() {
        return price * quantity;
    }

    public static void main(String[] args) {
        CartItem c = new CartItem("Phone", 20000, 1);
        c.add(1);
        c.remove(1);
        System.out.println(c.total());
    }
}
