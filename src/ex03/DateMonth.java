package ex03;

import java.util.*;

public class DateMonth {
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

        int addedmonth = addedNum + month;

        if (ymd.equals("month")) {
            year = year + (addedmonth - 1) / 12;
            System.out.println(year + "년" + ((addedmonth - 1) % 12 + 1) + "월" + day + "일");

        }
    }
}