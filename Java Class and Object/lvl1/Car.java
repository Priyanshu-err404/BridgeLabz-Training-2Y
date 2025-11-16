class Car {
    String model;
    int year;

    void set(String m, int y) {
        model = m;
        year = y;
    }

    void start() {
        System.out.println("Car Started");
    }

    void show() {
        System.out.println(model);
        System.out.println(year);
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.set("Honda", 2020);
        c.start();
        c.show();
    }
}
