package ex05.ch03;

class 지구인 {
}

class 유럽인 extends 지구인 {
}

class 아시아인 extends 지구인 {
    void speak() {
        System.out.println("아시아어");
    }
}

class 한국인 extends 아시아인 {
    void speak() {
        System.out.println("한국어");
    }
}

class 홍길동 extends 한국인 {
}

public class Exten01 {
    public static void main(String[] args) {
        아시아인 p1 = new 한국인();

        p1.speak();
        // 한국인 클래스를 호출해서 한국인 찾으면 당연히 있음
        // 부모가 가지고있는 메서드를 자식이 들고있다 => 재정의라고함.
        // new 한국인을 하는 순간 heap공간에는 [한국인]/ [아시아인]/[지구인] 이렇게 세개가 뜸
        // 이 상황에서 p1을 아시아인으로 캐스팅하고 speak라는 메서드를 호출하면
        // speak = 아시아어를 가지고있지만, 한국인클래스도 speak메서드를 가지고있다.
        // 이경우 speak 메서드는 재정의되며, 아시아 클래스가 가지고있는 speak 메서드는 오버라이드(무효화)된다.
        // 이렇게 내려가는 과정을 동적 바인딩이라고 한다.

    }
}
