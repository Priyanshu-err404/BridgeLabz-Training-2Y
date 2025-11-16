public class FactorsAdvanced {
    public static int[] factors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] res = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) res[idx++] = i;
        return res;
    }
    public static int greatestFactor(int[] f) {
        if (f.length <= 1) return 1;
        return f[f.length - 2];
    }
    public static long sum(int[] f) { long s = 0; for (int v : f) s += v; return s; }
    public static long product(int[] f) { long p = 1; for (int v : f) p *= v; return p; }
    public static double productOfCubes(int[] f) {
        double p = 1.0;
        for (int v : f) p *= Math.pow(v, 3);
        return p;
    }
    public static void main(String[] args) throws Exception {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[] f = factors(n);
        for (int v : f) System.out.println(v);
        System.out.println(greatestFactor(f));
        System.out.println(sum(f));
        System.out.println(product(f));
        System.out.println(productOfCubes(f));
    }
}
