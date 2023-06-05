package ex05.ch99;

public class App {
    static void attackZtoZ(P_G_Zealot u1, P_G_Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp는 : " + u2.hp);

    }

    static void attackZtoDr(P_G_Zealot u1, P_G_Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp는 : " + u2.hp);
    }

    static void attackZtoDt(P_G_Zealot u1, P_G_DarkTemplar u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp는 : " + u2.hp);

    }

    static void attackDrtoZ(P_G_Dragoon u1, P_G_Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp는 : " + u2.hp);
    }

    static void attackDrtoDr(P_G_Dragoon u1, P_G_Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp는 : " + u2.hp);

    }

    static void attackDrtoDt(P_G_Dragoon u1, P_G_DarkTemplar u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp는 : " + u2.hp);

    }

    static void attackDttoDt(P_G_DarkTemplar u1, P_G_DarkTemplar u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp는 : " + u2.hp);

    }

    static void attackDttoZ(P_G_DarkTemplar u1, P_G_Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp는 : " + u2.hp);

    }

    static void attackDttoDr(P_G_DarkTemplar u1, P_G_Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp는 : " + u2.hp);

    }

    public static void main(String[] args) {
        P_G_Zealot z1 = new P_G_Zealot("질럿1", 100, 10);
        P_G_Zealot z2 = new P_G_Zealot("질럿2", 100, 10);

        P_G_Dragoon dr1 = new P_G_Dragoon("드라군1", 100, 5);
        P_G_Dragoon dr2 = new P_G_Dragoon("드라군2", 100, 5);

        P_G_DarkTemplar dt1 = new P_G_DarkTemplar("다크1", 160, 40);
        P_G_DarkTemplar dt2 = new P_G_DarkTemplar("다크1", 160, 40);

        // 질럿1 -> 질럿2 공격
        attackZtoZ(z1, z2);
        // 질럿1 -> 드라군1 공격
        attackZtoDr(z1, dr1);
        // 질럿1 -> 다크1 공격
        attackZtoDt(z1, dt1);

        // 드라군1-> 드라군2 공격
        attackDrtoDr(dr1, dr2);
        // 드라군1 -> 질럿1 공격
        attackDrtoZ(dr1, z1);
        // 드라군1 -> 다크1 공격
        attackDrtoDt(dr1, dt1);

        // 다크1 -> 다크2 공격
        attackDttoDt(dt1, dt2);
        // 다크1 -> 질럿1 공격
        attackDttoZ(dt1, z1);
        // 다크1 -> 드라군1 공격
        attackDttoDr(dt1, dr1);

    }
}
