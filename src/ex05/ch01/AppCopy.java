package ex05.ch01;

public class AppCopy {
    static void attackZtoZ(Zealot u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp는 : " + u2.hp);

    }

    public static void main(String[] args) {
        Zealot z1 = new Zealot("질럿1", 100, 10);
        Zealot z2 = new Zealot("질럿2", 100, 10);

        // 질럿1 -> 질럿2 공격
        attackZtoZ(z1, z2);

    }
}
