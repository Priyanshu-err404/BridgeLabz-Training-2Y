import java.util.Scanner;
public class YoungestTallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = {"Amar","Akbar","Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            ages[i] = in.nextInt();
            heights[i] = in.nextDouble();
        }
        int youngestIdx = 0;
        for (int i = 1; i < 3; i++) if (ages[i] < ages[youngestIdx]) youngestIdx = i;
        int tallestIdx = 0;
        for (int i = 1; i < 3; i++) if (heights[i] > heights[tallestIdx]) tallestIdx = i;
        System.out.println(names[youngestIdx]);
        System.out.println(names[tallestIdx]);
    }
}
