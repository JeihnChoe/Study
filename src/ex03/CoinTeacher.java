package ex03;

import java.util.Scanner;

public class CoinTeacher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner sc = new Scanner(System.in);
        System.out.println("받은 금액을 입력해주세요."); // System.out.println("받은돈을 입력하시오");
        final int money = sc.nextInt(); // final int money = sc.nextInt();

        int restMoney = money; // int restMoney = money;

        int count;

        int[] tempMoney = { 500, 100, 50, 10 };
        for (int i = 0; i < tempMoney.length; i++) {
            // 500, 100, 50, 10
            count = restMoney / tempMoney[i]; // 5
            System.out.println(tempMoney[i] + "원 : " + count);
            restMoney = restMoney % tempMoney[i];
        }
    }

    // int a[] = { 500, 100, 50, 10 };

    // for (int i = 0; i < a.length; i++) {
    // int count = restMoney / a[i];
    // restMoney = restMoney % a[i];
    // System.out.println(a[i] + "원 동전 갯수: " + count);
}
