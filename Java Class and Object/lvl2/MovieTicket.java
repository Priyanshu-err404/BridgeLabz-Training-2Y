class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    void book(int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void show() {
        System.out.println(movieName);
        System.out.println(seatNumber);
        System.out.println(price);
    }

    public static void main(String[] args) {
        MovieTicket t = new MovieTicket("Avatar");
        t.book(10, 300);
        t.show();
    }
}
