import java.util.Scanner;
public class StudentVoteChecker {
    public boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StudentVoteChecker svc = new StudentVoteChecker();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) arr[i] = in.nextInt();
        for (int age : arr) {
            boolean can = svc.canStudentVote(age);
            if (!can) {
                if (age < 0) System.out.println("invalid age");
                else System.out.println("The student with the age " + age + " cannot vote.");
            } else System.out.println("The student with the age " + age + " can vote.");
        }
    }
}
