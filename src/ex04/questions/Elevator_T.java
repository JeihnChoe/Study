package ex04.questions;

public class Elevator_T {
    public static void main(String[] args) {
        int a = 13;
        int b = 17;
        int c = 10;

        System.out.println(guide(a));
        System.out.println(guide(b));
        System.out.println(guide(c));
    }

    public static String guide(int floor) {
        // 1. 유효성 검사(필터)
        if (floor > 20 || floor < 1)
            return String result = "오류"
        // 2. 알고리즘
        if (1 <= floor && floor <= 10)
            return "저층";
        else if (11 <= floor && floor <= 20)
            return "고층";
    }
}
