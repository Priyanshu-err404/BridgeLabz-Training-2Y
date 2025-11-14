import java.util.Scanner;
public class UnitConverter1 {
    public static double convertKmToMiles(double km) { return km * 0.621371; }
    public static double convertMilesToKm(double miles) { return miles * 1.60934; }
    public static double convertMetersToFeet(double meters) { return meters * 3.28084; }
    public static double convertFeetToMeters(double feet) { return feet * 0.3048; }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cmd = in.next();
        double v = in.nextDouble();
        switch (cmd) {
            case "km2miles": System.out.println(convertKmToMiles(v)); break;
            case "miles2km": System.out.println(convertMilesToKm(v)); break;
            case "m2ft": System.out.println(convertMetersToFeet(v)); break;
            case "ft2m": System.out.println(convertFeetToMeters(v)); break;
        }
    }
}
