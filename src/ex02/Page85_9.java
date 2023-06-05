package ex02;

import java.util.*;

public class Page85_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
                    //n = 65  99
        int A = n/64;//A = 1
        int a = n%64;//a = 1
        int B = a/32;//B = 0
        int b = a%32;//b = 1
        int C = b/16;//C = 0
        int c = b%16;//c = 1
        int D = c/8;//D = 0
        int d = c%8;//d = 1
        int E = d/4;//E = 0
        int e = d%4;//e = 1
        int F = e/2;//F = 0
        int f = e%2;//f = 1
        
        System.out.print(A);System.out.print(B);System.out.print(C);System.out.print(D);System.out.print(E);System.out.print(F);System.out.print(f);





    }
}
