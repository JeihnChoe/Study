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

        // 질럿1 -> 질럿2 공격
        attack(z1, z2);
        // 질럿1 -> 드라군1 공격
        attack(z1, dr1);
        // 질럿1 -> 다크1 공격
        attack(z1, dt1);

        // 드라군1-> 드라군2 공격
        attack(dr1, dr2);
        // 드라군1 -> 질럿1 공격
        attack(dr1, z1);
        // 드라군1 -> 다크1 공격
        attack(dr1, dt1);

        // 다크1 -> 다크2 공격
        attack(dt1, dt2);
        // 다크1 -> 질럿1 공격
        attack(dt1, z1);
        // 다크1 -> 드라군1 공격
        attack(dt1, dr1);

        // 오버로딩 체험하기 : Ctrl 클릭해서 누르면 안에 다른 메소드가 있음.
        System.out.println();
        System.out.println(1);
        System.out.println(1.1);
        System.out.println('문');
        System.out.println("문자열");
        System.out.println(true);

    }
}
