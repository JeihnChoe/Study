package ex05.ch01;

public class App {
    static void attackZtoZ(Zealot u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp는 : " + u2.hp);

    }

    static void attackZtoDr(Zealot u1, Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp는 : " + u2.hp);
    }

    static void attackZtoDt(Zealot u1, DarkTemplar u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp는 : " + u2.hp);

    }

    static void attackDrtoZ(Dragoon u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp는 : " + u2.hp);
    }

    static void attackDrtoDr(Dragoon u1, Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp는 : " + u2.hp);

    }

    static void attackDrtoDt(Dragoon u1, DarkTemplar u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp는 : " + u2.hp);

    }

    static void attackDttoDt(DarkTemplar u1, DarkTemplar u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp는 : " + u2.hp);

    }

    static void attackDttoZ(DarkTemplar u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp는 : " + u2.hp);

    }

    static void attackDttoDr(DarkTemplar u1, Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp는 : " + u2.hp);

    }

    public static void main(String[] args) {
        Zealot z1 = new Zealot("질럿1", 100, 10);
        Zealot z2 = new Zealot("질럿2", 100, 10);

        Dragoon dr1 = new Dragoon("드라군1", 100, 5);
        Dragoon dr2 = new Dragoon("드라군2", 100, 5);

        DarkTemplar dt1 = new DarkTemplar("다크1", 160, 40);
        DarkTemplar dt2 = new DarkTemplar("다크1", 160, 40);

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
