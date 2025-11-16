public class NumberCheckerDigits {
    public static int countDigits(long n) {
        if (n == 0) return 1;
        int c = 0;
        n = Math.abs(n);
        while (n != 0) { n /= 10; c++; }
        return c;
    }
    public static int[] digitsArray(long n) {
        n = Math.abs(n);
        int len = countDigits(n);
        int[] d = new int[len];
        for (int i = 0; i < len; i++) {
            d[i] = (int)(n % 10);
            n /= 10;
        }
        return d;
    }
    public static boolean isDuck(long n) {
        n = Math.abs(n);
        if (n == 0) return false;
        while (n != 0) {
            if (n % 10 == 0) return true;
            n /= 10;
        }
        return false;
    }
    public static boolean isArmstrong(long n) {
        n = Math.abs(n);
        int[] d = digitsArray(n);
        int p = d.length;
        long sum = 0;
        for (int x : d) sum += Math.pow(x, p);
        return sum == Math.abs(n);
    }
    public static int[] largestTwo(int[] d) {
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int v : d) {
            if (v > largest) { second = largest; largest = v; }
            else if (v > second && v != largest) second = v;
        }
        if (second == Integer.MIN_VALUE) second = largest;
        return new int[] { largest, second };
    }
    public static int[] smallestTwo(int[] d) {
        int smallest = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int v : d) {
            if (v < smallest) { second = smallest; smallest = v; }
            else if (v < second && v != smallest) second = v;
        }
        if (second == Integer.MAX_VALUE) second = smallest;
        return new int[] { smallest, second };
    }
    public static void main(String[] args) throws Exception {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine().trim());
        System.out.println(countDigits(n));
        int[] d = digitsArray(n);
        for (int x : d) System.out.print(x + " ");
        System.out.println();
        System.out.println(isDuck(n));
        System.out.println(isArmstrong(n));
        int[] ls = largestTwo(d);
        System.out.println(ls[0]);
        System.out.println(ls[1]);
        int[] ss = smallestTwo(d);
        System.out.println(ss[0]);
        System.out.println(ss[1]);
    }
}
