import java.util.Scanner;
public class UnitConverter2 {
    public static double convertYardsToFeet(double yards) { return yards * 3.0; }
    public static double convertFeetToYards(double feet) { return feet * 0.333333; }
    public static double convertMetersToInches(double meters) { return meters * 39.3701; }
    public static double convertInchesToMeters(double inches) { return inches * 0.0254; }
    public static double convertInchesToCm(double inches) { return inches * 2.54; }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cmd = in.next();
        double v = in.nextDouble();
        switch (cmd) {
            case "yards2feet": System.out.println(convertYardsToFeet(v)); break;
            case "feet2yards": System.out.println(convertFeetToYards(v)); break;
            case "m2in": System.out.println(convertMetersToInches(v)); break;
            case "in2m": System.out.println(convertInchesToMeters(v)); break;
            case "in2cm": System.out.println(convertInchesToCm(v)); break;
        }
    }
}
