package ex04.questions;

public class RareItem {
    public static void main(String[] args) {
        wear(2400, 2000);

    }

    public static void wear(int hp, int mp) {
        if (hp >= 2000 && mp >= 2000)
            System.out.println("체력 : " + hp + ", 마력 : " + mp + " =>아이템 장착 완료!");
        else
            System.out.println("체력 : " + hp + ", 마력 : " + mp + " =>아이템을 장착할 수 없습니다.");
    }
}
