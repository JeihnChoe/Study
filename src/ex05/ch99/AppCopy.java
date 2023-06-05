package ex05.ch99;

public class AppCopy {
    static void attackZtoZ(P_G_Zealot z1, P_G_Zealot z2) {
        z2.hp = z2.hp - z1.attack;
        System.out.println(z2.name + "이 공격당했습니다.");
        System.out.println(z2.name + "의 남은 hp는 : " + z2.hp);

    }

    public static void main(String[] args) {
        P_G_Zealot z1 = new P_G_Zealot("질럿1", 100, 10);
        P_G_Zealot z2 = new P_G_Zealot("질럿2", 100, 10);

        // 질럿1 -> 질럿2 공격
        attackZtoZ(z1, z2);

    }
}
