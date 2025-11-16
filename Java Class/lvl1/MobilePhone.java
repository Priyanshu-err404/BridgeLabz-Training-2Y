class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void show() {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
    }

    public static void main(String[] args) {
        MobilePhone m = new MobilePhone("Samsung", "S21", 45000);
        m.show();
    }
}
