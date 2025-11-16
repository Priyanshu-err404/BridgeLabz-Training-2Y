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
