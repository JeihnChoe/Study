package ex03;

import java.util.Scanner;

public class Rock {
    public static void main(String[] args) {
        double n2 = (int) (Math.random() * 3);
        // random한 값을 출력하게해준다. 0~1 사이의 실수를 리턴해준다.
        // 가위:0 바위:1 보:2
        // 1>0 2>1 0>2
        // 가위:0 바위:1 보:2

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        if (n1 == n2) {
            System.out.println("인간: " + n1 + " 컴퓨터: " + n2 + " 비김");
        } else if ((n1 == 1 && n2 == 0) || (n1 == 0 && n2 == 2) || (n1 == 2 && n2 == 1)) {
            System.out.println("인간 승리");
        } else {
            System.out.println("컴퓨터 승리");
        }
    }
}
