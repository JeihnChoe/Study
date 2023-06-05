package ex04;

class Cal01 {
    void add() {
        System.out.println("add 호출됨");
    }

    // minus
    void minus() {
        System.out.println("minus 호출됨");
    }

    // multi
    void multi() {
        System.out.println("multi 호출됨");
    }

    // divide
    void divide() {
        System.out.println("divide 호출됨");
    }
}

public class Meth01 {
    public static void main(String[] args) {
        // 1. Cal01 클래스를 호출하고 싶음
        // 2. new 를 써서 클래스 호출함.
        // 3. 호출한 클래스의 이름을 지정함 : c1
        // 4. c1의 타입형을 정해줘야함 : c1앞에 class 명 작성

        Cal01 c1 = new Cal01();
        c1.add();
        c1.minus();
        c1.multi();
        c1.divide();

        Cal01 c2 = new Cal01();
        c2.add();
        c2.minus();
        c2.multi();
        c2.divide();
    }

}
