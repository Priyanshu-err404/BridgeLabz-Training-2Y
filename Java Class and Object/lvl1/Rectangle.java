class Rectangle {
    double length;
    double width;

    void set(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.set(5, 3);
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}
