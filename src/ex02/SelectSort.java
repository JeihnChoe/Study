package ex02;

import java.util.*;

public class SelectSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = { 9, 5, 8, 3, 7, 1, 2 };

        for (int i = 0; i < a.length; i++) {
            // System.out.println("애기" + 1);
            int min = a[i], cnt = 0, temp = 0;
            for (int j = i + 1; j < a.length; j++) {
                // System.out.println("징그러운애기" + j);
                if (min > a[j])
                    ;
                {
                    min = a[j];
                    cnt = j;
                }
            }
            if (i == a.length - 1) {
                break;
            }
            // System.out.println(cnt);
            temp = a[cnt];
            a[cnt] = a[i];
            a[i] = temp;

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
