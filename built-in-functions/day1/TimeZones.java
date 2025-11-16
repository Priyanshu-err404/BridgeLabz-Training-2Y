import java.time.*;
public class TimeZones {
    public static void main(String[] args) {
        System.out.println(ZonedDateTime.now(ZoneId.of("GMT")));
        System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
        System.out.println(ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
    }
}
