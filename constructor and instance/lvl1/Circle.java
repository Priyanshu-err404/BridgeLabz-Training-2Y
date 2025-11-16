class Circle {
    double radius;

    Circle() {
        this(1.0);
    }

    Circle(double r) {
        radius = r;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c.radius);
    }
}
