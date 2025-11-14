import java.util.Scanner;
public class MatrixTo1D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int[][] mat = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = in.nextInt();
        int[] arr = new int[r * c];
        int idx = 0;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                arr[idx++] = mat[i][j];
        for (int v : arr) System.out.println(v);
    }
}
