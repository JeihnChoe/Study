package ex03;

import java.util.*;

public class DateYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("날짜를 입력하세요.");
        String date = sc.nextLine();

        String Year = date.split("-")[0];
        String Month = date.split("-")[1];
        String Day = date.split("-")[2];

        System.out.println("year, month, day 중 수정할 항목을 입력하세요.");
        String ymd = sc.next();

        System.out.println("더하거나 뺄 숫자를 입력하세요.");
        int addedNum = sc.nextInt();

        int year = Integer.parseInt(Year);
        int month = Integer.parseInt(Month);
        int day = Integer.parseInt(Day);

        if (ymd.equals("year")) {
            System.out.println(year + addedNum + "년 " + month + "월 " + day + "일");
        }
    }
}
