public class EmployeeBonusRandom {
    public static double[][] generateData(int n) {
        double[][] data = new double[n][2];
        for (int i = 0; i < n; i++) {
            int salary = 10000 + (int)(Math.random() * 90000);
            int years = (int)(Math.random() * 11);
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }
    public static double[][] computeNew(double[][] data) {
        int n = data.length;
        double[][] out = new double[n][2];
        for (int i = 0; i < n; i++) {
            double s = data[i][0];
            double y = data[i][1];
            double b = y > 5 ? s * 0.05 : s * 0.02;
            out[i][0] = s + b;
            out[i][1] = b;
        }
        return out;
git checkout Java-Fundamental

mkdir -p methods/lvl3

cat > methods/lvl3/PlayerHeights.java << 'EOF'
import java.util.Random;
public class PlayerHeights {
    public static int sum(int[] a) {
        int s = 0;
        for (int v : a) s += v;
        return s;
    }
    public static double mean(int[] a) {
        return (double)sum(a) / a.length;
    }
    public static int min(int[] a) {
        int m = a[0];
        for (int v : a) if (v < m) m = v;
        return m;
    }
    public static int max(int[] a) {
        int M = a[0];
        for (int v : a) if (v > M) M = v;
        return M;
    }
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random r = new Random();
        for (int i = 0; i < 11; i++) heights[i] = 150 + r.nextInt(101);
        System.out.println(min(heights));
        System.out.println(max(heights));
        System.out.println(mean(heights));
    }
}
