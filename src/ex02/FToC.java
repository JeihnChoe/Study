package ex02;

import java.util.*;

public class FToC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("화씨 몇도인지 입력하세요.");
        double F = sc.nextDouble();

        double C = 5.0/9.0*(F-32.0);
        System.out.println("화씨"+F+"도는 섭씨 "+ C+"도 입니다.");
    }
}
