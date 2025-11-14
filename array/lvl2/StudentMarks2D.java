import java.util.Scanner;
public class StudentMarks2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int students = in.nextInt();
        double[][] marks = new double[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) marks[i][j] = in.nextDouble();
        }
        for (int i = 0; i < students; i++) {
            double sum = marks[i][0] + marks[i][1] + marks[i][2];
            double perc = sum / 3.0;
            String grade;
            if (perc >= 90) grade = "A";
            else if (perc >= 80) grade = "B";
            else if (perc >= 70) grade = "C";
            else if (perc >= 60) grade = "D";
            else grade = "F";
            System.out.println(perc + " " + grade);
        }
    }
}
