public class NumberCheckerReversePalindrome {
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
    public static int[] reverseArray(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) b[i] = a[a.length - 1 - i];
        return b;
    }
    public static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }
    public static boolean isPalindrome(long n) {
        int[] d = digitsArray(n);
        int[] r = reverseArray(d);
        return arraysEqual(d, r);
    }
    public static boolean isDuck(long n) {
        n = Math.abs(n);
        if (n == 0) return false;
        while (n != 0) { if (n % 10 == 0) return true; n /= 10; }
        return false;
    }
    public static void main(String[] args) throws Exception {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine().trim());
        int[] d = digitsArray(n);
        int[] r = reverseArray(d);
        for (int x : r) System.out.print(x + " ");
        System.out.println();
        System.out.println(arraysEqual(d, r));
        System.out.println(isPalindrome(n));
        System.out.println(isDuck(n));
    }
}
