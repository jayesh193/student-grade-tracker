package gradecalculator;
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        int numSubject = 3;
        int sumSubject = 0;
        double percentage; // Use double for more accurate percentage calculation

        // Unused variable removed
        // StudentGradeCalculator studentGradeCalculator = new StudentGradeCalculator();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numSubject; i++) {
            System.out.println("Enter marks for subjects " + (i + 1));
            sumSubject = sumSubject + sc.nextInt();
        }

        percentage = (double) sumSubject / numSubject; // Use double for more accurate percentage calculation
        System.out.println("Sum of all Subjects:" + sumSubject);
        System.out.println("Percentage:" + percentage);

        if (percentage < 40) {
            System.out.println("Grade: Failed");
        } else if (percentage >= 40 && percentage < 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 60 && percentage < 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 80 && percentage <= 100) {
            System.out.println("Grade: A");
        } else {
            System.out.println("Invalid Marks. Enter Valid Marks.");
        }

        // Close the Scanner to avoid resource leak
        sc.close();
    }
}
