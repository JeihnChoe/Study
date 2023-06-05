package ex04.questions;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("층수를 입력해주세요");
        int floor = sc.nextInt();
        System.out.print(floor + "층 -> ");
        guide(floor);

    }

    public static void guide(int floor) {

        if (1 <= floor && floor <= 10)
            System.out.println("저층 엘리베이터");
        else if (floor <= 20)
            System.out.println("고층 엘리베이터");
        else
            System.out.println("존재하지 않는 층입니다.");

    }

}
