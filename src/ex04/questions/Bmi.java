package ex04.questions;

public class Bmi {
    public static void main(String[] args) {
        bmi(1.88, 80.0);
    }

    public static void bmi(Double t, Double w) {
        double bmicalculate = w / (t * t);
        if (bmicalculate >= 30)
            System.out.println("비만");
        else if (bmicalculate >= 25)
            System.out.println("과체중");
        else if (bmicalculate >= 18.5)
            System.out.println("정상");
        else
            System.out.println("저체중");
    }
}
