package ex04.access.room3;

public class App {
    public static void main(String[] args) {
        // 메서드 뒤에 괄호는 매개변수를 통해서 인수를 전달받기 위해서 필요
        // 괄호 뒤에 중괄호는 메서드 body. 스택에 할당하는 공간.
        Elise e1 = new Elise();

        e1.eat();
        e1.eat();

        e1.print();

    }
}
