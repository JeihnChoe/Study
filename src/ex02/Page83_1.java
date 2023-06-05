package ex02;

import java.util.*;

public class Page83_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int orange,share, remain;

        System.out.println("오렌지의 갯수를 입력하시오");
        orange = sc.nextInt();

        share = orange / 10;
        remain = orange % 10;

        System.out.println(share + "박스가 필요하고 "+remain+"개가 남습니다.");
    }
}
