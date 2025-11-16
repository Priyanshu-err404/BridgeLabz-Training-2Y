class Employee {
    String name;
    double salary;

    void set(String n, double s) {
        name = n;
        salary = s;
    }

    void increase(double amt) {
        salary += amt;
    }

    void show() {
        System.out.println(name);
        System.out.println(salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.set("Rishi", 30000);
        e.increase(5000);
        e.show();
    }
}
