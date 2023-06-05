package ex02;

import java.util.Scanner;

public class Page83_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double mile, kilo;
        System.out.println("마일을 입력하시오");
        mile = sc.nextDouble();

        kilo = mile * 1.609;
        System.out.println(mile + "마일은 " + kilo + "킬로미터 입니다.");

    }
}
