package ex00;

class 엘리스 {
    static String name = "엘리스";
    int height = 160;

    public 엘리스() {
    }

    void eat(int qty) {
        height = height + (10 * qty);// this 는 heap 에 접근하는것.
        System.out.println();
    }
}

public class MemApp {
    public static void main(String[] args) {
        엘리스 e = new 엘리스();
        e.eat(5); // height 210
        엘리스 e1 = new 엘리스();
    }
}

// JVM이 실행되면
// 1. 클래스 로드
// 2. 전체 코드에서 static 키워드만 찾고 static만 로드함.
// 2-1. static공간에 => 엘리스 static공간할당, MemApp static 공간할당
// 2-2. 엘리스 static에 name = "엘리스" 로드 / MemApp static에 main 로드
// 3. static 에 있는 main 실행
// 4. main 의 큐와 스택이 생김.
// 5.