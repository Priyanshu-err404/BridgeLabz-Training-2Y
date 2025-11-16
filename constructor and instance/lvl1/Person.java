class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    Person(Person p) {
        name = p.name;
        age = p.age;
    }

    public static void main(String[] args) {
        Person p = new Person("Rishi",20);
        Person c = new Person(p);
        System.out.println(c.name);
    }
}
