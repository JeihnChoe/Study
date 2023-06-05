package ex04.questions;

public class Walking {
    public static void main(String[] args) {

        double result = calculateCalory(10000);
        System.out.println(result);

    }

    private static double calculateCalory(int walk) {
        return 0.02 * walk;
    }

}
