package ex15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input03 {
    public static void main(String[] args) {
        // 연결(키보드)

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        // code 리팩토링하면
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        // 읽기
        try {
            char[] ch = new char[5];
            String data = br2.readLine();
            System.out.println(data);

            for (char c : ch) {
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace(); // 문제가 생겼을때 문제생긴 이력을 다 기록하고 보여주겠음
        }

    };
}
