class Item {
    String itemCode;
    String itemName;
    double price;

    Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    double totalCost(int qty) {
        return price * qty;
    }

    void show() {
        System.out.println(itemCode);
        System.out.println(itemName);
        System.out.println(price);
    }

    public static void main(String[] args) {
        Item i = new Item("A1", "Pen", 10);
        i.show();
        System.out.println(i.totalCost(5));
    }
}
