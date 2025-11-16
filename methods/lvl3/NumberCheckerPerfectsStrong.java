public class NumberCheckerPerfectsStrong {
    public static int sumProperDivisors(int n) {
        int s = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                s += i;
                int j = n / i;
                if (j != i) s += j;
            }
        }
        if (n == 1) return 0;
        return s;
    }
    public static boolean isPerfect(int n) {
        return n > 0 && sumProperDivisors(n) == n;
    }
    public static boolean isAbundant(int n) {
        return n > 0 && sumProperDivisors(n) > n;
    }
    public static boolean isDeficient(int n) {
        return n > 0 && sumProperDivisors(n) < n;
    }
    public static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }
    public static boolean isStrong(int n) {
        int t = n;
        int sum = 0;
        while (t != 0) {
            sum += factorial(t % 10);
            t /= 10;
        }
        return sum == n;
    }
    public static void main(String[] args) throws Exception {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        System.out.println(isPerfect(n));
        System.out.println(isAbundant(n));
        System.out.println(isDeficient(n));
        System.out.println(isStrong(n));
    }
}
