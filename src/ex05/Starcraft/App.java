package ex05.Starcraft;

public class App {

    static void attack(ProtossUnit u1, ProtossUnit u2) {
        u1.setHp(u1.getHp() - u2.getAttack());
        System.out
                .println(u1.getName() + "이 " + u2.getName() + "에게 공격당했습니다. " + u1.getName() + "의 남은 HP는 " + u1.getHp());
    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot("질럿1", 100, 10);
        ProtossUnit d1 = new Dragoon("드라군1", 80, 30);
        ProtossUnit dk1 = new DarkTemplar("닥템1", 60, 40);

        attack(new Zealot("질럿1", 100, 10), d1);
        attack(d1, dk1);
        attack(z1, d1);
    }
}
