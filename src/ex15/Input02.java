package ex15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input02 {
    public static void main(String[] args) {
        // 연결(키보드)
        // 대량으로읽기
        // 공간을 지정해놔야하기때문에 메모리관리어려움 // 적게지정해놓으면 터짐// 공간할당을많이해놓으면 공간낭비
        InputStreamReader ir = new InputStreamReader(System.in);

        // 읽기
        try {
            char[] ch = new char[5];
            ir.read(ch);

            for (char c : ch) {
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace(); // 문제가 생겼을때 문제생긴 이력을 다 기록하고 보여주겠음
        }

    };
}
