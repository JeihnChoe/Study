package ex04.access.room3;

public class Elise {

    int height = 160;

    void eat() {
        height = height + 10;
    }

    void print() {
        System.out.print(height);
    }
    // 함수를 호출하는 호출문이므로 main 메서드가 호출되어야 사용가능
}
