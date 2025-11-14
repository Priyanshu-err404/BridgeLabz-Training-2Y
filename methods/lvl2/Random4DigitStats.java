import java.util.Scanner;
public class Random4DigitStats {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = 1000 + (int)(Math.random() * 9000);
        return arr;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        if (numbers.length == 0) return new double[0];
        long sum = 0;
        int min = numbers[0], max = numbers[0];
        for (int v : numbers) {
            sum += v;
            if (v < min) min = v;
            if (v > max) max = v;
        }
        double avg = (double)sum / numbers.length;
        return new double[] { avg, (double)min, (double)max };
    }
    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        for (int v : arr) System.out.println(v);
        double[] res = findAverageMinMax(arr);
        System.out.println(res[0]);
        System.out.println(res[1]);
        System.out.println(res[2]);
    }
}
