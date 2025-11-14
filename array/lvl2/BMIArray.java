import java.util.Scanner;
public class BMIArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            double w = in.nextDouble();
            double h = in.nextDouble();
            if (w <= 0 || h <= 0) { i--; continue; }
            weight[i] = w;
            height[i] = h;
            double hm = h / 100.0;
            double b = w / (hm * hm);
            bmi[i] = b;
            if (b < 18.5) status[i] = "Underweight";
            else if (b < 25) status[i] = "Normal";
            else if (b < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        for (int i = 0; i < n; i++)
            System.out.println(weight[i] + " " + height[i] + " " + bmi[i] + " " + status[i]);
    }
}
