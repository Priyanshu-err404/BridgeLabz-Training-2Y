public class NumberCheckerSumSquareHarshad {
    public static int countDigits(long n) {
        if (n == 0) return 1;
        int c = 0; n = Math.abs(n);
        while (n != 0) { n /= 10; c++; }
        return c;
    }
    public static int[] digitsArray(long n) {
        n = Math.abs(n);
        int len = countDigits(n);
        int[] d = new int[len];
        for (int i = 0; i < len; i++) { d[i] = (int)(n % 10); n /= 10; }
        return d;
    }
    public static int sumDigits(int[] d) {
        int s = 0; for (int v : d) s += v; return s;
    }
    public static long sumSquares(int[] d) {
        long s = 0; for (int v : d) s += Math.pow(v, 2); return s;
    }
    public static boolean isHarshad(long n) {
        int[] d = digitsArray(n);
        int s = sumDigits(d);
        if (s == 0) return false;
        return Math.abs(n) % s == 0;
    }
    public static int[][] frequency(long n) {
        int[] freq = new int[10];
        if (n == 0) freq[0] = 1;
        n = Math.abs(n);
        while (n != 0) { freq[(int)(n % 10)]++; n /= 10; }
        int[][] res = new int[10][2];
        for (int i = 0; i < 10; i++) { res[i][0] = i; res[i][1] = freq[i]; }
        return res;
    }
    public static void main(String[] args) throws Exception {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine().trim());
        int[] d = digitsArray(n);
        System.out.println(sumDigits(d));
        System.out.println(sumSquares(d));
        System.out.println(isHarshad(n));
        int[][] f = frequency(n);
        for (int i = 0; i < 10; i++) System.out.println(f[i][0] + " " + f[i][1]);
    }
}
