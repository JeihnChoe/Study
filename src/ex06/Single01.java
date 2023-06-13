package ex06;

class 미니언 {
    public 미니언() {
        System.out.println("미니언이 생성되었습니다.");
    }
}

class 바론 {
    public static 바론 instance = new 바론();

    private 바론() {
    }

}

public class Single01 {
    public static void main(String[] args) {
        미니언 m1 = new 미니언();
        미니언 m2 = new 미니언();
        미니언 m3 = new 미니언();

        바론 b1 = 바론.instance; // instance로 만들었다는 이야기는 한번만 불러올수있다는이야기
        바론 b2 = 바론.instance; // 실제로는 b1, b2 이렇게 선언할일이없다. 같은 주소를 가르키고 있기 때문에.

        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode()); // 해쉬코드: 힙 위치를 가르킴 b1,b2 가 같은 해쉬코드라는 말은 같은 힙공간을 가르킴을 의미

        if (b1 instanceof 바론) {
            System.out.println("같은타입입니다.");
        }

        if (b1 instanceof Object) {
            System.out.println("같은타입입니다."); // object는 모든 클래스의 부모
        }

        String str = "안녕";
        Object obj = str;

    }
}
