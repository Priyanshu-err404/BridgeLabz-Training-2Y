import java.util.Scanner;
public class UnitConverter3 {
    public static double convertFarhenheitToCelsius(double f) { return (f - 32) * 5 / 9; }
    public static double convertCelsiusToFarhenheit(double c) { return (c * 9 / 5) + 32; }
    public static double convertPoundsToKilograms(double lb) { return lb * 0.453592; }
    public static double convertKilogramsToPounds(double kg) { return kg * 2.20462; }
    public static double convertGallonsToLiters(double g) { return g * 3.78541; }
    public static double convertLitersToGallons(double l) { return l * 0.264172; }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cmd = in.next();
        double v = in.nextDouble();
        switch (cmd) {
            case "f2c": System.out.println(convertFarhenheitToCelsius(v)); break;
            case "c2f": System.out.println(convertCelsiusToFarhenheit(v)); break;
            case "lb2kg": System.out.println(convertPoundsToKilograms(v)); break;
            case "kg2lb": System.out.println(convertKilogramsToPounds(v)); break;
            case "gal2l": System.out.println(convertGallonsToLiters(v)); break;
            case "l2gal": System.out.println(convertLitersToGallons(v)); break;
        }
    }
}
