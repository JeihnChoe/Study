package ex03;

import java.util.Scanner;

public class Simsim {
    public static void main(String[] args) {
        int computer = (int) ((Math.random() * 100) + 1);

        System.out.println(computer);

        Scanner sc = new Scanner(System.in);

        System.out.println("정답을 추측하여 보시오");

        int input = sc.nextInt();
        int i;
        for (i = 1; input != computer; i++) {
            if (input > computer) {
                System.out.println("더 작음");
                input = sc.nextInt();

            } else if (input < computer) {
                System.out.println("더 큼");
                input = sc.nextInt();

            }

        }
        System.out.println("축하합니다.");
        System.out.println("시도횟수 : " + i + "회");

    }

}