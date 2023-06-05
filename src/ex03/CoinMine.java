package ex03;

import java.util.Scanner;

public class CoinMine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("받은돈을 입력하시오");
        final int money = sc.nextInt();
        int restMoney = money;

        int a[] = { 500, 100, 50, 10 };

        for (int i = 0; i < a.length; i++) {
            int count = restMoney / a[i];
            restMoney = restMoney % a[i];
            System.out.println(a[i] + "원 동전 갯수: " + count);
        }
    }
}
