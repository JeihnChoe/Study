package ex04.questions;

public class Gamble {
    public static void main(String[] args) {
        double dollar = dice() + dice() + dice();

        double won = exchange(dollar);
        System.out.println("획득금액 : " + dollar + "달러(" + won + "원)");

    }

    public static int dice() {
        int dice = (int) ((Math.random() * 6) + 1);
        return dice;
    }

    public static double exchange(double dollar) {
        double exchange = 1082.25108 * dollar;
        return exchange;

    }

}
