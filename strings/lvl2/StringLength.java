import java.util.Scanner;
public class StringLength {
    public static int lengthWithoutMethod(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int custom = lengthWithoutMethod(s);
        int builtin = s.length();
        System.out.println(custom);
        System.out.println(builtin);
    }
}
