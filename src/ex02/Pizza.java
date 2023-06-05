package ex02;

import java.util.*;

public class Pizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.1495;

        System.out.println("첫번째 피자의 크기를 쓰시오");
        int pizza1 = sc.nextInt(); System.out.println("cm");

        System.out.println("피자의 갯수를 쓰시오");
        int ea1 = sc.nextInt();

        double p1size = pizza1 / 2 * pizza1 / 2 * pi * ea1;
        System.out.println("피자의 총 면적은 "+p1size);


        System.out.println("두번째 피자의 크기를 쓰시오");
        int pizza2 = sc.nextInt();

        System.out.println("피자의 갯수를 쓰시오");
        int ea2 = sc.nextInt();

        double p2size = pizza2 / 2 * pizza2 / 2 * pi * ea2;
        System.out.println("피자의 총 면적은 "+p2size);

        if(p1size>p2size){
            System.out.println("따라서, "+pizza1+"cm 피자를 선택하는게 이득입니다.");
        }else{
            System.out.println("따라서, "+pizza2+"cm 피자를 선택하는게 이득입니다.");
        }

    }
}
