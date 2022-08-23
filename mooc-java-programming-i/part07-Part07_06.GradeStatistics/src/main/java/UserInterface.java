import java.util.Scanner;

public class UserInterface {

    private Grades grades;
    private Scanner scanner;

    public UserInterface(Grades grades, Scanner scanner) {
        this.grades = grades;
        this.scanner = scanner;
    }

    public void start() {
        readCommands();
        printResults();
    }

    public void readCommands() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int points = Integer.valueOf(scanner.nextLine());
            if (points == -1) {
                break;
            }
            if (points > 0) {
                this.grades.addGrade(points);
            }
        }
    }

    public void printResults() {
        printGradeAverage();
        printPassingAverage();
        printPassingPercentage();
        printGradeDistribution();
    }

    private void printGradeAverage() {
        System.out.println("Point average (all): " + Grades.getAverage(grades.getGrades()));
    }

    private void printPassingAverage() {
        String result = "";
        if (Grades.getPassingAverage(grades.getGrades()) == 0) {
            result = "-";
        } else {
            result = "" + Grades.getPassingAverage(grades.getGrades());
        }
        System.out.println("Point average (passing): " + result);
    }

    private void printPassingPercentage() {
        System.out.println("Pass percentage: " + Grades.getPassingPercentage(grades.getGrades()));
    }

    private void printGradeDistribution() {
        System.out.println("Grade distribution: ");
        int[] stars = Grades.getGradeDistribution(grades.getGrades());

        for (int i = stars.length - 1; i >= 0; i--) {
            System.out.println(i + ": " + printStars(stars[i]));
        }
    }

    private static String printStars(int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += "*";
        }
        return result;
    }
}
