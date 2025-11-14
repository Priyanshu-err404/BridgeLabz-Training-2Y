import java.util.Scanner;
public class YoungestTallestMethods {
    public static String findYoungest(String[] names, int[] ages) {
        int idx = 0;
        for (int i = 1; i < ages.length; i++) if (ages[i] < ages[idx]) idx = i;
        return names[idx];
    }
    public static String findTallest(String[] names, double[] heights) {
        int idx = 0;
        for (int i = 1; i < heights.length; i++) if (heights[i] > heights[idx]) idx = i;
        return names[idx];
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = {"Amar","Akbar","Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) { ages[i] = in.nextInt(); heights[i] = in.nextDouble(); }
        System.out.println(findYoungest(names, ages));
        System.out.println(findTallest(names, heights));
    }
}
