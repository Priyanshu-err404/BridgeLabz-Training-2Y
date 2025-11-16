class Student {
    String name;
    int roll;
    int age;

    void setData(String n, int r, int a) {
        name = n;
        roll = r;
        age = a;
    }

    void show() {
        System.out.println(name);
        System.out.println(roll);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setData("Rishi", 1, 20);
        s.show();
    }
}
