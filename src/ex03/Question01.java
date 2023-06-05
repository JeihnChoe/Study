package ex03;

import java.util.*;

public class Question01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("날짜를 입력하시오");
        String date = sc.next();

        String year = date.split("-")[0];
        System.out.println(year);
        int Year = Integer.parseInt(year);

        String month = date.split("-")[1];
        System.out.println(month);
        int Month = Integer.parseInt(month);

        String day = date.split("-")[2];
        System.out.println(day);
        int Day = Integer.parseInt(day);

        System.out.println("변경할 year, month, day 중 하나를 입력하시오.");
        String answer = sc.next();

        System.out.println("더할 숫자를 입력하시오.");
        int x = sc.nextInt();

        if (answer.equals("year")) {
            System.out.println((Year + x) + "-" + Month + "-" + Day);
        }

        if (answer.equals("month")) {
            int plusyear = (Month + x) / 12;
            int remainmonth = (Month + x) % 12;
            System.out.println((Year + plusyear) + "-" + remainmonth + "-" + Day);
        }

        int z = Day + x; // 1+28 = 29

        int[] everymonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int a = everymonth[0];
        int b = everymonth[1];
        int c = everymonth[2];
        int d = everymonth[3];
        int e = everymonth[4];
        int f = everymonth[5];
        int g = everymonth[6];
        int h = everymonth[7];
        int i = everymonth[8];
        int j = everymonth[9];
        int k = everymonth[10];
        int l = everymonth[11];

        for (int mm = 1; mm < 12; mm++) {
            if (Year % 4 == 0) {
                z = z + 1;
            }
            if (answer.equals("day") && (Month == mm)) {
                if (z <= a) {
                    System.out.println((z));
                } else if (z <= a + b) {
                    System.out.println((z - a));
                } else if (z <= a + b + c) {
                    System.out.println((z - (a + b)));
                } else if (z <= a + b + c + d) {
                    System.out.println((z - (a + b + c)));
                } else if (z <= a + b + c + d + e) {
                    System.out.println((z - (a + b + c + d)));
                } else if (z <= a + b + c + d + e + f) {
                    System.out.println((z - (a + b + c + d + e)));
                } else if (z <= a + b + c + d + e + f + g) {
                    System.out.println((z - (a + b + c + d + e + f)));
                } else if (z <= a + b + c + d + e + f + g + h) {
                    System.out.println((z - (a + b + c + d + e + f + g)));
                } else if (z <= a + b + c + d + e + f + g + h + i) {
                    System.out.println((z - (a + b + c + d + e + f + g + h)));
                } else if (z <= a + b + c + d + e + f + g + h + i + j) {
                    System.out.println((z - (a + b + c + d + e + f + g + h + i)));
                } else if (z <= a + b + c + d + e + f + g + h + i + j + k) {
                    System.out.println((z - (a + b + c + d + e + f + g + h + i + j)));
                } else if (z <= a + b + c + d + e + f + g + h + i + j + k + l) {
                    System.out.println((z - (a + b + c + d + e + f + g + h + i + j + k)));
                }
                return;

            }
            a = everymonth[(0 + mm) % 12];
            b = everymonth[(1 + mm) % 12];
            c = everymonth[(2 + mm) % 12];
            d = everymonth[(3 + mm) % 12];
            e = everymonth[(4 + mm) % 12];
            f = everymonth[(5 + mm) % 12];
            g = everymonth[(6 + mm) % 12];
            h = everymonth[(7 + mm) % 12];
            i = everymonth[(8 + mm) % 12];
            j = everymonth[(9 + mm) % 12];
            k = everymonth[(10 + mm) % 12];
            l = everymonth[(11 + mm) % 12];
        }

    }
}
