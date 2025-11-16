public class NumberCheckerPrimesNeonSpyAutoBuzz {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }
    public static boolean isNeon(int n) {
        int sq = n * n;
        int sum = 0;
        while (sq != 0) { sum += sq % 10; sq /= 10; }
        return sum == n;
    }
    public static boolean isSpy(int n) {
        int sum = 0, prod = 1;
        int t = Math.abs(n);
        if (t == 0) prod = 0;
        while (t != 0) { int d = t % 10; sum += d; prod *= d; t /= 10; }
        return sum == prod;
    }
    public static boolean isAutomorphic(int n) {
        long sq = (long)n * n;
        String s = String.valueOf(sq);
        String t = String.valueOf(n);
        return s.endsWith(t);
    }
    public static boolean isBuzz(int n) {
        return n % 7 == 0 || Math.abs(n) % 10 == 7;
    }
    public static void main(String[] args) throws Exception {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        System.out.println(isPrime(n));
        System.out.println(isNeon(n));
        System.out.println(isSpy(n));
        System.out.println(isAutomorphic(n));
        System.out.println(isBuzz(n));
    }
}
