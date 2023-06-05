package ex03;

public class MyStar01 {
    public static void main(String[] args) {
        // // 내풀이
        // int i = 0;
        // int j = 1;
        // for (j = 1; j < 6; j++) {
        // for (i = 0; i < j; i++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // 1단계 첫번째줄만 찍어보기 (반복문)

        // for (int m = 0; i < 1; m++) {
        // System.out.print("*");
        // }
        // // 2단계 첫번째줄만 찍어보기 (반복문)
        // for (int m = 0; i < 2; m++) {
        // System.out.print("*");
        // }
        // // 3단계 첫번째줄만 찍어보기 (반복문)
        // for (int m = 0; i < 3; m++) {
        // System.out.print("*");
        // }
        // // 4단계 첫번째줄만 찍어보기 (반복문)
        // for (int m = 0; m < 4; m++) {
        // System.out.print("*");
        // }
        //// 리팩토링하기
        // int end = 1;

        // for (end = 1; end < 6; end++) {
        // for (int i = 0; i < end; i++) {
        // System.out.print("*");

        // }
        // System.out.println();
        // }
        // System.out.println();
        // int m = 0;
        // int n = 1;
        // for (n = 5; n >= 1; n--) {
        // for (m = 0; m < n; m++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // System.out.println();
        // a + b = 3
        // -* a = 1, b = 1
        // *** a = 0, b = 3
        // -* a = 1, b = 1

        // a + b = 5 // n = 2
        // --* a = 2, b = 1
        // -*** a = 1, b = 3
        // ***** a = 0, b = 5
        // -*** a = 1, b = 3
        // --* a = 2, b = 1

        // a + b = 2n+1 (n>0) // n = n
        // a= n b = 2n-1
        // a= n-1 b = 3
        // a= n-2 b = 5
        // a= 0 b= 2n+1

        // a + b = 7 // n = 3

        // ---* a = 3 b = 1
        // --*** a = 2, b = 3
        // -***** a = 1, b = 5
        // ******* a = 0, b = 7
        // -***** a = 1, b = 5
        // --*** a = 2, b = 3
        // ---* a = 3, b = 1
        for (int i = 0; i <= 3; i++) {
            for (int a = 3 - i; a > 0; a--) {
                System.out.print(" ");
            }
            for (int b = 1; b <= 2 * i + 1; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i <= 2; i++) {
            for (int a = 0; a <= i; a++) {
                System.out.print(" ");
            }
            for (int b = 5; b >= 2 * i + 1; b--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // for (int a = 2; a > 0; a--) {
        // System.out.print("-");
        // }
        // for (int b = 1; b <= 3; b++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // for (int a = 1; a > 0; a--) {
        // System.out.print("-");
        // }
        // for (int b = 1; b <= 5; b++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // for (int a = 0; a > 0; a--) {
        // System.out.print("-");
        // }
        // for (int b = 1; b <= 7; b++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // for (int a = 1; a > 0; a--) {
        // System.out.print("-");
        // }
        // for (int b = 1; b <= 5; b++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // for (int a = 2; a > 0; a--) {
        // System.out.print("-");
        // }
        // for (int b = 1; b <= 3; b++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // for (int a = 3; a > 0; a--) {
        // System.out.print("-");
        // }
        // for (int b = 1; b <= 1; b++) {
        // System.out.print("*");
        // }
        // System.out.println();

    }
}
