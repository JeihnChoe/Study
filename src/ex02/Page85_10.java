package ex02;

import java.util.*;

public class Page85_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("물체의 무게를 입력하시오(킬로그램): ");
        double m = sc.nextDouble(); 
        System.out.print("물체의 속도를 입력하시오(미터/초): ");
        double s = sc.nextDouble();

        double e = 0.5*m*s*s ;

        System.out.println("물체는 "+e+"(줄)의 에너지를 가지고 있다.");
    }
}
