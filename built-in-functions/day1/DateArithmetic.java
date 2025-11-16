import java.time.*;
import java.util.Scanner;
public class DateArithmetic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LocalDate d = LocalDate.parse(in.next());
        LocalDate r = d.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println(r);
    }
}
