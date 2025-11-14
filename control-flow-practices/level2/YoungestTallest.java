import java.util.Scanner;
public class YoungestTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ageA = input.nextInt(), heightA = input.nextInt();
        int ageB = input.nextInt(), heightB = input.nextInt();
        int ageC = input.nextInt(), heightC = input.nextInt();
        int youngestAge = ageA, tallestHeight = heightA;
        String youngest = "Amar", tallest = "Amar";
        if (ageB < youngestAge) { youngestAge = ageB; youngest = "Akbar"; }
        if (ageC < youngestAge) { youngestAge = ageC; youngest = "Anthony"; }
        if (heightB > tallestHeight) { tallestHeight = heightB; tallest = "Akbar"; }
        if (heightC > tallestHeight) { tallestHeight = heightC; tallest = "Anthony"; }
        System.out.println(youngest);
        System.out.println(tallest);
    }
}
