import java.util.Scanner;
public class StoreUpToTenDoubles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] arr = new double[10];
        int idx = 0;
        while (true) {
            if (idx == 10) break;
            double v = in.nextDouble();
            if (v <= 0) break;
            arr[idx++] = v;
        }
        double sum = 0;
        for (int i = 0; i < idx; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
