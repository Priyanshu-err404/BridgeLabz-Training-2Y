class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14159 * radius * radius;
    }

    double circumference() {
        return 2 * 3.14159 * radius;
    }

    void show() {
        System.out.println(area());
        System.out.println(circumference());
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.show();
    }
}
