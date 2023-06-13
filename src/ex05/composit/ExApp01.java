package ex05.composit;

public class ExApp01 {
    public static void main(String[] args) {
        Burger b1 = new Burger();
        System.out.println("======================");
        Burger b2 = new Burger(800, "버거"); // 세일해도 어차피 버거인데 이름을 매번 적어줘야해서 귀찮음. 오버로딩 생성자 하나 더만든다.
        System.out.println("======================");
        Burger b3 = new Burger(500);
        System.out.println("======================");

        Bigburger bb1 = new Bigburger();
        System.out.println("======================");
        Bigburger bb2 = new Bigburger(1300);
        System.out.println("======================");
        Bigburger bb3 = new Bigburger(1100);
        System.out.println("======================");

    }

}
