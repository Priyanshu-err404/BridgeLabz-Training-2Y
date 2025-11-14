import java.util.Scanner;
public class BMI2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];
        for (int i = 0; i < n; i++) {
            double w = in.nextDouble();
            double h = in.nextDouble();
            if (w <= 0 || h <= 0) { i--; continue; }
            double hm = h / 100.0;
            double b = w / (hm * hm);
            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = b;
            if (b < 18.5) weightStatus[i] = "Underweight";
            else if (b < 25) weightStatus[i] = "Normal";
            else if (b < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }
        for (int i = 0; i < n; i++)
            System.out.println(personData[i][0] + " " + personData[i][1] + " " + personData[i][2] + " " + weightStatus[i]);
    }
}
