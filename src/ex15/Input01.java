package ex15;

import java.io.IOException;
import java.io.InputStream;

public class Input01 {
    public static void main(String[] args) {
        // 연결(키보드)
        InputStream in = System.in;

        // 읽기
        try {
            int data = in.read(); // 대기 리스너임
            System.out.println(data);
            System.out.println((char) data);
        } catch (IOException e) {
            e.printStackTrace(); // 문제가 생겼을때 문제생긴 이력을 다 기록하고 보여주겠음
        }

    };
}
