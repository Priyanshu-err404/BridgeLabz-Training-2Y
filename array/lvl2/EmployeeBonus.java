import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOld = 0, totalNew = 0;
        int i = 0;
        while (i < 10) {
            double s = in.nextDouble();
            double y = in.nextDouble();
            if (s <= 0 || y < 0) continue;
            salary[i] = s;
            years[i] = y;
            i++;
        }
        for (i = 0; i < 10; i++) {
            double b = years[i] > 5 ? salary[i] * 0.05 : salary[i] * 0.02;
            bonus[i] = b;
            newSalary[i] = salary[i] + b;
            totalBonus += b;
            totalOld += salary[i];
            totalNew += newSalary[i];
        }
        System.out.println(totalBonus);
        System.out.println(totalOld);
        System.out.println(totalNew);
    }
}
