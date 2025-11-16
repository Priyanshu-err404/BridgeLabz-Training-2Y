class Book {
    String title;
    String author;
    double price;

    void set(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.set("Java Basics", "James", 499);
        b.show();
    }
}
