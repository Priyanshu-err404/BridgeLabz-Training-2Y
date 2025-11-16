import java.util.Scanner;
public class VowelConsonantCount {
    public static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
    public static boolean isVowelChar(char c) {
        char lc = c;
        if (lc >= 'A' && lc <= 'Z') lc = (char)(lc - 'A' + 'a');
        return lc=='a' || lc=='e' || lc=='i' || lc=='o' || lc=='u';
    }
    public static int[] countVowelsConsonants(String s) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!isLetter(c)) continue;
            if (isVowelChar(c)) vowels++; else consonants++;
        }
        return new int[] { vowels, consonants };
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int[] res = countVowelsConsonants(line);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
