import java.util.Scanner;
public class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p = input.nextDouble();
        double side = p / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + p);
    }
}
