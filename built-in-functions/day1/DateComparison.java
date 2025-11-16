import java.time.*;
import java.util.Scanner;
public class DateComparison {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LocalDate d1 = LocalDate.parse(in.next());
        LocalDate d2 = LocalDate.parse(in.next());
        if (d1.isBefore(d2)) System.out.println("Before");
        else if (d1.isAfter(d2)) System.out.println("After");
        else System.out.println("Equal");
    }
}
