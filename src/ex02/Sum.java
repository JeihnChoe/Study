package ex02;

import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, sum;

        System.out.println("a의 값을 입력하세요");
        a = sc.nextInt();

        System.out.println("b의 값을 입력하세요");
        b = sc.nextInt();
        
        sum = a + b;
        System.out.println("두 수의 합은 = " + sum);

    }
}
