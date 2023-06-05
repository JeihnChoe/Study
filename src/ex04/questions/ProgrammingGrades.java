package ex04.questions;

public class ProgrammingGrades {
    public static void main(String[] args) {
        int score1 = 96;
        int score2 = 85;
        int score3 = 76;

        System.out.println(score1 + "점 -> " + grade(score1));
        System.out.println(score2 + "점 -> " + grade(score2));
        System.out.println(score3 + "점 -> " + grade(score3));
    }

    public static String grade(int score) {
        String grade;
        if (score >= 95)
            grade = "A+";
        else if (score >= 90)
            grade = "A0";
        else if (score >= 80)
            grade = "B+";
        else if (score >= 70)
            grade = "B0";
        else
            grade = "C+";
        return grade;
    }
}