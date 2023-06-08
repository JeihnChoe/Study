package ex05.ch02;

public class App {
    static void attack(Zealot u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp는 : " + u2.hp);
    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot("질럿1", 100, 10);
        ProtossUnit z2 = new Zealot("질럿2", 100, 10);

        ProtossUnit dr1 = new Dragoon("드라군1", 100, 5);
        ProtossUnit dr2 = new Dragoon("드라군2", 100, 5);

    }
}
