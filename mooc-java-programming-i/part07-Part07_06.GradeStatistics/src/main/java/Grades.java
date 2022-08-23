import java.util.ArrayList;

public class Grades {

    private ArrayList<Integer> points;

    public Grades() {
        this.points = new ArrayList<>();
    }

    public void addGrade(int points) {
        this.points.add(points);
    }

    public ArrayList<Integer> getGrades() {
        return this.points;
    }

    public static double getAverage(ArrayList<Integer> points) {
        double sum = 0.0;
        int countOfValidNums = 0;
        for (Integer pts : points) {
            if (pts > 0 && pts <= 100) {
                sum += pts;
                countOfValidNums++;
            }
        }

        if (countOfValidNums > 0) {
            return sum / countOfValidNums;
        }

        return 0.0;
    }

    public static double getPassingAverage(ArrayList<Integer> points) {
        double sum = 0.0;
        int count = 0;
        for (Integer pts : points) {
            if (pts >= 50 && pts <= 100) {
                sum += pts;
                count++;
            }
        }
        if (sum > 0) {
            return sum / count;
        }
        return 0.0;
    }

    public static double getPassingPercentage(ArrayList<Integer> points) {
        int countOfPassingGrades = 0;
        int countOfValidParticipants = 0;

        for (Integer point : points) {
            if (point >= 50 && point <= 100) {
                countOfPassingGrades++;
            }

            if (point > 0 && point <= 100) {
                countOfValidParticipants++;
            }
        }

        if (countOfValidParticipants > 0) {
            return (double)100 * countOfPassingGrades / countOfValidParticipants;
        }

        return 0.0;
    }

    public static int[] getGradeDistribution(ArrayList<Integer> grades) {
        int[] starCount = new int[6];
        for (Integer grade : grades) {
            if (grade < 50) {
                starCount[0] = starCount[0] + 1;
            } else if (grade < 60) {
                starCount[1] = starCount[1] + 1;
            } else if (grade < 70) {
                starCount[2] = starCount[2] + 1;
            } else if (grade < 80) {
                starCount[3] = starCount[3] + 1;
            } else if (grade < 90) {
                starCount[4] = starCount[4] + 1;
            } else if (grade >= 90 && grade <= 100) {
                starCount[5] = starCount[5] + 1;
            } else {
                // IGNORE
            }
        }

        return starCount;
    }
}
