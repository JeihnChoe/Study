package ex06;

// 1. 인터페이스는 new 할수없다.
// 2. 인터페이스는 변수를 만들 수 있다.
// 3. 인터페이스는 추상메서드만 가진다.

interface Remote {
    int NUM = 10; // public static final 이 앞에 생략되어있다. final은 항상 대문자로 작성한다.

    void run(); // public abstract 가 앞에 생략되어있다.
}

public class Inter01 {
    public static void main(String[] args) {
        System.out.println(Remote.NUM);
    }

}
