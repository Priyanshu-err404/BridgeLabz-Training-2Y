import java.util.Scanner;

public class TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double angle = scanner.nextDouble();
        double[] values = calculateTrigonometricFunctions(angle);
        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);
        scanner.close();
    }
}
