package ex04.questions;

public class JavaCafe {
    public static void main(String[] args) {
        printPay(10.00, 40);
        printPay(10.00, 50);
        printPay(7.5, 38);
        printPay(8.5, 66);
    }

    public static void printPay(double basepay, int hours) {
        // 1. 유효성 검사 (필터링)
        if (basepay < 8) {
            System.out.println("최저시급 에러!");
            return;
        }
        if (hours > 60) {
            System.out.println("초과 근무시간 에러");
            return;
        }
        // 2. <내풀이> 수식 계산 : 예외처리 -> 내 풀이
        double pay = 0.0;
        if (hours < 40) {
            pay = basepay * hours;
        } else if (hours >= 40) {
            pay = 40 * basepay + (hours - 40) * basepay * 1.5;
        }
        // 2. <선생님풀이>수식계산 : 예외처리 ->선생님풀이
        pay = basepay * hours;
        if (hours > 40) {
            pay = pay + (hours - 40) * (basepay * 0.5);
        }
        System.out.printf("$ %.2f\n", pay);

        // if else를 쓰게되면 모듈화시켜서 쓰기가 힘들어지기때문에,
        // else를 최대한 쓰지않고 수식을 먼저 해놓고 예외사항만 따로처리해준다.
        // 최종 리팩토링할때 메소드화하여 코드 가독성을 끌어올릴수있다.

    }
}
