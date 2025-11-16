class BookConstructors {
    String title;
    String author;
    double price;

    BookConstructors() {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }

    BookConstructors(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    public static void main(String[] args) {
        BookConstructors b = new BookConstructors("Java","James",500);
        System.out.println(b.title);
    }
}
