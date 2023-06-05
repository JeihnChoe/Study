package ex04;

class Cal02 {
    void add(int n1, int n2, int n3) {
        System.out.println("더하기 : " + (n1 + n2 + n3));
    } // 스택을 종료하고, 복귀주소를 확인하고 복귀한다.

    // minus
    void minus(int n1, int n2) {
        System.out.println("빼기 : " + (n1 - n2));
    }

    // multi
    void multi(int n1, int n2) {
        System.out.println("곱하기 : " + n1 * n2);
    }

    // divide
    void divide(int n1, int n2) {
        System.out.println("나누기 : " + n1 / n2);
    }
}

public class Meth02 {
    public static void main(String[] args) {
        // 1. Cal01 클래스를 호출하고 싶음
        // 2. new 를 써서 클래스 호출함.
        // 3. 호출한 클래스의 이름을 지정함 : c1
        // 4. c1의 타입형을 정해줘야함 : c1앞에 class 명 작성

        Cal02 c1 = new Cal02();
        c1.add(10, 5, 0);
        c1.minus(10, 10);
        c1.multi(10, 10);
        c1.divide(10, 10);

        c1.add(1, 2, 3);

    }

}
