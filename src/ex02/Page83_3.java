package ex02;

import java.util.*;

public class Page83_3 {
    public static void main(String[] args) {
        double x,y ;
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        y = sc.nextDouble();

        System.out.println("x : "+x);
        System.out.println("y : "+y);

        double sum = x+y;
        System.out.println("두 수의 합: "+sum);
        double minus = x-y;
        System.out.println("두 수의 차: "+minus);
        double multiple = x*y;
        System.out.println("두 수의 곱: "+multiple);
        double avg = (x+y)/2;
        System.out.println("두 수의 평균: "+avg);
        double max_value = (x>y)?x:y ;
        System.out.println("큰수: "+max_value);
        double min_value = (x<y)?x:y ;
        System.out.println("작은수: "+min_value);
        
    }
}
