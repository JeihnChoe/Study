package ex15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input04 {
    public static void main(String[] args) {
        // 연결(키보드)
        try {
            InputStream in = new FileInputStream("input.txt");
            InputStreamReader ir = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(ir);
            String data = br.readLine();
            System.out.println(data);

            // Question. if(br.readLine()!=null){System.out.println("br.readLine")} 코드가
            // 잘못된이유는?

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 읽기

    }

};
