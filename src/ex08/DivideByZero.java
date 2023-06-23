package ex08;

public class DivideByZero {
    static void divide(int n) throws Exception {
        // 0으로 나누면 분명 오류가 날건데, 그 제어를 사용자에게 맡기고싶다.
        // 이제 divide(); 를 호출하는 메서드에서 try catch를 정의해줘야한다.
        int result = 10 / n;
        System.out.println("나눗셈 결과 : %s" + result);
    }

    public static void main(String[] args) {
        try {
            divide(0);
        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없습니다");
        }
    }
}
