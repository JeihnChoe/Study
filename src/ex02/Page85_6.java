package ex02;

import java.util.*;

public class Page85_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("드라이브 이름?");
        String c = sc.nextLine();
        System.out.println("디렉터리 이름?");
        String d = sc.nextLine();
        System.out.println("파일 이름?");
        String f = sc.nextLine();
        System.out.println("확장자 이름?");
        String e = sc.nextLine();

        System.out.println("드라이브 이름: " + c);
        System.out.println("디렉터리 이름: " + d);
        System.out.println("파일 이름: " + f);
        System.out.println("확장자: " + e);

        System.out.println("완전한 이름은 " + c + ":" + d + f + "." + e);

    }
}
