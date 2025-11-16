class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        guestName = "NA";
        roomType = "Standard";
        nights = 1;
    }

    HotelBooking(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
    }

    HotelBooking(HotelBooking h) {
        guestName = h.guestName;
        roomType = h.roomType;
        nights = h.nights;
    }

    public static void main(String[] args) {
        HotelBooking h = new HotelBooking("Rishi","Deluxe",3);
        HotelBooking c = new HotelBooking(h);
        System.out.println(c.roomType);
    }
}
