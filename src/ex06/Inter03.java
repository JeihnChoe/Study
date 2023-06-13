package ex06;

//앞으로 a1,a3,a5,a6
//뒤로 a8,a7,a6,a5
//멈추려면 a3, a7

//구현체 : car
interface CarAble {
    void 전진();

    void 후진();

    void 스탑();
}

class Car implements CarAble {
    void a1() {
    };

    void a2() {
    };

    void a3() {
    };

    void a4() {
    };

    void a5() {
    };

    void a6() {
    };

    void a7() {
    };

    void a8() {
    };

    void a9() {
    };

    public void 전진() {
        a1();
        a3();
        a5();
        a6();

        System.out.println("전진");
    }

    public void 후진() {
        a8();
        a7();
        a6();
        a5();
        System.out.println("후진");
    }

    public void 스탑() {
        a3();
        a7();
        System.out.println("스탑");
    }
}

// 대원칙 : 클래스 내에서 클래스는 호출될 수 없다.
// 따라서

public class Inter03 {

    public static void start(CarAble c) {
        c.전진();
        c.후진();
        c.스탑();
    }

    public static void main(String[] args) {
        CarAble c1 = new Car();
        start(c1);

        start(new Car());

    }

}
