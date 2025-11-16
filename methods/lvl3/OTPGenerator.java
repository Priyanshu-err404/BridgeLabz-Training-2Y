import java.util.HashSet;
public class OTPGenerator {
    public static int generate6Digit() {
        return 100000 + (int)(Math.random() * 900000);
    }
    public static boolean unique(int[] arr) {
        HashSet<Integer> s = new HashSet<>();
        for (int v : arr) s.add(v);
        return s.size() == arr.length;
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) arr[i] = generate6Digit();
        for (int v : arr) System.out.println(v);
        System.out.println(unique(arr));
    }
}
